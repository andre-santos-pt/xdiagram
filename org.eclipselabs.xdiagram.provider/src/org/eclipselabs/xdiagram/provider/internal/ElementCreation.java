package org.eclipselabs.xdiagram.provider.internal;



import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipselabs.xdiagram.dsl.Anchor;
import org.eclipselabs.xdiagram.dsl.ConnectableElement;
import org.eclipselabs.xdiagram.dsl.Custom;
import org.eclipselabs.xdiagram.dsl.CustomFigure;
import org.eclipselabs.xdiagram.dsl.Image;
import org.eclipselabs.xdiagram.dsl.Polyline;
import org.eclipselabs.xdiagram.provider.LanguageProvider;

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
	
	
	// TODO: Rhombus
	
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
}
