package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;

/**
 * Loads the Excel model from a CSV {@link Reader}
 */
public class CSVLoader implements WorkbookLoader {
	
	private ExcelFactory factory;
	
	/**
	 * Override to customize format
	 * @return
	 */
	protected CSVFormat createFormat() {
		return CSVFormat.Builder.create(CSVFormat.EXCEL).build();
	};

	public CSVLoader() {
		this(ExcelFactory.eINSTANCE);
	}
	
	public CSVLoader(ExcelFactory factory) {
		this.factory = factory;
	}
	
	public ExcelFactory getFactory() {
		return factory;
	}
	
	@Override
	public Workbook load(InputStream in) throws IOException {
		try (Reader reader = new InputStreamReader(in)) {
			CSVFormat format = createFormat();
			CSVParser parser = format.parse(reader);
			Workbook modelWorkbook = createWorkbook();
			modelWorkbook.getSheets().add(createSheet(modelWorkbook, parser));
			return modelWorkbook;
		}
	}
	
	/**
	 * Creates and loads a workbook sheet. This implementation creates and loads {@link RowSheet}.
	 * @param workbook
	 * @param next
	 * @param formulaEvaluator
	 * @return
	 */
	protected org.nasdanika.models.excel.Sheet createSheet(Workbook modelWorkbook, CSVParser parser) {
		RowSheet rowSheet = getFactory().createRowSheet(); 
		for (CSVRecord csvRecord: parser) {
			rowSheet.getRows().add(
					createRow(
							modelWorkbook, 
							rowSheet, 
							csvRecord));
			
		}
		return rowSheet;
	}

	/**
	 * Creates a row. This implementation creates a {@link CellRow}
	 * @param workbook
	 * @param sheet
	 * @param row
	 * @param formulaEvaluator
	 * @return
	 */
	protected org.nasdanika.models.excel.Row createRow(
			Workbook modelWorkbook, 
			org.nasdanika.models.excel.Sheet modelSheet, 
			CSVRecord csvRecord) {
		
		CellRow cellRow = getFactory().createCellRow();
		cellRow.setNumber(csvRecord.getRecordNumber());
		for (String value: csvRecord) {
			org.nasdanika.models.excel.Cell modelCell = createCell(
							modelWorkbook, 
							modelSheet, 
							cellRow,							
							value);
			modelCell.setColumnIndex(cellRow.getCells().size());
			cellRow.getCells().add(modelCell);
		}
		
		return cellRow;
	}
	
	/**
	 * Creates a cell depending on the cell type.
	 * @param workbook
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param formulaEvaluator
	 * @return
	 */
	protected org.nasdanika.models.excel.Cell createCell(
			Workbook modelWorkbook, 
			org.nasdanika.models.excel.Sheet modelSheet, 
			org.nasdanika.models.excel.Row modelRow, 
			String value) {

		StringCell stringCell = getFactory().createStringCell();
		stringCell.setValue(value);
		return stringCell;
	}		

	protected Workbook createWorkbook() {
		return getFactory().createWorkbook();
	}

	
}
