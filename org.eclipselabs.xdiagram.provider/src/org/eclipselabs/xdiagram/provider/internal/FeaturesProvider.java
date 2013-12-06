package org.eclipselabs.xdiagram.provider.internal;
//package org.eclipselabs.threedsl.provider.internal;
//
//import static org.eclipselabs.threedsl.provider.internal.FigureProperty.*;
//
//import java.awt.Point;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EAttribute;
//import org.eclipse.emf.ecore.EClass;
//import org.eclipse.emf.ecore.EClassifier;
//import org.eclipse.emf.ecore.EDataType;
//import org.eclipse.emf.ecore.EEnum;
//import org.eclipse.emf.ecore.EEnumLiteral;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EStructuralFeature;
//import org.eclipse.graphiti.datatypes.IDimension;
//import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
//import org.eclipse.graphiti.mm.Property;
//import org.eclipse.graphiti.mm.algorithms.AbstractText;
//import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
//import org.eclipse.graphiti.mm.algorithms.MultiText;
//import org.eclipse.graphiti.mm.algorithms.Polygon;
//import org.eclipse.graphiti.mm.algorithms.Polyline;
//import org.eclipse.graphiti.mm.algorithms.impl.ImageImpl;
//import org.eclipse.graphiti.mm.algorithms.styles.Color;
//import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
//import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
//import org.eclipse.graphiti.mm.algorithms.styles.Style;
//import org.eclipse.graphiti.mm.pictograms.Anchor;
//import org.eclipse.graphiti.mm.pictograms.Connection;
//import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
//import org.eclipse.graphiti.mm.pictograms.ContainerShape;
//import org.eclipse.graphiti.mm.pictograms.Diagram;
//import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
//import org.eclipse.graphiti.mm.pictograms.PictogramElement;
//import org.eclipse.graphiti.mm.pictograms.PictogramLink;
//import org.eclipse.graphiti.mm.pictograms.Shape;
//import org.eclipse.graphiti.services.Graphiti;
//import org.eclipse.graphiti.ui.services.GraphitiUi;
//import org.eclipse.graphiti.util.ColorConstant;
//import org.eclipse.graphiti.util.IColorConstant;
//import org.eclipse.graphiti.util.PredefinedColoredAreas;
//import org.eclipselabs.threedsl.provider.ImageProvider;
//import org.eclipselabs.threedsl.provider.internal.FigureProvider.BooleanFeature;
//import org.eclipselabs.threedsl.provider.internal.FigureProvider.ColorFeature;
//import org.eclipselabs.threedsl.provider.internal.FigureProvider.Colors;
//import org.eclipselabs.threedsl.provider.internal.FigureProvider.IntegerFeature;
//import org.eclipselabs.threedsl.provider.internal.NodeProvider.NodeFigures;
//import org.eclipselabs.threedsl.xtext.graficalDsl.AtributeExpression;
//import org.eclipselabs.threedsl.xtext.graficalDsl.AtributeValue;
//import org.eclipselabs.threedsl.xtext.graficalDsl.Attribute;
//import org.eclipselabs.threedsl.xtext.graficalDsl.DynamicFigure;
//import org.eclipselabs.threedsl.xtext.graficalDsl.FigureFeatures;
//import org.eclipselabs.threedsl.xtext.graficalDsl.GradientFeature;
//import org.eclipselabs.threedsl.xtext.graficalDsl.LineFeature;
//import org.eclipselabs.threedsl.xtext.graficalDsl.Node;
//import org.eclipselabs.threedsl.xtext.graficalDsl.NodeFigure;
//import org.eclipselabs.threedsl.xtext.graficalDsl.RGB;
//import org.eclipselabs.threedsl.xtext.graficalDsl.StaticFigure;
//import org.osgi.framework.Bundle;
//
//public class FeaturesProvider {
//
//	//	public static enum Figures {
//	//		   SQUARE {
//	//			@Override
//	//			GraphicsAlgorithm createFigure(IGraphiti.getGaService() Graphiti.getGaService(), Shape shape) {
//	//				return Graphiti.getGaService().createRectangle(shape);
//	//			}
//	//		   }, 
//	//		RECTANGLE, ROUNDEDRECTANGLE, CIRCLE, ELLIPSE, TRIANGLE, RHOMBUS, POLYGON;
//	//		   
//	//		   abstract GraphicsAlgorithm createFigure(IGraphiti.getGaService() Graphiti.getGaService(), Shape shape);
//	//		 }
//
//
//	//		org.eclipse.graphiti.mm.algorithms.styles.Font defaultFont =
//	//			Graphiti.getGaService().manageDefaultFont(diagram, false, false);
//
//
//	public static final HashMap<String, Point> imageSizes = new HashMap<String, Point>();
//	
//
//
//
//	public static enum LinkFigures {
//		ARROW, TRIANGLE, RHOMBUS, POLYGON, POLYLINE
//	}
//
//
//	//////////////////////////////////////////////////////////////////////////////////
//
//
//	public static enum ColorFeature {
//		BACKGROUND, FOREGROUND, GRADIENT
//	}
//
//
//	public static enum Colors implements IColorConstant {
//		WHITE(IColorConstant.WHITE), 
//		BLACK(IColorConstant.BLACK), 
//		BLUE(IColorConstant.BLUE), 
//		GREEN(IColorConstant.GREEN), 
//		RED(IColorConstant.RED), 
//		YELLOW(IColorConstant.YELLOW);
//
//		private final int r, g, b;
//
//		private Colors(IColorConstant color) {
//			this.r = color.getRed();
//			this.g = color.getGreen();
//			this.b = color.getBlue();
//		}
//
//		@Override
//		public int getRed() {
//			return r;
//		}
//
//		@Override
//		public int getGreen() {
//			return g;
//		}
//
//		@Override
//		public int getBlue() {
//			return b;
//		}
//	}
//
//
//	public static IColorConstant getRGBColor(RGB rgb){
//		return new ColorConstant(rgb.getR(), rgb.getG(), rgb.getB());
//	}
//
//	public static IColorConstant getDefaultColor(ColorFeature feature){
//		switch (feature){
//		case BACKGROUND:
//			return IColorConstant.LIGHT_GRAY;
//		case FOREGROUND:
//			return Colors.BLACK;
//		default:
//			return null;
//		}			
//	}
//
//	public static Style getFeatureGradient(Diagram diagram, EList<GradientFeature> features){
//		if (features.size()==0)
//			return null;
//		String name = features.get(0).getValue();
//		return getFeatureGradient(diagram, name);
//	}
//
//	public static Style getFeatureGradient(Diagram diagram, String name){
//		Style style = Graphiti.getGaService().findStyle(diagram, name);			
//		if (style==null){
//			style = Graphiti.getGaService().createPlainStyle(diagram, name);
//			style.setBackground(Graphiti.getGaService().manageColor(diagram, ColorConstant.WHITE));
//			switch (name){
//			case "BlueWhite":
//				Graphiti.getGaService().setRenderingStyle(style,
//						PredefinedColoredAreas.getBlueWhiteAdaptions());
//				break;
//			case "BlueWhiteGloss":
//				Graphiti.getGaService().setRenderingStyle(style,
//						PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
//				break;
//			case "CopperWhiteGloss":
//				Graphiti.getGaService().setRenderingStyle(style,
//						PredefinedColoredAreas.getCopperWhiteGlossAdaptions());
//				break;
//			case "LightGray":
//				Graphiti.getGaService().setRenderingStyle(style,
//						PredefinedColoredAreas.getLightGrayAdaptions());
//				break;
//			case "LightYellow":
//				Graphiti.getGaService().setRenderingStyle(style,
//						PredefinedColoredAreas.getLightYellowAdaptions());
//				break;
//			case "SilverWhiteGloss":
//				Graphiti.getGaService().setRenderingStyle(style,
//						PredefinedColoredAreas.getSilverWhiteGlossAdaptions());
//				break;
//			case "LimeWhite":
//				Graphiti.getGaService().setRenderingStyle(style,
//						CustomRenderingStyle.getLimeWhiteAdaptions());
//				break;
//			default:
//				break;
//			}
//		}
//		return style;
//		//return null;
//	}
//
//
//
//
//	//////////////////////////////////////////////////////////////////////////////
//
//	public static LineStyle getLineSyle(EList<LineFeature> features){
//		//EList<LineFeature> 
//		LineStyle ls = LineStyle.SOLID;
//		String line_value = features.size() == 0 ? "" : features.get(0).getValue();
//		if (line_value.equalsIgnoreCase("DASH"))
//			ls = LineStyle.DASH;
//		else if (line_value.equalsIgnoreCase("DOT"))
//			ls = LineStyle.DOT;
//		else if (line_value.equalsIgnoreCase("DAHDOT"))
//			ls = LineStyle.DASHDOT;
//		return ls;
//	}
//
//
//	public static enum IntegerFeature {
//		WIDTH, HEIGHT, TOP, LEFT, ANGLE, ARC, TRANSPARENCY, LINE_WIDTH, FONT_SIZE
//	}
//
//	public static int getDefaultInteger(IntegerFeature feature){
//		switch (feature){
//		case ANGLE:
//		case LEFT:
//		case TOP:
//		case TRANSPARENCY:
//			return 0;
//		case WIDTH:
//			return 100;
//		case HEIGHT:
//			return 50;
//		case ARC:
//			return 20;
//		case FONT_SIZE:
//			return 10;
//		default:
//			return 1;
//		}
//	}
//
//	public static enum BooleanFeature {
//		RESIZABLE, FONT_ITALIC, FONT_BOLD, TEXT_EDITABLE
//	}
//
//	public static boolean getDefaultBoolean(BooleanFeature feature){
//		switch (feature){
//		case RESIZABLE:
//			return true;
//		default:
//			return false;
//		}
//	}
//
//
//	public static enum StringFeature {
//		TEXT_VALUE, FONT_NAME, ICON
//	}	
//
////	public static void setProperties(GraphicsAlgorithm figure){
////		setProperties(figure, null);
////	}
////
////	public static void setProperties(GraphicsAlgorithm figure, String container){
////
////		FigureProperty.HASHCODE.set(figure, figure.hashCode());
////		FigureProperty.CONTAINER.set(figure, container);
////		FigureProperty.X.set(figure, figure.getX());
////		FigureProperty.Y.set(figure, figure.getY());
////		FigureProperty.WIDTH.set(figure, figure.getWidth());
////		FigureProperty.HEIGHT.set(figure, figure.getHeight());
////		FigureProperty.ZOOM_X.set(figure, 1);
////		FigureProperty.ZOOM_Y.set(figure, 1);
////		
////		if ( figure instanceof Polyline ){
////			EList<org.eclipse.graphiti.mm.algorithms.styles.Point> points = ((Polyline) figure).getPoints();
////			StringBuilder str_points = new StringBuilder(points.get(0).getX() + "," + points.get(0).getY());
////			for (int i=1; i<points.size(); i++)
////				str_points.append("|" + points.get(i).getX() + "," + points.get(i).getY());
////			POINTS.set(figure, str_points.toString());
////		}
////		
////		FigureProperty.ANCHOR_LEFT.set(figure, 0);
////		FigureProperty.ANCHOR_RIGHT.set(figure, 0);
////		FigureProperty.ANCHOR_UP.set(figure, 0);
////		FigureProperty.ANCHOR_DOWN.set(figure, 0);
////		
////	}
//
//	
//
//	
////	public static enum NodeFigures {
////		SQUARE, RECTANGLE, ROUNDEDRECTANGLE, CIRCLE, ELLIPSE, TRIANGLE, RHOMBUS, POLYGON, POLYLINE, LABEL, IMAGE
////	}
////
////	public static enum LinkFigures {
////		ARROW, TRIANGLE, RHOMBUS, POLYGON, POLYLINE
////	}
//	
//	//////////////////////////////////////////////////////////////////setfeatures
//	public static void setStyleFeatures(Diagram diagram, EObject eObject, GraphicsAlgorithm figure, FigureFeatures features){
//		
//		figure.setForeground(Graphiti.getGaService().manageColor(diagram, 
//				getFeatureColor(figure, eObject, 
//						features.getColorfeatures(), ColorFeature.FOREGROUND)));				
//
//		//shapes[i].Figure.setStyle(StyleUtil.getStyleForEClass(diagram));
//		if ( ! (figure instanceof AbstractText) ){
//			//Graphiti.getGaService().createShiftedColor(colorConstant, shift)
//			figure.setBackground(Graphiti.getGaService().manageColor(diagram, 
//					getFeatureColor(figure, eObject, 
//							features.getColorfeatures(), ColorFeature.BACKGROUND)));
//
//			Style style = getFeatureGradient(diagram, features.getGradientfeatures());
//			if (style!=null)
//				figure.setStyle(style);
//			//new RenderingStyle(PredefinedColoredAreas.getBlueWhiteGlossAdaptions()));
//			figure.setTransparency( (double) getFeatureInteger(figure, eObject, 
//							features.getIntegerfeatures(), IntegerFeature.TRANSPARENCY) / 100.0 );
//
//			figure.setLineWidth( getFeatureInteger(figure, eObject, 
//					features.getIntegerfeatures(), IntegerFeature.LINE_WIDTH) );
//
//
//			//					LineStyle ls = Graphiti.getGaService().createPlainStyle(diagram, "id");
//			figure.setLineStyle(getLineSyle(features.getLinefeatures()));
//			//					dashedStyle = gaService.createStyle(diagram, styleId);
//			//					dashedStyle.setLineStyle(LineStyle.DASH);
//			//					dashedStyle.setLineWidth(2);
//			//					dashedStyle.setForeground(gaService.manageColor(diagram,ICol orConstant.BLACK));
//			//
//			//					polyline.setStyle(dashedStyle);
//
//			//				Property e = new PropertyProvider();
//			//				EList proprieties = shapes[i].Figure.getProperties();
//			//				proprieties.add(e);
//			//				Graphiti.getGraphiti.getPeService()().setPropertyValue(shapes[i].Figure, "o", "l........."+shape.getFigure().toUpperCase());
//			//				
//		}
//		
//	}
//	
//	
//	
//	
//
//
//	public static final int minValue = 4;
//
//	public static class DrawShape {
//
//		public GraphicsAlgorithm Figure;
//		public Point Location;
//		public Point Size;
//
//		public DrawShape() {
//		}
//
//	}
//
//
//
//
//
//
//
//
//
//
//	public static class FigureShape {
//
//		public NodeFigures figure;
//		public FigureFeatures features;
//		public boolean main;
//
//		public FigureShape(String figure, FigureFeatures features, boolean main) {
//			this.figure = NodeFigures.RECTANGLE;
//			try{
//				this.figure = NodeFigures.valueOf(figure.toUpperCase());
//			}catch(Exception ex){				
//			}
//			this.features = features;
//			this.main = main;
//		}
//
//	}
//
//
//	public static class ResultShapes {
//
//		public DrawShape shapes[];
//		public Point minSize;
//		public Point maxSize;
//
//		public ResultShapes(DrawShape shapes[], Point minSize, Point maxSize) {
//			this.shapes=shapes;
//			this.minSize = minSize;
//			this.maxSize = maxSize;
//		}
//
//	}
//	
//	public static boolean isSameFeature (String key, String name){
//		return key.equalsIgnoreCase(name) || key.equalsIgnoreCase(name.replace("_", "-"));
//	}
//	
//	public static String getHashCode(GraphicsAlgorithm figure){
//		String hashcode = Graphiti.getPeService().getPropertyValue(figure, HASHCODE.toString());
//		return "|" + hashcode + "|";
//	}
//
//	public final static String strAttribute ="##ATTR##";	
//	public final static String typeSeperator = "_";
//	public final static String expressionSeperator = "|";
//	public final static String equalsSeperator = "=";
//	public final static String diferentSeperator = "<>";
//	public final static String rgbSeperator = ",";
//	
//	
//	
//	public static IColorConstant getFeatureColor(FigureFeatures features, ColorFeature feature){
//		return getFeatureColor(null, null, features.getColorfeatures(), feature);
//	}
//	public static IColorConstant getFeatureColor(GraphicsAlgorithm figure, EObject eObject, 
//			EList<org.eclipselabs.threedsl.xtext.graficalDsl.ColorFeature> features, ColorFeature feature){		
//		//System.out.println("--> color: "+ getColorKey(feature));
//		IColorConstant color = getDefaultColor(feature);				
//		for (org.eclipselabs.threedsl.xtext.graficalDsl.ColorFeature key : features)
//			if (isSameFeature (key.getKey(), feature.name())){
//				try{
//					color = key.getValue() != null ? 
//							Colors.valueOf(key.getValue().toUpperCase()) : 
//								getRGBColor(key.getRgb());
//					String result = key.getValue() != null ? key.getValue() : 
//								key.getRgb().getR() + rgbSeperator + key.getRgb().getG() + rgbSeperator + key.getRgb().getB();							
//					setExpressionResult(figure, eObject, key.getExpression(), 
//									feature.getClass().getName(), feature.name(), result);
//				}catch(Exception ex){
//				}
//			}
//		return color;
//	}
//
//
//
//	public static void setExpressionResult(GraphicsAlgorithm figure, EObject eObject, 
//			 AtributeExpression expression, String type, String feature, Object result){
//		
//		if (figure!=null && expression!=null && eObject!=null){
//			EClass eclass = eObject.eClass();			
//			for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
//				if (eStructuralFeature instanceof EAttribute) {
//					if (eStructuralFeature.getName().equals(expression.getKey())){												
//						Object value = getAttributeValue(eStructuralFeature.getEType(), 
//								expression.getValue());												
//						if (value!=null)
//							Graphiti.getPeService().setPropertyValue(figure,  type + typeSeperator + feature + 
//									expressionSeperator + expression.getKey()+expression.getOperator()+value.toString(), 
//											result.toString());
//					}
//				}
//			}
//
//		}
//		
//	}
//
//
//	public static String getExpressionResult(GraphicsAlgorithm figure, ArrayList<Property> properties,
//			String type, String feature, String attribute, String value){
//		String condition = type + typeSeperator + feature + expressionSeperator;
//		String result = Graphiti.getPeService().getPropertyValue(figure, 
//				condition + attribute + equalsSeperator + value);
//		if (result==null){
//			for ( Property property : properties )
//				if ( property.getKey().startsWith(condition + attribute + diferentSeperator) ){
//					String[] str_exprs = property.getKey().split(diferentSeperator);
//					if (!str_exprs[1].equals(value))
//						result = property.getValue();
//				}
//		}
//		return result;
//	}
//
//	public static void updateFigureFeatures(Diagram diagram, GraphicsAlgorithm figure){			
//
//		if (figure.getProperties().size()<=0)
//			return;
//
//		PictogramLink link = getPictogramLink(figure);
//		if (link!=null){
//
//			for (EObject eobject : link.getBusinessObjects()){
//				EClass eclass = eobject.eClass();
//				for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
//
//					if (eStructuralFeature instanceof EAttribute) {
//						String value = eobject.eGet(eStructuralFeature)==null ? 
//								"" : eobject.eGet(eStructuralFeature).toString();
//
//						ArrayList<Property> properties=new ArrayList<Property>();
//						for ( Property property : figure.getProperties() )
//							if ( property.getKey().contains(expressionSeperator + eStructuralFeature.getName()) )
//								properties.add(property);
//
//						if (properties.size()==0)
//							continue;
//
//						for ( ColorFeature feature :  ColorFeature.values() ){
//							String result = getExpressionResult(figure, properties,
//									feature.getClass().getName(), feature.name(), eStructuralFeature.getName(), value);								
//							if (result!=null){
//								Color color = null;
//								if (result.contains(rgbSeperator)){
//									String[] rgbs = result.split(rgbSeperator);
//									color = Graphiti.getGaService().manageColor(diagram, 
//											new ColorConstant(Integer.parseInt(rgbs[0]),
//													Integer.parseInt(rgbs[1]), 
//													Integer.parseInt(rgbs[2])) );
//								}else
//									color = Graphiti.getGaService().manageColor(diagram, 
//											Colors.valueOf(result.toUpperCase()));
//								switch (feature){
//								case BACKGROUND:
//									figure.setBackground(color);
//									break;
//								case FOREGROUND:
//									figure.setForeground(color);
//									break;
//								case GRADIENT:
//									Style style = getFeatureGradient(diagram, result);
//									if (style!=null) figure.setStyle(style);
//									break;
//								}
//							}								
//						}
//					}
//
//				}
//			}				
//		}
//	}
//	
////	public static Object getFeatureValue(String name){
////		
////		
////	}
//
//
//	public static int getFeatureInteger(FigureFeatures features, IntegerFeature feature){
//		return getFeatureInteger(null, null, features.getIntegerfeatures(), feature);
//	}
//	public static int getFeatureInteger(GraphicsAlgorithm figure, EObject eObject, 
//			EList<org.eclipselabs.threedsl.xtext.graficalDsl.IntegerFeature> features, IntegerFeature feature){
//		int value = getDefaultInteger(feature);
//		for (org.eclipselabs.threedsl.xtext.graficalDsl.IntegerFeature key : features)
//			if (isSameFeature (key.getKey(), feature.name())){
//				try{
//					value = key.getValue();
//					setExpressionResult(figure, eObject, key.getExpression(), 
//							feature.getClass().getName(), feature.name(), value);
//				}catch(Exception ex){
//				}
//			}
//		return value;
//	}
//
//	public static boolean getFeatureBoolean(FigureFeatures features, BooleanFeature feature){
//		return getFeatureBoolean(null, null, features.getBooleanfeatures(), feature);
//	}
//	public static boolean getFeatureBoolean(GraphicsAlgorithm figure, EObject eObject, 
//			EList<org.eclipselabs.threedsl.xtext.graficalDsl.BooleanFeature> features, BooleanFeature feature){
//		boolean value = getDefaultBoolean(feature);
//		for (org.eclipselabs.threedsl.xtext.graficalDsl.BooleanFeature key : features) 
//			if (isSameFeature (key.getKey(), feature.name())){
//				try{
//					value = key.getValue()!=null && key.getValue().equalsIgnoreCase("true");
//					setExpressionResult(figure, eObject, key.getExpression(), 
//							feature.getClass().getName(), feature.name(), value);
//				}catch(Exception ex){
//				}
//			}
//		return value;
//	}
//
//	public static String getFeatureString(FigureFeatures features, StringFeature feature){
//		return getFeatureString(features.getStringfeatures(), feature);
//	}
//	public static String getFeatureString(EList<org.eclipselabs.threedsl.xtext.graficalDsl.StringFeature> features, StringFeature feature){
//		return getFeatureString(null, null, features, feature);
//	}
//	public static String getFeatureString(GraphicsAlgorithm figure, EObject eObject, 
//			EList<org.eclipselabs.threedsl.xtext.graficalDsl.StringFeature> features, StringFeature feature){
//		String value = "";
//		if (feature==StringFeature.FONT_NAME)
//			value = "Arial";
//		for (org.eclipselabs.threedsl.xtext.graficalDsl.StringFeature key : features)
//			if (isSameFeature (key.getKey(), feature.name())){
//				try{
//					if (key.getValue()!=null)
//						value = key.getValue();
//					if (key.getValueL()!=null)
//						value += key.getValueL();
//					if (key.getAttribute()!=null){
//						value += strAttribute;
//						if (figure instanceof AbstractText){
//							Graphiti.getPeService().setPropertyValue(figure, 
//									TEXT_ATTR.toString(), key.getAttribute() );
//							Graphiti.getPeService().setPropertyValue(figure, 
//									TEXT_VALUE.toString(), "" );
//						}
//					}
//					if (key.getValueR()!=null)
//						value += key.getValueR();
//					setExpressionResult(figure, eObject, null, 
//							feature.getClass().getName(), feature.name(), value);
//				}catch(Exception ex){
//				}
//			}
//		return value;
//	}
//
//
//
//	
//
//	public static ContainerShape getContainerShape(PictogramElement pe){
//		if (pe instanceof ContainerShape)
//			return (ContainerShape) pe;
//		else if (pe != null)
//			return getContainerShape(Graphiti.getPeService().getPictogramElementParent(pe));
//		return null;
//	}
//
//	public static Object getContainerObject(GraphicsAlgorithm figure){
//		Object shape = figure.eContainer();
//		while ( shape != null && shape instanceof GraphicsAlgorithmContainer && 
//				!(shape instanceof ContainerShape) && !(shape instanceof Connection) )
//			shape = ((GraphicsAlgorithmContainer)shape).eContainer();
//		return shape;
//	}
//
//	public static PictogramLink getPictogramLink(GraphicsAlgorithm figure){
//		Object shape = figure.eContainer();
//		while ( shape != null && shape instanceof GraphicsAlgorithmContainer && 
//				!(shape instanceof ContainerShape) && !(shape instanceof Connection) )
//			shape = ((GraphicsAlgorithmContainer)shape).eContainer();
//		if (shape instanceof ContainerShape)
//			return ((ContainerShape)shape).getLink();
//		if (shape instanceof Connection)
//			return ((Connection)shape).getLink();
//		return null;
//	}
//
//	public static String updateLabelValue(AbstractText text){	
//		String value = Graphiti.getPeService().getPropertyValue(text, TEXT.toString());
//		String attr = Graphiti.getPeService().getPropertyValue(text, TEXT_ATTR.toString());
//
//		PictogramLink link = getPictogramLink(text);
//		if (attr!=null && link!=null){
//
//			for (EObject eobject : link.getBusinessObjects()){
//				EClass eclass = eobject.eClass();
//
//				for(EAttribute att : eclass.getEAllAttributes()) {
//					if (att.getName().equals(attr)){
//						String attribute = eobject.eGet(att)==null ? 
//								"" : eobject.eGet(att).toString();
//						Graphiti.getPeService().setPropertyValue(text, TEXT_VALUE.toString(), attribute);
//						value = value.replace(strAttribute,  attribute);
//					}
//				}
//
//			}
//		}				
//
//		text.setValue(value);
//		return value;
//	}
//
//	public static void updateLabelValue(GraphicsAlgorithm figure, String value){
//		if (!(figure instanceof AbstractText))
//			return;
//		AbstractText text = (AbstractText)figure;
//		String attr = Graphiti.getPeService().getPropertyValue(text, TEXT_ATTR.toString());
//
//		PictogramLink link = getPictogramLink(text);			
//		if (attr!=null && link!=null){
//
//			for (EObject eobject : link.getBusinessObjects()){
//				EClass eclass = eobject.eClass();
//				for (Iterator iterRef = 
//						eclass.getEAllStructuralFeatures().iterator(); iterRef.hasNext();){
//
//					EStructuralFeature eStructuralFeature = (EStructuralFeature) 
//							iterRef.next();
//
//					if (eStructuralFeature instanceof EAttribute) {				    
//						if (eStructuralFeature.getName().equals(attr))
//							eobject.eSet(eStructuralFeature, value);
//					}
//
//				}
//			}				
//			Graphiti.getPeService().setPropertyValue(text, TEXT_VALUE.toString(), value);				
//		}else
//			Graphiti.getPeService().setPropertyValue(text, TEXT.toString(), value);
//	}
//
//
//
//	public static Point setTextFigure(Diagram diagram, AbstractText text, FigureFeatures features){				
//
//		text.setValue(getFeatureString(text, null, features.getStringfeatures(), StringFeature.TEXT_VALUE));
//		text.setBackground(Graphiti.getGaService().manageColor(diagram, Colors.WHITE));
//		//text.setTransparency(1.0);
//		if ( features.getAlignfeatures().size()==0 || 
//				features.getAlignfeatures().get(0).getKey().equalsIgnoreCase("MIDDLE") )
//			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
//		else if ( features.getAlignfeatures().get(0).getKey().equalsIgnoreCase("RIGHT") )
//			text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
//		else
//			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
//
//		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
//		//		text.setForeground(Graphiti.getGaService().manageColor(diagram, Colors.BLACK));
//		org.eclipse.graphiti.mm.algorithms.styles.Font font =
//				Graphiti.getGaService().manageDefaultFont(diagram, false, false);	
//		try{
//			font = Graphiti.getGaService().manageFont(diagram, 
//					getFeatureString(features, StringFeature.FONT_NAME), 
//					getFeatureInteger(features, IntegerFeature.FONT_SIZE), 
//					getFeatureBoolean(features, BooleanFeature.FONT_ITALIC), 
//					getFeatureBoolean(features, BooleanFeature.FONT_BOLD));
//		}catch(Exception ex)
//		{}
//		text.setFont(font);
//
//		text.setLineWidth( getFeatureInteger(features, IntegerFeature.LINE_WIDTH) );
//
//		IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize("#"+text.getValue(), font);
//		Point size = new Point (dim.getWidth(), dim.getHeight() + 4);
//		Graphiti.getPeService().setPropertyValue(text, 
//				TEXT.toString(), text.getValue() );
//		Graphiti.getPeService().setPropertyValue(text, 
//				CAN_EDIT.toString(), 
//				getFeatureBoolean(features, BooleanFeature.TEXT_EDITABLE) ? "1" : "0" );
//
//		return size;
//	}
//
//	public static Object getAttributeValue(EClassifier etype, AtributeValue attribute){
//		if ( etype instanceof EEnum && attribute.getValueID() != null ){
//			EEnum eenum = (EEnum)etype;
//			for ( EEnumLiteral literal : eenum.getELiterals())
//				if ( literal.getName().equals(attribute.getValueID()) )
//					return literal.getInstance();
//		}else if (etype instanceof EDataType){				
//			switch (etype.getName()){	
//			case "EBoolean":
//				return "true".equals(attribute.getValueBOOL());
//			case "EInt":
//				return attribute.getValueINT();
//			case "EFloat":
//				return (float)attribute.getValueINT() + (float)attribute.getValueDEC()/100.0 ;
//			case "EDate":
//				return new Date(attribute.getValueYEAR(), 
//						attribute.getValueMONTH()-1, attribute.getValueYEAR());
//			default:
//				return attribute.getValueSTRING();
//			}
//		}
//		return null;			
//	}
//
//	public static void setAttributesValue(EList<Attribute> attributes, EObject eObject){
//		//EList<EAttribute> attrs = eObject.eClass().getEAllAttributes();
//		EClass eclass = eObject.eClass();
//		for (Iterator iterRef = 
//				eclass.getEAllStructuralFeatures().iterator(); iterRef.hasNext();){ 
//
//			EStructuralFeature eStructuralFeature = (EStructuralFeature) 
//					iterRef.next(); 
//
//			if (eStructuralFeature instanceof EAttribute) {
//				for (Attribute attribute : attributes){
//					if (eStructuralFeature.getName().equals(attribute.getKey()))
//						eObject.eSet(eStructuralFeature, 
//								getAttributeValue(eStructuralFeature.getEType(), attribute.getValue()));
//				}
//			}
//
//		}
//
//	}
//
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	public static void registerNodeImages(Map<String, String> properties, Bundle bundle, EList<Node> nodes){
//		for (Node node : nodes){
//			if (node.getIcon()!=null){
//				try{
//					String icon = properties.get(node.getIcon());
//					Point size = null;
//					if (icon!=null)
//						size = ImageProvider.addImageFile(node.getIcon(), icon, bundle);
//					if (size!=null)
//						imageSizes.put(node.getIcon(), size);
//				}catch (Exception ex){
//					System.err.println(ex.getMessage());
//				}
//			}
//			for (NodeFigure figure : node.getFigures()){
//				String value = FeaturesProvider.getFeatureString(figure.getFeatures(), StringFeature.ICON);
//				if (value!=null){
//					try{
//						String icon = properties.get(value);
//						Point size = null;
//						if (icon!=null)
//							size = ImageProvider.addImageFile(value, icon, bundle);
//						if (size!=null)
//							imageSizes.put(value, size);
//					}catch (Exception ex){
//						System.err.println(ex.getMessage());
//					}
//				}
//			}
//		}
//	}
//
//
//	public static ResultShapes processNodeFigures(Diagram diagram, GraphicsAlgorithmContainer container, 
//			EObject eObject, GraphicsAlgorithm parentFigure,
//			EList<NodeFigure> allfigures, Point minSize, Point maxSize){
//
//		FigureShape[] figures = new FigureShape[allfigures.size()];
//		for (int i=0; i<allfigures.size(); i++)
//			figures[i] = new FigureShape(allfigures.get(i).getFigure(), 
//					allfigures.get(i).getFeatures(), allfigures.get(i).getOption()!=null);
//
//		return processNodeFigures(diagram, container, eObject, parentFigure, figures, minSize, maxSize);
//
//	}
//
//
//	public static ResultShapes processNodeFigures(Diagram diagram, GraphicsAlgorithmContainer container, 
//			EObject eObject, GraphicsAlgorithm parentFigure,
//			FigureShape[] figures, Point minSize, Point maxSize){
//
//		DrawShape shapes[] = new DrawShape[figures.length*2];
//		if (minSize==null)
//			minSize = new Point(999, 999);
//		if (maxSize==null)
//			maxSize = new Point(-999, -999);
//
//		for (int i=0; i<figures.length; i++){
//
//			FigureShape figure = figures[i];
//
//			shapes[i] = new DrawShape();
//			shapes[i].Figure = null;
//			shapes[i].Location = new Point(
//					getFeatureInteger(figure.features, IntegerFeature.LEFT), 
//					getFeatureInteger(figure.features, IntegerFeature.TOP));
//			shapes[i].Size = new Point(
//					getFeatureInteger(figure.features, IntegerFeature.WIDTH), 
//					getFeatureInteger(figure.features, IntegerFeature.HEIGHT));
//
//			GraphicsAlgorithmContainer object = container;
//			if (container instanceof ContainerShape)
//				object = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
//			//figure.figure == NodeFigures.LABEL								
//
//
//					Point limit = FeaturesProvider.processShape(shapes[i], diagram, object, 
//							figure.figure, figure.features,
//							getFeatureInteger(figure.features, IntegerFeature.ANGLE), 
//							getFeatureInteger(figure.features, IntegerFeature.ARC));
//
//					if (figure.main)
//						Graphiti.getPeService().setPropertyValue(shapes[i].Figure, 
//								MAIN.toString(), "1" );
//
//					if ( figure.features.getCenterfeatures().size()==0 || 
//							figure.features.getCenterfeatures().get(0).getKey().equalsIgnoreCase("VERTICAL") ){
//						minSize.x = shapes[i].Location.x<minSize.x ? shapes[i].Location.x : minSize.x;
//						maxSize.x = limit.x>maxSize.x ? limit.x : maxSize.x;
//					}
//					if ( figure.features.getCenterfeatures().size()==0 || 
//							figure.features.getCenterfeatures().get(0).getKey().equalsIgnoreCase("HORIZONTAL") ){
//						minSize.y = shapes[i].Location.y<minSize.y ? shapes[i].Location.y : minSize.y;
//						maxSize.y = limit.y>maxSize.y ? limit.y : maxSize.y;
//					}
//
//					setStyleFeatures(diagram, eObject, shapes[i].Figure, figure.features);
//
//					if (figure.figure == NodeFigures.LABEL)
//						Graphiti.getPeService().setPropertyValue(parentFigure, CAN_RESIZE.toString(), "1");
//					
//					
//
//					//-----------------------------------
//
//					int j = figures.length+i;
//					shapes[j] = new DrawShape();
//					GraphicsAlgorithmContainer txtshape = container;
//					if (container instanceof ContainerShape)
//						txtshape = Graphiti.getPeCreateService().createShape((ContainerShape) container, false);
//					MultiText text = Graphiti.getGaService().createMultiText(txtshape, "#");
//					String value = getFeatureString(figure.features, StringFeature.TEXT_VALUE);
//					text.setValue( figure.figure != NodeFigures.LABEL ? value : "");
//
//
//					if ( figure.features.getAlignfeatures().size()==0 || 
//							figure.features.getAlignfeatures().get(0).getKey().equalsIgnoreCase("MIDDLE") )
//						text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
//					else if ( figure.features.getAlignfeatures().get(0).getKey().equalsIgnoreCase("RIGHT") )
//						text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
//					else
//						text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
//
//					text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
//					//				text.setForeground(Graphiti.getGaService().manageColor(diagram, Colors.BLACK));
//					org.eclipse.graphiti.mm.algorithms.styles.Font font =
//							Graphiti.getGaService().manageDefaultFont(diagram, false, false);	
//					try{
//						font = Graphiti.getGaService().manageFont(diagram, 
//								getFeatureString(figure.features, StringFeature.FONT_NAME), 
//								getFeatureInteger(figure.features, IntegerFeature.FONT_SIZE), 
//								getFeatureBoolean(figure.features, BooleanFeature.FONT_ITALIC), 
//								getFeatureBoolean(figure.features, BooleanFeature.FONT_BOLD));
//					}catch(Exception ex)
//					{}
//					text.setFont(font);
//
//					text.setLineWidth( getFeatureInteger(figure.features, IntegerFeature.LINE_WIDTH) );
//
//					if (text.getValue().length()>0){
//						Graphiti.getPeService().setPropertyValue(text, 
//								TEXT.toString(), text.getValue() );
//						Graphiti.getPeService().setPropertyValue(text, 
//								CAN_RESIZE.toString(), "1" );
//						Graphiti.getPeService().setPropertyValue(text, 
//								CAN_EDIT.toString(), 
//								getFeatureBoolean(figure.features, BooleanFeature.TEXT_EDITABLE) ? "1" : "0" );
//					}
//
//
//					text.setForeground(Graphiti.getGaService().manageColor(diagram, Colors.BLACK));
//
//					font =
//							Graphiti.getGaService().manageDefaultFont(diagram, false, false);
//					try{
//						font = Graphiti.getGaService().manageFont(diagram, 
//								getFeatureString(figure.features, StringFeature.FONT_NAME), 
//								getFeatureInteger(figure.features, IntegerFeature.FONT_SIZE), 
//								getFeatureBoolean(figure.features, BooleanFeature.FONT_ITALIC), 
//								getFeatureBoolean(figure.features, BooleanFeature.FONT_BOLD));
//					}catch(Exception ex)
//					{}
//					text.setFont(font);
//
//					//				Shell shell = new Shell();
//					//				Display display = Display.getDefault();
//					//				org.eclipse.swt.widgets.Text lbl = new org.eclipse.swt.widgets.Text(shell, SWT.WRAP);
//					//				
//					//				System.out.println("--> tt: "+ text.getFont().getName());
//					//				//try{
//					//				lbl.setFont(new Font(display,text.getFont().getName(), text.getFont().getSize(), SWT.ITALIC ));
//					//				//}catch(Exception ex){}
//					//				lbl.setSize(new org.eclipse.swt.graphics.Point(shapes[i].Size.x, shapes[i].Size.y));
//					//				lbl.setText(text.getValue());
//					//				GC gc = new GC(lbl);
//					//				FontMetrics fm = gc.getFontMetrics();
//					//				System.out.println("--> hh: "+ fm.getHeight() + " ''' " + 
//					//				GraphitiUi.getUiLayoutService().calculateTextSize(text.getValue(), f) );
//					shapes[j].Figure = text;
//					shapes[j].Location = shapes[i].Location.getLocation();
//					shapes[j].Size = (Point) shapes[i].Size.clone();
//					//				
//
//					//				Shape shape = Graphiti.getPeCreateService().createShape(container, false);
//					//				Text text = Graphiti.getGaService().createPlainText(shape, eObject.eClass().getName());
//					//				text.setValue(eObject.eClass().getName());
//					//				
//					//				Style fontStyle = Graphiti.getGaService().createPlainStyle(feature.getDiagram(), "myfontstyle");
//					//				fontStyle.setFont(Graphiti.getGaService().manageFont(feature.getDiagram(), "Arial", 15));	
//					//				fontStyle.setBackground(style.getBackground());
//					//				fontStyle.setForeground(Graphiti.getGaService().manageColor(feature.getDiagram(),IColorConstant.BLACK));
//					//				
//					//				text.setStyle(fontStyle);
//
//					//	            // create and set text graphics algorithm
//					//	            Text text = Graphiti.getGaService().createText(shape, addedClass.getName());
//					//	            text.setForeground(manageColor(E_CLASS_TEXT_FOREGROUND));
//					//	            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER); 
//					//	            // vertical alignment has as default value "center"
//					//	            text.setFont(Graphiti.getGaService().manageDefaultFont(getDiagram(), false, true));
//					//	            Graphiti.getGaService().setLocationAndSize(text, 0, 0, width, 20);
//
//
//		}
//
//		//System.out.println("--> size: x:" + minSize.x + " y:" + minSize.y);
//
//		for (DrawShape shape : shapes)
//			shape.Location.translate(-minSize.x, -minSize.y);
//		maxSize.translate(-minSize.x, -minSize.y);
//		minSize.translate(-minSize.x, -minSize.y);
//
//		if (maxSize.x<FeaturesProvider.minValue)
//			maxSize.x = FeaturesProvider.minValue;
//		if (maxSize.y<FeaturesProvider.minValue)
//			maxSize.y = FeaturesProvider.minValue;
//
//		for (int i=0; i<figures.length; i++){
//			FigureShape figure = figures[i];
//			int j = figures.length+i;
//			if ( figure.features.getCenterfeatures().size()>0 && 
//					!figure.features.getCenterfeatures().get(0).getKey().equalsIgnoreCase("VERTICAL") ){
//				shapes[i].Location.x = shapes[j].Location.x =
//						(int)(maxSize.x/2.0-shapes[i].Size.x/2.0);
//				minSize.x = shapes[i].Location.x<minSize.x ? shapes[i].Location.x : minSize.x;
//				int limit = shapes[i].Location.x+shapes[i].Size.x;
//				maxSize.x = limit>maxSize.x ? limit : maxSize.x;
//			}
//			if ( figure.features.getCenterfeatures().size()>0 && 
//					!figure.features.getCenterfeatures().get(0).getKey().equalsIgnoreCase("HORIZONTAL") ){
//				shapes[i].Location.y = shapes[j].Location.y = 
//						(int)(maxSize.y/2.0-shapes[i].Size.y/2.0);
//				minSize.y = shapes[i].Location.y<minSize.y ? shapes[i].Location.y : minSize.y;
//				int limit = shapes[i].Location.y+shapes[i].Size.y;
//				maxSize.y = limit>maxSize.y ? limit : maxSize.y;
//			}
//		}
//
//		//			for (DrawShape shape : shapes){
//		//				System.out.println("--> size: x:" + shape.Location.x + " y:" + shape.Location.y);
//		//			}
//
//		for (DrawShape shape : shapes)
//			shape.Location.translate(-minSize.x, -minSize.y);
//		maxSize.translate(-minSize.x, -minSize.y);
//		minSize.translate(-minSize.x, -minSize.y);
//
//		for (DrawShape shape : shapes){
//			Graphiti.getGaService().setLocationAndSize(shape.Figure, 
//					shape.Location.x, shape.Location.y, 
//					shape.Size.x, shape.Size.y);
//			FigureProperty.setProperties(shape.Figure);				
//
//			System.out.println("--> size: x:" + shape.Location.x + " y:" + shape.Location.y);
//		}			
//
//		return new ResultShapes(shapes, minSize, maxSize);
//
//	}
//
//
//	public static GraphicsAlgorithm processNodeImage(GraphicsAlgorithmContainer container, String icon, Point minSize, Point maxSize){
//		GraphicsAlgorithm nodeFigure = null;
//		if (icon!=null && imageSizes.containsKey(icon)){
//			nodeFigure = Graphiti.getGaService().createImage(container, icon);
//			minSize.x = 0;
//			minSize.y = 0;
//			maxSize.x = imageSizes.get(icon).x;
//			maxSize.y = imageSizes.get(icon).y;
//		}else{
//			//nodeFigure = Graphiti.getGaService().createInvisibleRectangle(container);
//			nodeFigure = Graphiti.getGaService().createImage(container, null);
//			//fig = Graphiti.getGaService().createText(container, "123");
//		}	
//		return nodeFigure;
//	}
//
//
//public static Point processShape(DrawShape shape, Diagram diagram, GraphicsAlgorithmContainer object, 
//			NodeFigures figure, FigureFeatures features, int angle, int arc){
//		//GraphicsAlgorithm fig = null;
//		//Point size = new Point(maxSize.x/2, maxSize.y/4);
//
//		int xy[] = null;
//		if (features.getPointfeatures().size()>1){
//
//			xy = new int [features.getPointfeatures().size()*2];
//			int beforeAfter[] = new int [features.getPointfeatures().size()*2];
//			for (int p=0; p<features.getPointfeatures().size(); p++){
//				int x = features.getPointfeatures().get(p).getX();
//				int y = features.getPointfeatures().get(p).getY();
//				xy[p*2] = x;
//				xy[p*2+1] = y;
//				//					beforeAfter[p*2] = 0;
//				//					beforeAfter[p*2+1] = 0;
//			}
//			Point[] bounds = FeaturesProvider.CalculateBounds(xy);
//			//shapes[i].Location.setLocation(bounds[0].x, bounds[0].y);
//			FeaturesProvider.TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//			//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//			shape.Size.setLocation(bounds[1].x, bounds[1].y);
//			//System.out.println("--> size: x:" + shapes[i].Size.x + " y:" + shapes[i].Size.y);
//			//xy = new int[] { shapes[i].Size.x/2, 0, 0, shapes[i].Size.y, shapes[i].Size.x, shapes[i].Size.y };
//			//xy = new int[] { 0, 0, 80, 0, 100, 50, 20, 50 };
//			//shapes[i].Figure = Graphiti.getGaService().createPolygon(object, xy);
//		}
//
//		if (figure==NodeFigures.POLYGON && xy ==null)
//			figure = NodeFigures.RECTANGLE;
//
//		Point center = new Point(shape.Location.x+shape.Size.x/2,
//				shape.Location.y+shape.Size.y/2);
//
//		switch (figure){	
//		case LABEL:					
//			MultiText text = Graphiti.getGaService().createMultiText(object, "#####");					
//			Point size = setTextFigure(diagram, text, features);
//			shape.Figure = text;
//			shape.Size.x = size.x;
//			shape.Size.y = size.y;					
//			break;
//		case IMAGE:					
//			String icon = getFeatureString(features, StringFeature.ICON);
//			if (icon!=null && imageSizes.containsKey(icon)){
//				shape.Figure = Graphiti.getGaService().createImage(object, icon);
//				shape.Size.y = imageSizes.get(icon).y;
//				shape.Size.x = imageSizes.get(icon).x;
//			}else{
//				shape.Figure = Graphiti.getGaService().createImage(object, null);
//				shape.Size.y = minValue;
//				shape.Size.x = minValue;
//			}
//			break;
//		case CIRCLE:
//			shape.Size.y = shape.Size.x;
//		case ELLIPSE:
//			shape.Figure = Graphiti.getGaService().createPlainEllipse(object);
//			break;
//		case SQUARE:
//			shape.Size.y = shape.Size.x;
//			center = new Point(shape.Location.x+shape.Size.x/2,
//					shape.Location.y+shape.Size.y/2);
//		case RECTANGLE:
//			if (angle>0){
//				xy = new int[] { 0, 0, shape.Size.x, 0,
//						shape.Size.x, shape.Size.y, 0, shape.Size.y };
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(shape.Location.x-bounds[0].x, 
//						shape.Location.y-bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				shape.Size.setLocation(bounds[1].x, bounds[1].y);
//				shape.Figure = Graphiti.getGaService().createPlainPolygon(object, xy);
//			}else
//				shape.Figure = Graphiti.getGaService().createPlainRectangle(object);
//			break;
//		case ROUNDEDRECTANGLE:
//			if (angle>0){
//				xy = new int[] { 0, 0, shape.Size.x, 0,
//						shape.Size.x, shape.Size.y, 0, shape.Size.y };
//				int[] beforeAfter = new int[] { arc, arc, arc, arc, arc, arc, arc, arc };
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(shape.Location.x-bounds[0].x, 
//						shape.Location.y-bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				shape.Size.setLocation(bounds[1].x, bounds[1].y);
//				shape.Figure = Graphiti.getGaService().createPlainPolygon(object, xy, beforeAfter);
//			}else
//				shape.Figure = Graphiti.getGaService().createPlainRoundedRectangle(object, arc, arc);
//			break;
//		case TRIANGLE:
//			shape.Size.y = shape.Size.x;
//			center = new Point(shape.Location.x+shape.Size.x/2,
//					shape.Location.y+shape.Size.y/2);
//			// triangle through points: top-middle, bottom-right, bottom-left
//			//					double radian = Math.PI / 180.0 * 15;
//			//					Point p1 = new Point(shape.Size.x/2, 0);
//			//					Point p2 = new Point(0, shape.Size.y);
//			//					Point p3 = new Point(shape.Size.x, shape.Size.y);		
//
//			xy = new int[] { shape.Size.x/2, 0, 
//					0, shape.Size.y, 
//					shape.Size.x, shape.Size.y };
//			if (angle>0){
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				shape.Size.setLocation(bounds[1].x, bounds[1].y);
//			}
//			shape.Figure = Graphiti.getGaService().createPlainPolygon(object, xy);
//			break;
//		case RHOMBUS:
//			xy = new int[] { shape.Size.x/2, 0, 
//					shape.Size.x, shape.Size.y/2,
//					shape.Size.x/2, shape.Size.y, 
//					0, shape.Size.y/2 };
//		case POLYGON:
//			//					xy = new int[] { p1.x, p1.y, p2.x, p2.y, p3.x, p3.y };
//			//					beforeAfter = new int[] { 0, 0, 0, 0, 0, 0 };
//			//					shape.Figure = Graphiti.getGaService().createPolygon(object, xy, beforeAfter);
//			//					p1 = new Point(shape.Size.x/2, 0);
//			//					p2 = new Point(0, shape.Size.y);
//			//					p3 = new Point(shape.Size.x, shape.Size.y);
//			//xy = new int[] { 0, 0, 80, 0, 100, 50, 20, 50 };
//			//shape.Figure = Graphiti.getGaService().createPolygon(object, xy);
//			//shape.Figure = shape.Figure;
//			if (angle>0){
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//				//						TranslateFigure(xy, new Point(shape.Location.x-bounds[0].x, 
//				//								shape.Location.y-bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				shape.Size.setLocation(bounds[1].x, bounds[1].y);
//			}
//			shape.Figure = Graphiti.getGaService().createPlainPolygon(object, xy);
//			break;
//		case POLYLINE:
//			//					xy = new int[] { p1.x, p1.y, p2.x, p2.y, p3.x, p3.y };
//			//					beforeAfter = new int[] { 0, 0, 0, 0, 0, 0 };
//			//					shape.Figure = Graphiti.getGaService().createPolygon(object, xy, beforeAfter);
//			//					p1 = new Point(shape.Size.x/2, 0);
//			//					p2 = new Point(0, shape.Size.y);
//			//					p3 = new Point(shape.Size.x, shape.Size.y);
//			//xy = new int[] { 0, 0, 80, 0, 100, 50, 20, 50 };
//			//shape.Figure = Graphiti.getGaService().createPolygon(object, xy);
//			//shape.Figure = shape.Figure;
//			if (angle>0){
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//				//						TranslateFigure(xy, new Point(shape.Location.x-bounds[0].x, 
//				//								shape.Location.y-bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				shape.Size.setLocation(bounds[1].x, bounds[1].y);
//			}
//			shape.Figure = Graphiti.getGaService().createPlainPolyline(object, xy);
//			break;
//		default:
//			shape.Figure = Graphiti.getGaService().createPlainRectangle(object);
//			break;
//		}
//
//		return new Point(shape.Location.x+shape.Size.x, shape.Location.y+shape.Size.y);
//	}
//
//
//
//
//	public static void processLinkFigure(Diagram diagram, ConnectionDecorator cd, StaticFigure figure){
//
//		int minValue = 20;
//
//		Point Location = new Point(0, 0);
//		Point Size = new Point(
//				getFeatureInteger(figure.getFeatures(), IntegerFeature.WIDTH), 
//				getFeatureInteger(figure.getFeatures(), IntegerFeature.HEIGHT));
//		if (Size.x==100 && Size.y==50)
//			Size.setLocation(minValue, minValue);
//
//		int xy[] = null;
//		if (figure.getFeatures().getPointfeatures().size()>1){
//			xy = new int [figure.getFeatures().getPointfeatures().size()*2];
//			int beforeAfter[] = new int [figure.getFeatures().getPointfeatures().size()*2];
//			for (int p=0; p<figure.getFeatures().getPointfeatures().size(); p++){
//				int x = figure.getFeatures().getPointfeatures().get(p).getX();
//				int y = figure.getFeatures().getPointfeatures().get(p).getY();
//				xy[p*2] = x;
//				xy[p*2+1] = y;
//				//					beforeAfter[p*2] = 0;
//				//					beforeAfter[p*2+1] = 0;
//			}
//			Point[] bounds = FeaturesProvider.CalculateBounds(xy);
//			//shapes[i].Location.setLocation(bounds[0].x, bounds[0].y);
//			FeaturesProvider.TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//			//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//			Size.setLocation(bounds[1].x, bounds[1].y);
//			//System.out.println("--> size: x:" + shapes[i].Size.x + " y:" + shapes[i].Size.y);
//			//xy = new int[] { shapes[i].Size.x/2, 0, 0, shapes[i].Size.y, shapes[i].Size.x, shapes[i].Size.y };
//			//xy = new int[] { 0, 0, 80, 0, 100, 50, 20, 50 };
//			//shapes[i].Figure = Graphiti.getGaService().createPolygon(object, xy);
//		}
//
//		LinkFigures linkfigure = LinkFigures.POLYLINE;
//		try{
//			linkfigure = LinkFigures.valueOf(figure.getFigure().toUpperCase());
//		}catch(Exception ex){				
//		}
//		if ( xy==null && (linkfigure==LinkFigures.POLYGON || linkfigure==LinkFigures.POLYLINE) )
//			return;
//
//		//			Point Location = new Point(
//		//					getFeatureInteger(figure.getFeatures(), IntegerFeature.LEFT), 
//		//					getFeatureInteger(figure.getFeatures(), IntegerFeature.TOP));					
//		int angle = getFeatureInteger(figure.getFeatures(), IntegerFeature.ANGLE);
//		int arc = getFeatureInteger(figure.getFeatures(), IntegerFeature.ARC);
//
//		Point center = new Point(Location.x+Size.x/2, Location.y+Size.y/2);
//		GraphicsAlgorithm arrow = null;
//
//		switch (linkfigure){
//		case RHOMBUS:
//			Size.y = Size.x/3*2;
//			xy = new int[] { 0, 0, -Size.x/2, -Size.y/2, -Size.x, 0, -Size.x/2, Size.y/2 };
//			//xy = new int[] { 0, 0, Size.x, 0, Size.x, Size.y, 0, Size.y };
//			if (angle>0){
//				center = new Point(Location.x+Size.x/2, Location.y+Size.y/2);
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				Size.setLocation(bounds[1].x, bounds[1].y);
//			}
//			arrow = Graphiti.getGaService().createPlainPolygon(cd, xy);
//			break;
//		case TRIANGLE:
//		case ARROW:
//			Size.y = Size.x/3*2;
//			xy = new int[] { -Size.y, Size.y/2, 0, 0, -Size.y, -Size.y/2 };
//			//xy = new int[] { 0, 0, Size.x, 0, Size.x, Size.y, 0, Size.y };
//			if (angle>0){
//				center = new Point(Location.x+Size.x/2, Location.y+Size.y/2);
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				Size.setLocation(bounds[1].x, bounds[1].y);
//			}
//
//			arrow = linkfigure==LinkFigures.TRIANGLE ? 
//					Graphiti.getGaService().createPlainPolygon(cd, xy) : 
//						Graphiti.getGaService().createPlainPolyline(cd, xy);
//					break;
//		case POLYGON:
//		case POLYLINE:
//			//					xy = new int[] { p1.x, p1.y, p2.x, p2.y, p3.x, p3.y };
//			//					beforeAfter = new int[] { 0, 0, 0, 0, 0, 0 };
//			//					shape.Figure = Graphiti.getGaService().createPolygon(object, xy, beforeAfter);
//			//					p1 = new Point(shape.Size.x/2, 0);
//			//					p2 = new Point(0, shape.Size.y);
//			//					p3 = new Point(shape.Size.x, shape.Size.y);
//			//xy = new int[] { 0, 0, 80, 0, 100, 50, 20, 50 };
//			//shape.Figure = Graphiti.getGaService().createPolygon(object, xy);
//			//shape.Figure = shape.Figure;
//			if (angle>0){
//				RotateFigure(xy, center, angle);
//				Point[] bounds = CalculateBounds(xy);
//				TranslateFigure(xy, new Point(-bounds[0].x, -bounds[0].y));
//				//						TranslateFigure(xy, new Point(shape.Location.x-bounds[0].x, 
//				//								shape.Location.y-bounds[0].y));
//				//shape.Location.setLocation(bounds[0].x, bounds[0].y);
//				//Graphiti.getGaService().calculateSize(ga, considerLineWidth).
//				Size.setLocation(bounds[1].x, bounds[1].y);
//			}
//			arrow = linkfigure==LinkFigures.POLYGON ? 
//					Graphiti.getGaService().createPlainPolygon(cd, xy) : 
//						Graphiti.getGaService().createPlainPolyline(cd, xy);
//					break;
//		default:
//			break;
//		}
//
//		setStyleFeatures(diagram, null, arrow, figure.getFeatures());
//	}
//
//	public static int getLabelWidth(GraphicsAlgorithm figure){			
//		if ( ! (figure instanceof AbstractText) )
//			return 0;
//		AbstractText text = (AbstractText)figure;
//		String value = updateLabelValue(text);
//		String canresize = Graphiti.getPeService().getPropertyValue(figure, CAN_RESIZE.toString());
//		if ( value!=null && canresize==null ){
//			IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize("#"+value, text.getFont());
//			return dim.getWidth();
//		}
//		return 0;
//	}
//
//	public static void processDynamicFigure(Diagram diagram, ConnectionDecorator cd, DynamicFigure figure){
//
//		Point Location = new Point(
//				getFeatureInteger(figure.getFeatures(), IntegerFeature.LEFT), 
//				getFeatureInteger(figure.getFeatures(), IntegerFeature.TOP));			
//
//		MultiText text = Graphiti.getGaService().createMultiText(cd);
//		Point size = setTextFigure(diagram, text, figure.getFeatures());
//		if (Location.x==0 && Location.y==0)
//			Location.setLocation(size.y, -minValue);
//		Graphiti.getGaService().setLocationAndSize(text, Location.x, Location.y, size.x, size.y);
//
//
//	}
//	
//	
//	
//	//resizes
//	//////////////////////////////////////////////////////////////////////////////////////
//
//	public static void resizeFigure(Diagram diagram, ContainerShape container, Point size){
//		resizeFigure(diagram, container, size, true);
//	}
//
//	public static void resizeFigure(Diagram diagram, ContainerShape container, Point size, boolean up){
//
//		GraphicsAlgorithm parent = container.getGraphicsAlgorithm();
//		//ContainerShape containerShape = (ContainerShape) parent.getPictogramElement();			
//
//		int anchor_left = Integer.parseInt(
//				Graphiti.getPeService().getPropertyValue(parent, 
//						ANCHOR_LEFT.toString()) );
//		int anchor_up = Integer.parseInt(
//				Graphiti.getPeService().getPropertyValue(parent, 
//						ANCHOR_UP.toString()) );
//		int anchor_right = Integer.parseInt(
//				Graphiti.getPeService().getPropertyValue(parent, 
//						ANCHOR_RIGHT.toString()) );
//		int anchor_down = Integer.parseInt(
//				Graphiti.getPeService().getPropertyValue(parent, 
//						ANCHOR_DOWN.toString()) );
//		int anchor_width = anchor_left+anchor_right;
//		int anchor_height = anchor_up+anchor_down;
//
//		Point location = new Point(anchor_left, anchor_up);
//
//		if (size==null)
//			size = new Point(parent.getWidth()-anchor_width, 
//					parent.getHeight()-anchor_height);
//		else
//			size = new Point(size.x-anchor_width, 
//					size.y-anchor_height);
//
//		if (size.x<minValue)
//			size.x = minValue;
//		if (size.y<minValue)
//			size.y = minValue;
//
//
//		resizeShapes(diagram, container, size);
//
//
//		int remainig = 0;
//		int vertical = 0;
//		//calcular tamanho final com filhos
//		for (Shape shape : container.getChildren()){
//			GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
//			if (figure != null && !(figure instanceof ImageImpl)){
//				String name = Graphiti.getPeService().getPropertyValue(figure, 
//						CONTAINER.toString());
//				if (name.length()>0){
//					String width = Graphiti.getPeService().getPropertyValue(figure, 
//							FORMAT.toString());
//
//					Point position = new Point(0, 0);
//					FeaturesProvider.resizeContainer(diagram, figure, position);
//
//					if (!"%".equals(width)){
//						int height = Integer.parseInt(
//								Graphiti.getPeService().getPropertyValue(figure, 
//										VERTICAL.toString()) );
//						if (height>position.y)
//							position.y = height;							
//						remainig += position.y;
//					}
//
//					if (position.x>size.x)
//						size.x = position.x;
//					vertical += position.y;
//
//				}
//			}
//		}
//
//		if (vertical>size.y)
//			size.y = vertical;
//		//				remainig = 0;
//		//			}else
//		remainig = size.y - remainig;
//		int left = size.y - vertical; //ver se tamanho final ultrupassa actual			
//
//		System.out.println("--> premainig "+remainig);
//		vertical = 0;
//		for (Shape shape : container.getChildren()){
//			GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
//			if (figure != null && !(figure instanceof ImageImpl)){
//				String name = Graphiti.getPeService().getPropertyValue(figure, 
//						CONTAINER.toString());
//				if (name.length()>0){
//					String width = Graphiti.getPeService().getPropertyValue(figure, 
//							FORMAT.toString());
//					int height = figure.getHeight();
//					if ("%".equals(width)){
//						int vheight = Integer.parseInt(
//								Graphiti.getPeService().getPropertyValue(figure, 
//										VERTICAL.toString()) );
//						vheight = (int)((double)vheight / 100.0 * (double)remainig);
//						if (vheight>height){
//							left += height;
//							if (vheight>left)
//								height = left;
//							else
//								height = vheight;
//							left -= height;
//						}
//
//					}else{
//						int vheight = Integer.parseInt(
//								Graphiti.getPeService().getPropertyValue(figure, 
//										VERTICAL.toString()) );
//						if (vheight>height)
//							height = vheight;
//					}
//
//					figure.setX(location.x);
//					figure.setY(location.y+vertical);
//					Point position = new Point(size.x, height);
//					FeaturesProvider.resizeContainer(diagram, figure, position);
//
//					vertical += position.y;
//					if (vertical>size.y)
//						size.y = vertical;
//					if (position.x>size.x)
//						size.x = position.x;
//
//				}
//			}
//		}
//
//		//			if (vertical>size.y)
//		//				size.y = vertical;
//		//			
//		//			
//		//			remainig = size.y;
//		//			//calcular tamanho final com filhos
//		//			for (Shape shape : container.getChildren()){
//		//				GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
//		//				if (figure != null && !(figure instanceof ImageImpl)){
//		//					String name = Graphiti.getPeService().getPropertyValue(figure, 
//		//							FeaturesProvider.Properties.CONTAINER.toString());
//		//					if (name.length()>0){
//		//						String width = Graphiti.getPeService().getPropertyValue(figure, 
//		//								FeaturesProvider.Properties.FORMAT.toString());
//		//						if (!"%".equals(width)){
//		//							remainig -= Integer.parseInt(
//		//								Graphiti.getPeService().getPropertyValue(figure, 
//		//								FeaturesProvider.Properties.VERTICAL.toString()) );
//		//						}
//		//
//		//					}
//		//				}
//		//			}
//		//			System.out.println("--> premainig "+remainig);
//		//			vertical = 0; //ver se tamanho final ultrupassa actual
//		//			for (Shape shape : container.getChildren()){
//		//				GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();				
//		//				if (figure != null && !(figure instanceof ImageImpl)){
//		//					String name = Graphiti.getPeService().getPropertyValue(figure, 
//		//							FeaturesProvider.Properties.CONTAINER.toString());
//		//					if (name.length()>0){
//		//						String width = Graphiti.getPeService().getPropertyValue(figure, 
//		//								FeaturesProvider.Properties.FORMAT.toString());
//		//						int height = Integer.parseInt(
//		//								Graphiti.getPeService().getPropertyValue(figure, 
//		//								FeaturesProvider.Properties.VERTICAL.toString()) );
//		//						if ("%".equals(width))
//		//							height = (int)((double)height / 100.0 * (double)remainig);						
//		//						
//		//						figure.setY(vertical);
//		//						Point position = new Point(size.x, height);
//		//						FeaturesProvider.resizeContainer(diagram, figure, position);
//		//						vertical += position.y;
//		//
//		//					}
//		//				}
//		//			}
//
//		//////////////////////////////////////////////////////////////////////////////////////
//		resizeShapes(diagram, container, location, size);
//
//		for ( Anchor anchors : container.getAnchors() ){
//			GraphicsAlgorithm inner = anchors.getGraphicsAlgorithm();
//			if (anchors instanceof FixPointAnchor){
//				FixPointAnchor anchor = (FixPointAnchor)anchors;
//				String format = Graphiti.getPeService().getPropertyValue(inner, 
//						ANCHOR_HORIZ.toString());
//				int value = Integer.parseInt(
//						Graphiti.getPeService().getPropertyValue(inner, 
//								FORMAT.toString()) );
//				if (format.equals("lf"))
//					anchor.getLocation().setX(anchor_left-value);
//				else if (format.equals("rg"))
//					anchor.getLocation().setX(anchor_left+size.x+value-inner.getWidth());
//				else if (format.equals("%")){
//					int pos = (int)(size.x*value/100.0-inner.getWidth()/2.0);
//					if (pos<0)
//						pos = 0;
//					if (pos+inner.getWidth()>size.x)
//						pos = size.x-inner.getWidth();
//					anchor.getLocation().setX(anchor_left+pos);
//				}
//
//
//				format = Graphiti.getPeService().getPropertyValue(inner, 
//						ANCHOR_VERT.toString());
//				String strfrm = Graphiti.getPeService().getPropertyValue(inner, 
//						VERTICAL.toString());
//				value = Integer.parseInt(
//						Graphiti.getPeService().getPropertyValue(inner, 
//								VERTICAL.toString()) );
//
//				if (format.equals("up"))
//					anchor.getLocation().setY(anchor_up-value);
//				else if (format.equals("dw"))
//					anchor.getLocation().setY(anchor_up+size.y+value-inner.getHeight());
//				else if (format.equals("%")){
//					int pos = (int)(size.y*value/100.0-inner.getHeight()/2.0);
//					if (pos<0)
//						pos = 0;
//					if (pos+inner.getHeight()>size.y)
//						pos = size.y-inner.getHeight();
//					anchor.getLocation().setY(anchor_up+pos);
//				}
//
//			}
//
//			EList<GraphicsAlgorithm> algoritms = inner.getGraphicsAlgorithmChildren();
//			for (int i=0; i<algoritms.size(); i++){
//				GraphicsAlgorithm child = algoritms.get(i);								
//				updateFigureFeatures(diagram, child);
//			}
//
//
//		}
//		parent.setWidth(size.x+anchor_width);
//		parent.setHeight(size.y+anchor_height);
//
//		System.out.println("--> container: "+ parent.getPictogramElement().getGraphicsAlgorithm());
//		String name = Graphiti.getPeService().getPropertyValue(parent, 
//				CONTAINER.toString());
//		String root = Graphiti.getPeService().getPropertyValue(parent, 
//				PARENT.toString());
//		if (!(root==null) && root.length()>0){
//			for (PictogramLink link : diagram.getPictogramLinks()){
//				GraphicsAlgorithm child = link.getPictogramElement().getGraphicsAlgorithm();
//				if (root.equals(getHashCode(child)))
//					resizeFigure(diagram, (ContainerShape)link.getPictogramElement(), null);
//			}
//		}
//
//
//		//			//fig = new AlgorithmProvider(fig);
//		//			//parent.resizeShapes();
//		//			System.out.println("--> width: "+ context.getTargetContainer().getChildren().get(0).getGraphicsAlgorithm());
//		//			System.out.println("--> width: "+ Graphiti.getGraphiti.getPeService()().getPropertyValue(context.getTargetContainer().getChildren().get(4).getGraphicsAlgorithm(),"o"));
//		//			System.out.println("--> width: "+ context.getTargetContainer().getLink().getBusinessObjects().get(0).eClass().getName());
//		//			//context.getTargetContainer().getChildren().get(6).getGraphicsAlgorithm());
//		Graphiti.getGaService().calculateSize(parent);
//
//	}
//
//	public static void resizeContainer(Diagram diagram, GraphicsAlgorithm parent, Point size){
//		resizeContainer(diagram, parent, new Point(0,0), size);
//	}	
//
//	public static void resizeContainer(Diagram diagram, GraphicsAlgorithm parent, Point location, Point size){
//
//		//ContainerShape containerShape = (ContainerShape) parent.getParentGraphicsAlgorithm();
//		//			GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
//		//			containerShape.getLink()
//		System.out.println("--> container: "+ parent.getPictogramElement().getGraphicsAlgorithm());
//		String name = Graphiti.getPeService().getPropertyValue(parent, 
//				CONTAINER.toString());
//		String children = Graphiti.getPeService().getPropertyValue(parent, 
//				CHILDREN.toString());
//		String canmove = Graphiti.getPeService().getPropertyValue(parent, 
//				TYPE.toString());
//		if (canmove!=null && canmove.equals("stack"))
//			canmove = "0";
//		else
//			canmove = "1";
//		//			parent.setX(location.x);
//		//			parent.setY(location.y);
//		int dx = 0;
//		int dy = 9999;
//		int inicial = size.y;
//		if (!(children==null) && children.length()>0){
//			int vertical = parent.getY();
//			for (PictogramLink link : diagram.getPictogramLinks()){
//				for (EObject eobject : link.getBusinessObjects()){
//					boolean isInstance = eobject.eClass().getName().equals(name);
//					for (EClass eclass : eobject.eClass().getEAllSuperTypes())
//						if (eclass.getName().equals(name))
//							isInstance = true;
//					if (isInstance){
//						GraphicsAlgorithm child = link.getPictogramElement().getGraphicsAlgorithm();
//						if (children.contains(getHashCode(child))){
//							if (canmove.equals("0")){
//								child.setX(parent.getX());
//								child.setY(vertical);
//								Graphiti.getPeService().setPropertyValue(child, 
//										CAN_MOVE.toString(), canmove);
//							}else{
//								//									if (child.getX()<parent.getX() && parent.getX()-child.getX()>dx)
//								//										dx = parent.getX()-child.getX();
//								//										//child.setX(parent.getX());
//								//									if (child.getY()<parent.getY() && parent.getY()-child.getY()>dy)
//								//										dy = parent.getY()-child.getY();
//								//										//child.setY(parent.getY());
//								if (child.getX()<parent.getX())
//									child.setX(parent.getX());
//								if (child.getY()<parent.getY())
//									child.setY(parent.getY());
//								if (child.getY()<dy)
//									dy = child.getY();
//							}
//							vertical += child.getHeight();
//							int max_x = child.getX()+child.getWidth()-parent.getX();
//							if (max_x>size.x)
//								size.x = max_x;								
//							int max_y = child.getY()+child.getHeight()-parent.getY();
//							if (max_y>size.y)
//								size.y = max_y;
//						}						
//					}	
//				}
//			}
//			dy -= parent.getY();
//			//				if (canmove.equals("1") && dy>0){
//			//					size.y -= dy;
//			//					for (PictogramLink link : diagram.getPictogramLinks()){
//			//						for (EObject eobject : link.getBusinessObjects()){
//			//							if (eobject.eClass().getName().equals(name)){
//			//								GraphicsAlgorithm child = link.getPictogramElement().getGraphicsAlgorithm();
//			//								String hashcode = Graphiti.getPeService().getPropertyValue(child, 
//			//										FeaturesProvider.Properties.HASHCODE.toString());
//			//								if (children.contains("|"+ hashcode +"|")){
//			//									child.setY(child.getY()-dy);
//			//								}						
//			//							}	
//			//						}
//			//					}		
//			//				}
//
//		}
//
//		//getBusinessObjectForPictogramElement(parent);
//
//		resizeShapes(diagram, parent.getPictogramElement(), location, size);
//
//	}
//
//	public static void resizeShapes(Diagram diagram, PictogramElement pe, Point size){
//		resizeShapes(diagram, pe, new Point(0,0), size);
//	}		
//
//	public static void resizeShapes(Diagram diagram, PictogramElement pe, Point location, Point size){
//
//		GraphicsAlgorithm parent = pe.getGraphicsAlgorithm();
//		parent.setHeight(size.y);
//		parent.setWidth(size.x);
//
//		int dx = Integer.parseInt(
//				Graphiti.getPeService().getPropertyValue(parent, 
//						WIDTH.toString()) );
//		int dy = Integer.parseInt(
//				Graphiti.getPeService().getPropertyValue(parent, 
//						HEIGHT.toString()) );			
//		double fx = parent.getWidth() / (double)dx;
//		double fy = parent.getHeight() / (double)dy;
//
//
//		boolean root = pe instanceof ContainerShape;			
//		EList<Shape> shapes = root ? ((ContainerShape)pe).getChildren() : null;
//		EList<GraphicsAlgorithm> algoritms = root ? null : parent.getGraphicsAlgorithmChildren();
//		int total = root ? shapes.size() : algoritms.size();
//
//
//		for (int i=0; i<total; i++){
//			GraphicsAlgorithm figure = root ? shapes.get(i).getGraphicsAlgorithm() : algoritms.get(i);								
//			int dim = getLabelWidth(figure);
//			if (dim>size.x)
//				size.x = dim;
//		}
//
//		for (int i=0; i<total; i++){
//			GraphicsAlgorithm figure = root ? shapes.get(i).getGraphicsAlgorithm() : algoritms.get(i);
//			if (figure != null && !(figure instanceof ImageImpl)){
//
//				updateFigureFeatures(diagram, figure);
//
//				String name = Graphiti.getPeService().getPropertyValue(figure, 
//						CONTAINER.toString());
//				String anchor = null;
//				//Graphiti.getPeService().getPropertyValue(figure, 
//						//FeaturesProvider.Properties.ANCHOR.toString());
//				if (anchor==null && (!root || name.length()==0)){
//					int x = Integer.parseInt(
//							Graphiti.getPeService().getPropertyValue(figure, 
//									X.toString()) );
//					int y = Integer.parseInt(
//							Graphiti.getPeService().getPropertyValue(figure, 
//									Y.toString()) );
//					int width = Integer.parseInt(
//							Graphiti.getPeService().getPropertyValue(figure, 
//									WIDTH.toString()) );
//					int height = Integer.parseInt(
//							Graphiti.getPeService().getPropertyValue(figure, 
//									HEIGHT.toString()) );
//					if ( figure instanceof Polyline ){
//						double zx = 1 / Double.parseDouble(
//								Graphiti.getPeService().getPropertyValue(figure, 
//										ZOOM_X.toString()) );
//						double zy = 1 / Double.parseDouble(
//								Graphiti.getPeService().getPropertyValue(figure, 
//										ZOOM_Y.toString()) );
//						String[] str_points = Graphiti.getPeService().getPropertyValue(figure, 
//								POINTS.toString()).split("\\|");
//						EList<org.eclipse.graphiti.mm.algorithms.styles.Point> points = ((Polyline) figure).getPoints();
//								for (int p=0; p<points.size(); p++){
//									//point.setX((int)(point.getX()*zx*fx));
//									//point.setY((int)(point.getY()*zy*fy));
//									String[] coord = str_points[p].split(",");
//									points.get(p).setX((int)(Integer.parseInt(coord[0])*fx));
//									points.get(p).setY((int)(Integer.parseInt(coord[1])*fy));
//									//point.setBefore((int)(point.getBefore()*fx));
//									//point.setAfter((int)(point.getAfter()*fy));							
//								}
//								Graphiti.getPeService().setPropertyValue(figure, 
//										ZOOM_X.toString(), Double.toString(fx));
//								Graphiti.getPeService().setPropertyValue(figure, 
//										ZOOM_Y.toString(), Double.toString(fy));
//					}
//					String value = Graphiti.getPeService().getPropertyValue(figure, TEXT.toString());
//					String canresize = Graphiti.getPeService().getPropertyValue(figure, CAN_RESIZE.toString());
//
//
//
//					if ( figure instanceof MultiText && value!=null && canresize==null )
//						Graphiti.getGaService().setLocationAndSize(figure, 
//								location.x+0, location.y+(int)(y*fy), 
//								size.x, (int)(height*fy));
//					else
//						Graphiti.getGaService().setLocationAndSize(figure, 
//								location.x+(int)(x*fx), location.y+(int)(y*fy), 
//								(int)(width*fx), (int)(height*fy));
//				}
//			}
//		}		
//
//		Graphiti.getGaService().calculateSize(parent);
//
//	}
//
//
//	public static void updateLink(Diagram diagram, Connection connection){
//
//		for ( ConnectionDecorator decorator : connection.getConnectionDecorators() ){
//			GraphicsAlgorithm ga = decorator.getGraphicsAlgorithm();
//			if ( ga instanceof AbstractText )
//				ga.setWidth(FeaturesProvider.getLabelWidth(ga));
//		}
//
//	}
//
//
//	public static Point[] CalculateBounds(int[] xy){
//		Point minPoli = new Point(999, 999);
//		Point maxPoli = new Point(-999, -999);
//		Point[] bounds = new Point[2];
//		for (int i=0; i<xy.length; i+=2){
//			minPoli.x = xy[i]<minPoli.x ? xy[i] : minPoli.x;
//			minPoli.y = xy[i+1]<minPoli.y ? xy[i+1] : minPoli.y;
//			maxPoli.x = xy[i]>maxPoli.x ? xy[i] : maxPoli.x;
//			maxPoli.y = xy[i+1]>maxPoli.y ? xy[i+1] : maxPoli.y;
//		}
//		maxPoli.setLocation(maxPoli.x-minPoli.x, maxPoli.y-minPoli.y);
//		bounds[0] = minPoli;
//		bounds[1] = maxPoli;
//		return bounds;
//	}
//
//	public static void TranslateFigure(int[] xy, Point point){
//		for (int i=0; i<xy.length; i+=2){
//			xy[i] += point.x;
//			xy[i+1] += point.y;
//		}
//	}
//
//	public static void RotateFigure(int[] xy, Point center, int angle){
//		double radian = Math.PI / 180.0 * (double)angle;
//		for (int i=0; i<xy.length; i+=2){
//			Point point = new Point(xy[i], xy[i+1]);
//			RotatePoint(point, center, radian);
//			xy[i] = point.x;
//			xy[i+1] = point.y;
//		}
//	}		
//
//	public static void RotatePoint(Point point, Point center, double angle){
//		double x = point.getX();
//		double y = point.getY();
//		double x0 = x - center.getX();
//		double y0 = y - center.getY();
//		x = x0 * Math.cos(angle) - y0 * Math.sin(angle);
//		y = x0 * Math.sin(angle) + y0 * Math.cos(angle);
//		x += center.getX();
//		y += center.getY();	        
//		point.setLocation(x, y);
//	}
//
//
//
//
//}