/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.TextPart#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.TextPart#getModelAttribute <em>Model Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextPart()
 * @model
 * @generated
 */
public interface TextPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextPart_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.TextPart#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextPart_ModelAttribute()
   * @model
   * @generated
   */
  EAttribute getModelAttribute();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.TextPart#getModelAttribute <em>Model Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Attribute</em>' reference.
   * @see #getModelAttribute()
   * @generated
   */
  void setModelAttribute(EAttribute value);

} // TextPart
