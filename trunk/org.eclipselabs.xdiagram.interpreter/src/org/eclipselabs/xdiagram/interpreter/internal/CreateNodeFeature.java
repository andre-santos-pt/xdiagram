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
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;


public class CreateNodeFeature extends AbstractAddShapeFeature {

	private GenericFeatureProvider provider;

	public CreateNodeFeature(GenericFeatureProvider provider, EObject parent) {
		super(provider);
		this.provider = provider;
	}

	public boolean canAdd(IAddContext context) {
		final EObject eObject = (EObject) context.getNewObject();
		ContainerShape container = context.getTargetContainer();
		return ECoreUtil.matchContainment(container, provider.getRootClass(), eObject.eClass());
	}

	public PictogramElement add(IAddContext context) {
		final EObject eObject = (EObject) context.getNewObject();
		final ContainerShape container = context.getTargetContainer();

		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(container, true);

		provider.getGraphicsProvider().createNodeFigure(getDiagram(), context, containerShape, eObject);

//		if (eObject.eResource() == null) {
//			getDiagram().eResource().getContents().add(eObject);
//		}

		// create link and wire it
		link(containerShape, eObject);

		// provide information to support direct-editing directly
		// after object creation (must be activated additionally)
		final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		// set container shape for direct editing after object creation
		directEditingInfo.setMainPictogramElement(containerShape);
		// set shape and graphics algorithm where the editor for
		// direct editing shall be opened after object creation
		//			directEditingInfo.setPictogramElement(shape);
		directEditingInfo.setPictogramElement(containerShape);

		// add a chopbox anchor to the shape
		//peCreateService.createChopboxAnchor(containerShape);


		// call the layout feature
		layoutPictogramElement(containerShape);

		provider.getGraphicsProvider().updateNodeFigure(getDiagram(), containerShape);		

		return containerShape;
	}
}
