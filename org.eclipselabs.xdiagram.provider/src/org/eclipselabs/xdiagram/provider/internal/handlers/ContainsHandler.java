package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Feature;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

public class ContainsHandler implements FeatureHandler {

	private Multimap<GraphicsAlgorithmContainer, EReference> references;
	private Map<GraphicsAlgorithmContainer, EObject> owners;
	
	public ContainsHandler() {
		references = ArrayListMultimap.create();
		owners = Maps.newHashMap();
	}

	public boolean isContainer(GraphicsAlgorithmContainer container) {
		return references.containsKey(container);
	}
	
	public Collection<EReference> getReferences(ContainerShape container) {
		return references.get(container); 
	}
	
	public Collection<EReference> getReferences(ContainerShape container, EObject eObject) {
		List<EReference> list = new ArrayList<>(references.get(container));
		Iterator<EReference> it = list.iterator();
		while(it.hasNext()) {
			if(!it.next().getEReferenceType().isInstance(eObject))
				it.remove();
		}
		return list;
	}
	
	public EObject getOwner(ContainerShape container) {
		assert isContainer(container);
		
		return owners.get(container); 
	}
	
	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Contains.class;
	}
	

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
		
		Contains cont = (Contains) feature;
	
		owners.put(container, eObject);		
		references.put(container, cont.getModelReference());
		
		System.out.println("CONT " + container + "  " + cont.getModelReference());
	}

	@Override
	public void applyDefaults(FeatureContainer element, GraphicsAlgorithm figure, Diagram diagram) {
		
	}
}
