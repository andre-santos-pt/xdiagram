package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
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
    	if( context.getPictogramElement().getLink() == null)
    		return false;
    	
        boolean canMove = super.canMoveShape(context);
        
        GraphicsAlgorithm figure = context.getPictogramElement().getGraphicsAlgorithm();
        return canMove && provider.getGraphicsProvider().canMoveNodeFigure(figure);        
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
