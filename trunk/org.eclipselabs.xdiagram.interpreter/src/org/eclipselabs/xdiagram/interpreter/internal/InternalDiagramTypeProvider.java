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


import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.platform.IDiagramBehavior;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.ProviderException;
import org.eclipselabs.xdiagram.interpreter.internal.Activator.LanguageDescription;

public class InternalDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] providers;

	private GenericFeatureProvider featureProvider;

	public InternalDiagramTypeProvider() {
		featureProvider = new GenericFeatureProvider(this);
		setFeatureProvider(featureProvider);
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

	@Override
	public void init(final Diagram diagram, IDiagramBehavior diagramBehavior) {
		super.init(diagram, diagramBehavior);	
		EClass eClass =  featureProvider.getRootClass();
	
		// TODO: read from file
		final EObject root = eClass.getEPackage().getEFactoryInstance().create(eClass);

		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(diagram);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			public void doExecute() {
				try {
					FileUtil.persistEObjectIfEmpty(root, diagram);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		featureProvider.getGraphicsProvider().loadDiagram(diagram, root);
	}

}
