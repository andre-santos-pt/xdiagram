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
package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class MoveNodeFeature extends DefaultMoveShapeFeature {
 
	private GenericFeatureProvider provider;
    
    public MoveNodeFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;
	}
 
    @Override
    public boolean canMoveShape(IMoveShapeContext context) {   
    	PictogramLink link = context.getPictogramElement().getLink();
    	if(link == null)
    		return false;
    	
        return super.canMoveShape(context) && provider.getGraphicsProvider().canMoveNode(context.getPictogramElement());        
    }
    
    @Override
    public void moveShape(IMoveShapeContext context) {
    	GraphicsAlgorithm figure = context.getPictogramElement().getGraphicsAlgorithm();
//    	figure.setX(context.getX());
//      figure.setY(context.getY());
//    	ContainerShape container = (ContainerShape) context.getPictogramElement();
//    	EObject eObject = context.getPictogramElement().getLink().getBusinessObjects().get(0);
    	Graphiti.getGaLayoutService().setLocation(figure, context.getX(), context.getY());
//    	provider.getGraphicsProvider().updateNodeFigure(getDiagram(), container, context.getPictogramElement().getGraphicsAlgorithm(), eObject);
//    	Shape s = (Shape) context.getPictogramElement();
//    	
//    	s.getContainer().eNotify(
//    			new ENotificationImpl((InternalEObject) s, Notification.SET, null, null, null));
    }
    
}
