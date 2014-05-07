/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipselabs.xdiagram.interpreter.internal;


import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.interpreter.internal.Activator.LanguageDescription;

public class InternalDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] providers;

	public InternalDiagramTypeProvider() {
		setFeatureProvider(new GenericFeatureProvider(this));
	}

	@Override
	public final IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		String diagramType = getDiagram().getDiagramTypeId();
		LanguageDescription desc = Activator.getInstance().getLanguageProvider(diagramType);
		
		if (providers == null)
			providers = new IToolBehaviorProvider[] { new ToolBehaviorProvider(this, desc.provider) };

		return providers;
	}

	@Override
	public final boolean isAutoUpdateAtStartup() {
		return true;
	}

	@Override
	public final boolean isAutoUpdateAtRuntimeWhenEditorIsSaved() {
		return super.isAutoUpdateAtRuntimeWhenEditorIsSaved();
	}
	
	
}
