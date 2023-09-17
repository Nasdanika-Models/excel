module org.nasdanika.models.excel.processors {
		
	requires transitive org.nasdanika.models.excel;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.excel.processors;
	opens org.nasdanika.models.excel.processors; // For loading resources
	
}
