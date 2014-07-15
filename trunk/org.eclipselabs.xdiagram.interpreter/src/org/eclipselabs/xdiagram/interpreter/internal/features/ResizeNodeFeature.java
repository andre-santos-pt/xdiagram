package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class ResizeNodeFeature extends DefaultResizeShapeFeature {
	
	private GenericFeatureProvider provider;
    
    public ResizeNodeFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;
	}
 
    @Override
    public boolean canResizeShape(IResizeShapeContext context) {
        return 
        		super.canResizeShape(context) && 
        		provider.getGraphicsProvider().canResizeNodeFigure(context.getPictogramElement().getGraphicsAlgorithm());
    }
    
  @Override
  public void resizeShape(IResizeShapeContext context) {
	  GraphicsAlgorithm figure = context.getPictogramElement().getGraphicsAlgorithm();
	  ContainerShape container = (ContainerShape) context.getPictogramElement();
	  
	  figure.setX(context.getX());
      figure.setY(context.getY());
      
      // TODO
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
