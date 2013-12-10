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
      case XdiagramPackage.NODE_FIGURE: return createNodeFigure();
      case XdiagramPackage.NODE_CONTAINER: return createNodeContainer();
      case XdiagramPackage.LINK: return createLink();
      case XdiagramPackage.PLACING_FIGURE: return createPlacingFigure();
      case XdiagramPackage.DYNAMIC_FIGURE: return createDynamicFigure();
      case XdiagramPackage.STATIC_FIGURE: return createStaticFigure();
      case XdiagramPackage.NODE_ANCHOR: return createNodeAnchor();
      case XdiagramPackage.ARROW_ANCHOR: return createArrowAnchor();
      case XdiagramPackage.FIGURE_FEATURES: return createFigureFeatures();
      case XdiagramPackage.STYLE_FEATURE: return createStyleFeature();
      case XdiagramPackage.LAYOUT_FEATURE: return createLayoutFeature();
      case XdiagramPackage.CENTER_FEATURE: return createCenterFeature();
      case XdiagramPackage.ALIGN_FEATURE: return createAlignFeature();
      case XdiagramPackage.GRADIENT_FEATURE: return createGradientFeature();
      case XdiagramPackage.POINT_FEATURE: return createPointFeature();
      case XdiagramPackage.SIZE_FEATURE: return createSizeFeature();
      case XdiagramPackage.POSITION_FEATURE: return createPositionFeature();
      case XdiagramPackage.COLOR_FEATURE: return createColorFeature();
      case XdiagramPackage.RGB: return createRGB();
      case XdiagramPackage.INTEGER_FEATURE: return createIntegerFeature();
      case XdiagramPackage.DOUBLE_FEATURE: return createDoubleFeature();
      case XdiagramPackage.STRING_FEATURE: return createStringFeature();
      case XdiagramPackage.BOOLEAN_FEATURE: return createBooleanFeature();
      case XdiagramPackage.LINE_FEATURE: return createLineFeature();
      case XdiagramPackage.ATRIBUTE_EXPRESSION: return createAtributeExpression();
      case XdiagramPackage.ATRIBUTE_VALUE: return createAtributeValue();
      case XdiagramPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
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
      case XdiagramPackage.FIGURE_SHAPE:
        return createFigureShapeFromString(eDataType, initialValue);
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
      case XdiagramPackage.FIGURE_SHAPE:
        return convertFigureShapeToString(eDataType, instanceValue);
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
  public NodeFigure createNodeFigure()
  {
    NodeFigureImpl nodeFigure = new NodeFigureImpl();
    return nodeFigure;
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
  public PlacingFigure createPlacingFigure()
  {
    PlacingFigureImpl placingFigure = new PlacingFigureImpl();
    return placingFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicFigure createDynamicFigure()
  {
    DynamicFigureImpl dynamicFigure = new DynamicFigureImpl();
    return dynamicFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticFigure createStaticFigure()
  {
    StaticFigureImpl staticFigure = new StaticFigureImpl();
    return staticFigure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeAnchor createNodeAnchor()
  {
    NodeAnchorImpl nodeAnchor = new NodeAnchorImpl();
    return nodeAnchor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowAnchor createArrowAnchor()
  {
    ArrowAnchorImpl arrowAnchor = new ArrowAnchorImpl();
    return arrowAnchor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureFeatures createFigureFeatures()
  {
    FigureFeaturesImpl figureFeatures = new FigureFeaturesImpl();
    return figureFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleFeature createStyleFeature()
  {
    StyleFeatureImpl styleFeature = new StyleFeatureImpl();
    return styleFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutFeature createLayoutFeature()
  {
    LayoutFeatureImpl layoutFeature = new LayoutFeatureImpl();
    return layoutFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CenterFeature createCenterFeature()
  {
    CenterFeatureImpl centerFeature = new CenterFeatureImpl();
    return centerFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlignFeature createAlignFeature()
  {
    AlignFeatureImpl alignFeature = new AlignFeatureImpl();
    return alignFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GradientFeature createGradientFeature()
  {
    GradientFeatureImpl gradientFeature = new GradientFeatureImpl();
    return gradientFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointFeature createPointFeature()
  {
    PointFeatureImpl pointFeature = new PointFeatureImpl();
    return pointFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeFeature createSizeFeature()
  {
    SizeFeatureImpl sizeFeature = new SizeFeatureImpl();
    return sizeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionFeature createPositionFeature()
  {
    PositionFeatureImpl positionFeature = new PositionFeatureImpl();
    return positionFeature;
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
  public IntegerFeature createIntegerFeature()
  {
    IntegerFeatureImpl integerFeature = new IntegerFeatureImpl();
    return integerFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleFeature createDoubleFeature()
  {
    DoubleFeatureImpl doubleFeature = new DoubleFeatureImpl();
    return doubleFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringFeature createStringFeature()
  {
    StringFeatureImpl stringFeature = new StringFeatureImpl();
    return stringFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanFeature createBooleanFeature()
  {
    BooleanFeatureImpl booleanFeature = new BooleanFeatureImpl();
    return booleanFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineFeature createLineFeature()
  {
    LineFeatureImpl lineFeature = new LineFeatureImpl();
    return lineFeature;
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
  public AttributeReference createAttributeReference()
  {
    AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
    return attributeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FigureShape createFigureShapeFromString(EDataType eDataType, String initialValue)
  {
    FigureShape result = FigureShape.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFigureShapeToString(EDataType eDataType, Object instanceValue)
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
