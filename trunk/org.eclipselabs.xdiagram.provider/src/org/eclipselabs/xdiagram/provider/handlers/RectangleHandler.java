package org.eclipselabs.xdiagram.provider.handlers;

import java.awt.Dimension;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle;

public class RectangleHandler implements ConnectableElementHandler {

	@Override
	public boolean accept(ConnectableElement object) {
		return object instanceof Rectangle;
	}

	@Override
	public GraphicsAlgorithm createNodeFigure(ConnectableElement element, Diagram diagram, Shape container,
			GraphicsAlgorithm parentFigure,
			EObject eObject) {
		GraphicsAlgorithm figure = Graphiti.getGaService().createPlainRoundedRectangle(container, 0, 0);
		return figure;
	}

	@Override
	public void updateContainerFigures(ConnectableElement eObject,
			ContainerShape container, GraphicsAlgorithm child) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void resizeNodeFigure(ConnectableElement element, Diagram diagram, ContainerShape container, Dimension size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContainerFigures(ConnectableElement element, Diagram diagram, GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		
	}

	

}
