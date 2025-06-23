package org.nasdanika.models.excel.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Requires;
import java.lang.module.ModuleDescriptor.Version;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.excel.Cell;
import org.nasdanika.models.excel.CellRow;
import org.nasdanika.models.excel.ExcelFactory;
import org.nasdanika.models.excel.Row;
import org.nasdanika.models.excel.RowSheet;
import org.nasdanika.models.excel.Sheet;
import org.nasdanika.models.excel.StringCell;
import org.nasdanika.models.excel.Workbook;
import org.nasdanika.models.excel.util.CSVLoader;
import org.nasdanika.models.excel.util.ColumnBuilder;
import org.nasdanika.models.excel.util.ColumnBuilderGroup;
import org.nasdanika.models.excel.util.Series;
import org.nasdanika.models.excel.util.TitleAndDescriptionColumnBuilder;
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
			for (Sheet sheet: ((Workbook) root).getSheets()) {
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
	public void testSaveAndLoadXSSWorkbookResource() throws Exception {
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
		headerRow.addStringCell("Hyperlink");
		
		CellRow dataRow = rowSheet.addCellRow();
		dataRow.addBlankCell();
		dataRow.addBooleanCell(true);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2013, 8, 10, 9, 0);
		dataRow.addDateCell(calendar.getTime());
		dataRow.addErrorCell((byte) 33);
		dataRow.addNumericCell(33);
		dataRow.addStringCell("Hello world!");
		dataRow.addHyperlinkCell("Nasdanika", "https://docs.nasdanika.org");
		
		excelResource.save(null);

		// Reading to a new resource set
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xlsx", new WorkbookResourceFactory());
		excelResource = resourceSet.getResource(URI.createFileURI(test.getAbsolutePath()), true);
		for (EObject root: excelResource.getContents()) {
			for (Sheet sheet: ((Workbook) root).getSheets()) {
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
	public void testLoadCSVResource() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("csv", new WorkbookResourceFactory());
		File test = new File("test.csv").getCanonicalFile();
		Resource excelResource = resourceSet.getResource(URI.createFileURI(test.getAbsolutePath()), true);
		for (EObject root: excelResource.getContents()) {
			for (Sheet sheet: ((Workbook) root).getSheets()) {
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
		
	@Test
	@Disabled
	public void testSaveWorkbook() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);

		File moduleFile = new File("target/module.xlsx").getCanonicalFile();
		Resource excelResource = resourceSet.createResource(URI.createFileURI(moduleFile.getAbsolutePath()));
		Workbook workbook = ExcelFactory.eINSTANCE.createWorkbook();
		excelResource.getContents().add(workbook);
		
		Module module = getClass().getModule();		
		ModuleDescriptor descriptor = module.getDescriptor();
		
		RowSheet rowSheet = workbook.addRowSheet(module.getName());
				
		CellRow headerRow = rowSheet.addCellRow();
		headerRow.addStringCell("Name");
		headerRow.addStringCell("Modifiers");
		headerRow.addStringCell("Version");
				
		for (Requires req: descriptor.requires()) {
			CellRow reqRow = rowSheet.addCellRow();
			reqRow.addStringCell(req.name());
			
			StringBuilder modifiersBuilder = new StringBuilder();
			req.modifiers().forEach(m -> {
				if (!modifiersBuilder.isEmpty()) {
					modifiersBuilder.append(", ");
				}
				modifiersBuilder.append(m);
			});
			reqRow.addStringCell(modifiersBuilder.toString());
			
			Optional<Version> versionOpt = req.compiledVersion();
			if (versionOpt.isEmpty()) {
				reqRow.addBlankCell();
			} else {
				Version version = versionOpt.get();
				reqRow.addStringCell(version.toString());
			}
		}				
		excelResource.save(null);
	}
		
	@Test
	@Disabled
	public void testLoadWorkbook() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File moduleFile = new File("target/module.xlsx").getCanonicalFile();

		// Reading to a new resource set
		Resource excelResource = resourceSet.getResource(URI.createFileURI(moduleFile.getAbsolutePath()), true);
		for (EObject root: excelResource.getContents()) {
			for (Sheet sheet: ((Workbook) root).getSheets()) {
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
	public void testSeries() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
	
		File moduleFile = new File("target/module-series.xlsx").getCanonicalFile();
		Resource excelResource = resourceSet.createResource(URI.createFileURI(moduleFile.getAbsolutePath()));
		Workbook workbook = ExcelFactory.eINSTANCE.createWorkbook();
		excelResource.getContents().add(workbook);
		
		Module module = getClass().getModule();		
		ModuleDescriptor descriptor = module.getDescriptor();
		
		List<ColumnBuilder<Requires>> columnBuilders = new ArrayList<>();

		columnBuilders.add(TitleAndDescriptionColumnBuilder.stringColumnBuilder(
				"Name", 
				"Requires name", 
				Requires::name, 
				null));		

		columnBuilders.add(TitleAndDescriptionColumnBuilder.stringColumnBuilder(
				"Modifiers", 
				"Requires modifiers", 
				req -> {
					StringBuilder modifiersBuilder = new StringBuilder();
					req.modifiers().forEach(m -> {
						if (!modifiersBuilder.isEmpty()) {
							modifiersBuilder.append(", ");
						}
						modifiersBuilder.append(m);
					});
					return modifiersBuilder.toString();
				}, 
				null));		

		columnBuilders.add(TitleAndDescriptionColumnBuilder.stringColumnBuilder(
				"Version", 
				"Requires version", 
				req -> {
					Optional<Version> versionOpt = req.compiledVersion();
					if (versionOpt.isEmpty()) {
						return null;
					}
					Version version = versionOpt.get();
					return version.toString();
				}, 
				null));		
		
		Series<Requires> series = Series.of(
				"Requires", 
				columnBuilders, 
				descriptor.requires(), 
				true);
		
		series.generate(workbook);
		
		ColumnBuilderGroup<Requires> requiresGroup = new ColumnBuilderGroup<ModuleDescriptor.Requires>(
				"Requires", 
				"Information about requires", 
				columnBuilders);
		
		Series<Requires> groupSeries = Series.of(
				"Requires group", 
				Collections.singletonList(requiresGroup), 
				descriptor.requires(), 
				true);		
		
		groupSeries.generate(workbook);
		
		excelResource.save(null);
	}
	
	
}
