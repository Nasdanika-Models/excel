package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.nasdanika.models.excel.BooleanCell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.ErrorCell;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.NumericCell;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;

/**
 * Loads the Excel model from a workbook stream
 */
public class Loader {
	
	private ExcelFactory factory;
	
	protected FormulaEvaluator createFormulaEvaluator(XSSFWorkbook workbook) {
		return workbook.getCreationHelper().createFormulaEvaluator();
	};

	public Loader() {
		this(ExcelFactory.eINSTANCE);
	}
	
	public Loader(ExcelFactory factory) {
		this.factory = factory;
	}
	
	public ExcelFactory getFactory() {
		return factory;
	}
	
	public Workbook load(InputStream in) throws IOException {
		try (XSSFWorkbook workbook = new XSSFWorkbook(in)) {
			Workbook modelWorkbook = createWorkbook(workbook);
			FormulaEvaluator formulaEvaluator = createFormulaEvaluator(workbook);
			Iterator<Sheet> sheetIterator = workbook.sheetIterator();
			while (sheetIterator.hasNext()) {
				modelWorkbook.getSheets().add(createSheet(
						modelWorkbook, 
						sheetIterator.next(), 
						formulaEvaluator));
			}
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
	protected org.nasdanika.models.excel.Sheet createSheet(
			Workbook modelWorkbook, 
			Sheet sheet,
			FormulaEvaluator formulaEvaluator) {
		
		RowSheet rowSheet = getFactory().createRowSheet(); 
		rowSheet.setName(sheet.getSheetName());
		Iterator<Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			rowSheet.getRows().add(
					createRow(
							modelWorkbook, 
							rowSheet, 
							rowIterator.next(), 
							formulaEvaluator));
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
			Row row,
			FormulaEvaluator formulaEvaluator) {
		
		CellRow cellRow = getFactory().createCellRow();
		cellRow.setNumber(row.getRowNum());
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			org.nasdanika.models.excel.Cell modelCell = createCell(
							modelWorkbook, 
							modelSheet, 
							cellRow,							
							cell, 
							formulaEvaluator);
			modelCell.setColumnIndex(cell.getColumnIndex());
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
			Cell cell,
			FormulaEvaluator formulaEvaluator) {

		switch (cell.getCellType()) {
		case BLANK:
			return getFactory().createBlankCell();
		case BOOLEAN:
			BooleanCell booleanCell = getFactory().createBooleanCell();
			booleanCell.setValue(cell.getBooleanCellValue());
			return booleanCell;
		case ERROR:
			ErrorCell errorCell = getFactory().createErrorCell();
			errorCell.setValue(cell.getErrorCellValue());
			return errorCell;
		case FORMULA:
			CellValue cellValue = formulaEvaluator.evaluate(cell);
			if (cellValue == null) {
				return factory.createBlankCell();
			}
			switch (cellValue.getCellType()) {
			case BLANK:
				return getFactory().createBlankCell();
			case BOOLEAN:
				BooleanCell booleanCellValue = getFactory().createBooleanCell();
				booleanCellValue.setValue(cellValue.getBooleanValue());
				return booleanCellValue;
			case ERROR:
				ErrorCell errorCellValue = getFactory().createErrorCell();
				errorCellValue.setValue(cellValue.getErrorValue());
				return errorCellValue;
			case NUMERIC:
				NumericCell numericCellValue = getFactory().createNumericCell();
				numericCellValue.setValue(cellValue.getNumberValue());
				return numericCellValue;
			case STRING:
				StringCell stringCellValue = getFactory().createStringCell();
				stringCellValue.setValue(cellValue.getStringValue());
				return stringCellValue;
			case FORMULA:
			case _NONE:
			default:
				throw new UnsupportedOperationException("Unsupported cell type: " + cell.getCellType());		
			}		
		case NUMERIC:
			NumericCell numericCell = getFactory().createNumericCell();
			numericCell.setValue(cell.getNumericCellValue());
			return numericCell;
		case STRING:
			StringCell stringCell = getFactory().createStringCell();
			stringCell.setValue(cell.getStringCellValue());
			return stringCell;
		case _NONE:
		default:
			throw new UnsupportedOperationException("Unsupported cell type: " + cell.getCellType());		
		}		
	}		

	protected Workbook createWorkbook(XSSFWorkbook workbook) {
		return getFactory().createWorkbook();
	}

	
}
