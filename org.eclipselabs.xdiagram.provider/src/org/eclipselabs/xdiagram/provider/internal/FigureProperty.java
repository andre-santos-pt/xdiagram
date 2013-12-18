package org.eclipselabs.xdiagram.provider.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.services.Graphiti;

public enum FigureProperty {
	
		MAIN, HASHCODE, CONTAINER, PARENT, CHILDREN, X, Y, WIDTH, HEIGHT, ZOOM_X, ZOOM_Y, POINTS,
		ANCHOR_LEFT, ANCHOR_RIGHT, ANCHOR_UP, ANCHOR_DOWN, ANCHOR_HORIZ, ANCHOR_VERT, ANCHOR_INCOMING, ANCHOR_OUTGOING,
		VERTICAL, FORMAT, TYPE, TEXT, TEXT_VALUE, TEXT_ATTR, CAN_RESIZE, CAN_MOVE, CAN_EDIT, LABEL;
		
		
		
		public void set(GraphicsAlgorithm figure, Object value) {
			Graphiti.getPeService().setPropertyValue(figure, name(), value==null ? "" : value.toString());
		}
		
		public String get(GraphicsAlgorithm figure) {
			return Graphiti.getPeService().getPropertyValue(figure, name());
		}
		
		
		public static void setProperty(GraphicsAlgorithm figure, String name, Object value){
			Graphiti.getPeService().setPropertyValue(figure, name, value==null ? "" : value.toString());
		}
		
		public static String getProperty(GraphicsAlgorithm figure, String name) {
			return Graphiti.getPeService().getPropertyValue(figure, name);
		}
		
		public static void setProperties(GraphicsAlgorithm figure){
			setProperties(figure, null);
		}
		
		public static void setProperties(GraphicsAlgorithm figure, String container){

			FigureProperty.HASHCODE.set(figure, figure.hashCode());
			FigureProperty.CONTAINER.set(figure, container);
			FigureProperty.X.set(figure, figure.getX());
			FigureProperty.Y.set(figure, figure.getY());
			FigureProperty.WIDTH.set(figure, figure.getWidth());
			FigureProperty.HEIGHT.set(figure, figure.getHeight());
			FigureProperty.ZOOM_X.set(figure, 1);
			FigureProperty.ZOOM_Y.set(figure, 1);
			
			if ( figure instanceof Polyline ){
				EList<org.eclipse.graphiti.mm.algorithms.styles.Point> points = ((Polyline) figure).getPoints();
				StringBuilder str_points = new StringBuilder(points.get(0).getX() + "," + points.get(0).getY());
				for (int i=1; i<points.size(); i++)
					str_points.append("|" + points.get(i).getX() + "," + points.get(i).getY());
				FigureProperty.POINTS.set(figure, str_points.toString());
			}
			
			FigureProperty.ANCHOR_LEFT.set(figure, 0);
			FigureProperty.ANCHOR_RIGHT.set(figure, 0);
			FigureProperty.ANCHOR_UP.set(figure, 0);
			FigureProperty.ANCHOR_DOWN.set(figure, 0);
			
		}
		
	}

//public static void setProperty(GraphicsAlgorithm figure, FigureProperty property, String value) {
//	Graphiti.getPeService().setPropertyValue(figure, property.name(), value);
//}