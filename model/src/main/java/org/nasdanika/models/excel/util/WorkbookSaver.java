package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.OutputStream;

import org.nasdanika.models.excel.Workbook;

public interface WorkbookSaver {

	void save(Workbook workbook, OutputStream out) throws IOException;	
	
}
