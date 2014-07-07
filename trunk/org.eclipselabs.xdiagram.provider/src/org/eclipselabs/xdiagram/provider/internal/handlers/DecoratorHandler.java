package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.Decorator;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Label;
import org.eclipselabs.xdiagram.dsl.Link;
import org.eclipselabs.xdiagram.provider.internal.ElementCreation;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

import com.google.common.collect.Maps;

public class DecoratorHandler implements FeatureHandler {

//	private Map<Decorator, ConnectionDecorator> decorators;
//	
//	public DecoratorHandler() {	
//		decorators = new WeakHashMap<>();
//	}
	
	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Decorator.class;
	}

	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof Link;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature,
			EObject eObject, Diagram diagram,
			GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		
		Decorator decorator = (Decorator) feature;
//		ConnectionDecorator dec = ((Connection) container;
//		dec.setLocationRelative(true);
//		dec.setLocation(getPosition(decorator));
	}

	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject,
			Diagram diagram, GraphicsAlgorithmContainer container,
			GraphicsAlgorithm figure) {
	}

	public static double getPosition(Decorator decorator) {
		return Double.parseDouble(decorator.getPosition().substring(0, decorator.getPosition().length()-1));
	}
}
