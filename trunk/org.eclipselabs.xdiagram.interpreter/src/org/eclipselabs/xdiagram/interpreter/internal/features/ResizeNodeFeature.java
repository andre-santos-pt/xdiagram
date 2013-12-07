package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class ResizeNodeFeature extends DefaultResizeShapeFeature {
	
	private GenericFeatureProvider provider;
    
    public ResizeNodeFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;
	}
 
    @Override
    public boolean canResizeShape(IResizeShapeContext context) {
        boolean canResize = super.canResizeShape(context);
        GraphicsAlgorithm figure = context.getPictogramElement().getGraphicsAlgorithm();
        return canResize && provider.getGraphicsProvider().canResizeNodeFigure(figure);
    }
    
  @Override
  public void resizeShape(IResizeShapeContext context) {
	  GraphicsAlgorithm figure = context.getPictogramElement().getGraphicsAlgorithm();
	  ContainerShape container = (ContainerShape) context.getPictogramElement();
	  
	  figure.setX(context.getX());
      figure.setY(context.getY());
      provider.getGraphicsProvider().resizeNodeFigure(getDiagram(), 
    		  container, context.getWidth(), context.getHeight());
      
      
   }
    
//    @Override
//    public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
//        Shape shape = context.getShape();
//        Object bo = getBusinessObjectForPictogramElement(shape);
//        if (bo instanceof EClass) {
//            return new TutorialResizeEClassFeature(this);
//        }
//        return super.getResizeShapeFeature(context);
//     }
    
 }
