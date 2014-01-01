/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Image#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends ConnectableElement
{
  /**
   * Returns the value of the '<em><b>Image</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' reference.
   * @see #setImage(ImageFile)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getImage_Image()
   * @model
   * @generated
   */
  ImageFile getImage();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Image#getImage <em>Image</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' reference.
   * @see #getImage()
   * @generated
   */
  void setImage(ImageFile value);

} // Image
