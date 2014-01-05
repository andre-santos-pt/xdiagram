/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getImageId <em>Image Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagramElement()
 * @model
 * @generated
 */
public interface DiagramElement extends EObject
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagramElement_ModelClass()
   * @model
   * @generated
   */
  EClass getModelClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getModelClass <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Class</em>' reference.
   * @see #getModelClass()
   * @generated
   */
  void setModelClass(EClass value);

  /**
   * Returns the value of the '<em><b>Tool Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tool Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tool Name</em>' attribute.
   * @see #setToolName(String)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagramElement_ToolName()
   * @model
   * @generated
   */
  String getToolName();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getToolName <em>Tool Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tool Name</em>' attribute.
   * @see #getToolName()
   * @generated
   */
  void setToolName(String value);

  /**
   * Returns the value of the '<em><b>Image Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Id</em>' attribute.
   * @see #setImageId(String)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDiagramElement_ImageId()
   * @model
   * @generated
   */
  String getImageId();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.DiagramElement#getImageId <em>Image Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Id</em>' attribute.
   * @see #getImageId()
   * @generated
   */
  void setImageId(String value);

} // DiagramElement
