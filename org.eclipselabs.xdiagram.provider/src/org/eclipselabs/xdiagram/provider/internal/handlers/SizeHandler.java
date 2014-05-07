package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.awt.Dimension;
import java.awt.Point;
import java.lang.reflect.Constructor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipselabs.xdiagram.provider.internal.DimensionFactor;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Ellipse;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Rectangle;
import org.eclipselabs.xdiagram.dsl.Size;

public class SizeHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Size.class;
	}
	
	@Override
	public boolean isStyle() {
		return false;
	}
	
	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {		
		Size feature;
		try {
			for (Constructor<?> constructor : Size.class.getDeclaredConstructors()){
				if (constructor.getParameterTypes().length==0){
					constructor.setAccessible(true);
					feature = (Size) constructor.newInstance(new Object[0]);
					feature.setWidth(100);
					feature.setHeight(50);
					update(element, feature, null, diagram, null, figure,
							new Point(0, 0), new DimensionFactor(1.0, 1.0));
					break;
				}
			}					
		} catch (Exception e) {
			System.err.println("Error On applyDefaults: " + e.getMessage());
		}
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		update(element, feature, eObject, diagram, container, figure,
				new Point(0, 0), new DimensionFactor(1.0, 1.0));
	}
	
	@Override
	public void update(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure, 
			Point location, DimensionFactor scale){
		Size size = (Size) feature;
		int w = size.getWidth();
		int h = size.getHeight();
		
		if(element instanceof Rectangle && ((Rectangle) element).isSquare() ||
		   element instanceof Ellipse && ((Ellipse) element).isCircle()) {
			int max = Math.max(w, h);
			w = max;
			h = max;
		}
		
		w = (int)(w*scale.width);
		h = (int)(h*scale.height);
		
		if(figure instanceof AbstractText) {
			AbstractText text = (AbstractText) figure;
			org.eclipse.graphiti.mm.algorithms.styles.Font font = text.getFont()!=null ? text.getFont() :
				Graphiti.getGaService().manageDefaultFont(diagram, false, false);
			IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(text.getValue(), font);		
			w = dim.getWidth();
			h = dim.getHeight();
		}		
		
		Graphiti.getGaService().setSize(figure, w, h);
	}
	
	
}
