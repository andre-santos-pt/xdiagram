/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2011 SAP AG.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;


public class CreateConnectionFeature extends AbstractAddFeature {

	private GenericFeatureProvider provider;
	
	public CreateConnectionFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;
	}
	

	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		EObject eObject = (EObject) context.getNewObject();

		Connection connection = provider.getGraphicsProvider().getConnectionFigure(getDiagram(), 
				addConContext.getSourceAnchor(), 
				addConContext.getTargetAnchor(), 
				eObject);

		if(eObject != null)
			link(connection, eObject);
		
//		provider.getGraphicsProvider().updateLinkFigure(getDiagram(), connection);

		return connection;
	}

	public boolean canAdd(IAddContext context) {
		return context instanceof IAddConnectionContext;
	}
}
