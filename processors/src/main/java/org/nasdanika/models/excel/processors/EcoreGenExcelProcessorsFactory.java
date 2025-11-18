package org.nasdanika.models.excel.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.excel.ExcelPackage;

@EPackageNodeProcessorFactory(nsURI = ExcelPackage.eNS_URI)
public class EcoreGenExcelProcessorsFactory {

	private Context context;
	
//	@Factory
//	public final AccessLevelProcessorsFactory accessLevelFactory;

	
	public EcoreGenExcelProcessorsFactory(Context context) {
		this.context = context;
//		accessLevelProcessorsFactory = new AccessLevelProcessorsFactory(context);
	}
	
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EPackageNodeProcessorFactory(
			label = "Excel",
			icon = "https://docs.nasdanika.org/images/excel.svg",
			description = "A model of MS Excel and CSV objects",
			documentation =  """				
				
				[TOC levels=6]
				
				## Creating a model and writing a file
				
				```java
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
				```	

				### Series and column builders
				
				```java
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
				
				excelResource.save(null);
				```
				
				#### Column builder group
				
				```java
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
				```
								
				## Reading a file
				
				```java
				CapabilityLoader capabilityLoader = new CapabilityLoader();
				ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
				Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
				ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
				
				File moduleFile = new File("target/module.xlsx").getCanonicalFile();
				
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
				```	
						
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
