package org.eclipselabs.xdiagram.provider.internal.props;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.Feature;

public interface PropertyFeature<T,M extends Feature> {

	Class<? extends T> getType();
	
	Class<? extends M> getModelType();
	
	T getDefault();
	
	T getValue(M feature);
	
	T getValue(GraphicsAlgorithm figure, EObject eObject);
			
	void update(Diagram diagram, 
			GraphicsAlgorithm figure, List<Property> properties, 
			EStructuralFeature eStructuralFeature, String value);

	
}
