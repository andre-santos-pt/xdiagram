package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import pt.iscte.xdiagram.dsl.model.Anchor;
import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.dsl.model.Position;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

import com.google.common.collect.Maps;

public class AnchorHandler implements FeatureHandler {

	private Map<org.eclipse.graphiti.mm.pictograms.Anchor, EObject> anchors;
	
	public AnchorHandler() {
		anchors = Maps.newHashMap();
	}
	
	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Anchor.class;
	}
	
	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject,
			Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Anchor anchor = (Anchor) feature;
		org.eclipse.graphiti.mm.pictograms.Anchor gAnchor = (org.eclipse.graphiti.mm.pictograms.Anchor) container;
		ConnectableElement e = (ConnectableElement) element;
		for(Feature f : e.getFeatures())
			if(f instanceof Position) {
				Position p = (Position) f;
				Graphiti.getGaLayoutService().setLocation(gAnchor.getGraphicsAlgorithm(), p.getX(), p.getY());
			}
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		AnchorContainer anchorContainer = (AnchorContainer) container;
		
		org.eclipse.graphiti.mm.pictograms.Anchor gAnchor = null;
		if(anchorContainer.getAnchors().isEmpty())
			gAnchor = Graphiti.getPeCreateService().createChopboxAnchor(anchorContainer);
		else
			gAnchor = anchorContainer.getAnchors().get(0);
		
		anchors.put(gAnchor, eObject);
	}

	public EObject get(org.eclipse.graphiti.mm.pictograms.Anchor a) {
		return anchors.get(a);
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof ConnectableElement && element.eContainer() instanceof Node;
	}
	
}
