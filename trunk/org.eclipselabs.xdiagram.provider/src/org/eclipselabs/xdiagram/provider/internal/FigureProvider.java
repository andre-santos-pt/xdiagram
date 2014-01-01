package org.eclipselabs.xdiagram.provider.internal;

import static org.eclipselabs.xdiagram.provider.internal.FigureProperty.TEXT_ATTR;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.graphiti.util.PredefinedColoredAreas;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Attribute;
import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.RGB;
import org.eclipselabs.xdiagram.xtext.xdiagram.impl.ColorFeatureImpl;
import org.eclipselabs.xdiagram.xtext.xdiagram.impl.RGBImpl;

public class FigureProvider {
	
	public final static String strAttribute ="><";	
	public final static String typeSeperator = "_";
	public final static String expressionSeperator = "|";
	public final static String equalsSeperator = "=";
	public final static String diferentSeperator = "<>";
	public final static String rgbSeperator = ",";
	
	public static final int minValue = 50;

	public static EList<org.eclipselabs.xdiagram.xtext.xdiagram.Style> styles;
	public static final HashMap<String, Dimension> imageSizes = new HashMap<String, Dimension>();
	
	public static void setStyles(EList<org.eclipselabs.xdiagram.xtext.xdiagram.Style> styles){
		FigureProvider.styles = styles;
	}
	
	public static void setStyle(String name, List<Feature> features){
		
		org.eclipselabs.xdiagram.xtext.xdiagram.Style style = null;
		for (org.eclipselabs.xdiagram.xtext.xdiagram.Style obj : styles)
			if (obj.getName().equals(name))
				style = obj;
		if (style==null || style.getFeatures()==null)
			return;
		
		for ( IntegerProperty feature :  IntegerProperty.values() )
			feature.addNewValue(features.getIntegerfeatures(), feature.getValue(style.getFeatures()), false);
		
		for ( ColorProperty feature :  ColorProperty.values() )
			feature.addNewValue(features.getColorfeatures(), feature.getValue(style.getFeatures()), false);
		
		for ( BooleanProperty feature :  BooleanProperty.values() )
			feature.addNewValue(features.getBooleanfeatures(), feature.getValue(style.getFeatures()), false);
		
		for ( StringProperty feature :  StringProperty.values() )
			feature.addNewValue(features.getStringfeatures(), feature.getValue(style.getFeatures()), false);
		
		if (style.getFeatures().getLinefeatures().size()>0)
			addLineStyle(features.getLinefeatures(), style.getFeatures().getLinefeatures().get(0).getValue(), false);
	
		// TODO: Eduardo
//		if (style.getFeatures().getGradientfeatures().size()>0)
//			addGradientStyle(features.getGradientfeatures(), style.getFeatures().getGradientfeatures().get(0).getValue(), false);		
		
	}
	
	
	public static enum Colors implements IColorConstant {
		WHITE(IColorConstant.WHITE), 
		BLACK(IColorConstant.BLACK), 
		GRAY(IColorConstant.GRAY), 
		BLUE(IColorConstant.BLUE), 
		GREEN(IColorConstant.GREEN), 
		RED(IColorConstant.RED), 
		YELLOW(IColorConstant.YELLOW), 
		CYAN(IColorConstant.CYAN),
		ORANGE(IColorConstant.ORANGE);

		private final int r, g, b;

		private Colors(IColorConstant color) {
			this.r = color.getRed();
			this.g = color.getGreen();
			this.b = color.getBlue();
		}

		@Override
		public int getRed() {
			return r;
		}

		@Override
		public int getGreen() {
			return g;
		}

		@Override
		public int getBlue() {
			return b;
		}		
		
	}
	
	
	
	
	
	public static enum ColorProperty {
		BACKGROUND, FOREGROUND;

		public IColorConstant getDefault(){
			switch (this){
				case BACKGROUND:
					return IColorConstant.LIGHT_GRAY;
				case FOREGROUND:
					return Colors.BLACK;
				default:
					return null;
			}			
		}
		
		public void addNewValue(EList<ColorFeature> features, IColorConstant value, boolean overwrite){
			boolean featureSet = false;
			RGBImpl rgb = null;
			for (Constructor<?> constructor : RGBImpl.class.getDeclaredConstructors()){
				if (constructor.getParameterTypes().length==0){
					constructor.setAccessible(true);
					try {
						rgb = (RGBImpl) constructor.newInstance(new Object[0]);
						rgb.setR(value.getRed());
						rgb.setG(value.getGreen());
						rgb.setB(value.getBlue());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}			
			for (ColorFeature key : features){
				if (isSameFeature (key.getKey(), name())){
					if (overwrite && rgb!=null){
						key.setValue(null);						
						key.setRgb(rgb);
					}
					featureSet = true;
				}
			}
			if (!featureSet){
				ColorFeatureImpl feature;
				try {
					for (Constructor<?> constructor : ColorFeatureImpl.class.getDeclaredConstructors()){
						if (constructor.getParameterTypes().length==0){
							constructor.setAccessible(true);
							feature = (ColorFeatureImpl) constructor.newInstance(new Object[0]);
							feature.setKey(name());
							feature.setValue(null);
							feature.setRgb(rgb);
							features.add(feature);
							return;
						}
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		}
		
		public IColorConstant getValue(FigureFeatures features){
			if (features==null)
				return getDefault();
			return getValue(null, null, features.getColorfeatures());
		}
		
		public IColorConstant getValue(GraphicsAlgorithm figure, EObject eObject, FigureFeatures features){
			if (features==null)
				return getDefault();
			return getValue(figure, eObject, features.getColorfeatures());
		}
		
		public IColorConstant getValue(GraphicsAlgorithm figure, EObject eObject, EList<ColorFeature> features){		
			IColorConstant color = getDefault();
			if (features==null)
				return color;
			for (ColorFeature key : features)
				if (isSameFeature (key.getKey(), name())){
					color = getDefault();
					try{
						color = key.getValue() != null ? 
								Colors.valueOf(key.getValue().toUpperCase()) : 
									getRGBColor(key.getRgb());
								String result = key.getValue() != null ? key.getValue() : 
									key.getRgb().getR() + rgbSeperator + 
									key.getRgb().getG() + rgbSeperator + key.getRgb().getB();							
								setExpressionResult(figure, eObject, key.getExpression(), 
										this.getClass().getSimpleName(), name(), result);
					}catch(Exception ex){
					}
				}
			return color;
		}
		
		public static void update(Diagram diagram, GraphicsAlgorithm figure, ArrayList<Property> properties, 
				EStructuralFeature eStructuralFeature, String value){
			for ( ColorProperty feature :  values() ){
				String result = getExpressionResult(figure, properties,
						feature.getClass().getSimpleName(), feature.name(), eStructuralFeature.getName(), value);								
				if (result!=null){
					Color color = null;
					if (result.contains(rgbSeperator)){
						String[] rgbs = result.split(rgbSeperator);
						color = Graphiti.getGaService().manageColor(diagram, 
								new ColorConstant(Integer.parseInt(rgbs[0]),
										Integer.parseInt(rgbs[1]), 
										Integer.parseInt(rgbs[2])) );
					}else
						color = Graphiti.getGaService().manageColor(diagram, 
								Colors.valueOf(result.toUpperCase()));
					switch (feature){
					case BACKGROUND:
						figure.setBackground(color);
						break;
					case FOREGROUND:
						figure.setForeground(color);
						break;
//					case GRADIENT:
//						Style style = getFeatureGradient(diagram, result);
//						if (style!=null) figure.setStyle(style);
//						break;
					}
				}								
			}
		}
		
	}


	
	
	
	
	public static enum IntegerProperty {
		WIDTH, HEIGHT, TOP, LEFT, ANGLE, CORNER, TRANSPARENCY, LINE_WIDTH, FONT_SIZE;
		
		public int getDefault(){
			switch (this){
				case ANGLE:
				case CORNER:
				case LEFT:				
				case TOP:
				case TRANSPARENCY:
					return 0;
				case WIDTH:
				case HEIGHT:
					return minValue;
				case FONT_SIZE:
					return 10;
				default:
					return 1;
			}
		}
		
		public boolean isSameFeature (Feature f){
			return f.getClass().getSimpleName().equalsIgnoreCase(name());
		}
		
		public void addNewValue(List<Feature> features, int value, boolean overwrite){
			boolean featureSet = false;
			for (Feature f : features){
				if (isSameFeature (f)){
					if (overwrite)
						f.setValue(value);
					featureSet = true;
				}
			}
			if (!featureSet){
				Feature feature; // REPLACE with ecore reflect
				try {
					for (Constructor<?> constructor : IntegerFeatureImpl.class.getDeclaredConstructors()){
						if (constructor.getParameterTypes().length==0){
							constructor.setAccessible(true);
							feature = (IntegerFeatureImpl) constructor.newInstance(new Object[0]);
							feature.setKey(name());
							feature.setValue(value);
							features.add(feature);
							return;
						}
					}				
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		}

		public int getValue(List<Feature> features){
			if (features==null)
				return getDefault();
			return getValue(null, null, features.getIntegerfeatures());
		}
		
		public int getValue(GraphicsAlgorithm figure, EObject eObject, List<Feature> features){
			if (features==null)
				return getDefault();
			return getValue(figure, eObject, features.getIntegerfeatures());
		}
		
		public int getValue(GraphicsAlgorithm figure, EObject eObject, List<Feature> features){
			int value = getDefault();
			if (features==null)
				return value;
			for (Feature key : features)
				if (isSameFeature (key)){
					value = getDefault();
					try{
						value = key.getValue();
						setExpressionResult(figure, eObject, key.getExpression(), 
								this.getClass().getSimpleName(), name(), value);
					}catch(Exception ex){
					}
				}
			return value;
		}

		public static void update(Diagram diagram, GraphicsAlgorithm figure, List<Property> properties, 
				EStructuralFeature eStructuralFeature, String value){
			for ( IntegerProperty feature :  values() ){
				String result = getExpressionResult(figure, properties,
						feature.getClass().getSimpleName(), feature.name(), eStructuralFeature.getName(), value);								
				if (result!=null){
					int num = Integer.parseInt(result);
					switch (feature){
						case TRANSPARENCY:
							figure.setTransparency((double)num/100.0);
							break;
						case CORNER:
							if (figure instanceof RoundedRectangle){
								RoundedRectangle rect = (RoundedRectangle)figure;
								rect.setCornerHeight(num);
								rect.setCornerWidth(num);
							}
							break;
						case FONT_SIZE:
							if (figure instanceof AbstractText){
								try{
									AbstractText text =(AbstractText)figure;
									org.eclipse.graphiti.mm.algorithms.styles.Font font = text.getFont();
									font = Graphiti.getGaService().manageFont(diagram, 
											font.getName(), num, font.isItalic(), font.isBold() );
									text.setFont(font);
								}catch(Exception ex){
								}
							}
							break;
						case LINE_WIDTH:
							figure.setLineWidth(num);
							break;
						default:
							break;
					}
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	public static enum BooleanProperty {
		RESIZABLE, FONT_ITALIC, FONT_BOLD, TEXT_EDITABLE;
		
		public boolean getDefault(){
			switch (this){
			case RESIZABLE:
				return true;
			default:
				return false;
			}
		}
		
		public void addNewValue(EList<BooleanFeature> features, boolean value, boolean overwrite){
			boolean featureSet = false;
			for (BooleanFeature key : features){
				if (isSameFeature (key.getKey(), name())){
					if (overwrite)
						key.setValue(value ? "true" : "false");
					featureSet = true;
				}
			}
			if (!featureSet){
				BooleanFeatureImpl feature;
				try {
					for (Constructor<?> constructor : BooleanFeatureImpl.class.getDeclaredConstructors()){
						if (constructor.getParameterTypes().length==0){
							constructor.setAccessible(true);
							feature = (BooleanFeatureImpl) constructor.newInstance(new Object[0]);
							feature.setKey(name());
							feature.setValue(value ? "true" : "false");
							features.add(feature);
							return;
						}
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		}
		
		public boolean getValue(FigureFeatures features){
			if (features==null)
				return getDefault();
			return getValue(null, null, features.getBooleanfeatures());
		}
		public boolean getValue(GraphicsAlgorithm figure, EObject eObject, FigureFeatures features){
			if (features==null)
				return getDefault();
			return getValue(figure, eObject, features.getBooleanfeatures());
		}
		public boolean getValue(GraphicsAlgorithm figure, EObject eObject, EList<BooleanFeature> features){
			boolean value = getDefault();
			if (features==null)
				return value;
			for (BooleanFeature key : features) 
				if (isSameFeature (key.getKey(), name())){
					value = getDefault();
					try{
						value = key.getValue()!=null && key.getValue().equalsIgnoreCase("true");
						setExpressionResult(figure, eObject, key.getExpression(), 
								getClass().getSimpleName(), name(), value);
					}catch(Exception ex){
					}
				}
			return value;
		}
		
		public static void update(Diagram diagram, GraphicsAlgorithm figure, ArrayList<Property> properties, 
				EStructuralFeature eStructuralFeature, String value){
			for ( BooleanProperty feature :  values() ){
				String result = getExpressionResult(figure, properties,
						feature.getClass().getSimpleName(), feature.name(), eStructuralFeature.getName(), value);								
				if (result!=null && figure instanceof AbstractText){
					AbstractText text =(AbstractText)figure;
					org.eclipse.graphiti.mm.algorithms.styles.Font font = text.getFont();
					boolean bool = "true".equals(result);
					switch (feature){
						case FONT_ITALIC:							
							font = Graphiti.getGaService().manageFont(diagram, 
									font.getName(), font.getSize(), bool, font.isBold() );
							break;
						case FONT_BOLD:
							font = Graphiti.getGaService().manageFont(diagram, 
									font.getName(), font.getSize(), font.isItalic(), bool );
							break;
						default:
							break;
					}
					text.setFont(font);
				}
			}
		}
		
	}
	

	public static enum StringProperty {
		TEXT_VALUE, FONT_NAME, ICON;
		
		public String getDefault(){
			switch (this){
			case FONT_NAME:
				return "Arial";
			default:
				return "";
			}
		}
		
		public void addNewValue(EList<StringFeature> features, String value, boolean overwrite){
			boolean featureSet = false;
			for (StringFeature key : features){
				if (isSameFeature (key.getKey(), name())){
					if (overwrite)
						key.setValue(value);
					featureSet = true;
				}
			}
			if (!featureSet){
				StringFeatureImpl feature;
				try {
					for (Constructor<?> constructor : StringFeatureImpl.class.getDeclaredConstructors()){
						if (constructor.getParameterTypes().length==0){
							constructor.setAccessible(true);
							feature = (StringFeatureImpl) constructor.newInstance(new Object[0]);
							feature.setKey(name());
							feature.setValue(value);
							features.add(feature);
							return;
						}
					}					
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
		}
		
		public String getValue(FigureFeatures features){
			if (features==null)
				return getDefault();
			return getValue(features.getStringfeatures());
		}		
		public String getValue(EList<StringFeature> features){
			if (features==null)
				return getDefault();
			return getValue(null, null, features);
		}
		public String getValue(GraphicsAlgorithm figure, EObject eObject, FigureFeatures features){
			if (features==null)
				return getDefault();
			return getValue(figure, eObject, features.getStringfeatures());
		}
		public String getValue(GraphicsAlgorithm figure, EObject eObject, EList<StringFeature> features){
			String value = getDefault();
			if (features==null)
				return value;
			for (StringFeature key : features)
				if (isSameFeature (key.getKey(), this.name())){
					value = getDefault();
					try{
						if (key.getValue()!=null && key.getValue().length()>0)
							value = key.getValue();
						else{
							if (key.getValueL()!=null)
								value += key.getValueL();
							if (key.getAttribute()!=null){
								value += strAttribute;
								if (figure instanceof AbstractText){
									Graphiti.getPeService().setPropertyValue(figure, 
											TEXT_ATTR.toString(), key.getAttribute() );
									Graphiti.getPeService().setPropertyValue(figure, 
											TEXT_VALUE.toString(), "" );
								}
							}
							if (key.getValueR()!=null)
								value += key.getValueR();
						}
						setExpressionResult(figure, eObject, key.getExpression(), 
								this.getClass().getSimpleName(), name(), value);
					}catch(Exception ex){
					}
				}
			return value;
		}
		
		public static void update(Diagram diagram, GraphicsAlgorithm figure, ArrayList<Property> properties, 
				EStructuralFeature eStructuralFeature, String value){
			for ( StringProperty feature :  values() ){
				String result = getExpressionResult(figure, properties,
						feature.getClass().getSimpleName(), feature.name(), eStructuralFeature.getName(), value);								
				if (result!=null){
					switch (feature){
						case FONT_NAME:	
							if (figure instanceof AbstractText){
								try{
									AbstractText text =(AbstractText)figure;
									org.eclipse.graphiti.mm.algorithms.styles.Font font = text.getFont();
									font = Graphiti.getGaService().manageFont(diagram, 
											result, font.getSize(), font.isItalic(), font.isBold() );
									text.setFont(font);
								}catch(Exception ex){
								}
							}
							break;
						case TEXT_VALUE:
							if (figure instanceof AbstractText)
								FigureProperty.TEXT.set(figure, result);
							break;
						case ICON:					
							if (figure instanceof Image && imageSizes.containsKey(result)){
								Image img = (Image)figure;
								img.setId(result);
//								img.setWidth( imageSizes.get(result).width );
//								img.setHeight( imageSizes.get(result).height );
							}
							break;
					}
					
				}
			}
		}

	}

	
	public static void addLineStyle(EList<LineFeature> features, String value, boolean overwrite){
		boolean featureSet = false;
		for (LineFeature key : features){
				if (overwrite)
					key.setValue(value);
				featureSet = true;
		}
		if (!featureSet){
			LineFeatureImpl feature;
			try {
				for (Constructor<?> constructor : LineFeatureImpl.class.getDeclaredConstructors()){
					if (constructor.getParameterTypes().length==0){
						constructor.setAccessible(true);
						feature = (LineFeatureImpl) constructor.newInstance(new Object[0]);
						feature.setKey("line-style");
						feature.setValue(value);
						features.add(feature);
						return;
					}
				}					
			} catch (Exception e) {
				e.printStackTrace();
			}				
		}
	}	
	
	public static LineStyle getLineSyle(GraphicsAlgorithm figure, EObject eObject, EList<LineFeature> features){

		LineStyle ls = LineStyle.SOLID;
		for(int i=0; i<features.size(); i++){
			String line_value = features.get(i).getValue();
			ls = LineStyle.SOLID;
			if (line_value.equalsIgnoreCase(LineStyle.DASH.name()))
				ls = LineStyle.DASH;
			else if (line_value.equalsIgnoreCase(LineStyle.DOT.name()))
				ls = LineStyle.DOT;
			else if (line_value.equalsIgnoreCase(LineStyle.DASHDOT.name()))
				ls = LineStyle.DASHDOT;			
			setExpressionResult(figure, eObject, features.get(i).getExpression(), 
					"LineProperty", "LineSyle", ls.getName());	
		}
		return ls;
	}
	
	
	public static void updateLineSyle(Diagram diagram, GraphicsAlgorithm figure, ArrayList<Property> properties, 
			EStructuralFeature eStructuralFeature, String value){

		String result = getExpressionResult(figure, properties,
				"LineProperty", "LineSyle", eStructuralFeature.getName(), value);		
		if (result!=null){
			LineStyle ls = LineStyle.SOLID;
			if (result.equalsIgnoreCase(LineStyle.DASH.name()))
				ls = LineStyle.DASH;
			else if (result.equalsIgnoreCase(LineStyle.DOT.name()))
				ls = LineStyle.DOT;
			else if (result.equalsIgnoreCase(LineStyle.DASHDOT.name()))
				ls = LineStyle.DASHDOT;
			figure.setLineStyle(ls);
		}
		
	}
	
	
//	public static void addGradientStyle(EList<GradientFeature> features, String value, boolean overwrite){
//		boolean featureSet = false;
//		for (GradientFeature key : features){
//				if (overwrite)
//					key.setValue(value);
//				featureSet = true;
//		}
//		if (!featureSet){
//			GradientFeature feature;
//			try {
//				for (Constructor<?> constructor : GradientFeatureImpl.class.getDeclaredConstructors()){
//					if (constructor.getParameterTypes().length==0){
//						constructor.setAccessible(true);
//						feature = (GradientFeatureImpl) constructor.newInstance(new Object[0]);
//						feature.setKey("gradient");
//						feature.setValue(value);
//						features.add(feature);
//						return;
//					}
//				}					
//			} catch (Exception e) {
//				e.printStackTrace();
//			}				
//		}
//	}
//	
//	
//	
//	
//	public static Style getGradientStyle(Diagram diagram, List<GradientFeature> features){
//		if (features.size()==0)
//			return null;
//		String name = features.get(0).getValue();
//		return getGradientStyle(diagram, name);
//	}
//
//	public static Style getGradientStyle(Diagram diagram, String name){
//		Style style = Graphiti.getGaService().findStyle(diagram, name);			
//		if (style==null){
//			style = Graphiti.getGaService().createPlainStyle(diagram, name);
//			style.setBackground(Graphiti.getGaService().manageColor(diagram, ColorConstant.WHITE));
//			switch (name){
//				case "BlueWhite":
//					Graphiti.getGaService().setRenderingStyle(style,
//							PredefinedColoredAreas.getBlueWhiteAdaptions());
//					break;
//				case "BlueWhiteGloss":
//					Graphiti.getGaService().setRenderingStyle(style,
//							PredefinedColoredAreas.getBlueWhiteGlossAdaptions());
//					break;
//				case "CopperWhiteGloss":
//					Graphiti.getGaService().setRenderingStyle(style,
//							PredefinedColoredAreas.getCopperWhiteGlossAdaptions());
//					break;
//				case "LightGray":
//					Graphiti.getGaService().setRenderingStyle(style,
//							PredefinedColoredAreas.getLightGrayAdaptions());
//					break;
//				case "LightYellow":
//					Graphiti.getGaService().setRenderingStyle(style,
//							PredefinedColoredAreas.getLightYellowAdaptions());
//					break;
//				case "SilverWhiteGloss":
//					Graphiti.getGaService().setRenderingStyle(style,
//							PredefinedColoredAreas.getSilverWhiteGlossAdaptions());
//					break;
//				case "LimeWhite":
//					Graphiti.getGaService().setRenderingStyle(style,
//							CustomRenderingStyle.getLimeWhiteAdaptions());
//					break;
//				default:
//					break;
//			}
//		}
//		return style;
//	}
	




	public static void setStyleFeatures(Diagram diagram, EObject eObject, GraphicsAlgorithm figure, List<Feature> features){

		figure.setForeground(Graphiti.getGaService().manageColor(diagram, 
				ColorProperty.FOREGROUND.getValue(figure, eObject, features)));

		if ( ! (figure instanceof AbstractText) ){
			
			figure.setBackground(Graphiti.getGaService().manageColor(diagram, 
					ColorProperty.BACKGROUND.getValue(figure, eObject, features)));

			Style style = features==null ? null : getGradientStyle(diagram, features.getGradientfeatures());
			if (style!=null)
				figure.setStyle(style);

			figure.setTransparency( (double) 
					IntegerProperty.TRANSPARENCY.getValue(figure, eObject, features) / 100.0 );

			figure.setLineWidth( IntegerProperty.LINE_WIDTH.getValue(figure, eObject, features) );

			if (features!=null)
				figure.setLineStyle(getLineSyle(figure, eObject, features.getLinefeatures()));			
		}

	}


	public static void updateStyleFeatures(Diagram diagram, GraphicsAlgorithm figure){			

		if (figure==null || figure.getProperties().size()==0)
			return;

		PictogramLink link = getPictogramLink(figure);
		if (link!=null){

			for (EObject eobject : link.getBusinessObjects()){
				EClass eclass = eobject.eClass();
				for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){

					if (eStructuralFeature instanceof EAttribute) {
						String value = eobject.eGet(eStructuralFeature)==null ? 
								"" : eobject.eGet(eStructuralFeature).toString();

						ArrayList<Property> properties=new ArrayList<Property>();
						for ( Property property : figure.getProperties() )
							if ( property.getKey().contains(expressionSeperator + eStructuralFeature.getName()) )
								properties.add(property);

						if (properties.size()==0)
							continue;

						ColorProperty.update(diagram, figure, properties, eStructuralFeature, value);
						BooleanProperty.update(diagram, figure, properties, eStructuralFeature, value);
						IntegerProperty.update(diagram, figure, properties, eStructuralFeature, value);
						StringProperty.update(diagram, figure, properties, eStructuralFeature, value);
						updateLineSyle(diagram, figure, properties, eStructuralFeature, value);
						
					}

				}
			}				
		}
	}
	


	/////////////////////////////////////////////////////////////////
	
	public static IColorConstant getRGBColor(RGB rgb){
		return new ColorConstant(rgb.getR(), rgb.getG(), rgb.getB());
	}
	
	

	
	public static boolean isSameFeature (String key, String name){
		return key.equalsIgnoreCase(name) || key.equalsIgnoreCase(name.replace("_", "-"));
	}

	public static String getHashCode(GraphicsAlgorithm figure){
		return expressionSeperator + FigureProperty.HASHCODE.get(figure) + expressionSeperator;
	}
	
	public static ContainerShape getContainerShape(PictogramElement pe){
		if (pe instanceof ContainerShape)
			return (ContainerShape) pe;
		else if (pe != null)
			return getContainerShape(Graphiti.getPeService().getPictogramElementParent(pe));
		return null;
	}
	
	public static ArrayList<GraphicsAlgorithm> getChildFigures(PictogramElement pe){
		ArrayList<GraphicsAlgorithm> figures = new ArrayList<GraphicsAlgorithm>();
		if ( pe instanceof ContainerShape ){
			for (Shape shape : ((ContainerShape)pe).getChildren() )
				figures.add(shape.getGraphicsAlgorithm());
		}else{
			for (GraphicsAlgorithm figure : pe.getGraphicsAlgorithm().getGraphicsAlgorithmChildren() )
				figures.add(figure);
		}
		return figures;
	}
	
	public static boolean isBaseContainer(GraphicsAlgorithm figure){
		return figure.eContainer() instanceof ContainerShape || figure.eContainer() instanceof Connection;
	}
	
	public static boolean isBaseContainer(Object figure){
		return figure instanceof ContainerShape || figure instanceof Connection;
	}
	
//	public boolean isInstanceOf(String child, String parent){
//		EClass echild = (EClass) ePackage.getEClassifier(child);
//		EList<EClass> parents = echild.getEAllSuperTypes();
//		for (EClass obj : parents)
//			System.out.println("--> parents: "+ obj.getName());
//		return true;
//	}

	public static Object getContainerObject(GraphicsAlgorithm figure){
		Object shape = figure.eContainer();
		while ( shape != null && shape instanceof GraphicsAlgorithmContainer && 
				!isBaseContainer(shape) )
			shape = ((GraphicsAlgorithmContainer)shape).eContainer();
		return shape;
	}

	public static PictogramLink getPictogramLink(GraphicsAlgorithm figure){
		Object shape = figure.eContainer();
		while ( shape != null && shape instanceof GraphicsAlgorithmContainer && 
				!isBaseContainer(shape) )
			shape = ((GraphicsAlgorithmContainer)shape).eContainer();
		if (shape instanceof ContainerShape)
			return ((ContainerShape)shape).getLink();
		if (shape instanceof Connection)
			return ((Connection)shape).getLink();
		return null;
	}
	
	public static Rectangle CalculateBounds(int[] xy){
		Point minPoli = new Point(999, 999);
		Point maxPoli = new Point(-999, -999);
		for (int i=0; i<xy.length; i+=2){
			minPoli.x = xy[i]<minPoli.x ? xy[i] : minPoli.x;
			minPoli.y = xy[i+1]<minPoli.y ? xy[i+1] : minPoli.y;
			maxPoli.x = xy[i]>maxPoli.x ? xy[i] : maxPoli.x;
			maxPoli.y = xy[i+1]>maxPoli.y ? xy[i+1] : maxPoli.y;
		}
		maxPoli.setLocation(maxPoli.x-minPoli.x, maxPoli.y-minPoli.y);		
		return new Rectangle(minPoli.x, minPoli.y, maxPoli.x, maxPoli.y);
	}

	public static void TranslateFigure(int[] xy, Point point){
		for (int i=0; i<xy.length; i+=2){
			xy[i] += point.x;
			xy[i+1] += point.y;
		}
	}

	public static void RotateFigure(int[] xy, Point center, int angle){
		double radian = Math.PI / 180.0 * (double)angle;
		for (int i=0; i<xy.length; i+=2){
			Point point = new Point(xy[i], xy[i+1]);
			RotatePoint(point, center, radian);
			xy[i] = point.x;
			xy[i+1] = point.y;
		}
	}		

	public static void RotatePoint(Point point, Point center, double angle){
		double x = point.getX();
		double y = point.getY();
		double x0 = x - center.getX();
		double y0 = y - center.getY();
		x = x0 * Math.cos(angle) - y0 * Math.sin(angle);
		y = x0 * Math.sin(angle) + y0 * Math.cos(angle);
		x += center.getX();
		y += center.getY();	        
		point.setLocation(x, y);
	}
	
	
	
	@SuppressWarnings("deprecation")
	public static Object getAttributeValue(EClassifier etype, AtributeValue attribute){
		if ( etype instanceof EEnum && attribute.getValueID() != null ){
			EEnum eenum = (EEnum)etype;
			for ( EEnumLiteral literal : eenum.getELiterals())
				if ( literal.getName().equals(attribute.getValueID()) )
					return literal.getInstance();
		}else if (etype instanceof EDataType){
//			etype.getEAttributeType().getInstanceClass().equals(boolean.class)
			switch (etype.getName()){
				case "EBoolean":
					return "true".equals(attribute.getValueBOOL());
				case "EInt":
					return attribute.getValueINT();
				case "EFloat":
					return (float)attribute.getValueINT() + (float)attribute.getValueDEC()/100.0 ;
				case "EDate":
					return new Date(attribute.getValueYEAR(), 
							attribute.getValueMONTH()-1, attribute.getValueYEAR());
				default:
					return attribute.getValueSTRING();
			}
		}
		return null;			
	}

	public static void setAttributesValue(EList<Attribute> attributes, EObject eObject){
		EClass eclass = eObject.eClass();			
		for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
			if (eStructuralFeature instanceof EAttribute) {
				for (Attribute attribute : attributes){
					if (eStructuralFeature.getName().equals(attribute.getKey()))
						eObject.eSet(eStructuralFeature, 
								getAttributeValue(eStructuralFeature.getEType(), attribute.getValue()));
				}
			}
		}
	}
	
	public static void setExpressionResult(GraphicsAlgorithm figure, EObject eObject, 
			AtributeExpression expression, String type, String feature, Object result){
		if (figure!=null && expression!=null && eObject!=null){
			EClass eclass = eObject.eClass();			
			for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
				if (eStructuralFeature instanceof EAttribute) {
					if (eStructuralFeature.getName().equals(expression.getKey())){												
						Object value = getAttributeValue(eStructuralFeature.getEType(), 
								expression.getValue());												
						if (value!=null)
							FigureProperty.setProperty(figure,  type + typeSeperator + feature + 
							expressionSeperator + expression.getKey()+expression.getOperator()+value.toString(), 
							result.toString());
					}
				}
			}
		}
	}

	public static String getExpressionResult(GraphicsAlgorithm figure, List<Property> properties,
			String type, String feature, String attribute, String value){
		String condition = type + typeSeperator + feature + expressionSeperator;
		String result = Graphiti.getPeService().getPropertyValue(figure, 
				condition + attribute + equalsSeperator + value);
		if (result==null){
			for ( Property property : properties )
				if ( property.getKey().startsWith(condition + attribute + diferentSeperator) ){
					String[] str_exprs = property.getKey().split(diferentSeperator);
					if (!str_exprs[1].equals(value))
						result = property.getValue();
				}
		}
		return result;
	}
	


	//////////////////////////////////////////////////////////////////
	
	public static GraphicsAlgorithm createImageFigure(GraphicsAlgorithmContainer container, String icon, Rectangle rect){
		GraphicsAlgorithm figure = null;
		if (icon!=null && imageSizes.containsKey(icon)){
			Image img = Graphiti.getGaService().createImage(container, icon);
			img.setStretchH(true);
			img.setStretchV(true);
			figure = img;
			if (!(rect.width > minValue))
				rect.width = imageSizes.get(icon).width;
			if (!(rect.height > minValue))
				rect.height = imageSizes.get(icon).height;	
			
		}else{
			figure = Graphiti.getGaService().createImage(container, null);
			rect.width = minValue;
			rect.height = minValue;
		}	
		return figure;
	}
	
	
	public static Dimension setLabelFigure(Diagram diagram, EObject eObject, GraphicsAlgorithm figure, List<Feature> features, boolean labelin){

		AbstractText text = (AbstractText)figure;
		
		text.setValue(labelin ? "" : 
			StringProperty.TEXT_VALUE.getValue(figure, eObject, features) );

		if ( features.getAlignfeatures().size()==0 || 
				features.getAlignfeatures().get(0).getKey().equalsIgnoreCase("MIDDLE") )
			text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		else if ( features.getAlignfeatures().get(0).getKey().equalsIgnoreCase("RIGHT") )
			text.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
		else
			text.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);

		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);

		org.eclipse.graphiti.mm.algorithms.styles.Font font =
				Graphiti.getGaService().manageDefaultFont(diagram, false, false);	
		try{
			font = Graphiti.getGaService().manageFont(diagram, 
					StringProperty.FONT_NAME.getValue(figure, eObject, features), 
					IntegerProperty.FONT_SIZE.getValue(figure, eObject, features), 
					BooleanProperty.FONT_ITALIC.getValue(figure, eObject, features), 
					BooleanProperty.FONT_BOLD.getValue(figure, eObject, features));
		}catch(Exception ex)
		{
			System.err.println("--> erro font: "+ ex.getMessage());
		}
		text.setFont(font);

		text.setLineWidth( IntegerProperty.LINE_WIDTH.getValue(figure, eObject, features) );

		IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize("#"+text.getValue(), font);

		FigureProperty.TEXT.set(text, text.getValue());
		FigureProperty.CAN_EDIT.set(text, BooleanProperty.TEXT_EDITABLE.getValue(features) ? "1" : "0");

		return new Dimension (dim.getWidth()+minValue, dim.getHeight()+minValue);
	}

	public static int getLabelWidth(GraphicsAlgorithm figure){			
		if ( ! (figure instanceof AbstractText) )
			return 0;
		AbstractText text = (AbstractText)figure;
		String value = getLabelValue(text);
		String canresize = FigureProperty.CAN_RESIZE.get(figure);
		if ( value!=null && canresize==null ){
			IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(value, text.getFont());
			return dim.getWidth()+minValue;
		}
		return 0;
	}
	
	public static String getLabelValue(AbstractText text){		
		String value = FigureProperty.TEXT.get(text);
		String attr = FigureProperty.TEXT_ATTR.get(text);

		PictogramLink link = getPictogramLink(text);
		if (attr!=null && link!=null){
			for (EObject eobject : link.getBusinessObjects()){
				EClass eclass = eobject.eClass();
				for(EAttribute att : eclass.getEAllAttributes()) {
					if (att.getName().equals(attr)){
						String attribute = eobject.eGet(att)==null ? 
								"" : eobject.eGet(att).toString();
						FigureProperty.TEXT_VALUE.set(text, attribute);
						value = value.replace(strAttribute,  attribute);
					}
				}

			}
		}				

		text.setValue(value);
		return value;
	}

	public static void setLabelValue(GraphicsAlgorithm figure, String value){
		if (!(figure instanceof AbstractText))
			return;
		AbstractText text = (AbstractText)figure;
		String attr = FigureProperty.TEXT_ATTR.get(text);

		PictogramLink link = getPictogramLink(text);			
		if (attr!=null && link!=null){
			for (EObject eobject : link.getBusinessObjects()){
				EClass eclass = eobject.eClass();
				for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
					if (eStructuralFeature instanceof EAttribute) {				    
						if (eStructuralFeature.getName().equals(attr))
							eobject.eSet(eStructuralFeature, value);
					}
				}
			}				
			FigureProperty.TEXT_VALUE.set(text, value);
		}else
			FigureProperty.TEXT.set(text, value);
	}
	
	
	
	public static GraphicsAlgorithm getTextFigure(ContainerShape container){
		if (container == null)
			return null;
		for (Shape shape : container.getChildren()){
			GraphicsAlgorithm figure = shape.getGraphicsAlgorithm();
			if (figure != null && !isBaseContainer(figure)){
				String value = FigureProperty.TEXT.get(figure);
				boolean can_edit = "1".equals(FigureProperty.CAN_EDIT.get(figure));
				if ( figure instanceof MultiText && value!=null && can_edit )
					return figure;
				else if (figure.getGraphicsAlgorithmChildren().size()>0){
					GraphicsAlgorithm result = getTextFigure(figure);
					if (result!=null)
						return result;
				}
			}
		}
		return null;
	}

	
	public static GraphicsAlgorithm getTextFigure(GraphicsAlgorithm ga){
		if (ga == null)
			return null;
		for (GraphicsAlgorithm figure : ga.getGraphicsAlgorithmChildren()){
			if (figure != null && !isBaseContainer(figure)){
				String value = FigureProperty.TEXT.get(figure);
				boolean can_edit = "1".equals(FigureProperty.CAN_EDIT.get(figure));
				if ( figure instanceof MultiText && value!=null && can_edit )
					return figure;
				else if (figure.getGraphicsAlgorithmChildren().size()>0){
					GraphicsAlgorithm result = getTextFigure(figure);
					if (result!=null)
						return result;
				}
			}
		}
		return null;
	}
	
	

}



