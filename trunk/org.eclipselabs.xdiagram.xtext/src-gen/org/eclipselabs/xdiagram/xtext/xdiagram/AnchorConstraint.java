/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAnchorConstraint()
 * @model
 * @generated
 */
public interface AnchorConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType
   * @see #setType(AnchorConstraintType)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAnchorConstraint_Type()
   * @model
   * @generated
   */
  AnchorConstraintType getType();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraintType
   * @see #getType()
   * @generated
   */
  void setType(AnchorConstraintType value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAnchorConstraint_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAnchorConstraint_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AnchorConstraint#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

} // AnchorConstraint
