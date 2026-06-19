package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CompletionStage;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.excel.Workbook;

/**
 * Provides an {@link OpenAIClient} instance.  
 */
public class CSVArrayResourceContentHandlerCapabilityFactory extends ServiceCapabilityFactory<org.nasdanika.capability.emf.ResourceContentsHandler.Requirement, ResourceContentsHandler<EObject[]>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type) 
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& match(handlerRequirement);
	}

	private boolean match(org.nasdanika.capability.emf.ResourceContentsHandler.Requirement handlerRequirement) {
		return EObject[].class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() == 0
				&& "csv".equalsIgnoreCase(handlerRequirement.getQualifiers()[0]);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<EObject[]>>>> createService(
			Class<ResourceContentsHandler<EObject[]>> serviceType, 
			org.nasdanika.capability.emf.ResourceContentsHandler.Requirement serviceRequirement, 
			final Loader loader,
			ProgressMonitor progressMonitor) {
		
		ResourceContentsHandler<EObject[]> workbookHandler = new ResourceContentsHandler<EObject[]>() {

			@Override
			public Order getOrder() {
				return Order.of(0);
			}

			@Override
			public EObject[] load(InputStream inputStream, Map<?, ?> options) throws IOException {
				CSVLoader workbookLoader = new CSVLoader();
				return new EObject[] { workbookLoader.load(inputStream) };
			}

			@Override
			public void save(EObject[] contents, OutputStream outputStream, Map<?, ?> options) throws IOException {
				CSVSaver saver = new CSVSaver();
				saver.save((Workbook) contents[0], outputStream);
			}
			
		};

		return wrap(workbookHandler);
	}

}
