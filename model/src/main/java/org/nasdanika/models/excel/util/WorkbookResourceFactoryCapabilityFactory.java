package org.nasdanika.models.excel.util;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ContentsHandlingResourceFactory;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

public class WorkbookResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		return new ContentsHandlingResourceFactory(loader.getCapabilityLoader(), progressMonitor);
	}
	
	@Override
	protected String getExtension() {
		return "xlsx";
	}

}
