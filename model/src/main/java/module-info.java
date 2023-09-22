module org.nasdanika.models.excel {
	exports org.nasdanika.models.excel;
	exports org.nasdanika.models.excel.impl;
	exports org.nasdanika.models.excel.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.apache.poi.ooxml;
	requires org.apache.commons.csv;
}