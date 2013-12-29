package org.eclipselabs.xdiagram.interpreter.internal.features;

import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
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
	    return org.eclipse.graphiti.func.IDirectEditing.TYPE_TEXT;
	}
	
	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
	    PictogramElement pe = context.getPictogramElement();
	    GraphicsAlgorithm ga = context.getGraphicsAlgorithm();

	    if (ga instanceof AbstractText){
	    	figureLabel = provider.getGraphicsProvider().canEditFigureLabel(ga) ? ga : null;	    	
	    }else{
		    ContainerShape container = ((Shape) pe).getContainer();
		    figureLabel = provider.getGraphicsProvider().getFigureLabel(getDiagram(), container);
	    }
	    return figureLabel != null;	    
	}
	

	
	public String getInitialValue(IDirectEditingContext context) {
	    return provider.getGraphicsProvider().getFigureLabelValue(figureLabel);
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
	
	public void setValue(String value, IDirectEditingContext context) {
	    provider.getGraphicsProvider().updateFigureLabel(getDiagram(), figureLabel, value);
	}
	
}
