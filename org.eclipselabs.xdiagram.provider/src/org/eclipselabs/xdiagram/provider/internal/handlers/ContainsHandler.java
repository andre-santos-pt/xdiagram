package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.provider.internal.Util;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Element;
import org.eclipselabs.xdiagram.dsl.Feature;

public class ContainsHandler implements FeatureHandler {

	private Map<GraphicsAlgorithmContainer, OwnerRef> containers = new HashMap<>();
	
	private class OwnerRef {
		EReference reference;
		EObject owner;
		
		@Override
		public String toString() {
			return reference.getName() + "   " + owner; 
		}
	}
	
	public boolean isContainer(ContainerShape container) {
		return containers.containsKey(container);
	}
	
	public EReference getReference(ContainerShape container) {
		assert isContainer(container);
		
		return containers.get(container).reference; 
	}
	
	public EObject getOwner(ContainerShape container) {
		assert isContainer(container);
		
		return containers.get(container).owner; 
	}
	
	@Override
	public boolean accept(Element element, Feature feature, GraphicsAlgorithmContainer container) {
		return feature instanceof Contains;
	}

	@Override
	public void handle(Element element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
		
		Contains cont = (Contains) feature;
	
		OwnerRef or = new OwnerRef();
		or.reference = (EReference) Util.matchFeature(eObject.eClass(), cont.getModelReference());
		or.owner = eObject;
		
//		ContainerShape containerShape = Graphiti.getPeCreateService().createContainerShape(container, false);
		containers.put(container, or);
		System.out.println("CONT " + container + "  " + or);
	}

	@Override
	public boolean acceptDefaults(Element element, GraphicsAlgorithm figure, GraphicsAlgorithmContainer container) {
		return false;
	}

	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure,
			Diagram diagram) {
		
	}

}
