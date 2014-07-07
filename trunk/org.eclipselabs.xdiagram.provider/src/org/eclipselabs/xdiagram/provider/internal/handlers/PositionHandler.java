package org.eclipselabs.xdiagram.provider.internal.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.ContainerLayout;
import org.eclipselabs.xdiagram.dsl.Contains;
import org.eclipselabs.xdiagram.dsl.Feature;
import org.eclipselabs.xdiagram.dsl.FeatureContainer;
import org.eclipselabs.xdiagram.dsl.Node;
import org.eclipselabs.xdiagram.dsl.Position;
import org.eclipselabs.xdiagram.provider.LanguageProvider;
import org.eclipselabs.xdiagram.provider.internal.FeatureHandler;

public class PositionHandler implements FeatureHandler {

	private static final int DEFAULT_MARGIN = 0;
	
	private ContainsHandler containsHandler;

	public PositionHandler(ContainsHandler containsHandler) {
		this.containsHandler = containsHandler;
	}

	@Override
	public Class<? extends Feature> getTargetFeature() {
		return Position.class;
	}

	@Override
	public void handle(FeatureContainer element, Feature feature, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		Position p = (Position) feature;
		int x = p.getX();
		int y = p.getY();
		if(p.isXRelative()) {
			ContainerShape parent = (ContainerShape) container.eContainer();
			IDimension dim = Graphiti.getGaLayoutService().calculateSize(figure);
			IDimension pdim = Graphiti.getGaLayoutService().calculateSize(parent.getGraphicsAlgorithm());
			x = (pdim.getWidth()/2) - (dim.getWidth()/2);
		}
			
		Graphiti.getGaService().setLocation(figure, x, y);
	}



	@Override
	public void applyDefaults(FeatureContainer element, EObject eObject, Diagram diagram, GraphicsAlgorithmContainer container, GraphicsAlgorithm figure) {
		//		if(accept(element, figure.getPictogramElement())) {

		EObject parent = element.eContainer();
		ContainerShape parentContainer = (ContainerShape) container.eContainer();
		ContainerLayout layout = ContainerLayout.FREE;
		if(parent instanceof ConnectableElement) {
			layout = ((ConnectableElement)parent).getLayout();
		}
		else if(parent instanceof Node && containsHandler.isContainer(parentContainer)) {

			// TODO multiple contains
			for(Contains c : containsHandler.getContainsFeature(parentContainer)) {
				layout = c.getLayout();
			}
		}

		if(!layout.equals(ContainerLayout.FREE)) {
			ContainerShape cs = ((ContainerShape) figure.eContainer()).getContainer();
			element.eContainer();
			int x = 0;
			int y = 0;

			for(Shape s : cs.getChildren()) {
				if(s.getGraphicsAlgorithm() == figure)
					break;

				IDimension size = Graphiti.getGaService().calculateSize(s.getGraphicsAlgorithm());
				x += size.getWidth();
				y += size.getHeight();
			}

			if(layout.equals(ContainerLayout.VSTACK))
				Graphiti.getGaService().setLocation(figure, DEFAULT_MARGIN, y);
			else
				Graphiti.getGaService().setLocation(figure, x, DEFAULT_MARGIN);
		}
		else if(!(parent instanceof Node)) {
			Graphiti.getGaService().setLocation(figure, DEFAULT_MARGIN, DEFAULT_MARGIN);
		}
	}



	@Override
	public boolean accept(FeatureContainer element) {
		return element instanceof ConnectableElement && 
				(element.eContainer() instanceof ConnectableElement || element.eContainer() instanceof Node);
	}
}
