package org.eclipselabs.xdiagram.provider.internal;



import java.util.List;

import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.CustomFigure;
import org.eclipselabs.xdiagram.dsl.Image;
import org.eclipselabs.xdiagram.dsl.Polyline;
import org.eclipselabs.xdiagram.dsl.Size;

public enum ElementCreation {

	RECTANGLE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createPlainRoundedRectangle(container, 0, 0);
		}
	}, 
	ELLIPSE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createEllipse(container);
		}
	},
	POLYLINE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			Polyline p = (Polyline) element;
			return p.isPolygon() ?
					Graphiti.getGaService().createPolygon(container) :
						Graphiti.getGaService().createPolyline(container);
		}
	},
	
	
	
	TRIANGLE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createPolygon(container, new int[] { 0, 0, -15, -10, -15, 10,  });
		}
		
		
	},
	
	RHOMBUS {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createPolygon(container, new int[] { 0, 0, -10, -10, -20, 0, -10, 10 });
		}
	},
	
	LINE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createPolyline(container, new int[] { 0, 0, 20, 0});
		}
	},
	
	
	LABEL {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createText(container);
		}
	},
	
	IMAGE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			Image image = (Image) element;
			return Graphiti.getGaService().createImage(container, image.getImageId());			
		}
	},
	
	INVISIBLE {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			return Graphiti.getGaService().createInvisibleRectangle((PictogramElement) container);
		}
	},
	
	CUSTOM {
		protected GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
			CustomFigure fig = ((Custom) element).getFigure();
			return createNodeFigure(fig.getElement(), diagram, container);			
		}
	}
	;

	protected abstract GraphicsAlgorithm create(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container);

	public static GraphicsAlgorithm createNodeFigure(ConnectableElement element, Diagram diagram, GraphicsAlgorithmContainer container) {
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
	
	public static void updateTriangleSize(Polygon triangle, Size size) {
		List<Point> points = triangle.getPoints();
		points.remove(1);
		points.remove(1);
		points.add(Graphiti.getGaCreateService().createPoint(-size.getHeight(), -size.getWidth()/2));
		points.add(Graphiti.getGaCreateService().createPoint(-size.getHeight(), size.getWidth()/2));
	}
	
	
	public static void updateRhombusSize(Polygon triangle, Size size) {
		List<Point> points = triangle.getPoints();
		points.remove(1);
		points.remove(1);
		points.remove(1);
		
		points.add(Graphiti.getGaCreateService().createPoint(-size.getHeight()/2, -size.getWidth()/2));
		points.add(Graphiti.getGaCreateService().createPoint(-size.getHeight(), 0));
		points.add(Graphiti.getGaCreateService().createPoint(-size.getHeight()/2, size.getWidth()/2));
		
	}
}
