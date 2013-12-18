/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LinkElement#getLineType <em>Line Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LinkElement#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLinkElement()
 * @model
 * @generated
 */
public interface LinkElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Line Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.LineType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.LineType
   * @see #setLineType(LineType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLinkElement_LineType()
   * @model
   * @generated
   */
  LineType getLineType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LinkElement#getLineType <em>Line Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.LineType
   * @see #getLineType()
   * @generated
   */
  void setLineType(LineType value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLinkElement_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // LinkElement
