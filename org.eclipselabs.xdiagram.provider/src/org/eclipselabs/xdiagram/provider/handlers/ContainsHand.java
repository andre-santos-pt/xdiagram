package org.eclipselabs.xdiagram.provider.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Contains;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;

public class ContainsHand implements FeatureHandler {

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
	public boolean accept(Element element, Feature feature) {
		return feature instanceof Contains;
	}

	@Override
	public void handle(Element element, Feature feature,
			GraphicsAlgorithm figure, Diagram diagram, EObject eObject,
			GraphicsAlgorithmContainer container) {
		
		Contains cont = (Contains) feature;
	
		OwnerRef or = new OwnerRef();
		or.reference = (EReference) Util.matchFeature(eObject.eClass(), cont.getModelReference());
		or.owner = eObject;
		
//		ContainerShape containerShape = Graphiti.getPeCreateService().createContainerShape(container, false);
		containers.put(container, or);
		System.out.println("CONT " + container + "  " + or);
	}

	@Override
	public boolean accept(Element element, GraphicsAlgorithm figure) {
		return false;
	}

	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure,
			Diagram diagram) {
		
	}

}
