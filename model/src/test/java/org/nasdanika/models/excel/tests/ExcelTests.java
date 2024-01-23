package org.nasdanika.models.excel.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;
import org.nasdanika.models.excel.util.CSVLoader;
import org.nasdanika.models.excel.util.WorkbookResourceFactory;
import org.nasdanika.models.excel.util.XSSWorkbookLoader;

public class ExcelTests {
	
	@Test
	public void testWorkbookLoader() throws Exception {
		XSSWorkbookLoader loader = new XSSWorkbookLoader();
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
	public void testCSVLoader() throws Exception {
		CSVLoader loader = new CSVLoader();
		File in = new File("test.csv");
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
	public void testLoadXSSWorkbookResource() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new WorkbookResourceFactory());
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
	
	@Test
	public void testSaveXSSWorkbookResource() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new WorkbookResourceFactory());
		File test = new File("target/test.xlsx").getCanonicalFile();
		Resource excelResource = resourceSet.createResource(URI.createFileURI(test.getAbsolutePath()));
		Workbook workbook = ExcelFactory.eINSTANCE.createWorkbook();
		excelResource.getContents().add(workbook);
		RowSheet rowSheet = workbook.addRowSheet("My worksheet");
		CellRow headerRow = rowSheet.addCellRow();
		headerRow.addStringCell("Blank");
		headerRow.addStringCell("Boolean");
		headerRow.addStringCell("Date");
		headerRow.addStringCell("Error");
		headerRow.addStringCell("Numeric");
		headerRow.addStringCell("String");
		
		CellRow dataRow = rowSheet.addCellRow();
		dataRow.addBlankCell();
		dataRow.addBooleanCell(true);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2013, 8, 10, 9, 0);
		dataRow.addDateCell(calendar.getTime());
		dataRow.addErrorCell((byte) 33);
		dataRow.addNumericCell(33);
		dataRow.addStringCell("Hello world!");
		
		excelResource.save(null);
	}
	
	@Test
	public void testLoadCSVResource() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("csv", new WorkbookResourceFactory());
		File test = new File("test.csv").getCanonicalFile();
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
	
	@Test
	public void testSaveCSVWorkbookResource() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("csv", new WorkbookResourceFactory());
		File test = new File("target/test.csv").getCanonicalFile();
		Resource excelResource = resourceSet.createResource(URI.createFileURI(test.getAbsolutePath()));
		Workbook workbook = ExcelFactory.eINSTANCE.createWorkbook();
		excelResource.getContents().add(workbook);
		RowSheet rowSheet = workbook.addRowSheet("My worksheet");
		CellRow headerRow = rowSheet.addCellRow();
		headerRow.addStringCell("Blank");
		headerRow.addStringCell("Boolean");
		headerRow.addStringCell("Date");
		headerRow.addStringCell("Error");
		headerRow.addStringCell("Numeric");
		headerRow.addStringCell("String");
		
		CellRow dataRow = rowSheet.addCellRow();
		dataRow.addBlankCell();
		dataRow.addBooleanCell(true);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2013, 8, 10, 9, 0);
		dataRow.addDateCell(calendar.getTime());
		dataRow.addErrorCell((byte) 33);
		dataRow.addNumericCell(33);
		dataRow.addStringCell("Hello world!");
		
		excelResource.save(null);
	}
	
	
}
