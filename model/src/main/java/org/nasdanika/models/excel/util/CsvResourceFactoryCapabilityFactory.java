package org.nasdanika.models.excel.util;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

public class CsvResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		Requirement<Object, ResourceContentsFilter> resourceContentsFilterRequirement = ServiceCapabilityFactory.createRequirement(ResourceContentsFilter.class);		
		List<ResourceContentsFilter> filters = loader.getCapabilityLoader().loadAll(resourceContentsFilterRequirement, progressMonitor);		
		return new WorkbookResourceFactory(filters);
	}
	
	@Override
	protected String getExtension() {
		return "csv";
	}

}
