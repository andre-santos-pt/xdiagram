package org.eclipselabs.xdiagram.provider.handlers;

import java.awt.Dimension;
import java.awt.Rectangle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse;

public class EllipseHandler implements ConnectableElementHandler {

	@Override
	public boolean accept(ConnectableElement eObject) {
		return eObject instanceof Ellipse;
	}

	@Override
	public GraphicsAlgorithm createNodeFigure(ConnectableElement element, Diagram diagram, Shape container,
			GraphicsAlgorithm parentFigure, EObject eObject) {
		
		GraphicsAlgorithm figure = Graphiti.getGaService().createEllipse(container);
		return figure;
	}

	@Override
	public void updateContainerFigures(ConnectableElement eObject,
			ContainerShape container, GraphicsAlgorithm child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resizeNodeFigure(ConnectableElement eObject, Diagram diagram, ContainerShape container, Dimension size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeContainerFigures(ConnectableElement eObject, Diagram diagram, GraphicsAlgorithm figure) {
		// TODO Auto-generated method stub
		
	}



}
