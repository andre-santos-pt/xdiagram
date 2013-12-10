/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDiagramElement()
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDiagramElement_ModelClass()
   * @model
   * @generated
   */
  EClass getModelClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getModelClass <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Class</em>' reference.
   * @see #getModelClass()
   * @generated
   */
  void setModelClass(EClass value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDiagramElement_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDiagramElement_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDiagramElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.DiagramElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDiagramElement_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // DiagramElement
