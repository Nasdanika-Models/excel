package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.nasdanika.capability.emf.ContentsFilteringResource;
import org.nasdanika.capability.emf.ResourceContentsFilter;
import org.nasdanika.models.excel.Workbook;

/**
 * Creates resources loading data from MS Excel using provided {@link XSSWorkbookLoader}. 
 * @author Pavel
 *
 */
public class WorkbookResourceFactory extends ResourceFactoryImpl {
	
	protected Collection<ResourceContentsFilter> filters;
	
	public WorkbookResourceFactory(Collection<ResourceContentsFilter> filters) {
		this.filters = filters;
	}
	
	
	@Override
	public Resource createResource(URI uri) {
		return new ContentsFilteringResource(uri, filters) {
			
			@Override
			protected List<EObject> loadContents(InputStream inputStream, Map<?, ?> options) throws IOException {
				Workbook workbook = getLoader(this).load(inputStream);
				return List.of(workbook);
			}
			
			@Override
			protected void saveContents(List<EObject> contents, OutputStream outputStream, Map<?, ?> options) throws IOException {
				getSaver(this).save((Workbook) contents.get(0), outputStream);
			}
			
		};
	}

	protected WorkbookLoader getLoader(Resource resource) {
		if (resource.getURI().toString().toLowerCase().endsWith(".csv")) {
			return new CSVLoader();
		}
		return new XSSWorkbookLoader();
	}
	
	protected WorkbookSaver getSaver(Resource resource) {
		if (resource.getURI().toString().toLowerCase().endsWith(".csv")) {
			return new CSVSaver();
		}
		return new XSSWorkbookSaver();
	}
			
}
