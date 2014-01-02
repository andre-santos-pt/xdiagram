/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.ImageFile#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.ImageFile#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getImageFile()
 * @model
 * @generated
 */
public interface ImageFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getImageFile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.ImageFile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' attribute.
   * @see #setSrc(String)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getImageFile_Src()
   * @model
   * @generated
   */
  String getSrc();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.ImageFile#getSrc <em>Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' attribute.
   * @see #getSrc()
   * @generated
   */
  void setSrc(String value);

} // ImageFile
