/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDiagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.XDiagram#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.XDiagram#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.XDiagram#getCustomColors <em>Custom Colors</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.XDiagram#getElements <em>Elements</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.XDiagram#getFigures <em>Figures</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getXDiagram()
 * @model
 * @generated
 */
public interface XDiagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' containment reference.
   * @see #setMetamodel(MetaModel)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getXDiagram_Metamodel()
   * @model containment="true"
   * @generated
   */
  MetaModel getMetamodel();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.XDiagram#getMetamodel <em>Metamodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metamodel</em>' containment reference.
   * @see #getMetamodel()
   * @generated
   */
  void setMetamodel(MetaModel value);

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
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getXDiagram_Diagram()
   * @model containment="true"
   * @generated
   */
  Diagram getDiagram();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.XDiagram#getDiagram <em>Diagram</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Diagram</em>' containment reference.
   * @see #getDiagram()
   * @generated
   */
  void setDiagram(Diagram value);

  /**
   * Returns the value of the '<em><b>Custom Colors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Colors</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Colors</em>' containment reference.
   * @see #setCustomColors(Colors)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getXDiagram_CustomColors()
   * @model containment="true"
   * @generated
   */
  Colors getCustomColors();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.XDiagram#getCustomColors <em>Custom Colors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Colors</em>' containment reference.
   * @see #getCustomColors()
   * @generated
   */
  void setCustomColors(Colors value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link pt.iscte.xdiagram.dsl.model.DiagramElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getXDiagram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DiagramElement> getElements();

  /**
   * Returns the value of the '<em><b>Figures</b></em>' containment reference list.
   * The list contents are of type {@link pt.iscte.xdiagram.dsl.model.CustomFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figures</em>' containment reference list.
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getXDiagram_Figures()
   * @model containment="true"
   * @generated
   */
  EList<CustomFigure> getFigures();

} // XDiagram
