/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.AttributeReference#getModelAttribute <em>Model Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.AttributeReference#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends EObject
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAttributeReference_ModelAttribute()
   * @model
   * @generated
   */
  EAttribute getModelAttribute();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.AttributeReference#getModelAttribute <em>Model Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Attribute</em>' reference.
   * @see #getModelAttribute()
   * @generated
   */
  void setModelAttribute(EAttribute value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.AttributeReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getAttributeReference_Path()
   * @model containment="true"
   * @generated
   */
  EList<AttributeReference> getPath();

} // AttributeReference
