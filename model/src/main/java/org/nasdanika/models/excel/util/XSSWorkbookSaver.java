package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.nasdanika.models.excel.BlankCell;
import org.nasdanika.models.excel.BooleanCell;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.DateCell;
import org.nasdanika.models.excel.EObjectCell;
import org.nasdanika.models.excel.ErrorCell;
import org.nasdanika.models.excel.NumericCell;
import org.nasdanika.models.excel.ReferenceCell;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;

public class XSSWorkbookSaver implements WorkbookSaver {

	@Override
	public void save(Workbook workbook, OutputStream out) throws IOException {
		try (XSSFWorkbook xssWorkbook = new XSSFWorkbook()) {
			for (Sheet sheet: workbook.getSheets()) {
				if (sheet instanceof RowSheet) {
					XSSFSheet xssSheet = xssWorkbook.createSheet(sheet.getName());
					for (Row row: ((RowSheet) sheet).getRows()) {
						if (row instanceof CellRow) {
							CellRow cellRow = (CellRow) row;
							XSSFRow xssRow = xssSheet.createRow(row.getNumber());
							for (Cell cell: cellRow.getCells()) {
								addCell(xssRow, cell);
							}
						} else {
							throw new IllegalArgumentException("Can save only cell rows");										
						}
					}
				} else {
					throw new IllegalArgumentException("Can save only row sheets");				
				}
			}

			try (out) {
				xssWorkbook.write(out);
			}
		}
	}

	protected void addCell(XSSFRow xssRow, Cell cell) {
		if (cell instanceof BlankCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.BLANK);
		} else 	if (cell instanceof BooleanCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.BOOLEAN).setCellValue(((BooleanCell) cell).isValue());
		} else if (cell instanceof DateCell) {									
			xssRow.createCell(cell.getColumnIndex(), CellType.NUMERIC).setCellValue(DateUtil.getExcelDate((((DateCell) cell).getValue())));
		} else if (cell instanceof EObjectCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.STRING).setCellValue(((EObjectCell) cell).getValue().toString());
		} else if (cell instanceof ErrorCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.ERROR).setCellValue(((ErrorCell) cell).getValue());
		} else if (cell instanceof NumericCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.NUMERIC).setCellValue(((NumericCell) cell).getValue());
		} else if (cell instanceof ReferenceCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.STRING).setCellValue(((ReferenceCell) cell).getTarget().toString());
		} else if (cell instanceof StringCell) {
			xssRow.createCell(cell.getColumnIndex(), CellType.STRING).setCellValue(((StringCell) cell).getValue());
		} else {
			throw new UnsupportedOperationException("Unsupported cell type: " + cell);
		}
	}

}
