package org.eclipselabs.xdiagram.interpreter.internal.features;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.xdiagram.interpreter.GraphicsProvider;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class UpdateNodeFeature extends AbstractUpdateFeature {
 
	private GraphicsProvider provider;
	
	private static ArrayList<UpdateNodeFeature> updateFeatures = new ArrayList<UpdateNodeFeature>();
	
    public static ArrayList<UpdateNodeFeature> getInstances(){
    	return updateFeatures;
    }
	
	public UpdateNodeFeature(IFeatureProvider fp, GraphicsProvider provider) {
		super(fp);
		this.provider = provider;
		
		if (!updateFeatures.contains(this))
			updateFeatures.add(this);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
//		 Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return context.getPictogramElement() instanceof Diagram;
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {

		if(context.getPictogramElement() instanceof Diagram)
			return Reason.createTrueReason();
		else
			return Reason.createFalseReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		PictogramElement pe = context.getPictogramElement();
		// TODO: link root object
		//EObject eObject = (EObject) getBusinessObjectForPictogramElement(diagram); 
		if ( pe instanceof Diagram )
			provider.update((Diagram)pe);
		else
			provider.updateElement(getDiagram(), pe);
		return true;
	}
} 