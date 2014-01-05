package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.EnumMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.Color;
import org.eclipselabs.xdiagram.dsl.ColorFeature;
import org.eclipselabs.xdiagram.dsl.CustomColor;
import org.eclipselabs.xdiagram.dsl.DefaultColor;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;

public class ColorHandler implements FeatureHandler {

	private static EnumMap<DefaultColor, ColorConstant> map;
	
	//http://en.wikipedia.org/wiki/Web_colors
	static {
		map = new EnumMap<>(DefaultColor.class);
		map.put(DefaultColor.WHITE, new ColorConstant(255, 255, 255));
		map.put(DefaultColor.SILVER, new ColorConstant(172, 172, 172));
		map.put(DefaultColor.GRAY, new ColorConstant(127, 127, 127));
		map.put(DefaultColor.BLACK, new ColorConstant(0, 0, 0));
		map.put(DefaultColor.RED, new ColorConstant(255, 0, 0));
		map.put(DefaultColor.MAROON, new ColorConstant(127, 0, 0));
		map.put(DefaultColor.YELLOW, new ColorConstant(255, 255, 0));
		map.put(DefaultColor.OLIVE, new ColorConstant(127, 127, 0));
		map.put(DefaultColor.LIME, new ColorConstant(0, 255, 0));
		map.put(DefaultColor.GREEN, new ColorConstant(0, 127, 0));
		map.put(DefaultColor.AQUA, new ColorConstant(0, 255, 255));
		map.put(DefaultColor.TEAL, new ColorConstant(0, 127, 127));
		map.put(DefaultColor.BLUE, new ColorConstant(0, 0, 255));
		map.put(DefaultColor.NAVY, new ColorConstant(0, 0, 127));
		map.put(DefaultColor.FUCHSIA, new ColorConstant(255, 0, 255));
		map.put(DefaultColor.PURPLE, new ColorConstant(127, 0, 127));
	}
	
	@Override
	public boolean accept(FeatureContainer element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof ColorFeature;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {

		ColorFeature colorFeature = (ColorFeature) feature;
		Color c = colorFeature.getColor();
		org.eclipse.graphiti.mm.algorithms.styles.Color cg = null;
		if(c.getCustom() != null) {
			CustomColor cc = c.getCustom();
			cg = Graphiti.getGaService().manageColor(diagram, (new ColorConstant(cc.getR(), cc.getG(), cc.getB())));
		}
		else {
			cg = Graphiti.getGaService().manageColor(diagram, (map.get(c.getDefault())));
		}

		switch(colorFeature.getType()) {
		case "background": figure.setBackground(cg); break;
		case "foreground": figure.setForeground(cg); break;
		}
	}

	@Override
	public void setDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		figure.setBackground(Graphiti.getGaService().manageColor(diagram, map.get(DefaultColor.WHITE)));
		figure.setForeground(Graphiti.getGaService().manageColor(diagram, map.get(DefaultColor.BLACK)));
	}

	@Override
	public boolean acceptDefaults(FeatureContainer element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return true;
	}



}
