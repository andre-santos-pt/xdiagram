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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.LineStyle;
import pt.iscte.xdiagram.provider.internal.FeatureHandler;

public class LineStyleHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return LineStyle.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		LineStyle lineStyle = (LineStyle) feature;
		org.eclipse.graphiti.mm.algorithms.styles.LineStyle s = org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID;

		if(lineStyle.getStyle() != null) {
			switch(lineStyle.getStyle()) {
			case SOLID: s = org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID; break;
			case DASH: s =  org.eclipse.graphiti.mm.algorithms.styles.LineStyle.DASH; break;
			case DOT: s = org.eclipse.graphiti.mm.algorithms.styles.LineStyle.DOT; break;
			}
		}
		figure.setLineStyle(s);
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		figure.setLineStyle(org.eclipse.graphiti.mm.algorithms.styles.LineStyle.SOLID);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}


}
