/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyle#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFontStyle()
 * @model
 * @generated
 */
public interface FontStyle extends Feature
{
  /**
   * Returns the value of the '<em><b>Styles</b></em>' attribute list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType}.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styles</em>' attribute list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FontStyleType
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFontStyle_Styles()
   * @model unique="false"
   * @generated
   */
  EList<FontStyleType> getStyles();

} // FontStyle
