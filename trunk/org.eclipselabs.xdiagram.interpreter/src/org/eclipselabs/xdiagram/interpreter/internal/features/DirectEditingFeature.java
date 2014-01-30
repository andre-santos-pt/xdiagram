package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.xdiagram.interpreter.internal.GenericFeatureProvider;

public class DirectEditingFeature extends AbstractDirectEditingFeature {
	
	private GenericFeatureProvider provider;
	private GraphicsAlgorithm figureLabel;
	 
	public DirectEditingFeature(GenericFeatureProvider provider) {
		super(provider);
//		this.eObject = eObject;
		this.provider = provider;
	}
	
	public int getEditingType() {
	    // there are several possible editor-types supported:
	    // text-field, checkbox, color-chooser, combobox, ...
		// TODO: interessante
	    return org.eclipse.graphiti.func.IDirectEditing.TYPE_TEXT;
	}
	
	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
	    PictogramElement pe = context.getPictogramElement();
	    GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
	    if(pe.getLink() == null)
	    	return false;
	    
	    EObject eObject = pe.getLink().getBusinessObjects().get(0);
	    if (ga instanceof AbstractText){
	    	figureLabel = provider.getGraphicsProvider().canEditFigureLabel(ga, eObject) ? ga : null;	    	
	    }else{
	    	// TODO:Eduardo
		    ContainerShape container = ((Shape) pe).getContainer();
//		    figureLabel = provider.getGraphicsProvider().getFigureLabel(getDiagram(), container);
	    }
	    return figureLabel != null;	    
	}
	

	@Override	
	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		EObject eObject = pe.getLink().getBusinessObjects().get(0);
		EAttribute att = provider.getGraphicsProvider().getTextEditableAttribute(eObject.eClass());
		return "" + eObject.eGet(att); 
//		return provider.getGraphicsProvider().getFigureLabelValue(figureLabel);
	}
	
	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
//	    if (value.length() < 1)
//	        return "Please enter any text.";
//	    if (value.contains("\n"))
//	        return "Line breakes are not allowed.";
	
	    // null means, that the value is valid
	    return null;
	}
	
	@Override
	public void setValue(String value, IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		EObject eObject = pe.getLink().getBusinessObjects().get(0);
		
		EAttribute att = provider.getGraphicsProvider().getTextEditableAttribute(eObject.eClass());
		
		eObject.eSet(att, value);
		
//	    provider.getGraphicsProvider().updateFigureLabel(getDiagram(), figureLabel, value);
	}
	
}
