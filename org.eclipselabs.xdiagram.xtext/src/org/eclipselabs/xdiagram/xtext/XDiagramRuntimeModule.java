/*
 * generated by Xtext
 */
package org.eclipselabs.xdiagram.xtext;

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class XDiagramRuntimeModule extends org.eclipselabs.xdiagram.xtext.AbstractXDiagramRuntimeModule {

	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return ImportedNamespaceAwareLocalScopeProvider.class;
	}
	
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return ImportUriGlobalScopeProvider.class;
	}
}