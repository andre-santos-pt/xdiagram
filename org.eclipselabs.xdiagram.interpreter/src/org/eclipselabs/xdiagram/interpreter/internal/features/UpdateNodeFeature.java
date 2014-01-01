package org.eclipselabs.xdiagram.interpreter.internal.features;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class UpdateNodeFeature extends AbstractUpdateFeature {
 
	private GenericFeatureProvider provider;
	
	private static ArrayList<UpdateNodeFeature> updateFeatures = new ArrayList<UpdateNodeFeature>();
	private static ArrayList<GenericFeatureProvider> updateProvides = new ArrayList<GenericFeatureProvider>();
    
    public UpdateNodeFeature(GenericFeatureProvider provider) {
		super(provider);
		this.provider = provider;

		if (!updateFeatures.contains(this))
			updateFeatures.add(this);	
		if (!updateProvides.contains(provider))
			updateProvides.add(provider);	
	}
    
    public static ArrayList<UpdateNodeFeature> getInstances(){
    	return updateFeatures;
    }
    
    public static ArrayList<GenericFeatureProvider> getProviders(){
    	return updateProvides;
    }
 
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a EClass
//        Object bo =
//            getBusinessObjectForPictogramElement(context.getPictogramElement());
//        return (bo instanceof EClass);
    	return true;
    }
 
    public IReason updateNeeded(IUpdateContext context) {
//        // retrieve name from pictogram model
//        String pictogramName = null;
//        PictogramElement pictogramElement = context.getPictogramElement();
//        if (pictogramElement instanceof ContainerShape) {
//            ContainerShape cs = (ContainerShape) pictogramElement;
//            for (Shape shape : cs.getChildren()) {
//                if (shape.getGraphicsAlgorithm() instanceof Text) {
//                    Text text = (Text) shape.getGraphicsAlgorithm();
//                    pictogramName = text.getValue();
//                }
//            }
//        }
// 
//        // retrieve name from business model
//        String businessName = null;
//        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
//        if (bo instanceof EClass) {
//            EClass eClass = (EClass) bo;
//            businessName = eClass.getName();
//        }
// 
//        // update needed, if names are different
//        boolean updateNameNeeded =
//            ((pictogramName == null && businessName != null) || 
//                (pictogramName != null && !pictogramName.equals(businessName)));
//        if (updateNameNeeded) {
//            return Reason.createTrueReason("Name is out of date");
//        } else {
//            return Reason.createFalseReason();
//        }
    	return Reason.createFalseReason();
    }
    
    
    public boolean update(PictogramElement pe) {
//    	EObject eObject = pe.getLink().getBusinessObjects().get(0);
    
//	  	System.out.println("UPDATED!!!!!!!!" + eObject);
	  	
//	  	if ( pe instanceof Connection )
//	  		provider.getGraphicsProvider().updateLinkFigure(getDiagram(), (Connection)pe);
//	  	else
//	  		provider.getGraphicsProvider().updateNodeFigure(getDiagram(), (ContainerShape)pe, pe.getGraphicsAlgorithm(), eObject);  
	  	//this.updatePictogramElement(pe);
	  	
	  	return true;
  }
    
    
 
    public boolean update(IUpdateContext context) {
    	
//        // retrieve name from business model
//        String businessName = null;
//        PictogramElement pictogramElement = context.getPictogramElement();
//        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
//        if (bo instanceof EClass) {
//            EClass eClass = (EClass) bo;
//            businessName = eClass.getName();
//        }
// 
//        // Set name in pictogram model
//        if (pictogramElement instanceof ContainerShape) {
//            ContainerShape cs = (ContainerShape) pictogramElement;
//            for (Shape shape : cs.getChildren()) {
//                if (shape.getGraphicsAlgorithm() instanceof Text) {
//                    Text text = (Text) shape.getGraphicsAlgorithm();
//                    text.setValue(businessName);
//                    return true;
//                }
//            }
//        }
// 
//        return false;
    	
    	return update(context.getPictogramElement());
    }
} 