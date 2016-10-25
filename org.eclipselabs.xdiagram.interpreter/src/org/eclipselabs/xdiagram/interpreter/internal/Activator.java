/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.xdiagram.interpreter.internal;

import static org.eclipselabs.xdiagram.interpreter.ExtensionPointIds.BINDINGS_EPACKAGE_URI;
import static org.eclipselabs.xdiagram.interpreter.ExtensionPointIds.XDIAGRAM_PROVIDERS_EXT;
import static org.eclipselabs.xdiagram.interpreter.ExtensionPointIds.XDIAGRAM_PROVIDERS_PROVIDER;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipselabs.xdiagram.interpreter.ExtensionPointIds;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	static class LanguageDescription {
		private final IConfigurationElement providerConf;
		private final String ecoreURI;
		private final Map<String, String> properties;
		private final Bundle bundle;
		
		LanguageDescription(IConfigurationElement providerConf, String ecoreURI, Map<String, String> properties, Bundle bundle) {
			this.providerConf = providerConf;
			this.ecoreURI = ecoreURI;
			this.properties = properties;
			this.bundle = bundle;
		}
		
		String getEcoreURI () {
			return ecoreURI;
		}
		
		Map<String, String> getProperties() {
			return Collections.unmodifiableMap(properties);
		}
		
		Bundle getBundle() {
			return bundle;
		}
		
		GraphicsProvider createProvider() {
			try {
				return (GraphicsProvider) providerConf.createExecutableExtension(XDIAGRAM_PROVIDERS_PROVIDER);
			} catch (CoreException e) {
				e.printStackTrace();
				return null;
			}	
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
		for(IConfigurationElement reg : Platform.getExtensionRegistry().getConfigurationElementsFor(XDIAGRAM_PROVIDERS_EXT)) {
			Bundle bundle = Platform.getBundle(reg.getContributor().getName());
			String uri = reg.getAttribute(BINDINGS_EPACKAGE_URI);
//			GraphicsProvider provider = null;
//			try {
//				provider = (GraphicsProvider) reg.createExecutableExtension(XDIAGRAM_PROVIDERS_PROVIDER);
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}	
			Map<String, String> properties = new HashMap<String, String>();
			IConfigurationElement[] props = reg.getChildren("property");
			for(IConfigurationElement p : props) {
				properties.put(p.getAttribute("id"), p.getAttribute("value"));
			}
			LanguageDescription desc = new LanguageDescription(reg, uri, properties, bundle);
			
			providers.put(reg.getAttribute(ExtensionPointIds.BINDINGS_DIAGRAM_TYPE), desc);
		}			
	}
	
	public void stop(BundleContext context) throws Exception {

	}

	public boolean existsDiagramType(String diagramType) {
		return providers.containsKey(diagramType);
	}
	
	public LanguageDescription getLanguageDescription(String diagramType) {
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