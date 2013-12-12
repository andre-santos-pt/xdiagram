/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ArrowAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Attribute;
import org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ContainerLayout;
import org.eclipselabs.xdiagram.xtext.xdiagram.Decorator;
import org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement;
import org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures;
import org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape;
import org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement;
import org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LayoutFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Link;
import org.eclipselabs.xdiagram.xtext.xdiagram.Node;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeAnchor;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeContainer;
import org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.StaticFigure;
import org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature;
import org.eclipselabs.xdiagram.xtext.xdiagram.Style;
import org.eclipselabs.xdiagram.xtext.xdiagram.StyleFeature;
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
  private EClass nodeFigureEClass = null;

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
  private EClass dynamicFigureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticFigureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeAnchorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowAnchorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass figureFeaturesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centerFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alignFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gradientFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionFeatureEClass = null;

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
  private EClass rgbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributeExpressionEClass = null;

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
  private EEnum containerLayoutEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum figureShapeEEnum = null;

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
  public EReference getXDiagram_Styles()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Nodes()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDiagram_Links()
  {
    return (EReference)xDiagramEClass.getEStructuralFeatures().get(5);
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
  public EReference getNode_Figures()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Containers()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Anchors()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(3);
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
  public EClass getNodeFigure()
  {
    return nodeFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeFigure_Option()
  {
    return (EAttribute)nodeFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeFigure_Figure()
  {
    return (EAttribute)nodeFigureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeFigure_Style()
  {
    return (EAttribute)nodeFigureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeFigure_Features()
  {
    return (EReference)nodeFigureEClass.getEStructuralFeatures().get(3);
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
  public EReference getLink_Linefeatures()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Colorfeatures()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Integerfeatures()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Decorators()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(8);
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
  public EAttribute getDecorator_Pos()
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
  public EReference getDecorator_PlacingStatic()
  {
    return (EReference)decoratorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecorator_PlacingDynamic()
  {
    return (EReference)decoratorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicFigure()
  {
    return dynamicFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDynamicFigure_Figure()
  {
    return (EAttribute)dynamicFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDynamicFigure_Features()
  {
    return (EReference)dynamicFigureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticFigure()
  {
    return staticFigureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticFigure_Figure()
  {
    return (EAttribute)staticFigureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticFigure_Style()
  {
    return (EAttribute)staticFigureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticFigure_Features()
  {
    return (EReference)staticFigureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeAnchor()
  {
    return nodeAnchorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_Object()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_PassX()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_X()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_FormatX()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_PassY()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_Y()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeAnchor_FormatY()
  {
    return (EAttribute)nodeAnchorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeAnchor_Figures()
  {
    return (EReference)nodeAnchorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeAnchor_Arrows()
  {
    return (EReference)nodeAnchorEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrowAnchor()
  {
    return arrowAnchorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowAnchor_Reference()
  {
    return (EAttribute)arrowAnchorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowAnchor_Type()
  {
    return (EAttribute)arrowAnchorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowAnchor_N()
  {
    return (EAttribute)arrowAnchorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFigureFeatures()
  {
    return figureFeaturesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Linefeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Centerfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Alignfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Gradientfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Pointfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Sizefeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Positionfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Colorfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Integerfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Booleanfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigureFeatures_Stringfeatures()
  {
    return (EReference)figureFeaturesEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyleFeature()
  {
    return styleFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyleFeature_Key()
  {
    return (EAttribute)styleFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyleFeature_Value()
  {
    return (EAttribute)styleFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutFeature()
  {
    return layoutFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCenterFeature()
  {
    return centerFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlignFeature()
  {
    return alignFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlignFeature_Key()
  {
    return (EAttribute)alignFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlignFeature_Value()
  {
    return (EAttribute)alignFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGradientFeature()
  {
    return gradientFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradientFeature_Key()
  {
    return (EAttribute)gradientFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGradientFeature_Value()
  {
    return (EAttribute)gradientFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointFeature()
  {
    return pointFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointFeature_X()
  {
    return (EAttribute)pointFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPointFeature_Y()
  {
    return (EAttribute)pointFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeFeature()
  {
    return sizeFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeFeature_Width()
  {
    return (EAttribute)sizeFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeFeature_Height()
  {
    return (EAttribute)sizeFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositionFeature()
  {
    return positionFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPositionFeature_X()
  {
    return (EAttribute)positionFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPositionFeature_Y()
  {
    return (EAttribute)positionFeatureEClass.getEStructuralFeatures().get(1);
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
  public EReference getColorFeature_Expression()
  {
    return (EReference)colorFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Key()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Value()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFeature_Rgb()
  {
    return (EReference)colorFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Atribute()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Operator()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Option()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(6);
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
  public EClass getIntegerFeature()
  {
    return integerFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerFeature_Expression()
  {
    return (EReference)integerFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerFeature_Key()
  {
    return (EAttribute)integerFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerFeature_Value()
  {
    return (EAttribute)integerFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringFeature()
  {
    return stringFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringFeature_Expression()
  {
    return (EReference)stringFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringFeature_Key()
  {
    return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringFeature_Value()
  {
    return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringFeature_ValueL()
  {
    return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringFeature_Attribute()
  {
    return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringFeature_ValueR()
  {
    return (EAttribute)stringFeatureEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanFeature()
  {
    return booleanFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanFeature_Expression()
  {
    return (EReference)booleanFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanFeature_Key()
  {
    return (EAttribute)booleanFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanFeature_Value()
  {
    return (EAttribute)booleanFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineFeature()
  {
    return lineFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLineFeature_Expression()
  {
    return (EReference)lineFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineFeature_Key()
  {
    return (EAttribute)lineFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineFeature_Value()
  {
    return (EAttribute)lineFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributeExpression()
  {
    return atributeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeExpression_Key()
  {
    return (EAttribute)atributeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributeExpression_Operator()
  {
    return (EAttribute)atributeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtributeExpression_Value()
  {
    return (EReference)atributeExpressionEClass.getEStructuralFeatures().get(2);
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
  public EEnum getContainerLayout()
  {
    return containerLayoutEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFigureShape()
  {
    return figureShapeEEnum;
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
    createEReference(xDiagramEClass, XDIAGRAM__STYLES);
    createEReference(xDiagramEClass, XDIAGRAM__NODES);
    createEReference(xDiagramEClass, XDIAGRAM__LINKS);

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
    createEReference(nodeEClass, NODE__FIGURES);
    createEReference(nodeEClass, NODE__CONTAINERS);
    createEReference(nodeEClass, NODE__ANCHORS);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__KEY);
    createEReference(attributeEClass, ATTRIBUTE__VALUE);

    nodeFigureEClass = createEClass(NODE_FIGURE);
    createEAttribute(nodeFigureEClass, NODE_FIGURE__OPTION);
    createEAttribute(nodeFigureEClass, NODE_FIGURE__FIGURE);
    createEAttribute(nodeFigureEClass, NODE_FIGURE__STYLE);
    createEReference(nodeFigureEClass, NODE_FIGURE__FEATURES);

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
    createEReference(linkEClass, LINK__LINEFEATURES);
    createEReference(linkEClass, LINK__COLORFEATURES);
    createEReference(linkEClass, LINK__INTEGERFEATURES);
    createEReference(linkEClass, LINK__DECORATORS);

    decoratorEClass = createEClass(DECORATOR);
    createEAttribute(decoratorEClass, DECORATOR__POS);
    createEAttribute(decoratorEClass, DECORATOR__SOURCE);
    createEAttribute(decoratorEClass, DECORATOR__TARGET);
    createEAttribute(decoratorEClass, DECORATOR__MIDDLE);
    createEReference(decoratorEClass, DECORATOR__PLACING_STATIC);
    createEReference(decoratorEClass, DECORATOR__PLACING_DYNAMIC);

    dynamicFigureEClass = createEClass(DYNAMIC_FIGURE);
    createEAttribute(dynamicFigureEClass, DYNAMIC_FIGURE__FIGURE);
    createEReference(dynamicFigureEClass, DYNAMIC_FIGURE__FEATURES);

    staticFigureEClass = createEClass(STATIC_FIGURE);
    createEAttribute(staticFigureEClass, STATIC_FIGURE__FIGURE);
    createEAttribute(staticFigureEClass, STATIC_FIGURE__STYLE);
    createEReference(staticFigureEClass, STATIC_FIGURE__FEATURES);

    nodeAnchorEClass = createEClass(NODE_ANCHOR);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__OBJECT);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__PASS_X);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__X);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__FORMAT_X);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__PASS_Y);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__Y);
    createEAttribute(nodeAnchorEClass, NODE_ANCHOR__FORMAT_Y);
    createEReference(nodeAnchorEClass, NODE_ANCHOR__FIGURES);
    createEReference(nodeAnchorEClass, NODE_ANCHOR__ARROWS);

    arrowAnchorEClass = createEClass(ARROW_ANCHOR);
    createEAttribute(arrowAnchorEClass, ARROW_ANCHOR__REFERENCE);
    createEAttribute(arrowAnchorEClass, ARROW_ANCHOR__TYPE);
    createEAttribute(arrowAnchorEClass, ARROW_ANCHOR__N);

    figureFeaturesEClass = createEClass(FIGURE_FEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__LINEFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__CENTERFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__ALIGNFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__GRADIENTFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__POINTFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__SIZEFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__POSITIONFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__COLORFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__INTEGERFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__BOOLEANFEATURES);
    createEReference(figureFeaturesEClass, FIGURE_FEATURES__STRINGFEATURES);

    styleFeatureEClass = createEClass(STYLE_FEATURE);
    createEAttribute(styleFeatureEClass, STYLE_FEATURE__KEY);
    createEAttribute(styleFeatureEClass, STYLE_FEATURE__VALUE);

    layoutFeatureEClass = createEClass(LAYOUT_FEATURE);

    centerFeatureEClass = createEClass(CENTER_FEATURE);

    alignFeatureEClass = createEClass(ALIGN_FEATURE);
    createEAttribute(alignFeatureEClass, ALIGN_FEATURE__KEY);
    createEAttribute(alignFeatureEClass, ALIGN_FEATURE__VALUE);

    gradientFeatureEClass = createEClass(GRADIENT_FEATURE);
    createEAttribute(gradientFeatureEClass, GRADIENT_FEATURE__KEY);
    createEAttribute(gradientFeatureEClass, GRADIENT_FEATURE__VALUE);

    pointFeatureEClass = createEClass(POINT_FEATURE);
    createEAttribute(pointFeatureEClass, POINT_FEATURE__X);
    createEAttribute(pointFeatureEClass, POINT_FEATURE__Y);

    sizeFeatureEClass = createEClass(SIZE_FEATURE);
    createEAttribute(sizeFeatureEClass, SIZE_FEATURE__WIDTH);
    createEAttribute(sizeFeatureEClass, SIZE_FEATURE__HEIGHT);

    positionFeatureEClass = createEClass(POSITION_FEATURE);
    createEAttribute(positionFeatureEClass, POSITION_FEATURE__X);
    createEAttribute(positionFeatureEClass, POSITION_FEATURE__Y);

    colorFeatureEClass = createEClass(COLOR_FEATURE);
    createEReference(colorFeatureEClass, COLOR_FEATURE__EXPRESSION);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__KEY);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__VALUE);
    createEReference(colorFeatureEClass, COLOR_FEATURE__RGB);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__ATRIBUTE);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__OPERATOR);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__OPTION);

    rgbEClass = createEClass(RGB);
    createEAttribute(rgbEClass, RGB__R);
    createEAttribute(rgbEClass, RGB__G);
    createEAttribute(rgbEClass, RGB__B);

    integerFeatureEClass = createEClass(INTEGER_FEATURE);
    createEReference(integerFeatureEClass, INTEGER_FEATURE__EXPRESSION);
    createEAttribute(integerFeatureEClass, INTEGER_FEATURE__KEY);
    createEAttribute(integerFeatureEClass, INTEGER_FEATURE__VALUE);

    stringFeatureEClass = createEClass(STRING_FEATURE);
    createEReference(stringFeatureEClass, STRING_FEATURE__EXPRESSION);
    createEAttribute(stringFeatureEClass, STRING_FEATURE__KEY);
    createEAttribute(stringFeatureEClass, STRING_FEATURE__VALUE);
    createEAttribute(stringFeatureEClass, STRING_FEATURE__VALUE_L);
    createEAttribute(stringFeatureEClass, STRING_FEATURE__ATTRIBUTE);
    createEAttribute(stringFeatureEClass, STRING_FEATURE__VALUE_R);

    booleanFeatureEClass = createEClass(BOOLEAN_FEATURE);
    createEReference(booleanFeatureEClass, BOOLEAN_FEATURE__EXPRESSION);
    createEAttribute(booleanFeatureEClass, BOOLEAN_FEATURE__KEY);
    createEAttribute(booleanFeatureEClass, BOOLEAN_FEATURE__VALUE);

    lineFeatureEClass = createEClass(LINE_FEATURE);
    createEReference(lineFeatureEClass, LINE_FEATURE__EXPRESSION);
    createEAttribute(lineFeatureEClass, LINE_FEATURE__KEY);
    createEAttribute(lineFeatureEClass, LINE_FEATURE__VALUE);

    atributeExpressionEClass = createEClass(ATRIBUTE_EXPRESSION);
    createEAttribute(atributeExpressionEClass, ATRIBUTE_EXPRESSION__KEY);
    createEAttribute(atributeExpressionEClass, ATRIBUTE_EXPRESSION__OPERATOR);
    createEReference(atributeExpressionEClass, ATRIBUTE_EXPRESSION__VALUE);

    atributeValueEClass = createEClass(ATRIBUTE_VALUE);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_INT);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_DEC);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_ID);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_BOOL);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_STRING);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_DAY);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_MONTH);
    createEAttribute(atributeValueEClass, ATRIBUTE_VALUE__VALUE_YEAR);

    // Create enums
    containerLayoutEEnum = createEEnum(CONTAINER_LAYOUT);
    figureShapeEEnum = createEEnum(FIGURE_SHAPE);
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
    layoutFeatureEClass.getESuperTypes().add(this.getStyleFeature());
    centerFeatureEClass.getESuperTypes().add(this.getStyleFeature());

    // Initialize classes and features; add operations and parameters
    initEClass(xDiagramEClass, XDiagram.class, "XDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXDiagram_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Imports(), this.getImportStatement(), null, "imports", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_ModelClass(), ecorePackage.getEClass(), null, "modelClass", null, 0, 1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Styles(), this.getStyle(), null, "styles", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Nodes(), this.getNode(), null, "nodes", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXDiagram_Links(), this.getLink(), null, "links", null, 0, -1, XDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportStatement_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyle_Features(), this.getFigureFeatures(), null, "features", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(diagramElementEClass, DiagramElement.class, "DiagramElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagramElement_ModelClass(), ecorePackage.getEClass(), null, "modelClass", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiagramElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagramElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DiagramElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Resizable(), ecorePackage.getEBoolean(), "resizable", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Figures(), this.getNodeFigure(), null, "figures", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Containers(), this.getNodeContainer(), null, "containers", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Anchors(), this.getNodeAnchor(), null, "anchors", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Key(), ecorePackage.getEString(), "key", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Value(), this.getAtributeValue(), null, "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeFigureEClass, NodeFigure.class, "NodeFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeFigure_Option(), ecorePackage.getEString(), "option", null, 0, 1, NodeFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeFigure_Figure(), this.getFigureShape(), "figure", null, 0, 1, NodeFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeFigure_Style(), ecorePackage.getEString(), "style", null, 0, 1, NodeFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeFigure_Features(), this.getFigureFeatures(), null, "features", null, 0, 1, NodeFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeContainerEClass, NodeContainer.class, "NodeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeContainer_Layout(), this.getContainerLayout(), "layout", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeContainer_ModelReference(), ecorePackage.getEReference(), null, "modelReference", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeContainer_Value(), ecorePackage.getEInt(), "value", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeContainer_Format(), ecorePackage.getEString(), "format", null, 0, 1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeContainer_Figures(), this.getNodeFigure(), null, "figures", null, 0, -1, NodeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLink_ModelReference(), ecorePackage.getEReference(), null, "modelReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Complex(), ecorePackage.getEBoolean(), "complex", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_SourceReference(), ecorePackage.getEReference(), null, "sourceReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_TargetReference(), ecorePackage.getEReference(), null, "targetReference", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Manhattan(), ecorePackage.getEBoolean(), "manhattan", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Linefeatures(), this.getLineFeature(), null, "linefeatures", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Colorfeatures(), this.getColorFeature(), null, "colorfeatures", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Integerfeatures(), this.getIntegerFeature(), null, "integerfeatures", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Decorators(), this.getDecorator(), null, "decorators", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decoratorEClass, Decorator.class, "Decorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecorator_Pos(), ecorePackage.getEInt(), "pos", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecorator_Source(), ecorePackage.getEBoolean(), "source", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecorator_Target(), ecorePackage.getEBoolean(), "target", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecorator_Middle(), ecorePackage.getEBoolean(), "middle", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorator_PlacingStatic(), this.getStaticFigure(), null, "placingStatic", null, 0, 1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecorator_PlacingDynamic(), this.getDynamicFigure(), null, "placingDynamic", null, 0, -1, Decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dynamicFigureEClass, DynamicFigure.class, "DynamicFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDynamicFigure_Figure(), ecorePackage.getEString(), "figure", null, 0, 1, DynamicFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDynamicFigure_Features(), this.getFigureFeatures(), null, "features", null, 0, 1, DynamicFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticFigureEClass, StaticFigure.class, "StaticFigure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStaticFigure_Figure(), ecorePackage.getEString(), "figure", null, 0, 1, StaticFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStaticFigure_Style(), ecorePackage.getEString(), "style", null, 0, 1, StaticFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStaticFigure_Features(), this.getFigureFeatures(), null, "features", null, 0, 1, StaticFigure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeAnchorEClass, NodeAnchor.class, "NodeAnchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeAnchor_Object(), ecorePackage.getEString(), "object", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeAnchor_PassX(), ecorePackage.getEString(), "passX", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeAnchor_X(), ecorePackage.getEInt(), "X", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeAnchor_FormatX(), ecorePackage.getEString(), "formatX", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeAnchor_PassY(), ecorePackage.getEString(), "passY", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeAnchor_Y(), ecorePackage.getEInt(), "Y", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeAnchor_FormatY(), ecorePackage.getEString(), "formatY", null, 0, 1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeAnchor_Figures(), this.getNodeFigure(), null, "figures", null, 0, -1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeAnchor_Arrows(), this.getArrowAnchor(), null, "arrows", null, 0, -1, NodeAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrowAnchorEClass, ArrowAnchor.class, "ArrowAnchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrowAnchor_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ArrowAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrowAnchor_Type(), ecorePackage.getEString(), "type", null, 0, 1, ArrowAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrowAnchor_N(), ecorePackage.getEInt(), "N", null, 0, 1, ArrowAnchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(figureFeaturesEClass, FigureFeatures.class, "FigureFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFigureFeatures_Linefeatures(), this.getLineFeature(), null, "linefeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Centerfeatures(), this.getCenterFeature(), null, "centerfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Alignfeatures(), this.getAlignFeature(), null, "alignfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Gradientfeatures(), this.getGradientFeature(), null, "gradientfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Pointfeatures(), this.getPointFeature(), null, "pointfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Sizefeatures(), this.getSizeFeature(), null, "sizefeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Positionfeatures(), this.getPositionFeature(), null, "positionfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Colorfeatures(), this.getColorFeature(), null, "colorfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Integerfeatures(), this.getIntegerFeature(), null, "integerfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Booleanfeatures(), this.getBooleanFeature(), null, "booleanfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFigureFeatures_Stringfeatures(), this.getStringFeature(), null, "stringfeatures", null, 0, -1, FigureFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleFeatureEClass, StyleFeature.class, "StyleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStyleFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, StyleFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStyleFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, StyleFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutFeatureEClass, LayoutFeature.class, "LayoutFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(centerFeatureEClass, CenterFeature.class, "CenterFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alignFeatureEClass, AlignFeature.class, "AlignFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlignFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, AlignFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlignFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, AlignFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gradientFeatureEClass, GradientFeature.class, "GradientFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGradientFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, GradientFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGradientFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, GradientFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointFeatureEClass, PointFeature.class, "PointFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPointFeature_X(), ecorePackage.getEInt(), "X", null, 0, 1, PointFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPointFeature_Y(), ecorePackage.getEInt(), "Y", null, 0, 1, PointFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeFeatureEClass, SizeFeature.class, "SizeFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSizeFeature_Width(), ecorePackage.getEInt(), "Width", null, 0, 1, SizeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSizeFeature_Height(), ecorePackage.getEInt(), "Height", null, 0, 1, SizeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positionFeatureEClass, PositionFeature.class, "PositionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPositionFeature_X(), ecorePackage.getEInt(), "X", null, 0, 1, PositionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPositionFeature_Y(), ecorePackage.getEInt(), "Y", null, 0, 1, PositionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFeatureEClass, ColorFeature.class, "ColorFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorFeature_Expression(), this.getAtributeExpression(), null, "expression", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorFeature_Rgb(), this.getRGB(), null, "rgb", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFeature_Atribute(), ecorePackage.getEString(), "atribute", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFeature_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFeature_Option(), ecorePackage.getEString(), "option", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rgbEClass, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, "RGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGB_R(), ecorePackage.getEInt(), "R", null, 0, 1, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_G(), ecorePackage.getEInt(), "G", null, 0, 1, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGB_B(), ecorePackage.getEInt(), "B", null, 0, 1, org.eclipselabs.xdiagram.xtext.xdiagram.RGB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerFeatureEClass, IntegerFeature.class, "IntegerFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerFeature_Expression(), this.getAtributeExpression(), null, "expression", null, 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerFeature_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringFeatureEClass, StringFeature.class, "StringFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringFeature_Expression(), this.getAtributeExpression(), null, "expression", null, 0, 1, StringFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, StringFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringFeature_ValueL(), ecorePackage.getEString(), "valueL", null, 0, 1, StringFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringFeature_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, StringFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringFeature_ValueR(), ecorePackage.getEString(), "valueR", null, 0, 1, StringFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanFeatureEClass, BooleanFeature.class, "BooleanFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanFeature_Expression(), this.getAtributeExpression(), null, "expression", null, 0, 1, BooleanFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, BooleanFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, BooleanFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineFeatureEClass, LineFeature.class, "LineFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLineFeature_Expression(), this.getAtributeExpression(), null, "expression", null, 0, 1, LineFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineFeature_Key(), ecorePackage.getEString(), "key", null, 0, 1, LineFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, LineFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributeExpressionEClass, AtributeExpression.class, "AtributeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributeExpression_Key(), ecorePackage.getEString(), "key", null, 0, 1, AtributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, AtributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtributeExpression_Value(), this.getAtributeValue(), null, "value", null, 0, 1, AtributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributeValueEClass, AtributeValue.class, "AtributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributeValue_ValueINT(), ecorePackage.getEInt(), "valueINT", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueDEC(), ecorePackage.getEInt(), "valueDEC", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueID(), ecorePackage.getEString(), "valueID", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueBOOL(), ecorePackage.getEString(), "valueBOOL", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueSTRING(), ecorePackage.getEString(), "valueSTRING", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueDAY(), ecorePackage.getEInt(), "valueDAY", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueMONTH(), ecorePackage.getEInt(), "valueMONTH", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributeValue_ValueYEAR(), ecorePackage.getEInt(), "valueYEAR", null, 0, 1, AtributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(containerLayoutEEnum, ContainerLayout.class, "ContainerLayout");
    addEEnumLiteral(containerLayoutEEnum, ContainerLayout.STACK);
    addEEnumLiteral(containerLayoutEEnum, ContainerLayout.FREE);

    initEEnum(figureShapeEEnum, FigureShape.class, "FigureShape");
    addEEnumLiteral(figureShapeEEnum, FigureShape.SQUARE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.RECTANGLE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.ROUNDED_RECTANGLE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.CIRCLE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.ELLIPSE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.TRIANGLE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.RHOMBUS);
    addEEnumLiteral(figureShapeEEnum, FigureShape.POLYGON);
    addEEnumLiteral(figureShapeEEnum, FigureShape.POLYLINE);
    addEEnumLiteral(figureShapeEEnum, FigureShape.LABEL);
    addEEnumLiteral(figureShapeEEnum, FigureShape.IMAGE);

    // Create resource
    createResource(eNS_URI);
  }

} //XdiagramPackageImpl
