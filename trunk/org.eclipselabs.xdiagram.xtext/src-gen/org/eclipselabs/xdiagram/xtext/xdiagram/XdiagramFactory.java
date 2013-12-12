/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage
 * @generated
 */
public interface XdiagramFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XdiagramFactory eINSTANCE = org.eclipselabs.xdiagram.xtext.xdiagram.impl.XdiagramFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XDiagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDiagram</em>'.
   * @generated
   */
  XDiagram createXDiagram();

  /**
   * Returns a new object of class '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Statement</em>'.
   * @generated
   */
  ImportStatement createImportStatement();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>Diagram Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram Element</em>'.
   * @generated
   */
  DiagramElement createDiagramElement();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Node Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Figure</em>'.
   * @generated
   */
  NodeFigure createNodeFigure();

  /**
   * Returns a new object of class '<em>Node Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Container</em>'.
   * @generated
   */
  NodeContainer createNodeContainer();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Decorator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decorator</em>'.
   * @generated
   */
  Decorator createDecorator();

  /**
   * Returns a new object of class '<em>Dynamic Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Figure</em>'.
   * @generated
   */
  DynamicFigure createDynamicFigure();

  /**
   * Returns a new object of class '<em>Static Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Figure</em>'.
   * @generated
   */
  StaticFigure createStaticFigure();

  /**
   * Returns a new object of class '<em>Node Anchor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Anchor</em>'.
   * @generated
   */
  NodeAnchor createNodeAnchor();

  /**
   * Returns a new object of class '<em>Arrow Anchor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrow Anchor</em>'.
   * @generated
   */
  ArrowAnchor createArrowAnchor();

  /**
   * Returns a new object of class '<em>Figure Features</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Figure Features</em>'.
   * @generated
   */
  FigureFeatures createFigureFeatures();

  /**
   * Returns a new object of class '<em>Style Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style Feature</em>'.
   * @generated
   */
  StyleFeature createStyleFeature();

  /**
   * Returns a new object of class '<em>Layout Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layout Feature</em>'.
   * @generated
   */
  LayoutFeature createLayoutFeature();

  /**
   * Returns a new object of class '<em>Center Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Center Feature</em>'.
   * @generated
   */
  CenterFeature createCenterFeature();

  /**
   * Returns a new object of class '<em>Align Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Align Feature</em>'.
   * @generated
   */
  AlignFeature createAlignFeature();

  /**
   * Returns a new object of class '<em>Gradient Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gradient Feature</em>'.
   * @generated
   */
  GradientFeature createGradientFeature();

  /**
   * Returns a new object of class '<em>Point Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point Feature</em>'.
   * @generated
   */
  PointFeature createPointFeature();

  /**
   * Returns a new object of class '<em>Size Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Feature</em>'.
   * @generated
   */
  SizeFeature createSizeFeature();

  /**
   * Returns a new object of class '<em>Position Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Position Feature</em>'.
   * @generated
   */
  PositionFeature createPositionFeature();

  /**
   * Returns a new object of class '<em>Color Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Feature</em>'.
   * @generated
   */
  ColorFeature createColorFeature();

  /**
   * Returns a new object of class '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RGB</em>'.
   * @generated
   */
  RGB createRGB();

  /**
   * Returns a new object of class '<em>Integer Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Feature</em>'.
   * @generated
   */
  IntegerFeature createIntegerFeature();

  /**
   * Returns a new object of class '<em>String Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Feature</em>'.
   * @generated
   */
  StringFeature createStringFeature();

  /**
   * Returns a new object of class '<em>Boolean Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Feature</em>'.
   * @generated
   */
  BooleanFeature createBooleanFeature();

  /**
   * Returns a new object of class '<em>Line Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Feature</em>'.
   * @generated
   */
  LineFeature createLineFeature();

  /**
   * Returns a new object of class '<em>Atribute Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atribute Expression</em>'.
   * @generated
   */
  AtributeExpression createAtributeExpression();

  /**
   * Returns a new object of class '<em>Atribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atribute Value</em>'.
   * @generated
   */
  AtributeValue createAtributeValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XdiagramPackage getXdiagramPackage();

} //XdiagramFactory
