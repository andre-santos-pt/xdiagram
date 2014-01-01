/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Conditional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getModelAttribute <em>Model Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFeatureConditional()
 * @model
 * @generated
 */
public interface FeatureConditional extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Attribute</em>' reference.
   * @see #setModelAttribute(EAttribute)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFeatureConditional_ModelAttribute()
   * @model
   * @generated
   */
  EAttribute getModelAttribute();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getModelAttribute <em>Model Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Attribute</em>' reference.
   * @see #getModelAttribute()
   * @generated
   */
  void setModelAttribute(EAttribute value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.xtext.xdiagram.Operator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Operator
   * @see #setOperator(Operator)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFeatureConditional_Operator()
   * @model
   * @generated
   */
  Operator getOperator();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.Operator
   * @see #getOperator()
   * @generated
   */
  void setOperator(Operator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFeatureConditional_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.FeatureConditional#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // FeatureConditional
