/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Connectable Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connectable Element</em>'.
   * @generated
   */
  ConnectableElement createConnectableElement();

  /**
   * Returns a new object of class '<em>RGB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RGB</em>'.
   * @generated
   */
  RGB createRGB();

  /**
   * Returns a new object of class '<em>Image File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image File</em>'.
   * @generated
   */
  ImageFile createImageFile();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>Custom Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Color</em>'.
   * @generated
   */
  CustomColor createCustomColor();

  /**
   * Returns a new object of class '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rectangle</em>'.
   * @generated
   */
  Rectangle createRectangle();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

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
   * Returns a new object of class '<em>Polygon</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polygon</em>'.
   * @generated
   */
  Polygon createPolygon();

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
   * Returns a new object of class '<em>Link Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link Element</em>'.
   * @generated
   */
  LinkElement createLinkElement();

  /**
   * Returns a new object of class '<em>Color Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Feature</em>'.
   * @generated
   */
  ColorFeature createColorFeature();

  /**
   * Returns a new object of class '<em>Foreground</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreground</em>'.
   * @generated
   */
  Foreground createForeground();

  /**
   * Returns a new object of class '<em>Background</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Background</em>'.
   * @generated
   */
  Background createBackground();

  /**
   * Returns a new object of class '<em>Border</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Border</em>'.
   * @generated
   */
  Border createBorder();

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
  MyDslPackage getMyDslPackage();

} //MyDslFactory
