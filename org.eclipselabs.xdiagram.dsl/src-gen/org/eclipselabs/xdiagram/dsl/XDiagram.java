/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getColors <em>Colors</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.XDiagram#getFigures <em>Figures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram()
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.ImportStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportStatement> getImports();

  /**
   * Returns the value of the '<em><b>Diagram</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Diagram</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Diagram</em>' containment reference.
   * @see #setDiagram(Diagram)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Diagram()
   * @model containment="true"
   * @generated
   */
  Diagram getDiagram();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.XDiagram#getDiagram <em>Diagram</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Diagram</em>' containment reference.
   * @see #getDiagram()
   * @generated
   */
  void setDiagram(Diagram value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Group> getGroups();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.DiagramElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DiagramElement> getElements();

  /**
   * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.Style}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styles</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Styles()
   * @model containment="true"
   * @generated
   */
  EList<Style> getStyles();

  /**
   * Returns the value of the '<em><b>Colors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.CustomColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colors</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Colors()
   * @model containment="true"
   * @generated
   */
  EList<CustomColor> getColors();

  /**
   * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.dsl.CustomFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getXDiagram_Figures()
   * @model containment="true"
   * @generated
   */
  EList<CustomFigure> getFigures();

} // XDiagram
