/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.Anchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint;
import org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Attribute;
import org.eclipselabs.xdiagram.xtext.xdiagram.Background;
import org.eclipselabs.xdiagram.xtext.xdiagram.BooleanLiteral;
import org.eclipselabs.xdiagram.xtext.xdiagram.BooleanValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Color;
import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ConnectableElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout;
import org.eclipselabs.xdiagram.xtext.xdiagram.Contains;
import org.eclipselabs.xdiagram.xtext.xdiagram.Corner;
import org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.DefaultColor;
import org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.DoubleValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Element;
import org.eclipselabs.xdiagram.xtext.xdiagram.Ellipse;
import org.eclipselabs.xdiagram.xtext.xdiagram.EnumValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;
import org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional;
import org.eclipselabs.xdiagram.xtext.xdiagram.FontFace;
import org.eclipselabs.xdiagram.xtext.xdiagram.FontFaceType;
import org.eclipselabs.xdiagram.xtext.xdiagram.FontSize;
import org.eclipselabs.xdiagram.xtext.xdiagram.FontStyle;
import org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType;
import org.eclipselabs.xdiagram.xtext.xdiagram.Foreground;
import org.eclipselabs.xdiagram.xtext.xdiagram.Image;
import org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile;
import org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Label;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineStyle;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineType;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineWidth;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer;
import org.eclipselabs.xdiagram.xtext.xdiagram.Operator;
import org.eclipselabs.xdiagram.xtext.xdiagram.Point;
import org.eclipselabs.xdiagram.xtext.xdiagram.Polyline;
import org.eclipselabs.xdiagram.xtext.xdiagram.Position;
import org.eclipselabs.xdiagram.xtext.xdiagram.Rectangle;
import org.eclipselabs.xdiagram.xtext.xdiagram.Rhombus;
import org.eclipselabs.xdiagram.xtext.xdiagram.Size;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Style;
import org.eclipselabs.xdiagram.xtext.xdiagram.TextValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Transparency;
import org.eclipselabs.xdiagram.xtext.xdiagram.Value;
import org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramFactory;
import org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XdiagramPackageImpl extends EPackageImpl implements XdiagramPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDiagramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decoratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anchorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anchorConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rectangleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rhombusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ellipseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass polylineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureConditionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foregroundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backgroundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transparencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cornerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontFaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontSizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineWidthEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum containerLayoutEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum anchorConstraintTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum defaultColorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanLiteralEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fontFaceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fontStyleTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lineTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XdiagramPackageImpl()
  {
    super(eNS_URI, XdiagramFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link XdiagramPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XdiagramPackage init()
  {
    if (isInited) return (XdiagramPackage)EPackage.Registry.INSTANCE.getEPackage(XdiagramPackage.eNS_URI);

    // Obtain or create and register package
    XdiagramPackageImpl theXdiagramPackage = (XdiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XdiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XdiagramPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXdiagramPackage.createPackageContents();

    // Initialize created meta-data
    theXdiagramPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXdiagramPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XdiagramPackage.eNS_URI, theXdiagramPackage);
    return theXdiagramPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDiagram()
  {
    return xDiagramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXDiagram_ImportURI()
  {
    return (EAttribute)xDiagramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Imports()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_ModelClass()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Nodes()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Links()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Styles()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Colors()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Images()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportStatement()
  {
    return importStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportStatement_ImportedNamespace()
  {
    return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyle()
  {
    return styleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyle_Name()
  {
    return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_Features()
  {
    return (EReference)styleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagramElement()
  {
    return diagramElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagramElement_ModelClass()
  {
    return (EReference)diagramElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramElement_Style()
  {
    return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramElement_Icon()
  {
    return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiagramElement_Name()
  {
    return (EAttribute)diagramElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagramElement_Attributes()
  {
    return (EReference)diagramElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Resizable()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_MainFigure()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Anchors()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Key()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Value()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeContainer()
  {
    return nodeContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeContainer_Layout()
  {
    return (EAttribute)nodeContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeContainer_ModelReference()
  {
    return (EReference)nodeContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeContainer_Value()
  {
    return (EAttribute)nodeContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeContainer_Format()
  {
    return (EAttribute)nodeContainerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeContainer_Figures()
  {
    return (EReference)nodeContainerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_ModelReference()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Complex()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_SourceReference()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_TargetReference()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Manhattan()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Decorators()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecorator()
  {
    return decoratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecorator_Position()
  {
    return (EAttribute)decoratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecorator_Source()
  {
    return (EAttribute)decoratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecorator_Target()
  {
    return (EAttribute)decoratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecorator_Middle()
  {
    return (EAttribute)decoratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorator_StaticElement()
  {
    return (EReference)decoratorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorator_Label()
  {
    return (EReference)decoratorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectableElement()
  {
    return connectableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnectableElement_Children()
  {
    return (EReference)connectableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnchor()
  {
    return anchorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_Object()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_PassX()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_X()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_FormatX()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_PassY()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_Y()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchor_FormatY()
  {
    return (EAttribute)anchorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnchor_Figures()
  {
    return (EReference)anchorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnchor_Constraints()
  {
    return (EReference)anchorEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnchorConstraint()
  {
    return anchorConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchorConstraint_Type()
  {
    return (EAttribute)anchorConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchorConstraint_Reference()
  {
    return (EAttribute)anchorConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnchorConstraint_Max()
  {
    return (EAttribute)anchorConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Features()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGB()
  {
    return rgbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_R()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_G()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGB_B()
  {
    return (EAttribute)rgbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageFile()
  {
    return imageFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageFile_Name()
  {
    return (EAttribute)imageFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageFile_Src()
  {
    return (EAttribute)imageFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Default()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColor_Custom()
  {
    return (EReference)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomColor()
  {
    return customColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomColor_Name()
  {
    return (EAttribute)customColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomColor_Rgb()
  {
    return (EReference)customColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRectangle()
  {
    return rectangleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Rectangle()
  {
    return (EAttribute)rectangleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRectangle_Square()
  {
    return (EAttribute)rectangleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Conditional()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRhombus()
  {
    return rhombusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEllipse()
  {
    return ellipseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Ellipse()
  {
    return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEllipse_Circle()
  {
    return (EAttribute)ellipseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolyline()
  {
    return polylineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolyline_Polygon()
  {
    return (EAttribute)polylineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolyline_Polyline()
  {
    return (EAttribute)polylineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureConditional()
  {
    return featureConditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureConditional_ModelAttribute()
  {
    return (EReference)featureConditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureConditional_Operator()
  {
    return (EAttribute)featureConditionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureConditional_Value()
  {
    return (EReference)featureConditionalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContains()
  {
    return containsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContains_ModelReference()
  {
    return (EReference)containsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntValue()
  {
    return intValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntValue_Value()
  {
    return (EAttribute)intValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleValue()
  {
    return doubleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleValue_ValueInt()
  {
    return (EAttribute)doubleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleValue_ValueDecimal()
  {
    return (EAttribute)doubleValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Null()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringValue_Value()
  {
    return (EAttribute)stringValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanValue()
  {
    return booleanValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValue_Value()
  {
    return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumValue()
  {
    return enumValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumValue_Name()
  {
    return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributeValue()
  {
    return atributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueINT()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueDEC()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueID()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueBOOL()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueSTRING()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueDAY()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueMONTH()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeValue_ValueYEAR()
  {
    return (EAttribute)atributeValueEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Editable()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImage_Image()
  {
    return (EReference)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorFeature()
  {
    return colorFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFeature_Color()
  {
    return (EReference)colorFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeground()
  {
    return foregroundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackground()
  {
    return backgroundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransparency()
  {
    return transparencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransparency_Percent()
  {
    return (EAttribute)transparencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSize()
  {
    return sizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Width()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSize_Height()
  {
    return (EAttribute)sizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_X()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Y()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPosition()
  {
    return positionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosition_X()
  {
    return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPosition_Y()
  {
    return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCorner()
  {
    return cornerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorner_Angle()
  {
    return (EAttribute)cornerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextValue()
  {
    return textValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextValue_Text()
  {
    return (EAttribute)textValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextValue_ModelAttribute()
  {
    return (EReference)textValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontFace()
  {
    return fontFaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontFace_Face()
  {
    return (EAttribute)fontFaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontSize()
  {
    return fontSizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontSize_Size()
  {
    return (EAttribute)fontSizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontStyle()
  {
    return fontStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFontStyle_Styles()
  {
    return (EAttribute)fontStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineStyle()
  {
    return lineStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineStyle_Style()
  {
    return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineWidth()
  {
    return lineWidthEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineWidth_Width()
  {
    return (EAttribute)lineWidthEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getContainerLayout()
  {
    return containerLayoutEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAnchorConstraintType()
  {
    return anchorConstraintTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDefaultColor()
  {
    return defaultColorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperator()
  {
    return operatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanLiteral()
  {
    return booleanLiteralEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFontFaceType()
  {
    return fontFaceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFontStyleType()
  {
    return fontStyleTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLineType()
  {
    return lineTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XdiagramFactory getXdiagramFactory()
  {
    return (XdiagramFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    xDiagramEClass = createEClass(XDIAGRAM);
    createEAttribute(xDiagramEClass, XDIAGRAM__IMPORT_URI);
    createEReference(xDiagramEClass, XDIAGRAM__IMPORTS);
    createEReference(xDiagramEClass, XDIAGRAM__MODEL_CLASS);
    createEReference(xDiagramEClass, XDIAGRAM__NODES);
    createEReference(xDiagramEClass, XDIAGRAM__LINKS);
    createEReference(xDiagramEClass, XDIAGRAM__STYLES);
    createEReference(xDiagramEClass, XDIAGRAM__COLORS);
    createEReference(xDiagramEClass, XDIAGRAM__IMAGES);

    importStatementEClass = createEClass(IMPORT_STATEMENT);
    createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORTED_NAMESPACE);

    styleEClass = createEClass(STYLE);
    createEAttribute(styleEClass, STYLE__NAME);
    createEReference(styleEClass, STYLE__FEATURES);

    diagramElementEClass = createEClass(DIAGRAM_ELEMENT);
    createEReference(diagramElementEClass, DIAGRAM_ELEMENT__MODEL_CLASS);
    createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__STYLE);
    createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__ICON);
    createEAttribute(diagramElementEClass, DIAGRAM_ELEMENT__NAME);
    createEReference(diagramElementEClass, DIAGRAM_ELEMENT__ATTRIBUTES);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__RESIZABLE);
    createEReference(nodeEClass, NODE__MAIN_FIGURE);
    createEReference(nodeEClass, NODE__ANCHORS);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__KEY);
    createEReference(attributeEClass, ATTRIBUTE__VALUE);

    nodeContainerEClass = createEClass(NODE_CONTAINER);
    createEAttribute(nodeContainerEClass, NODE_CONTAINER__LAYOUT);
    createEReference(nodeContainerEClass, NODE_CONTAINER__MODEL_REFERENCE);
    createEAttribute(nodeContainerEClass, NODE_CONTAINER__VALUE);
    createEAttribute(nodeContainerEClass, NODE_CONTAINER__FORMAT);
    createEReference(nodeContainerEClass, NODE_CONTAINER__FIGURES);

    linkEClass = createEClass(LINK);
    createEReference(linkEClass, LINK__MODEL_REFERENCE);
    createEAttribute(linkEClass, LINK__COMPLEX);
    createEReference(linkEClass, LINK__SOURCE_REFERENCE);
    createEReference(linkEClass, LINK__TARGET_REFERENCE);
    createEAttribute(linkEClass, LINK__MANHATTAN);
    createEReference(linkEClass, LINK__DECORATORS);

    decoratorEClass = createEClass(DECORATOR);
    createEAttribute(decoratorEClass, DECORATOR__POSITION);
    createEAttribute(decoratorEClass, DECORATOR__SOURCE);
    createEAttribute(decoratorEClass, DECORATOR__TARGET);
    createEAttribute(decoratorEClass, DECORATOR__MIDDLE);
    createEReference(decoratorEClass, DECORATOR__STATIC_ELEMENT);
    createEReference(decoratorEClass, DECORATOR__LABEL);

    connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);
    createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__CHILDREN);

    anchorEClass = createEClass(ANCHOR);
    createEAttribute(anchorEClass, ANCHOR__OBJECT);
    createEAttribute(anchorEClass, ANCHOR__PASS_X);
    createEAttribute(anchorEClass, ANCHOR__X);
    createEAttribute(anchorEClass, ANCHOR__FORMAT_X);
    createEAttribute(anchorEClass, ANCHOR__PASS_Y);
    createEAttribute(anchorEClass, ANCHOR__Y);
    createEAttribute(anchorEClass, ANCHOR__FORMAT_Y);
    createEReference(anchorEClass, ANCHOR__FIGURES);
    createEReference(anchorEClass, ANCHOR__CONSTRAINTS);

    anchorConstraintEClass = createEClass(ANCHOR_CONSTRAINT);
    createEAttribute(anchorConstraintEClass, ANCHOR_CONSTRAINT__TYPE);
    createEAttribute(anchorConstraintEClass, ANCHOR_CONSTRAINT__REFERENCE);
    createEAttribute(anchorConstraintEClass, ANCHOR_CONSTRAINT__MAX);

    elementEClass = createEClass(ELEMENT);
    createEReference(elementEClass, ELEMENT__FEATURES);

    rgbEClass = createEClass(RGB);
    createEAttribute(rgbEClass, RGB__R);
    createEAttribute(rgbEClass, RGB__G);
    createEAttribute(rgbEClass, RGB__B);

    imageFileEClass = createEClass(IMAGE_FILE);
    createEAttribute(imageFileEClass, IMAGE_FILE__NAME);
    createEAttribute(imageFileEClass, IMAGE_FILE__SRC);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__DEFAULT);
    createEReference(colorEClass, COLOR__CUSTOM);

    customColorEClass = createEClass(CUSTOM_COLOR);
    createEAttribute(customColorEClass, CUSTOM_COLOR__NAME);
    createEReference(customColorEClass, CUSTOM_COLOR__RGB);

    rectangleEClass = createEClass(RECTANGLE);
    createEAttribute(rectangleEClass, RECTANGLE__RECTANGLE);
    createEAttribute(rectangleEClass, RECTANGLE__SQUARE);

    featureEClass = createEClass(FEATURE);
    createEReference(featureEClass, FEATURE__CONDITIONAL);

    rhombusEClass = createEClass(RHOMBUS);

    ellipseEClass = createEClass(ELLIPSE);
    createEAttribute(ellipseEClass, ELLIPSE__ELLIPSE);
    createEAttribute(ellipseEClass, ELLIPSE__CIRCLE);

    polylineEClass = createEClass(POLYLINE);
    createEAttribute(polylineEClass, POLYLINE__POLYGON);
    createEAttribute(polylineEClass, POLYLINE__POLYLINE);

    featureConditionalEClass = createEClass(FEATURE_CONDITIONAL);
    createEReference(featureConditionalEClass, FEATURE_CONDITIONAL__MODEL_ATTRIBUTE);
    createEAttribute(featureConditionalEClass, FEATURE_CONDITIONAL__OPERATOR);
    createEReference(featureConditionalEClass, FEATURE_CONDITIONAL__VALUE);

    containsEClass = createEClass(CONTAINS);
    createEReference(containsEClass, CONTAINS__MODEL_REFERENCE);

    valueEClass = createEClass(VALUE);

    intValueEClass = createEClass(INT_VALUE);
    createEAttribute(intValueEClass, INT_VALUE__VALUE);

    doubleValueEClass = createEClass(DOUBLE_VALUE);
    createEAttribute(doubleValueEClass, DOUBLE_VALUE__VALUE_INT);
    createEAttribute(doubleValueEClass, DOUBLE_VALUE__VALUE_DECIMAL);

    stringValueEClass = createEClass(STRING_VALUE);
    createEAttribute(stringValueEClass, STRING_VALUE__NULL);
    createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

    booleanValueEClass = createEClass(BOOLEAN_VALUE);
    createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

    enumValueEClass = createEClass(ENUM_VALUE);
    createEAttribute(enumValueEClass, ENUM_VALUE__NAME);

    atributeValueEClass = createEClass(ATRIBUTE_VALUE);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_INT);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_DEC);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_ID);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_BOOL);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_STRING);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_DAY);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_MONTH);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_YEAR);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__EDITABLE);

    imageEClass = createEClass(IMAGE);
    createEReference(imageEClass, IMAGE__IMAGE);

    colorFeatureEClass = createEClass(COLOR_FEATURE);
    createEReference(colorFeatureEClass, COLOR_FEATURE__COLOR);

    foregroundEClass = createEClass(FOREGROUND);

    backgroundEClass = createEClass(BACKGROUND);

    transparencyEClass = createEClass(TRANSPARENCY);
    createEAttribute(transparencyEClass, TRANSPARENCY__PERCENT);

    sizeEClass = createEClass(SIZE);
    createEAttribute(sizeEClass, SIZE__WIDTH);
    createEAttribute(sizeEClass, SIZE__HEIGHT);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__X);
    createEAttribute(pointEClass, POINT__Y);

    positionEClass = createEClass(POSITION);
    createEAttribute(positionEClass, POSITION__X);
    createEAttribute(positionEClass, POSITION__Y);

    cornerEClass = createEClass(CORNER);
    createEAttribute(cornerEClass, CORNER__ANGLE);

    textValueEClass = createEClass(TEXT_VALUE);
    createEAttribute(textValueEClass, TEXT_VALUE__TEXT);
    createEReference(textValueEClass, TEXT_VALUE__MODEL_ATTRIBUTE);

    fontFaceEClass = createEClass(FONT_FACE);
    createEAttribute(fontFaceEClass, FONT_FACE__FACE);

    fontSizeEClass = createEClass(FONT_SIZE);
    createEAttribute(fontSizeEClass, FONT_SIZE__SIZE);

    fontStyleEClass = createEClass(FONT_STYLE);
    createEAttribute(fontStyleEClass, FONT_STYLE__STYLES);

    lineStyleEClass = createEClass(LINE_STYLE);
    createEAttribute(lineStyleEClass, LINE_STYLE__STYLE);

    lineWidthEClass = createEClass(LINE_WIDTH);
    createEAttribute(lineWidthEClass, LINE_WIDTH__WIDTH);

    // Create enums
    containerLayoutEEnum = createEEnum(CONTAINER_LAYOUT);
    anchorConstraintTypeEEnum = createEEnum(ANCHOR_CONSTRAINT_TYPE);
    defaultColorEEnum = createEEnum(DEFAULT_COLOR);
    operatorEEnum = createEEnum(OPERATOR);
    booleanLiteralEEnum = createEEnum(BOOLEAN_LITERAL);
    fontFaceTypeEEnum = createEEnum(FONT_FACE_TYPE);
    fontStyleTypeEEnum = createEEnum(FONT_STYLE_TYPE);
    lineTypeEEnum = createEEnum(LINE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nodeEClass.getESuperTypes().add(this.getDiagramElement());
    linkEClass.getESuperTypes().add(this.getDiagramElement());
    linkEClass.getESuperTypes().add(this.getElement());
    connectableElementEClass.getESuperTypes().add(this.getElement());
    rectangleEClass.getESuperTypes().add(this.getConnectableElement());
    rhombusEClass.getESuperTypes().add(this.getConnectableElement());
    ellipseEClass.getESuperTypes().add(this.getConnectableElement());
    polylineEClass.getESuperTypes().add(this.getConnectableElement());
    containsEClass.getESuperTypes().add(this.getFeature());
    intValueEClass.getESuperTypes().add(this.getValue());
    doubleValueEClass.getESuperTypes().add(this.getValue());
    stringValueEClass.getESuperTypes().add(this.getValue());
    booleanValueEClass.getESuperTypes().add(this.getValue());
    enumValueEClass.getESuperTypes().add(this.getValue());
    labelEClass.getESuperTypes().add(this.getConnectableElement());
    imageEClass.getESuperTypes().add(this.getConnectableElement());
    colorFeatureEClass.getESuperTypes().add(this.getFeature());
    foregroundEClass.getESuperTypes().add(this.getFeature());
    foregroundEClass.getESuperTypes().add(this.getColorFeature());
    backgroundEClass.getESuperTypes().add(this.getFeature());
    backgroundEClass.getESuperTypes().add(this.getColorFeature());
    transparencyEClass.getESuperTypes().add(this.getFeature());
    sizeEClass.getESuperTypes().add(this.getFeature());
    pointEClass.getESuperTypes().add(this.getFeature());
    positionEClass.getESuperTypes().add(this.getFeature());
    cornerEClass.getESuperTypes().add(this.getFeature());
    textValueEClass.getESuperTypes().add(this.getFeature());
    fontFaceEClass.getESuperTypes().add(this.getFeature());
    fontSizeEClass.getESuperTypes().add(this.getFeature());
    fontStyleEClass.getESuperTypes().add(this.getFeature());
    lineStyleEClass.getESuperTypes().add(this.getFeature());
    lineWidthEClass.getESuperTypes().add(this.getFeature());

    // Initialize classes and features; add operations and parameters
    initEClass(xDiagramEClass, XDiagram.class, "XDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXDiagram_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Imports(), this.getImportStatement(), null, "imports", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_ModelClass(), ecorePackage.getEClass(), null, "modelClass", null, 0, 1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Nodes(), this.getNode(), null, "nodes", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Links(), this.getLink(), null, "links", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Styles(), this.getStyle(), null, "styles", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Colors(), this.getCustomColor(), null, "colors", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Images(), this.getImageFile(), null, "images", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportStatement_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyle_Features(), this.getFeature(), null, "features", null, 0, -1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagramElement_ModelClass(), ecorePackage.getEClass(), null, "modelClass", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagramElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Resizable(), ecorePackage.getEBoolean(), "resizable", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_MainFigure(), this.getConnectableElement(), null, "mainFigure", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Anchors(), this.getAnchor(), null, "anchors", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Key(), ecorePackage.getEString(), "key", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Value(), this.getAtributeValue(), null, "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeContainerEClass, NodeContainer.class, "NodeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeContainer_Layout(), this.getContainerLayout(), "layout", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeContainer_ModelReference(), ecorePackage.getEReference(), null, "modelReference", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeContainer_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeContainer_Format(), ecorePackage.getEString(), "format", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeContainer_Figures(), this.getConnectableElement(), null, "figures", null, 0, -1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_ModelReference(), ecorePackage.getEReference(), null, "modelReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Complex(), ecorePackage.getEBoolean(), "complex", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_SourceReference(), ecorePackage.getEReference(), null, "sourceReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_TargetReference(), ecorePackage.getEReference(), null, "targetReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Manhattan(), ecorePackage.getEBoolean(), "manhattan", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Decorators(), this.getDecorator(), null, "decorators", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decoratorEClass, Decorator.class, "Decorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecorator_Position(), ecorePackage.getEInt(), "position", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecorator_Source(), ecorePackage.getEBoolean(), "source", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecorator_Target(), ecorePackage.getEBoolean(), "target", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecorator_Middle(), ecorePackage.getEBoolean(), "middle", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorator_StaticElement(), this.getConnectableElement(), null, "staticElement", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorator_Label(), this.getLabel(), null, "label", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnectableElement_Children(), this.getConnectableElement(), null, "children", null, 0, -1, ConnectableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anchorEClass, Anchor.class, "Anchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnchor_Object(), ecorePackage.getEString(), "object", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchor_PassX(), ecorePackage.getEString(), "passX", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchor_X(), ecorePackage.getEInt(), "X", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchor_FormatX(), ecorePackage.getEString(), "formatX", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchor_PassY(), ecorePackage.getEString(), "passY", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchor_Y(), ecorePackage.getEInt(), "Y", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchor_FormatY(), ecorePackage.getEString(), "formatY", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnchor_Figures(), this.getConnectableElement(), null, "figures", null, 0, -1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnchor_Constraints(), this.getAnchorConstraint(), null, "constraints", null, 0, -1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anchorConstraintEClass, AnchorConstraint.class, "AnchorConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnchorConstraint_Type(), this.getAnchorConstraintType(), "type", null, 0, 1, AnchorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchorConstraint_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, AnchorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnchorConstraint_Max(), ecorePackage.getEInt(), "max", null, 0, 1, AnchorConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElement_Features(), this.getFeature(), null, "features", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rgbEClass, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, "RGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGB_R(), ecorePackage.getEInt(), "R", null, 0, 1, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_G(), ecorePackage.getEInt(), "G", null, 0, 1, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_B(), ecorePackage.getEInt(), "B", null, 0, 1, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageFileEClass, ImageFile.class, "ImageFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageFile_Src(), ecorePackage.getEString(), "src", null, 0, 1, ImageFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_Default(), this.getDefaultColor(), "default", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColor_Custom(), this.getCustomColor(), null, "custom", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customColorEClass, CustomColor.class, "CustomColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustomColor_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomColor_Rgb(), this.getRGB(), null, "rgb", null, 0, 1, CustomColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRectangle_Rectangle(), ecorePackage.getEBoolean(), "rectangle", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRectangle_Square(), ecorePackage.getEBoolean(), "square", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_Conditional(), this.getFeatureConditional(), null, "conditional", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rhombusEClass, Rhombus.class, "Rhombus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEllipse_Ellipse(), ecorePackage.getEBoolean(), "ellipse", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEllipse_Circle(), ecorePackage.getEBoolean(), "circle", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolyline_Polygon(), ecorePackage.getEBoolean(), "polygon", null, 0, 1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolyline_Polyline(), ecorePackage.getEBoolean(), "polyline", null, 0, 1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureConditionalEClass, FeatureConditional.class, "FeatureConditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureConditional_ModelAttribute(), ecorePackage.getEAttribute(), null, "modelAttribute", null, 0, 1, FeatureConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureConditional_Operator(), this.getOperator(), "operator", null, 0, 1, FeatureConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureConditional_Value(), this.getValue(), null, "value", null, 0, 1, FeatureConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContains_ModelReference(), ecorePackage.getEReference(), null, "modelReference", null, 0, 1, Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleValueEClass, DoubleValue.class, "DoubleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleValue_ValueInt(), ecorePackage.getEInt(), "valueInt", null, 0, 1, DoubleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDoubleValue_ValueDecimal(), ecorePackage.getEInt(), "valueDecimal", null, 0, 1, DoubleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringValue_Null(), ecorePackage.getEBoolean(), "null", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValue_Value(), this.getBooleanLiteral(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributeValueEClass, AtributeValue.class, "AtributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributeValue_ValueINT(), ecorePackage.getEInt(), "valueINT", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueDEC(), ecorePackage.getEInt(), "valueDEC", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueID(), ecorePackage.getEString(), "valueID", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueBOOL(), ecorePackage.getEString(), "valueBOOL", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueSTRING(), ecorePackage.getEString(), "valueSTRING", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueDAY(), ecorePackage.getEInt(), "valueDAY", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueMONTH(), ecorePackage.getEInt(), "valueMONTH", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueYEAR(), ecorePackage.getEInt(), "valueYEAR", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImage_Image(), this.getImageFile(), null, "image", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFeatureEClass, ColorFeature.class, "ColorFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorFeature_Color(), this.getColor(), null, "color", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foregroundEClass, Foreground.class, "Foreground", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(backgroundEClass, Background.class, "Background", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transparencyEClass, Transparency.class, "Transparency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransparency_Percent(), ecorePackage.getEString(), "percent", null, 0, 1, Transparency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSize_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSize_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPosition_X(), ecorePackage.getEInt(), "x", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPosition_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCorner_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, Corner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textValueEClass, TextValue.class, "TextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextValue_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextValue_ModelAttribute(), ecorePackage.getEAttribute(), null, "modelAttribute", null, 0, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontFaceEClass, FontFace.class, "FontFace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontFace_Face(), this.getFontFaceType(), "face", null, 0, 1, FontFace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontSizeEClass, FontSize.class, "FontSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontSize_Size(), ecorePackage.getEInt(), "size", null, 0, 1, FontSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontStyleEClass, FontStyle.class, "FontStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFontStyle_Styles(), this.getFontStyleType(), "styles", null, 0, -1, FontStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineStyle_Style(), this.getLineType(), "style", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineWidthEClass, LineWidth.class, "LineWidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineWidth_Width(), ecorePackage.getEInt(), "width", null, 0, 1, LineWidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(containerLayoutEEnum, ContainerLayout.class, "ContainerLayout");
    addEEnumLiteral(containerLayoutEEnum, ContainerLayout.STACK);
    addEEnumLiteral(containerLayoutEEnum, ContainerLayout.FREE);

    initEEnum(anchorConstraintTypeEEnum, AnchorConstraintType.class, "AnchorConstraintType");
    addEEnumLiteral(anchorConstraintTypeEEnum, AnchorConstraintType.INCOMING);
    addEEnumLiteral(anchorConstraintTypeEEnum, AnchorConstraintType.OUTGOING);

    initEEnum(defaultColorEEnum, DefaultColor.class, "DefaultColor");
    addEEnumLiteral(defaultColorEEnum, DefaultColor.RED);
    addEEnumLiteral(defaultColorEEnum, DefaultColor.BLUE);
    addEEnumLiteral(defaultColorEEnum, DefaultColor.YELLOW);

    initEEnum(operatorEEnum, Operator.class, "Operator");
    addEEnumLiteral(operatorEEnum, Operator.EQUAL);
    addEEnumLiteral(operatorEEnum, Operator.DIFFERENT);

    initEEnum(booleanLiteralEEnum, BooleanLiteral.class, "BooleanLiteral");
    addEEnumLiteral(booleanLiteralEEnum, BooleanLiteral.TRUE);
    addEEnumLiteral(booleanLiteralEEnum, BooleanLiteral.FALSE);

    initEEnum(fontFaceTypeEEnum, FontFaceType.class, "FontFaceType");
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.ARIAL);
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.VERDANA);
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.TIMES);
    addEEnumLiteral(fontFaceTypeEEnum, FontFaceType.COURIER);

    initEEnum(fontStyleTypeEEnum, FontStyleType.class, "FontStyleType");
    addEEnumLiteral(fontStyleTypeEEnum, FontStyleType.ITALICS);
    addEEnumLiteral(fontStyleTypeEEnum, FontStyleType.BOLD);
    addEEnumLiteral(fontStyleTypeEEnum, FontStyleType.UNDERLINE);

    initEEnum(lineTypeEEnum, LineType.class, "LineType");
    addEEnumLiteral(lineTypeEEnum, LineType.SOLID);
    addEEnumLiteral(lineTypeEEnum, LineType.DASH);

    // Create resource
    createResource(eNS_URI);
  }

} //XdiagramPackageImpl
