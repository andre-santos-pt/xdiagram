package org.eclipselabs.xdiagram.provider.internal;



import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;

public interface FeatureHandler {
	
	/**
	 * This element accepts 
	 * @param element
	 * @param feature
	 * @param container
	 * @return
	 */
	boolean accept(FeatureContainer element, Feature feature, GraphicsAlgorithmContainer container);
	
	void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure);
	
	boolean acceptDefaults(FeatureContainer element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container);
	
	void setDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram);
	
}
