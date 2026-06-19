package org.nasdanika.models.excel.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CompletionStage;

import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.emf.ResourceContentsHandler;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.excel.Workbook;

/**
 * Provides an {@link OpenAIClient} instance.  
 */
public class CSVResourceContentHandlerCapabilityFactory extends ServiceCapabilityFactory<org.nasdanika.capability.emf.ResourceContentsHandler.Requirement, ResourceContentsHandler<Workbook>> {

	@Override
	public boolean isFor(Class<?> type, Object serviceRequirement) {
		return ResourceContentsHandler.class.equals(type) 
				&& serviceRequirement instanceof ResourceContentsHandler.Requirement handlerRequirement
				&& match(handlerRequirement);
	}

	private boolean match(org.nasdanika.capability.emf.ResourceContentsHandler.Requirement handlerRequirement) {
		return Workbook.class.equals(handlerRequirement.getContentsType())
				&& handlerRequirement.getQualifierIndex() == 0
				&& "csv".equalsIgnoreCase(handlerRequirement.getQualifiers()[0]);
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<ResourceContentsHandler<Workbook>>>> createService(
			Class<ResourceContentsHandler<Workbook>> serviceType, 
			org.nasdanika.capability.emf.ResourceContentsHandler.Requirement serviceRequirement, 
			final Loader loader,
			ProgressMonitor progressMonitor) {
		
		ResourceContentsHandler<Workbook> workbookHandler = new ResourceContentsHandler<Workbook>() {

			@Override
			public Order getOrder() {
				return Order.of(0);
			}

			@Override
			public Workbook load(InputStream inputStream, Map<?, ?> options) throws IOException {
				CSVLoader workbookLoader = new CSVLoader();
				return workbookLoader.load(inputStream);
			}

			@Override
			public void save(Workbook contents, OutputStream outputStream, Map<?, ?> options) throws IOException {
				CSVSaver saver = new CSVSaver();
				saver.save(contents, outputStream);
			}
			
		};

		return wrap(workbookHandler);
	}

}
