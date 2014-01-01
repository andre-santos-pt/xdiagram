package org.eclipselabs.xdiagram.provider.internal.props;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.Corner;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth;

public class LineWidthProperty extends AbstractPropertyFeature<Integer, LineWidth> {

	@Override
	public Integer getDefault() {
		return 0;
	}

	@Override
	public Integer getValue(LineWidth feature) {
		return feature.getWidth();
	}

	@Override
	public void update(Diagram diagram, GraphicsAlgorithm figure,
			List<Property> properties, EStructuralFeature eStructuralFeature,
			String value) {
		// TODO Auto-generated method stub
		
	}
}
