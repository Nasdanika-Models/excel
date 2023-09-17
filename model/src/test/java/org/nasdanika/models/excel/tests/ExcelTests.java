package org.nasdanika.models.excel.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;
import org.nasdanika.models.excel.util.ExcelResourceFactory;
import org.nasdanika.models.excel.util.Loader;

public class ExcelTests {
	
	@Test
	public void testLoader() throws Exception {
		Loader loader = new Loader();
		File in = new File("test.xlsx");
		assertTrue(in.isFile());
		try (InputStream is = new FileInputStream(in)) {
			Workbook workbook = loader.load(is);
			for (Sheet sheet: workbook.getSheets()) {
				System.out.println(sheet.getName() + " " + sheet.eClass().getName());
				for (Row row: ((RowSheet) sheet).getRows()) {
					System.out.println("\t" + row.getNumber() + " " + row.eClass().getName());
					for (Cell cell: ((CellRow) row).getCells()) {
						System.out.println("\t\t" + cell.getColumnIndex() + " " + cell.eClass().getName());
						if (cell instanceof StringCell) {
							System.out.println("\t\t\t" + ((StringCell) cell).getValue());
						}
					}					
				}
			}
		}
	}

	@Test
	public void testResourceFactory() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new ExcelResourceFactory());
		File test = new File("test.xlsx").getCanonicalFile();
		Resource excelResource = resourceSet.getResource(URI.createFileURI(test.getAbsolutePath()), true);
		for (EObject root: excelResource.getContents()) {
			Sheet sheet = (Sheet) root;
			System.out.println(sheet.getName() + " " + sheet.eClass().getName());
			for (Row row: ((RowSheet) sheet).getRows()) {
				System.out.println("\t" + row.getNumber() + " " + row.eClass().getName());
				for (Cell cell: ((CellRow) row).getCells()) {
					System.out.println("\t\t" + cell.getColumnIndex() + " " + cell.eClass().getName());
					if (cell instanceof StringCell) {
						System.out.println("\t\t\t" + ((StringCell) cell).getValue());
					}
				}					
			}
		}
	}
	
}
