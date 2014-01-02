package org.eclipselabs.xdiagram.provider.internal;



import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.Polyline;

public enum ElementCreation {

	RECTANGLE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, Shape container) {
			return Graphiti.getGaService().createPlainRoundedRectangle(container, 0, 0);
		}
	}, 
	ELLIPSE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, Shape container) {
			return Graphiti.getGaService().createEllipse(container);
		}
	},
	POLYLINE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, Shape container) {
			Polyline p = (Polyline) element;
			return p.isPolygon() ?
					Graphiti.getGaService().createPolygon(container) :
						Graphiti.getGaService().createPolyline(container);
		}
	},
	
	
	// TODO: Rhombus
	
	LABEL {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, Shape container) {
			return Graphiti.getGaService().createText(container);
		}
	},
	
	// TODO: IMAGE
	
	INVISIBLE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, Shape container) {
			return Graphiti.getGaService().createInvisibleRectangle(container);
		}
	},
	;

	protected abstract GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, Shape container);

	public static GraphicsAlgorithm createNodeFigure(ConnectableElement element, Diagram diagram, Shape container) {
		String type = element.getClass().getInterfaces()[0].getSimpleName();

		try	{
			ElementCreation v = valueOf(type.toUpperCase());
			return v.create(element, diagram, container);
		}
		catch(IllegalArgumentException e) {
			System.err.println("Not supported: " + type);
			return INVISIBLE.create(element, diagram, container);
		}
	}
	
//	public static Class<? extends GraphicsAlgorithm> type()

}