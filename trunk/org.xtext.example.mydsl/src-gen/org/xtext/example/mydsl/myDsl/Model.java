/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getColors <em>Colors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getImages <em>Images</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Model#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Colors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.CustomColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colors</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Colors()
   * @model containment="true"
   * @generated
   */
  EList<CustomColor> getColors();

  /**
   * Returns the value of the '<em><b>Images</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ImageFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Images</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Images()
   * @model containment="true"
   * @generated
   */
  EList<ImageFile> getImages();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ConnectableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ConnectableElement> getElements();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.LinkElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModel_Links()
   * @model containment="true"
   * @generated
   */
  EList<LinkElement> getLinks();

} // Model
