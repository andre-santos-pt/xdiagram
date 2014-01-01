/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getColors <em>Colors</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImages <em>Images</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram()
 * @model
 * @generated
 */
public interface XDiagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.ImportStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportStatement> getImports();

  /**
   * Returns the value of the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Class</em>' reference.
   * @see #setModelClass(EClass)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_ModelClass()
   * @model
   * @generated
   */
  EClass getModelClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.XDiagram#getModelClass <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Class</em>' reference.
   * @see #getModelClass()
   * @generated
   */
  void setModelClass(EClass value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.Link}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_Links()
   * @model containment="true"
   * @generated
   */
  EList<Link> getLinks();

  /**
   * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.Style}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styles</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_Styles()
   * @model containment="true"
   * @generated
   */
  EList<Style> getStyles();

  /**
   * Returns the value of the '<em><b>Colors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.CustomColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colors</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_Colors()
   * @model containment="true"
   * @generated
   */
  EList<CustomColor> getColors();

  /**
   * Returns the value of the '<em><b>Images</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.ImageFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Images</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getXDiagram_Images()
   * @model containment="true"
   * @generated
   */
  EList<ImageFile> getImages();

} // XDiagram
