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
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;


public class CreateNodeFeature extends AbstractAddShapeFeature {

	private GenericFeatureProvider provider;

	public CreateNodeFeature(GenericFeatureProvider provider, EObject parent) {
		super(provider);
		this.provider = provider;
	}

	public boolean canAdd(IAddContext context) {
		final EObject newObject = (EObject) context.getNewObject();
		ContainerShape container = context.getTargetContainer();

		if(container instanceof Diagram)
			return ECoreUtil.matchContainment(container, provider.getRootClass(), newObject.eClass());

		boolean b = provider.getGraphicsProvider().canAddChild(container, newObject.eClass());
		return b;
	}

	public PictogramElement add(IAddContext context) {
		final EObject eObject = (EObject) context.getNewObject();

		ContainerShape container = context.getTargetContainer();

		final ContainerShape containerShape =  Graphiti.getPeCreateService().createContainerShape(container, true);

		GraphicsAlgorithm fig = provider.getGraphicsProvider().createNodeFigure(getDiagram(), context, containerShape, eObject);

		link(containerShape, eObject);

//		AbstractText text = provider.getGraphicsProvider().getFigureLabel(containerShape); 
//
//		if(text != null) {
//			IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
//			directEditingInfo.setMainPictogramElement(containerShape);
//			directEditingInfo.setPictogramElement((ContainerShape) text.eContainer());
//			directEditingInfo.setGraphicsAlgorithm(text);
//		}
		layoutPictogramElement(containerShape);

		if(!(container instanceof Diagram)) {
			ContainerShape c = container;
			while(!(c.eContainer() instanceof Diagram))
				c = (ContainerShape) c.eContainer();
			
			provider.getGraphicsProvider().update(c);
		}
		
		return containerShape;
	}
	
	
}
