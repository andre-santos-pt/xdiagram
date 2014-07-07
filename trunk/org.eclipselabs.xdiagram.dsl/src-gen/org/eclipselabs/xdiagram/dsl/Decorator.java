/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Decorator#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Decorator#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDecorator()
 * @model
 * @generated
 */
public interface Decorator extends Feature
{
  /**
   * Returns the value of the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' attribute.
   * @see #setPosition(String)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDecorator_Position()
   * @model
   * @generated
   */
  String getPosition();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Decorator#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(ConnectableElement)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getDecorator_Element()
   * @model containment="true"
   * @generated
   */
  ConnectableElement getElement();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Decorator#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(ConnectableElement value);

} // Decorator
