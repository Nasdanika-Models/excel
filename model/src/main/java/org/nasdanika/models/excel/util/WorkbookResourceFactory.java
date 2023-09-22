package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.excel.Workbook;

/**
 * Creates resources loading data from MS Excel using provided {@link WorkbookLoader}. 
 * @author Pavel
 *
 */
public class WorkbookResourceFactory extends ResourceFactoryImpl {
	
	@Override
	public Resource createResource(URI uri) {
		return new ResourceImpl(uri) {

			@Override
			protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
				Workbook workbook = getLoader(this).load(inputStream);
				getContents().addAll(workbook.getSheets());
			}
			
		};
	}

	protected WorkbookLoader getLoader(Resource resource) {
		return new WorkbookLoader();
	}
		
}
