package org.eclipselabs.xdiagram.provider.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;

public interface FeatureHandler {
	
	boolean accept(Element element, Feature feature);
	
	void handle(Element element, Feature feature, GraphicsAlgorithm figure, Diagram diagram, EObject eObject, GraphicsAlgorithmContainer container);
	
	boolean accept(Element element, GraphicsAlgorithm figure);
	
	void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram);
	
}
