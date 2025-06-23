package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
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
import org.nasdanika.models.excel.HyperlinkCell;
import org.nasdanika.models.excel.NumericCell;
import org.nasdanika.models.excel.ReferenceCell;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.*;


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
								addCell(xssWorkbook, xssRow, cell);
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

	protected void addCell(XSSFWorkbook xssWorkbook, XSSFRow xssRow, Cell cell) {
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
			XSSFCell xssCell = xssRow.createCell(cell.getColumnIndex(), CellType.STRING);
			xssCell.setCellValue(((StringCell) cell).getValue());
			if (cell instanceof HyperlinkCell) {
		        CreationHelper createHelper = xssWorkbook.getCreationHelper();
		        HyperlinkCell hlCell = (HyperlinkCell) cell;
		        HyperlinkType hyperlinkType = switch (hlCell.getHyperlinkType()) {
				case DOCUMENT -> HyperlinkType.DOCUMENT;
				case EMAIL -> HyperlinkType.EMAIL;
				case FILE -> HyperlinkType.FILE;
				case NONE -> HyperlinkType.NONE;
				case URL -> HyperlinkType.URL;
				default -> throw new IllegalArgumentException("Unsupported hyperlink type: " + hlCell.getHyperlinkType());
		        };
		        Hyperlink link = createHelper.createHyperlink(hyperlinkType);
		        link.setAddress(hlCell.getAddress());
		        xssCell.setHyperlink(link);

		        // Styling
		        CellStyle hyperlinkStyle = xssWorkbook.createCellStyle();
		        XSSFFont hyperlinkFont = xssWorkbook.createFont();
		        hyperlinkFont.setUnderline(Font.U_SINGLE);
		        hyperlinkFont.setColor(IndexedColors.BLUE.getIndex());
		        hyperlinkStyle.setFont(hyperlinkFont);
		        xssCell.setCellStyle(hyperlinkStyle);			
			}			
		} else {
			throw new UnsupportedOperationException("Unsupported cell type: " + cell);
		}
	}

}
