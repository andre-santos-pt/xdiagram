package org.eclipselabs.xdiagram.provider.internal;



import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;

public interface FeatureHandler {
	
	
	boolean accept(Element element, Feature feature, ContainerShape container);
	
	void handle(Element element, Feature feature, EObject eObject, Diagram diagram, ContainerShape container, GraphicsAlgorithm figure);
	
	boolean acceptDefaults(Element element, GraphicsAlgorithm figure, ContainerShape container);
	
	void setDefaults(Element element, GraphicsAlgorithm figure, Diagram diagram);
	
}
