/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
package pt.iscte.xdiagram.provider.internal.handlers;

import java.util.EnumMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.ColorConstant;

import pt.iscte.xdiagram.dsl.model.Color;
import pt.iscte.xdiagram.dsl.model.ColorFeature;
import pt.iscte.xdiagram.dsl.model.CustomColor;
import pt.iscte.xdiagram.dsl.model.DefaultColor;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.provider.internal.FeatureHandler;

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
	public Class<? extends Feature> getTargetFeature() {
		return ColorFeature.class;
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
		case "background": 
			figure.setBackground(cg); break;
		case "foreground": 
			figure.setForeground(cg); break;
		}
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		figure.setBackground(Graphiti.getGaService().manageColor(diagram, map.get(DefaultColor.WHITE)));
		figure.setForeground(Graphiti.getGaService().manageColor(diagram, map.get(DefaultColor.BLACK)));
	}


	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}
}
