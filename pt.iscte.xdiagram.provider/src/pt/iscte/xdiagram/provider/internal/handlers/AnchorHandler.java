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

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;

import com.google.common.collect.Maps;

import pt.iscte.xdiagram.dsl.model.Anchor;
import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.provider.LanguageProvider;
import pt.iscte.xdiagram.provider.internal.FeatureHandler;

public class AnchorHandler implements FeatureHandler {

//	private Map<org.eclipse.graphiti.mm.pictograms.Anchor, EObject> anchors;
	
	public AnchorHandler() {
//		anchors = Maps.newHashMap(); // weakHashMap?
	}
	
	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Anchor.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject,
			Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		// TODO connect to anchor
		ChopboxAnchor gAnchor = Graphiti.getPeCreateService().createChopboxAnchor((AnchorContainer) container);
//		System.out.println(figure + "    ?? " + eObject + "\n\t" + gAnchor);
//		anchors.put(gAnchor, eObject);
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		// only for top-level node figures
		if(element.eContainer() instanceof Node && !LanguageProvider.hasFeature(element, pt.iscte.xdiagram.dsl.model.Anchor.class, true)) {
			ChopboxAnchor gAnchor = Graphiti.getPeCreateService().createChopboxAnchor((AnchorContainer) container);
//			anchors.put(gAnchor, eObject);
//			System.out.println(eObject + "\n\t" + gAnchor);
		}
			
	}
	
	

//	public EObject get(org.eclipse.graphiti.mm.pictograms.Anchor a) {
//		return anchors.get(a);
//	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof ConnectableElement;
	}
	
}
