package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.models.excel.Workbook;

/**
 * Creates resources loading data from MS Excel using provided {@link XSSWorkbookLoader}. 
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
				loadContents(workbook, this);
			}
			
			@Override
			protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
				getSaver(this).save((Workbook) getContents().get(0), outputStream);
			}
			
		};
	}
	
	/**
	 * Override to customize, e.g. transform the workbook to something else
	 * @param workbook
	 * @param resource
	 */
	protected void loadContents(Workbook workbook, Resource resource) {
		resource.getContents().addAll(workbook.getSheets());		
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
