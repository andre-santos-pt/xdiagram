/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.FontFace#getFace <em>Face</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getFontFace()
 * @model
 * @generated
 */
public interface FontFace extends Feature
{
  /**
   * Returns the value of the '<em><b>Face</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.dsl.FontFaceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Face</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.FontFaceType
   * @see #setFace(FontFaceType)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getFontFace_Face()
   * @model
   * @generated
   */
  FontFaceType getFace();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.FontFace#getFace <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.FontFaceType
   * @see #getFace()
   * @generated
   */
  void setFace(FontFaceType value);

} // FontFace
