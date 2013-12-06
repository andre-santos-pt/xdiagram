/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getLinefeatures <em>Linefeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getCenterfeatures <em>Centerfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getAlignfeatures <em>Alignfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getGradientfeatures <em>Gradientfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getPointfeatures <em>Pointfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getSizefeatures <em>Sizefeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getPositionfeatures <em>Positionfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getColorfeatures <em>Colorfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getIntegerfeatures <em>Integerfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getBooleanfeatures <em>Booleanfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getStringfeatures <em>Stringfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureFeatures#getCustomfeatures <em>Customfeatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures()
 * @model
 * @generated
 */
public interface FigureFeatures extends EObject
{
  /**
   * Returns the value of the '<em><b>Linefeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linefeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linefeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Linefeatures()
   * @model containment="true"
   * @generated
   */
  EList<LineFeature> getLinefeatures();

  /**
   * Returns the value of the '<em><b>Centerfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.CenterFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Centerfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Centerfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Centerfeatures()
   * @model containment="true"
   * @generated
   */
  EList<CenterFeature> getCenterfeatures();

  /**
   * Returns the value of the '<em><b>Alignfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.AlignFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alignfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alignfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Alignfeatures()
   * @model containment="true"
   * @generated
   */
  EList<AlignFeature> getAlignfeatures();

  /**
   * Returns the value of the '<em><b>Gradientfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.GradientFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gradientfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gradientfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Gradientfeatures()
   * @model containment="true"
   * @generated
   */
  EList<GradientFeature> getGradientfeatures();

  /**
   * Returns the value of the '<em><b>Pointfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.PointFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Pointfeatures()
   * @model containment="true"
   * @generated
   */
  EList<PointFeature> getPointfeatures();

  /**
   * Returns the value of the '<em><b>Sizefeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.SizeFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sizefeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sizefeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Sizefeatures()
   * @model containment="true"
   * @generated
   */
  EList<SizeFeature> getSizefeatures();

  /**
   * Returns the value of the '<em><b>Positionfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.PositionFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Positionfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Positionfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Positionfeatures()
   * @model containment="true"
   * @generated
   */
  EList<PositionFeature> getPositionfeatures();

  /**
   * Returns the value of the '<em><b>Colorfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colorfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colorfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Colorfeatures()
   * @model containment="true"
   * @generated
   */
  EList<ColorFeature> getColorfeatures();

  /**
   * Returns the value of the '<em><b>Integerfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integerfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integerfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Integerfeatures()
   * @model containment="true"
   * @generated
   */
  EList<IntegerFeature> getIntegerfeatures();

  /**
   * Returns the value of the '<em><b>Booleanfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.BooleanFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Booleanfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Booleanfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Booleanfeatures()
   * @model containment="true"
   * @generated
   */
  EList<BooleanFeature> getBooleanfeatures();

  /**
   * Returns the value of the '<em><b>Stringfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stringfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stringfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Stringfeatures()
   * @model containment="true"
   * @generated
   */
  EList<StringFeature> getStringfeatures();

  /**
   * Returns the value of the '<em><b>Customfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureFeatures_Customfeatures()
   * @model containment="true"
   * @generated
   */
  EList<CustomFeature> getCustomfeatures();

} // FigureFeatures
