import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.excel.util.CsvResourceFactoryCapabilityFactory;
import org.nasdanika.models.excel.util.ExcelEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.excel.util.WorkbookResourceFactoryCapabilityFactory;

module org.nasdanika.models.excel {
	exports org.nasdanika.models.excel;
	exports org.nasdanika.models.excel.impl;
	exports org.nasdanika.models.excel.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.apache.poi.ooxml;
	requires org.apache.commons.csv;
	requires transitive org.nasdanika.exec;
	
	provides CapabilityFactory with 
		ExcelEPackageResourceSetCapabilityFactory,
		WorkbookResourceFactoryCapabilityFactory,
		CsvResourceFactoryCapabilityFactory;
}