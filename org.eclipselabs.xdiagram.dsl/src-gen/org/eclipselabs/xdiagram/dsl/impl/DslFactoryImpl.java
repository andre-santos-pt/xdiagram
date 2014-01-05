/**
 */
package org.eclipselabs.xdiagram.dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.xdiagram.dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DslFactory init()
  {
    try
    {
      DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
      if (theDslFactory != null)
      {
        return theDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslFactoryImpl()
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
      case DslPackage.XDIAGRAM: return createXDiagram();
      case DslPackage.IMPORT_STATEMENT: return createImportStatement();
      case DslPackage.DIAGRAM_ELEMENT: return createDiagramElement();
      case DslPackage.STYLE: return createStyle();
      case DslPackage.FEATURE: return createFeature();
      case DslPackage.FEATURE_CONTAINER: return createFeatureContainer();
      case DslPackage.FEATURE_CONDITIONAL: return createFeatureConditional();
      case DslPackage.NODE: return createNode();
      case DslPackage.LINK: return createLink();
      case DslPackage.DECORATOR: return createDecorator();
      case DslPackage.CONNECTABLE_ELEMENT: return createConnectableElement();
      case DslPackage.ANCHOR: return createAnchor();
      case DslPackage.CUSTOM_COLOR: return createCustomColor();
      case DslPackage.COLOR: return createColor();
      case DslPackage.RECTANGLE: return createRectangle();
      case DslPackage.RHOMBUS: return createRhombus();
      case DslPackage.ELLIPSE: return createEllipse();
      case DslPackage.POLYLINE: return createPolyline();
      case DslPackage.CONTAINS: return createContains();
      case DslPackage.VALUE: return createValue();
      case DslPackage.INT_VALUE: return createIntValue();
      case DslPackage.DOUBLE_VALUE: return createDoubleValue();
      case DslPackage.STRING_VALUE: return createStringValue();
      case DslPackage.BOOLEAN_VALUE: return createBooleanValue();
      case DslPackage.ENUM_VALUE: return createEnumValue();
      case DslPackage.LABEL: return createLabel();
      case DslPackage.IMAGE: return createImage();
      case DslPackage.INVISIBLE: return createInvisible();
      case DslPackage.COLOR_FEATURE: return createColorFeature();
      case DslPackage.TRANSPARENCY: return createTransparency();
      case DslPackage.SIZE: return createSize();
      case DslPackage.POINT: return createPoint();
      case DslPackage.POSITION: return createPosition();
      case DslPackage.CORNER: return createCorner();
      case DslPackage.TEXT_VALUE: return createTextValue();
      case DslPackage.FONT_FACE: return createFontFace();
      case DslPackage.FONT_SIZE: return createFontSize();
      case DslPackage.FONT_STYLE: return createFontStyle();
      case DslPackage.LINE_STYLE: return createLineStyle();
      case DslPackage.LINE_WIDTH: return createLineWidth();
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
      case DslPackage.CONNECTION_TYPE:
        return createConnectionTypeFromString(eDataType, initialValue);
      case DslPackage.ANCHOR_DIRECTION:
        return createAnchorDirectionFromString(eDataType, initialValue);
      case DslPackage.DEFAULT_COLOR:
        return createDefaultColorFromString(eDataType, initialValue);
      case DslPackage.CONTAINER_LAYOUT:
        return createContainerLayoutFromString(eDataType, initialValue);
      case DslPackage.OPERATOR:
        return createOperatorFromString(eDataType, initialValue);
      case DslPackage.BOOLEAN_LITERAL:
        return createBooleanLiteralFromString(eDataType, initialValue);
      case DslPackage.FONT_FACE_TYPE:
        return createFontFaceTypeFromString(eDataType, initialValue);
      case DslPackage.FONT_STYLE_TYPE:
        return createFontStyleTypeFromString(eDataType, initialValue);
      case DslPackage.LINE_TYPE:
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
      case DslPackage.CONNECTION_TYPE:
        return convertConnectionTypeToString(eDataType, instanceValue);
      case DslPackage.ANCHOR_DIRECTION:
        return convertAnchorDirectionToString(eDataType, instanceValue);
      case DslPackage.DEFAULT_COLOR:
        return convertDefaultColorToString(eDataType, instanceValue);
      case DslPackage.CONTAINER_LAYOUT:
        return convertContainerLayoutToString(eDataType, instanceValue);
      case DslPackage.OPERATOR:
        return convertOperatorToString(eDataType, instanceValue);
      case DslPackage.BOOLEAN_LITERAL:
        return convertBooleanLiteralToString(eDataType, instanceValue);
      case DslPackage.FONT_FACE_TYPE:
        return convertFontFaceTypeToString(eDataType, instanceValue);
      case DslPackage.FONT_STYLE_TYPE:
        return convertFontStyleTypeToString(eDataType, instanceValue);
      case DslPackage.LINE_TYPE:
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
  public FeatureContainer createFeatureContainer()
  {
    FeatureContainerImpl featureContainer = new FeatureContainerImpl();
    return featureContainer;
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
  public Invisible createInvisible()
  {
    InvisibleImpl invisible = new InvisibleImpl();
    return invisible;
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
  public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue)
  {
    ConnectionType result = ConnectionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnchorDirection createAnchorDirectionFromString(EDataType eDataType, String initialValue)
  {
    AnchorDirection result = AnchorDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAnchorDirectionToString(EDataType eDataType, Object instanceValue)
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
  public DslPackage getDslPackage()
  {
    return (DslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DslPackage getPackage()
  {
    return DslPackage.eINSTANCE;
  }

} //DslFactoryImpl
