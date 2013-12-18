/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.CONNECTABLE_ELEMENT: return createConnectableElement();
      case MyDslPackage.RGB: return createRGB();
      case MyDslPackage.IMAGE_FILE: return createImageFile();
      case MyDslPackage.COLOR: return createColor();
      case MyDslPackage.CUSTOM_COLOR: return createCustomColor();
      case MyDslPackage.RECTANGLE: return createRectangle();
      case MyDslPackage.FEATURE: return createFeature();
      case MyDslPackage.RHOMBUS: return createRhombus();
      case MyDslPackage.ELLIPSE: return createEllipse();
      case MyDslPackage.POLYGON: return createPolygon();
      case MyDslPackage.ATRIBUTE_EXPRESSION: return createAtributeExpression();
      case MyDslPackage.ATRIBUTE_VALUE: return createAtributeValue();
      case MyDslPackage.LABEL: return createLabel();
      case MyDslPackage.IMAGE: return createImage();
      case MyDslPackage.LINK_ELEMENT: return createLinkElement();
      case MyDslPackage.COLOR_FEATURE: return createColorFeature();
      case MyDslPackage.FOREGROUND: return createForeground();
      case MyDslPackage.BACKGROUND: return createBackground();
      case MyDslPackage.BORDER: return createBorder();
      case MyDslPackage.TRANSPARENCY: return createTransparency();
      case MyDslPackage.SIZE: return createSize();
      case MyDslPackage.POINT: return createPoint();
      case MyDslPackage.POSITION: return createPosition();
      case MyDslPackage.CORNER: return createCorner();
      case MyDslPackage.FONT_FACE: return createFontFace();
      case MyDslPackage.FONT_SIZE: return createFontSize();
      case MyDslPackage.FONT_STYLE: return createFontStyle();
      case MyDslPackage.LINE_STYLE: return createLineStyle();
      case MyDslPackage.LINE_WIDTH: return createLineWidth();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.DEFAULT_COLOR:
        return createDefaultColorFromString(eDataType, initialValue);
      case MyDslPackage.FONT_FACE_TYPE:
        return createFontFaceTypeFromString(eDataType, initialValue);
      case MyDslPackage.FONT_STYLE_TYPE:
        return createFontStyleTypeFromString(eDataType, initialValue);
      case MyDslPackage.LINE_TYPE:
        return createLineTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MyDslPackage.DEFAULT_COLOR:
        return convertDefaultColorToString(eDataType, instanceValue);
      case MyDslPackage.FONT_FACE_TYPE:
        return convertFontFaceTypeToString(eDataType, instanceValue);
      case MyDslPackage.FONT_STYLE_TYPE:
        return convertFontStyleTypeToString(eDataType, instanceValue);
      case MyDslPackage.LINE_TYPE:
        return convertLineTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectableElement createConnectableElement()
  {
    ConnectableElementImpl connectableElement = new ConnectableElementImpl();
    return connectableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGB createRGB()
  {
    RGBImpl rgb = new RGBImpl();
    return rgb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageFile createImageFile()
  {
    ImageFileImpl imageFile = new ImageFileImpl();
    return imageFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomColor createCustomColor()
  {
    CustomColorImpl customColor = new CustomColorImpl();
    return customColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle createRectangle()
  {
    RectangleImpl rectangle = new RectangleImpl();
    return rectangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rhombus createRhombus()
  {
    RhombusImpl rhombus = new RhombusImpl();
    return rhombus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ellipse createEllipse()
  {
    EllipseImpl ellipse = new EllipseImpl();
    return ellipse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Polygon createPolygon()
  {
    PolygonImpl polygon = new PolygonImpl();
    return polygon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtributeExpression createAtributeExpression()
  {
    AtributeExpressionImpl atributeExpression = new AtributeExpressionImpl();
    return atributeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtributeValue createAtributeValue()
  {
    AtributeValueImpl atributeValue = new AtributeValueImpl();
    return atributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkElement createLinkElement()
  {
    LinkElementImpl linkElement = new LinkElementImpl();
    return linkElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFeature createColorFeature()
  {
    ColorFeatureImpl colorFeature = new ColorFeatureImpl();
    return colorFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foreground createForeground()
  {
    ForegroundImpl foreground = new ForegroundImpl();
    return foreground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Background createBackground()
  {
    BackgroundImpl background = new BackgroundImpl();
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border createBorder()
  {
    BorderImpl border = new BorderImpl();
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transparency createTransparency()
  {
    TransparencyImpl transparency = new TransparencyImpl();
    return transparency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Position createPosition()
  {
    PositionImpl position = new PositionImpl();
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Corner createCorner()
  {
    CornerImpl corner = new CornerImpl();
    return corner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFace createFontFace()
  {
    FontFaceImpl fontFace = new FontFaceImpl();
    return fontFace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontSize createFontSize()
  {
    FontSizeImpl fontSize = new FontSizeImpl();
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyle createFontStyle()
  {
    FontStyleImpl fontStyle = new FontStyleImpl();
    return fontStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineStyle createLineStyle()
  {
    LineStyleImpl lineStyle = new LineStyleImpl();
    return lineStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineWidth createLineWidth()
  {
    LineWidthImpl lineWidth = new LineWidthImpl();
    return lineWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultColor createDefaultColorFromString(EDataType eDataType, String initialValue)
  {
    DefaultColor result = DefaultColor.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDefaultColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontFaceType createFontFaceTypeFromString(EDataType eDataType, String initialValue)
  {
    FontFaceType result = FontFaceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFontFaceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyleType createFontStyleTypeFromString(EDataType eDataType, String initialValue)
  {
    FontStyleType result = FontStyleType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFontStyleTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineType createLineTypeFromString(EDataType eDataType, String initialValue)
  {
    LineType result = LineType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLineTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
