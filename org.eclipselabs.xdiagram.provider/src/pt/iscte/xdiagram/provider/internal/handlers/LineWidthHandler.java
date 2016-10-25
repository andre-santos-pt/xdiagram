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
import pt.iscte.xdiagram.dsl.model.LineWidth;
import pt.iscte.xdiagram.provider.internal.FeatureHandler;

public class LineWidthHandler implements FeatureHandler {

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return LineWidth.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		LineWidth lineWidth = (LineWidth) feature;	
		figure.setLineWidth(lineWidth.getWidth());
	}
	
	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		figure.setLineWidth(1);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return true;
	}

	
}
