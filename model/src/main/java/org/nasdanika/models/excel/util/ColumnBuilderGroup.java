package org.nasdanika.models.excel.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;

import org.nasdanika.common.Util;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.RowSheet;

/**
 * Group of column builders with title and description
 * @param <T>
 */
public class ColumnBuilderGroup<T> implements ColumnBuilder<T> {

	protected String title;
	protected String description;
	private List<ColumnBuilder<T>> builders = new ArrayList<>();
	
	@SafeVarargs
	public ColumnBuilderGroup(String title, String description, ColumnBuilder<T>... builders) {
		this.title = title;
		this.description = description;
		for (ColumnBuilder<T> builder: builders) {
			if (builder != null) {
				this.builders.add(builder);
			}
		}
	}	
	
	public ColumnBuilderGroup(String title, String description, Iterable<ColumnBuilder<T>> builders) {
		this.title = title;
		this.description = description;
		if (builders != null) {
			for (ColumnBuilder<T> builder: builders) {
				if (builder != null) {
					this.builders.add(builder);
				}
			}			
		}
	}
	
	public void add(ColumnBuilder<T> builder) {
		builders.add(builder);
	}
		
	private List<RowBuilder> aggregate(List<List<RowBuilder>> rowBuilders) {
		List<RowBuilder> ret = new ArrayList<>();
		OptionalInt numberOfRows = rowBuilders.stream().mapToInt(Collection::size).max();
		if (numberOfRows.isPresent()) {
			for (int rowIdx = 0; rowIdx < numberOfRows.getAsInt(); ++rowIdx) {
				ret.add(createRowBuilder(rowIdx, rowBuilders));
			}
		}		
		return ret;
	}
	
	private RowBuilder createRowBuilder(int rowIdx, List<List<RowBuilder>> rowBuilders) {
		return row -> {
			for (int builderIdx = 0; builderIdx < rowBuilders.size(); ++builderIdx) {
				List<RowBuilder> rb = rowBuilders.get(builderIdx);
				int width = builders.get(builderIdx).width();
				if (rb.size() > rowIdx) {
					int rowLength = row.getCells().size();
					RowBuilder rowBuilder = rb.get(rowIdx);
					rowBuilder.build(row);
					if (row.getCells().size() - rowLength != width) {
						throw new IllegalStateException("Wrong number of columns built by " + rowBuilder);
					}					
				} else {
					for (int columnIdx = 0; columnIdx < width; ++columnIdx) {
						row.addBlankCell();
					}					
				}
			}
		};
	}	
	
	@Override
	public List<RowBuilder> getHeaderBuilders() {
		List<RowBuilder> ret = new ArrayList<>();
		ret.add(row -> {
			if (Util.isBlank(title)) {
				row.addBlankCell();
			} else {
				row.addStringCell(title);
			}
			int width = width();
			for (int i = 1; i < width; ++i) {
				row.addBlankCell();
			}
		});
		
		ret.addAll(aggregate(
				builders
					.stream()
					.map(cb -> cb.getHeaderBuilders())
					.toList()));
		return ret;
	}
	

	@Override
	public List<RowBuilder> getElementBuilders(T element) {
		return aggregate(
				builders
					.stream()
					.map(cb -> cb.getElementBuilders(element))
					.toList());
	}

	@Override
	public List<RowBuilder> getFooterBuilders() {
		return aggregate(
				builders
					.stream()
					.map(cb -> cb.getFooterBuilders())
					.toList());
	}

	@Override
	public int width() {
		return builders.stream().mapToInt(ColumnBuilder::width).sum();
	}

	@Override
	public void buildDescription(RowSheet rowSheet) {
		CellRow row = rowSheet.addCellRow();
		if (Util.isBlank(title)) {
			row.addBlankCell();
		} else {
			row.addStringCell(title);
		}
		if (Util.isBlank(description)) {
			row.addBlankCell();
		} else {
			row.addStringCell(description);
		}
		for (ColumnBuilder<T> builder: builders) {
			builder.buildDescription(rowSheet);
		}		
	}
	

}
