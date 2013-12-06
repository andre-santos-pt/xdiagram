/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDynamicFigure()
 * @model
 * @generated
 */
public interface DynamicFigure extends EObject
{
  /**
   * Returns the value of the '<em><b>Figure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figure</em>' attribute.
   * @see #setFigure(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDynamicFigure_Figure()
   * @model
   * @generated
   */
  String getFigure();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFigure <em>Figure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure</em>' attribute.
   * @see #getFigure()
   * @generated
   */
  void setFigure(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference.
   * @see #setFeatures(FigureFeatures)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDynamicFigure_Features()
   * @model containment="true"
   * @generated
   */
  FigureFeatures getFeatures();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure#getFeatures <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' containment reference.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(FigureFeatures value);

} // DynamicFigure
