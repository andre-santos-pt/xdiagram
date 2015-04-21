/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.TextValue#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextValue()
 * @model
 * @generated
 */
public interface TextValue extends Feature
{
  /**
   * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.TextPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getTextValue_Parts()
   * @model containment="true"
   * @generated
   */
  EList<TextPart> getParts();

} // TextValue
