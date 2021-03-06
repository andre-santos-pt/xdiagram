/*******************************************************************************
 * Copyright (c) 2016 ISCTE-IUL.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André L. Santos, Eduardo Gomes - initial API and implementation
 *******************************************************************************/
package pt.iscte.xdiagram.provider.internal;



import java.util.List;

import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.osgi.framework.Bundle;

import pt.iscte.xdiagram.dsl.model.Custom;
import pt.iscte.xdiagram.dsl.model.CustomFigure;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Image;
import pt.iscte.xdiagram.dsl.model.Line;
import pt.iscte.xdiagram.dsl.model.Polyline;

public enum ElementCreation {

	RECTANGLE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createPlainRoundedRectangle(container, 0, 0);
		}
	}, 
	ELLIPSE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createEllipse(container);
		}
	},
	POLYLINE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			Polyline p = (Polyline) element;
			org.eclipse.graphiti.mm.algorithms.Polyline fig = p.isPolygon() ?
					Graphiti.getGaService().createPolygon(container) :
						Graphiti.getGaService().createPolyline(container);
			for(Feature f : p.getFeatures())
				if(f instanceof pt.iscte.xdiagram.dsl.model.Point) {
					pt.iscte.xdiagram.dsl.model.Point point = (pt.iscte.xdiagram.dsl.model.Point) f;
					fig.getPoints().add(Graphiti.getGaService().createPoint(point.getX(), point.getY()));
				}
				
			return fig;
		}
	},
	
	
	
	TRIANGLE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createPolygon(container, new int[] { 1, 0, -15, -10, -15, 10 });
		}
		
		
	},
	
	RHOMBUS {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createPolygon(container, new int[] { 1, 0, -10, -10, -20, 0, -10, 10 });
		}
	},
	
	LINE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			Line line = (Line) element;
			int[] points = line.isHorizontal() ?
					new int[] { 0, 0, 10, 0} : new int[] { 0, 0, 0, 10};
					
			return Graphiti.getGaService().createPolyline(container, points);
		}
	},
	
	ARROW {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createPolyline(container, new int[] { -10, 10, 1, 0, -10, -10 });
		}
	},
	
	
	LABEL {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createText(container);
		}
	},
	
	IMAGE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			Image image = (Image) element;
			String key = bundle.getSymbolicName() + ":" + image.getImageId();
			return Graphiti.getGaService().createImage(container, key);			
		}
	},
	
	INVISIBLE {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			return Graphiti.getGaService().createInvisibleRectangle((PictogramElement) container);
		}
	},
	
	CUSTOM {
		protected GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
			CustomFigure fig = ((Custom) element).getFigure();
			return createNodeFigure(fig.getElement(), diagram, container, bundle);			
		}
	}
	;

	protected abstract GraphicsAlgorithm create(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle);

	public static GraphicsAlgorithm createNodeFigure(FeatureContainer element, Diagram diagram, GraphicsAlgorithmContainer container, Bundle bundle) {
		String type = element.getClass().getInterfaces()[0].getSimpleName();
		try	{
			ElementCreation v = valueOf(type.toUpperCase());
			return v.create(element, diagram, container, bundle);
		}
		catch(IllegalArgumentException e) {
			System.err.println("Not supported: " + type);
			return INVISIBLE.create(element, diagram, container, bundle);
		}
	}	
	
	
	public static void updateLineSize(org.eclipse.graphiti.mm.algorithms.Polyline line, int length, boolean horizontal) {
		List<Point> points = line.getPoints();
		points.remove(1);
		int w = horizontal ? length : 0;
		int h = horizontal ? 0 : length;
		points.add(Graphiti.getGaCreateService().createPoint(w, h));
	}
	
	public static void updateArrowSize(org.eclipse.graphiti.mm.algorithms.Polyline line, int width, int height) {
		List<Point> points = line.getPoints();
		points.clear();
		points.add(Graphiti.getGaCreateService().createPoint(-width, width));
		points.add(Graphiti.getGaCreateService().createPoint(1, 0));
		points.add(Graphiti.getGaCreateService().createPoint(-height, -height));
		
	}
	
	
	public static void updateTriangleSize(Polygon triangle, int width, int height) {
		List<Point> points = triangle.getPoints();
		points.remove(1);
		points.remove(1);
		points.add(Graphiti.getGaCreateService().createPoint(-height, -width/2));
		points.add(Graphiti.getGaCreateService().createPoint(-height, width/2));
	}
	
	
	public static void updateRhombusSize(Polygon triangle, int width, int height) {
		List<Point> points = triangle.getPoints();
		points.remove(1);
		points.remove(1);
		points.remove(1);
		points.add(Graphiti.getGaCreateService().createPoint(-height/2, -width/2));
		points.add(Graphiti.getGaCreateService().createPoint(-height, 0));
		points.add(Graphiti.getGaCreateService().createPoint(-height/2, width/2));
		
	}
}
