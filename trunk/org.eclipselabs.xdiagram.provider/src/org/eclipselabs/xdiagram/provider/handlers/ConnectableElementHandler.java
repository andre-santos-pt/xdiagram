package org.eclipselabs.xdiagram.provider.handlers;

import java.awt.Dimension;
import java.awt.Rectangle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;

public interface ConnectableElementHandler {
	
	boolean accept(ConnectableElement element);
	
	GraphicsAlgorithm createNodeFigure(ConnectableElement element, Diagram diagram, Shape container, 
			GraphicsAlgorithm parentFigure, EObject eObject);
		
	void updateContainerFigures(ConnectableElement element, ContainerShape container, GraphicsAlgorithm child);
		
	void resizeNodeFigure(ConnectableElement element, Diagram diagram, ContainerShape container, Dimension size);
	
	void removeContainerFigures(ConnectableElement element, Diagram diagram, GraphicsAlgorithm figure);
	
	
	
	public abstract class Adapter implements ConnectableElementHandler {

		@Override
		public boolean accept(ConnectableElement element) {
			return true;
		}

		@Override
		public GraphicsAlgorithm createNodeFigure(ConnectableElement element,
				Diagram diagram, Shape container,
				GraphicsAlgorithm parentFigure, EObject eObject) {

			return null;
		}

		

		@Override
		public void updateContainerFigures(ConnectableElement element,
				ContainerShape container, GraphicsAlgorithm child) {
			
		}

	

		@Override
		public void resizeNodeFigure(ConnectableElement element,
				Diagram diagram, ContainerShape container, Dimension size) {
			
		}

		@Override
		public void removeContainerFigures(ConnectableElement element,
				Diagram diagram, GraphicsAlgorithm figure) {
			
		}
	
	}
}
