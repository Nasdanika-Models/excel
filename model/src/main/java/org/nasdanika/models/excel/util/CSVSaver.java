package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
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

public class CSVSaver implements WorkbookSaver {

	@Override
	public void save(Workbook workbook, OutputStream out) throws IOException {
		if (workbook.getSheets().size() != 1) {
			throw new IllegalArgumentException("Can save only single-sheet workbooks to CSV");
		}
		try (CSVPrinter printer = new CSVPrinter(new OutputStreamWriter(out), CSVFormat.EXCEL)) {
			Sheet sheet = workbook.getSheets().get(0);
			if (sheet instanceof RowSheet) {
				for (Row row: ((RowSheet) sheet).getRows()) {
					if (row instanceof CellRow) {
						CellRow cellRow = (CellRow) row;
						printer.printRecord(cellRow.getCells().stream().map(this::cellValue));
					} else {
						throw new IllegalArgumentException("Can save only cell rows to CSV");										
					}
				}
			} else {
				throw new IllegalArgumentException("Can save only row sheets to CSV");				
			}
		}
	}
	
	protected Object cellValue(Cell cell) {
		if (cell instanceof BlankCell) {
			return null;
		}
		if (cell instanceof BooleanCell) {
			return ((BooleanCell) cell).isValue();
		}
		if (cell instanceof DateCell) {
			return ((DateCell) cell).getValue();
		}
		if (cell instanceof EObjectCell) {
			return ((EObjectCell) cell).getValue();
		}
		if (cell instanceof ErrorCell) {
			return ((ErrorCell) cell).getValue();
		}
		if (cell instanceof NumericCell) {
			return ((NumericCell) cell).getValue();
		}
		if (cell instanceof ReferenceCell) {
			return ((ReferenceCell) cell).getTarget();
		}
		if (cell instanceof StringCell) {
			return ((StringCell) cell).getValue();
		}
		throw new UnsupportedOperationException("Unsupported cell type: " + cell);
	}

}
