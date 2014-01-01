/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.xdiagram.xtext.xdiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XdiagramFactoryImpl extends EFactoryImpl implements XdiagramFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XdiagramFactory init()
  {
    try
    {
      XdiagramFactory theXdiagramFactory = (XdiagramFactory)EPackage.Registry.INSTANCE.getEFactory(XdiagramPackage.eNS_URI);
      if (theXdiagramFactory != null)
      {
        return theXdiagramFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XdiagramFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XdiagramFactoryImpl()
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
      case XdiagramPackage.XDIAGRAM: return createXDiagram();
      case XdiagramPackage.IMPORT_STATEMENT: return createImportStatement();
      case XdiagramPackage.STYLE: return createStyle();
      case XdiagramPackage.DIAGRAM_ELEMENT: return createDiagramElement();
      case XdiagramPackage.NODE: return createNode();
      case XdiagramPackage.ATTRIBUTE: return createAttribute();
      case XdiagramPackage.NODE_CONTAINER: return createNodeContainer();
      case XdiagramPackage.LINK: return createLink();
      case XdiagramPackage.DECORATOR: return createDecorator();
      case XdiagramPackage.CONNECTABLE_ELEMENT: return createConnectableElement();
      case XdiagramPackage.ANCHOR: return createAnchor();
      case XdiagramPackage.ANCHOR_CONSTRAINT: return createAnchorConstraint();
      case XdiagramPackage.ELEMENT: return createElement();
      case XdiagramPackage.RGB: return createRGB();
      case XdiagramPackage.IMAGE_FILE: return createImageFile();
      case XdiagramPackage.COLOR: return createColor();
      case XdiagramPackage.CUSTOM_COLOR: return createCustomColor();
      case XdiagramPackage.RECTANGLE: return createRectangle();
      case XdiagramPackage.FEATURE: return createFeature();
      case XdiagramPackage.RHOMBUS: return createRhombus();
      case XdiagramPackage.ELLIPSE: return createEllipse();
      case XdiagramPackage.POLYLINE: return createPolyline();
      case XdiagramPackage.FEATURE_CONDITIONAL: return createFeatureConditional();
      case XdiagramPackage.CONTAINS: return createContains();
      case XdiagramPackage.VALUE: return createValue();
      case XdiagramPackage.INT_VALUE: return createIntValue();
      case XdiagramPackage.DOUBLE_VALUE: return createDoubleValue();
      case XdiagramPackage.STRING_VALUE: return createStringValue();
      case XdiagramPackage.BOOLEAN_VALUE: return createBooleanValue();
      case XdiagramPackage.ENUM_VALUE: return createEnumValue();
      case XdiagramPackage.ATRIBUTE_VALUE: return createAtributeValue();
      case XdiagramPackage.LABEL: return createLabel();
      case XdiagramPackage.IMAGE: return createImage();
      case XdiagramPackage.COLOR_FEATURE: return createColorFeature();
      case XdiagramPackage.FOREGROUND: return createForeground();
      case XdiagramPackage.BACKGROUND: return createBackground();
      case XdiagramPackage.TRANSPARENCY: return createTransparency();
      case XdiagramPackage.SIZE: return createSize();
      case XdiagramPackage.POINT: return createPoint();
      case XdiagramPackage.POSITION: return createPosition();
      case XdiagramPackage.CORNER: return createCorner();
      case XdiagramPackage.TEXT_VALUE: return createTextValue();
      case XdiagramPackage.FONT_FACE: return createFontFace();
      case XdiagramPackage.FONT_SIZE: return createFontSize();
      case XdiagramPackage.FONT_STYLE: return createFontStyle();
      case XdiagramPackage.LINE_STYLE: return createLineStyle();
      case XdiagramPackage.LINE_WIDTH: return createLineWidth();
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
      case XdiagramPackage.CONTAINER_LAYOUT:
        return createContainerLayoutFromString(eDataType, initialValue);
      case XdiagramPackage.ANCHOR_CONSTRAINT_TYPE:
        return createAnchorConstraintTypeFromString(eDataType, initialValue);
      case XdiagramPackage.DEFAULT_COLOR:
        return createDefaultColorFromString(eDataType, initialValue);
      case XdiagramPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      case XdiagramPackage.BOOLEAN_LITERAL:
        return createBooleanLiteralFromString(eDataType, initialValue);
      case XdiagramPackage.FONT_FACE_TYPE:
        return createFontFaceTypeFromString(eDataType, initialValue);
      case XdiagramPackage.FONT_STYLE_TYPE:
        return createFontStyleTypeFromString(eDataType, initialValue);
      case XdiagramPackage.LINE_TYPE:
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
      case XdiagramPackage.CONTAINER_LAYOUT:
        return convertContainerLayoutToString(eDataType, instanceValue);
      case XdiagramPackage.ANCHOR_CONSTRAINT_TYPE:
        return convertAnchorConstraintTypeToString(eDataType, instanceValue);
      case XdiagramPackage.DEFAULT_COLOR:
        return convertDefaultColorToString(eDataType, instanceValue);
      case XdiagramPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      case XdiagramPackage.BOOLEAN_LITERAL:
        return convertBooleanLiteralToString(eDataType, instanceValue);
      case XdiagramPackage.FONT_FACE_TYPE:
        return convertFontFaceTypeToString(eDataType, instanceValue);
      case XdiagramPackage.FONT_STYLE_TYPE:
        return convertFontStyleTypeToString(eDataType, instanceValue);
      case XdiagramPackage.LINE_TYPE:
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
  public XDiagram createXDiagram()
  {
    XDiagramImpl xDiagram = new XDiagramImpl();
    return xDiagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportStatement createImportStatement()
  {
    ImportStatementImpl importStatement = new ImportStatementImpl();
    return importStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyle()
  {
    StyleImpl style = new StyleImpl();
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiagramElement createDiagramElement()
  {
    DiagramElementImpl diagramElement = new DiagramElementImpl();
    return diagramElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeContainer createNodeContainer()
  {
    NodeContainerImpl nodeContainer = new NodeContainerImpl();
    return nodeContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decorator createDecorator()
  {
    DecoratorImpl decorator = new DecoratorImpl();
    return decorator;
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
  public Anchor createAnchor()
  {
    AnchorImpl anchor = new AnchorImpl();
    return anchor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorConstraint createAnchorConstraint()
  {
    AnchorConstraintImpl anchorConstraint = new AnchorConstraintImpl();
    return anchorConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
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
  public Polyline createPolyline()
  {
    PolylineImpl polyline = new PolylineImpl();
    return polyline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureConditional createFeatureConditional()
  {
    FeatureConditionalImpl featureConditional = new FeatureConditionalImpl();
    return featureConditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Contains createContains()
  {
    ContainsImpl contains = new ContainsImpl();
    return contains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleValue createDoubleValue()
  {
    DoubleValueImpl doubleValue = new DoubleValueImpl();
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumValue createEnumValue()
  {
    EnumValueImpl enumValue = new EnumValueImpl();
    return enumValue;
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
  public TextValue createTextValue()
  {
    TextValueImpl textValue = new TextValueImpl();
    return textValue;
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
  public ContainerLayout createContainerLayoutFromString(EDataType eDataType, String initialValue)
  {
    ContainerLayout result = ContainerLayout.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertContainerLayoutToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorConstraintType createAnchorConstraintTypeFromString(EDataType eDataType, String initialValue)
  {
    AnchorConstraintType result = AnchorConstraintType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAnchorConstraintTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
  public Operator createOperatorFromString(EDataType eDataType, String initialValue)
  {
    Operator result = Operator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteralFromString(EDataType eDataType, String initialValue)
  {
    BooleanLiteral result = BooleanLiteral.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanLiteralToString(EDataType eDataType, Object instanceValue)
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
  public XdiagramPackage getXdiagramPackage()
  {
    return (XdiagramPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XdiagramPackage getPackage()
  {
    return XdiagramPackage.eINSTANCE;
  }

} //XdiagramFactoryImpl
