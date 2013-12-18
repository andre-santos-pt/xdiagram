package org.eclipselabs.xdiagram.provider.internal;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures;
import org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.impl.FigureFeaturesImpl;

public class LinkProvider extends FigureProvider {

	public static enum LinkShape {
		ARROW, TRIANGLE, RHOMBUS, POLYGON, POLYLINE;
	}
	
	public static GraphicsAlgorithm createLinkArrow(Diagram diagram, GraphicsAlgorithmContainer container, EObject eObject,
			LinkShape shape, FigureFeatures features, Rectangle limits){
		
		int angle = IntegerProperty.ANGLE.getValue(features); 
		int arc = IntegerProperty.CORNER.getValue(features);

		GraphicsAlgorithm figure = null;
		
		int xy[] = null;
		int beforeAfter[] = null;
		Point center = new Point(limits.x+limits.width/2, limits.y+limits.height/2);

		switch (shape){	
		case RHOMBUS:					
			limits.height = limits.width/3*2;
			xy = new int[] { 0, 0, -limits.width/2, -limits.height/2, -limits.width, 0, -limits.width/2, limits.height/2 };
			break;
		case TRIANGLE:
		case ARROW:
			limits.height = limits.width/3*2;
			xy = new int[] { -limits.height, limits.height/2, 0, 0, -limits.height, -limits.height/2 };
			break;
		case POLYGON:
			if (features.getPointfeatures().size()<3)
				return null;
		case POLYLINE:
			if (features.getPointfeatures().size()<2)
				return null;
			xy = new int [features.getPointfeatures().size()*2];
			for (int p=0; p<features.getPointfeatures().size(); p++){
				int x = features.getPointfeatures().get(p).getX();
				int y = features.getPointfeatures().get(p).getY();
				xy[p*2] = x;
				xy[p*2+1] = y;
			}
			Rectangle bounds = CalculateBounds(xy);
			TranslateFigure(xy, new Point(-bounds.x, -bounds.y));
			limits.width = bounds.width;
			limits.height = bounds.height;
			break;
		}

		
		if (figure==null){
			
			beforeAfter = new int[xy.length];
			for (int i=0; i<xy.length; i++)
				beforeAfter[i] = arc;
			
			if (angle>0){
				RotateFigure(xy, center, angle);
				Rectangle bounds = CalculateBounds(xy);
				TranslateFigure(xy, new Point(-bounds.x, -bounds.y));
				limits.width = bounds.width;
				limits.height = bounds.height;
			}			
			
			if (shape==LinkShape.ARROW || shape==LinkShape.POLYLINE)
				figure = Graphiti.getGaService().createPlainPolyline(container, xy, beforeAfter);
			else
				figure = Graphiti.getGaService().createPlainPolygon(container, xy, beforeAfter);
		}

		setStyleFeatures(diagram, eObject, figure, features);		
		return figure;
		
	}

	public static void createLinkFigure(Diagram diagram, ConnectionDecorator cd, 
			EObject eObject, StaticFigure figure, String style){

		FigureFeatures features = figure.getFeatures();
		if (features==null){
			for (Constructor<?> constructor : FigureFeaturesImpl.class.getDeclaredConstructors()){
				if (constructor.getParameterTypes().length==0){
					constructor.setAccessible(true);
					try {
						features = (FigureFeaturesImpl) constructor.newInstance(new Object[0]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}	
		}
		
		FigureProvider.setStyle(figure.getStyle()!=null && figure.getStyle().length()>0 ?
				figure.getStyle() : style, features);
		if (features!=null && features.getSizefeatures()!=null)
			for (SizeFeature sf : features.getSizefeatures()){
				IntegerProperty.WIDTH.addNewValue(features.getIntegerfeatures(), sf.getWidth(), true);
				IntegerProperty.HEIGHT.addNewValue(features.getIntegerfeatures(), sf.getHeight(), true);
			}
		if (features!=null && features.getPositionfeatures()!=null)
			for (PositionFeature pf : features.getPositionfeatures()){
				IntegerProperty.TOP.addNewValue(features.getIntegerfeatures(), pf.getY(), true);
				IntegerProperty.LEFT.addNewValue(features.getIntegerfeatures(), pf.getX(), true);
			}
		
		
		Rectangle limits = new Rectangle(0, 0, 
				IntegerProperty.WIDTH.getValue(features), 
				IntegerProperty.HEIGHT.getValue(features));

		if (limits.width==minValue && limits.height==minValue)
			limits.width = limits.height = 20;

		LinkShape shape = LinkShape.POLYLINE;
		shape = LinkShape.valueOf(figure.getFigure().toUpperCase());

		createLinkArrow(diagram, cd, eObject, shape, features, limits);
		
	}
	
	
	public static void createDynamicFigure(Diagram diagram, ConnectionDecorator cd, 
			EObject eObject, DynamicFigure figure, String style){
		
		FigureFeatures features = figure.getFeatures();
		if (features==null){
			for (Constructor<?> constructor : FigureFeaturesImpl.class.getDeclaredConstructors()){
				if (constructor.getParameterTypes().length==0){
					constructor.setAccessible(true);
					try {
						features = (FigureFeaturesImpl) constructor.newInstance(new Object[0]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}	
		}
		
		//FigureProvider.setStyle(figure.getStyle()!=null && figure.getStyle().length()>0 ?
		//		figure.getStyle() : style, features);
		if (features!=null && features.getSizefeatures()!=null)
			for (SizeFeature sf : features.getSizefeatures()){
				IntegerProperty.WIDTH.addNewValue(features.getIntegerfeatures(), sf.getWidth(), true);
				IntegerProperty.HEIGHT.addNewValue(features.getIntegerfeatures(), sf.getHeight(), true);
			}
		if (features!=null && features.getPositionfeatures()!=null)
			for (PositionFeature pf : features.getPositionfeatures()){
				IntegerProperty.TOP.addNewValue(features.getIntegerfeatures(), pf.getY(), true);
				IntegerProperty.LEFT.addNewValue(features.getIntegerfeatures(), pf.getX(), true);
			}

		Point Location = new Point(
				IntegerProperty.LEFT.getValue(features), 
				IntegerProperty.TOP.getValue(features));			

		MultiText text = Graphiti.getGaService().createMultiText(cd);
		Dimension size = setLabelFigure(diagram, null, text, features, false);
		if (Location.x==0 && Location.y==0)
			Location.setLocation(size.height, -minValue);
		Graphiti.getGaService().setLocationAndSize(text, Location.x, Location.y, size.width, size.height);

	}


	public static void updateLinkConnection(Diagram diagram, Connection connection){
		for ( ConnectionDecorator decorator : connection.getConnectionDecorators() ){
			GraphicsAlgorithm ga = decorator.getGraphicsAlgorithm();
			if ( ga instanceof AbstractText )
				ga.setWidth(getLabelWidth(ga));
		}
	}



}
