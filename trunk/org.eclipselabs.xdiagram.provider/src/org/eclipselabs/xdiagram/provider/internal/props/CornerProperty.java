package org.eclipselabs.xdiagram.provider.internal.props;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.dsl.Corner;
import org.eclipselabs.xdiagram.dsl.Feature;

public class CornerProperty extends AbstractPropertyFeature<Integer, Corner> {

	@Override
	public Integer getDefault() {
		return 0;
	}

	@Override
	public Integer getValue(Corner feature) {
		return feature.getAngle();
	}

	@Override
	public void update(Diagram diagram, GraphicsAlgorithm figure,
			List<Property> properties, EStructuralFeature eStructuralFeature,
			String value) {
		String result = getExpressionResult(figure, properties, eStructuralFeature.getName(), value);
		
		if (result!=null) {
			int num = Integer.parseInt(result);
			if (figure instanceof RoundedRectangle) {
				RoundedRectangle rect = (RoundedRectangle) figure;
				rect.setCornerHeight(num);
				rect.setCornerWidth(num);
			}
		}
	}

	@Override
	public Integer getValue(GraphicsAlgorithm figure, EObject eObject) {
		setExpressionResult(figure, eObject, key.getExpression(), 
				this.getClass().getSimpleName(), name(), value);
		return null;
	}
}
