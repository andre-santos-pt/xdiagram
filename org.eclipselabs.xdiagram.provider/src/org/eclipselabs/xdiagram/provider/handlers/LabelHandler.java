package org.eclipselabs.xdiagram.provider.handlers;

import java.awt.Dimension;
import java.awt.Rectangle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Label;

public class LabelHandler implements ConnectableElementHandler {

	@Override
	public boolean accept(ConnectableElement element) {
		return element instanceof Label;
	}

	@Override
	public GraphicsAlgorithm createNodeFigure(ConnectableElement element, Diagram diagram,
			Shape container, GraphicsAlgorithm parentFigure,
			EObject eObject) {

		AbstractText text = Graphiti.getGaService().createText(container);
		return text;
	}

	@Override
	public void updateContainerFigures(ConnectableElement element,
			ContainerShape container, GraphicsAlgorithm child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resizeNodeFigure(ConnectableElement element, Diagram diagram,
			ContainerShape container, Dimension size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContainerFigures(ConnectableElement element,
			Diagram diagram, GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		
	}

}
