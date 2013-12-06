/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placing Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPos <em>Pos</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingStatic <em>Placing Static</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingDynamic <em>Placing Dynamic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getPlacingFigure()
 * @model
 * @generated
 */
public interface PlacingFigure extends EObject
{
  /**
   * Returns the value of the '<em><b>Pos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pos</em>' attribute.
   * @see #setPos(int)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getPlacingFigure_Pos()
   * @model
   * @generated
   */
  int getPos();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPos <em>Pos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pos</em>' attribute.
   * @see #getPos()
   * @generated
   */
  void setPos(int value);

  /**
   * Returns the value of the '<em><b>Placing Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Placing Static</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Placing Static</em>' containment reference.
   * @see #setPlacingStatic(StaticFigure)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getPlacingFigure_PlacingStatic()
   * @model containment="true"
   * @generated
   */
  StaticFigure getPlacingStatic();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure#getPlacingStatic <em>Placing Static</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Placing Static</em>' containment reference.
   * @see #getPlacingStatic()
   * @generated
   */
  void setPlacingStatic(StaticFigure value);

  /**
   * Returns the value of the '<em><b>Placing Dynamic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Placing Dynamic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Placing Dynamic</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getPlacingFigure_PlacingDynamic()
   * @model containment="true"
   * @generated
   */
  EList<DynamicFigure> getPlacingDynamic();

} // PlacingFigure
