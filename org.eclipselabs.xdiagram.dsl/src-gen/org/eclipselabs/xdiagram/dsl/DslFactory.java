/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslFactory eINSTANCE = org.eclipselabs.xdiagram.dsl.impl.DslFactoryImpl.init();

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
   * Returns a new object of class '<em>Diagram</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram</em>'.
   * @generated
   */
  Diagram createDiagram();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Diagram Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagram Element</em>'.
   * @generated
   */
  DiagramElement createDiagramElement();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Feature Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Container</em>'.
   * @generated
   */
  FeatureContainer createFeatureContainer();

  /**
   * Returns a new object of class '<em>Feature Conditional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Conditional</em>'.
   * @generated
   */
  FeatureConditional createFeatureConditional();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

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
   * Returns a new object of class '<em>Connectable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connectable Element</em>'.
   * @generated
   */
  ConnectableElement createConnectableElement();

  /**
   * Returns a new object of class '<em>Anchor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anchor</em>'.
   * @generated
   */
  Anchor createAnchor();

  /**
   * Returns a new object of class '<em>Custom Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Color</em>'.
   * @generated
   */
  CustomColor createCustomColor();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Custom Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Figure</em>'.
   * @generated
   */
  CustomFigure createCustomFigure();

  /**
   * Returns a new object of class '<em>Custom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom</em>'.
   * @generated
   */
  Custom createCustom();

  /**
   * Returns a new object of class '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rectangle</em>'.
   * @generated
   */
  Rectangle createRectangle();

  /**
   * Returns a new object of class '<em>Rhombus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rhombus</em>'.
   * @generated
   */
  Rhombus createRhombus();

  /**
   * Returns a new object of class '<em>Ellipse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ellipse</em>'.
   * @generated
   */
  Ellipse createEllipse();

  /**
   * Returns a new object of class '<em>Polyline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polyline</em>'.
   * @generated
   */
  Polyline createPolyline();

  /**
   * Returns a new object of class '<em>Contains</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contains</em>'.
   * @generated
   */
  Contains createContains();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns a new object of class '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Value</em>'.
   * @generated
   */
  DoubleValue createDoubleValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Value</em>'.
   * @generated
   */
  BooleanValue createBooleanValue();

  /**
   * Returns a new object of class '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Value</em>'.
   * @generated
   */
  EnumValue createEnumValue();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image</em>'.
   * @generated
   */
  Image createImage();

  /**
   * Returns a new object of class '<em>Invisible</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invisible</em>'.
   * @generated
   */
  Invisible createInvisible();

  /**
   * Returns a new object of class '<em>Color Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Feature</em>'.
   * @generated
   */
  ColorFeature createColorFeature();

  /**
   * Returns a new object of class '<em>Transparency</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transparency</em>'.
   * @generated
   */
  Transparency createTransparency();

  /**
   * Returns a new object of class '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size</em>'.
   * @generated
   */
  Size createSize();

  /**
   * Returns a new object of class '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Point</em>'.
   * @generated
   */
  Point createPoint();

  /**
   * Returns a new object of class '<em>Position</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Position</em>'.
   * @generated
   */
  Position createPosition();

  /**
   * Returns a new object of class '<em>Corner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Corner</em>'.
   * @generated
   */
  Corner createCorner();

  /**
   * Returns a new object of class '<em>Text Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Value</em>'.
   * @generated
   */
  TextValue createTextValue();

  /**
   * Returns a new object of class '<em>Font Face</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Face</em>'.
   * @generated
   */
  FontFace createFontFace();

  /**
   * Returns a new object of class '<em>Font Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Size</em>'.
   * @generated
   */
  FontSize createFontSize();

  /**
   * Returns a new object of class '<em>Font Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Style</em>'.
   * @generated
   */
  FontStyle createFontStyle();

  /**
   * Returns a new object of class '<em>Line Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Style</em>'.
   * @generated
   */
  LineStyle createLineStyle();

  /**
   * Returns a new object of class '<em>Line Width</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Width</em>'.
   * @generated
   */
  LineWidth createLineWidth();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslPackage getDslPackage();

} //DslFactory
