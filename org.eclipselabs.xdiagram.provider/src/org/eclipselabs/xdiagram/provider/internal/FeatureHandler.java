package org.eclipselabs.xdiagram.provider.internal;



import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;

public interface FeatureHandler {
	
	
	boolean accept(Element element, Feature feature, GraphicsAlgorithmContainer container);
	
	void handle(Element element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure);
	
	boolean acceptDefaults(Element element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container);
	
	void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram);
	
}
