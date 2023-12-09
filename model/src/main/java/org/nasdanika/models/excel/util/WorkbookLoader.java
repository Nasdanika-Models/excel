package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;

import org.nasdanika.models.excel.Workbook;

public interface WorkbookLoader {

	Workbook load(InputStream in) throws IOException;	
	
}
