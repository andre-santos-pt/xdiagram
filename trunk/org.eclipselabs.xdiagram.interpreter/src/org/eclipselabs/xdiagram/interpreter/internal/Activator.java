package org.eclipselabs.xdiagram.interpreter.internal;

import static org.eclipselabs.xdiagram.interpreter.ExtensionPointIds.BINDINGS_EPACKAGE_URI;
import static org.eclipselabs.xdiagram.interpreter.ExtensionPointIds.PROVIDERS_ID;
import static org.eclipselabs.xdiagram.interpreter.ExtensionPointIds.PROVIDERS_PROVIDER;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipselabs.xdiagram.interpreter.ExtensionPointIds;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.internal.Activator.LanguageDescription;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	static class LanguageDescription {
		final GraphicsProvider provider;
		final String ecoreURI;
		final Map<String, String> properties;
		final Bundle bundle;
		
		LanguageDescription(GraphicsProvider provider, String ecoreURI, Map<String, String> properties, Bundle bundle) {
			this.provider = provider;
			this.ecoreURI = ecoreURI;
			this.properties = properties;
			this.bundle = bundle;
		}
	}
	
	private static Activator instance;
	
	private Map<String, LanguageDescription> providers;

	public Activator() {
		providers = new HashMap<String, LanguageDescription>();
		instance = this;
	}

	public static Activator getInstance() {
		return instance;
	}
	
	public void start(BundleContext context) throws Exception {
		loadProviders();
	}

	private void loadProviders() {
		for(IConfigurationElement reg : Platform.getExtensionRegistry().getConfigurationElementsFor(PROVIDERS_ID)) {
			Bundle bundle = Platform.getBundle(reg.getContributor().getName());
			String uri = reg.getAttribute(BINDINGS_EPACKAGE_URI);
			GraphicsProvider provider = null;
			try {
				provider = (GraphicsProvider) reg.createExecutableExtension(PROVIDERS_PROVIDER);
			} catch (CoreException e) {
				e.printStackTrace();
			}	
			Map<String, String> properties = new HashMap<String, String>();
			IConfigurationElement[] props = reg.getChildren("property");
			for(IConfigurationElement p : props) {
				properties.put(p.getAttribute("id"), p.getAttribute("value"));
			}
			LanguageDescription desc = new LanguageDescription(provider, uri, properties, bundle);
			
			providers.put(reg.getAttribute(ExtensionPointIds.BINDINGS_DIAGRAM_TYPE), desc);
		}			
	}
	
	public void stop(BundleContext context) throws Exception {

	}

	public boolean existsDiagramType(String diagramType) {
		return providers.containsKey(diagramType);
	}
	
	public LanguageDescription getLanguageProvider(String diagramType) {
		return providers.get(diagramType);
	}

//	LanguageDescription createProvider(String diagramType) {
//		if(providers.containsKey(diagramType)) {
//			IConfigurationElement conf = providers.get(diagramType);
//			Bundle bundle = Platform.getBundle(conf.getContributor().getName());
//			String uri = conf.getAttribute(BINDINGS_EPACKAGE_URI);
//			GraphicsProvider provider = null;
//			try {
//				provider = (GraphicsProvider) conf.createExecutableExtension(PROVIDERS_PROVIDER);
//			} catch (CoreException e) {
//				e.printStackTrace();
////				provider = new StandardGraphicsProvider();
//			}
//			Map<String, String> properties = new HashMap<String, String>();
//			IConfigurationElement[] props = conf.getChildren("property");
//			for(IConfigurationElement p : props) {
//				properties.put(p.getAttribute("id"), p.getAttribute("value"));
//			}
//			return new LanguageDescription(provider, uri, properties, bundle);
//		}		
//		else {
//			throw new IllegalArgumentException("diagram type not found - " + diagramType);
//		}
//	}

	

}