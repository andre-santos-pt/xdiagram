package org.eclipselabs.xdiagram.provider.handlers;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional;

public class FeatureConditionalHandler implements FeatureHandler {

	@Override
	public boolean accept(Element element, Feature feature) {
		return feature.getConditional() != null;
	}

	@Override
	public void handle(Element element, Feature feature, GraphicsAlgorithm figure, Diagram diagram, EObject eObject, GraphicsAlgorithmContainer container) {
		FeatureConditional cond = feature.getConditional();
		EAttribute att = cond.getModelAttribute(); // match
		Object o = eObject.eGet(att);

		switch(cond.getOperator()) {
		case EQUAL:
			eObject.eAdapters().add(new AdapterImpl() {

			});
			//				o.equals(getValue(cond.getValue()))
			break;
		case DIFFERENT:
			break;
		}
	}



	@Override
	public boolean accept(Element element, GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDefaults(Element element, GraphicsAlgorithm figure,
			Diagram diagram) {
		// TODO Auto-generated method stub

	}

}
