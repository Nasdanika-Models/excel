package org.nasdanika.models.excel.util;

import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;

import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Workbook;

public interface Series<T> {
	
	Iterable<T> getElements();
	
	List<ColumnBuilder<T>> getColumnBuilders();
	
	String getName();
	
	default String getDescriptionSheetName() {
		return getName() + " description";
	}
	
	default boolean isGenerateDescriptionSheet() {
		return true;
	}
	
	private static void build(RowSheet dataSheet, List<Integer> widths, List<List<RowBuilder>> builders) {
		OptionalInt numberOfRows = builders.stream().mapToInt(Collection::size).max();
		if (numberOfRows.isPresent()) {
			for (int rowIdx = 0; rowIdx < numberOfRows.getAsInt(); ++rowIdx) {
				CellRow row = dataSheet.addCellRow();
				for (int columnBuilderIdx = 0; columnBuilderIdx < widths.size(); ++columnBuilderIdx) {
					List<RowBuilder> cBuilders = builders.get(columnBuilderIdx);
					int cbWidth = widths.get(columnBuilderIdx);
					if (cBuilders.size() > rowIdx) {
						int rowLength = row.getCells().size();
						RowBuilder rowBuilder = cBuilders.get(rowIdx);
						rowBuilder.build(row);
						if (row.getCells().size() - rowLength != cbWidth) {
							throw new IllegalStateException("Wrong number of columns built by " + rowBuilder);
						}
					} else {
						for (int columnIdx = 0; columnIdx < cbWidth; ++columnIdx) {
							row.addBlankCell();
						}
					}
				}
			}
		}		
	}
	
	default void generate(Workbook workbook) {
		RowSheet dataSheet = workbook.addRowSheet(getName());
		List<ColumnBuilder<T>> columnBuilders = getColumnBuilders();
		
		List<Integer> widths = columnBuilders
				.stream()
				.map(cb -> cb.width()) 
				.toList();
		
		build(
				dataSheet, 
				widths, 
				columnBuilders
						.stream()
						.map(cb -> cb.getHeaderBuilders())
						.toList());
		
		for (T element: getElements()) {	
			build(
					dataSheet, 
					widths,
					columnBuilders
							.stream()
							.map(cb -> cb.getElementBuilders(element))
							.toList());
		}
		
		build(
				dataSheet, 
				widths, 
				columnBuilders
						.stream()
						.map(cb -> cb.getFooterBuilders())
						.toList());
		
		if (isGenerateDescriptionSheet()) {
			RowSheet descriptionSheet = workbook.addRowSheet(getDescriptionSheetName());
			CellRow headerRow = descriptionSheet.addCellRow();
			headerRow.addStringCell("Name");
			headerRow.addStringCell("Description");
			headerRow.addStringCell("Summary");			
			for (ColumnBuilder<T> columnBuilder: getColumnBuilders()) {
				columnBuilder.buildDescription(descriptionSheet);
			}			
		}
		
	}
	
	static <T> Series<T> of(
			String name,
			List<ColumnBuilder<T>> columnBuilders,
			Iterable<T> elements, 
			boolean generateDescriptionSheet) {
		
		return new Series<T>() {

			@Override
			public Iterable<T> getElements() {
				return elements;
			}

			@Override
			public List<ColumnBuilder<T>> getColumnBuilders() {
				return columnBuilders;
			}

			@Override
			public String getName() {
				return name;
			}
			
			@Override
			public boolean isGenerateDescriptionSheet() {
				return generateDescriptionSheet;
			}
			
		};
	}

}
