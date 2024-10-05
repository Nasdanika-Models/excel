package org.nasdanika.models.excel.util;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;

public class CsvResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(ResourceSet resourceSet) {
		return new WorkbookResourceFactory();
	}
	
	@Override
	protected String getExtension() {
		return "csv";
	}

}
