/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Face</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.FontFace#getFace <em>Face</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFontFace()
 * @model
 * @generated
 */
public interface FontFace extends Feature
{
  /**
   * Returns the value of the '<em><b>Face</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.FontFaceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Face</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.FontFaceType
   * @see #setFace(FontFaceType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFontFace_Face()
   * @model
   * @generated
   */
  FontFaceType getFace();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.FontFace#getFace <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.FontFaceType
   * @see #getFace()
   * @generated
   */
  void setFace(FontFaceType value);

} // FontFace
