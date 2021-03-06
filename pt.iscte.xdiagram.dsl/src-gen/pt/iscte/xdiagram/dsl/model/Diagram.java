/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Diagram#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Diagram#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject
{
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
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getDiagram_ModelClass()
   * @model
   * @generated
   */
  EClass getModelClass();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Diagram#getModelClass <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Class</em>' reference.
   * @see #getModelClass()
   * @generated
   */
  void setModelClass(EClass value);

  /**
   * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
   * The list contents are of type {@link pt.iscte.xdiagram.dsl.model.Contains}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' containment reference list.
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getDiagram_Contains()
   * @model containment="true"
   * @generated
   */
  EList<Contains> getContains();

} // Diagram
