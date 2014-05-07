package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.awt.Dimension;
import java.awt.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.DefaultColor;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Size;
import org.eclipselabs.xdiagram.dsl.TextValue;

public class TextValueHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return TextValue.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, final Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		TextValue v = (TextValue) feature;
		String value = "";
		final AbstractText text = (AbstractText) figure;
		final EAttribute att = v.getModelAttribute();
		
		//figure.setBackground(Graphiti.getGaService().manageColor(diagram, ColorConstant.WHITE));
		//figure.setForeground(Graphiti.getGaService().manageColor(diagram, ColorConstant.BLACK));
		
		if(att != null) {
//			final EAttribute a = Util.matchAttribute(eObject.eClass(), att);	
			value += eObject.eGet(att);
			eObject.eAdapters().add(new AdapterImpl() {	
				@Override
				public void notifyChanged(Notification notification) {
					if(att.equals(notification.getFeature())){
						String newvalue = notification.getNewStringValue();
						org.eclipse.graphiti.mm.algorithms.styles.Font font = text.getFont()!=null ? text.getFont() :
							Graphiti.getGaService().manageDefaultFont(diagram, false, false);
						IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(newvalue, font);		
						text.setValue(newvalue);
						text.setWidth(dim.getWidth());
						text.setHeight(dim.getHeight());
						
//						try{						
//							int posX = text.getX();
//							Object container = text.getPictogramElement().eContainer();
//							while ( container!=null && container instanceof ContainerShape 
//									&& ((ContainerShape)container).getLink()==null ){
//								container = ((Shape)container).eContainer();
//								posX += ((Shape)container).getGraphicsAlgorithm().getX();
//							}
//							if ( container!=null && container instanceof ContainerShape
//								 && posX+text.getWidth() >
//								((Shape)container).getGraphicsAlgorithm().getWidth() ){
//								((Shape)container).getGraphicsAlgorithm().setWidth(posX+text.getWidth());;
//							}							
//						}
//						catch(Exception e) {
//						}
					
					
					}
				}
			});
		}
		else {
			value += v.getText();
		}
		
	}

	

	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		if(figure instanceof AbstractText)
			((AbstractText) figure).setValue("?");
	}
	
	
	@Override
	public boolean isStyle() {
		return true;
	}
	
	@Override
	public void update(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure, 
			Point location, DimensionFactor diff){

	}
	
	
}
