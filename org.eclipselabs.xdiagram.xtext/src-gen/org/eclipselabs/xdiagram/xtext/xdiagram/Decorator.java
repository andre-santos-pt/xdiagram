/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isSource <em>Source</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isMiddle <em>Middle</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getStaticElement <em>Static Element</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator()
 * @model
 * @generated
 */
public interface Decorator extends EObject
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
   * @see #setPosition(int)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator_Position()
   * @model
   * @generated
   */
  int getPosition();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getPosition <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' attribute.
   * @see #getPosition()
   * @generated
   */
  void setPosition(int value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator_Source()
   * @model
   * @generated
   */
  boolean isSource();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #isSource()
   * @generated
   */
  void setSource(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator_Target()
   * @model
   * @generated
   */
  boolean isTarget();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #isTarget()
   * @generated
   */
  void setTarget(boolean value);

  /**
   * Returns the value of the '<em><b>Middle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Middle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Middle</em>' attribute.
   * @see #setMiddle(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator_Middle()
   * @model
   * @generated
   */
  boolean isMiddle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#isMiddle <em>Middle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Middle</em>' attribute.
   * @see #isMiddle()
   * @generated
   */
  void setMiddle(boolean value);

  /**
   * Returns the value of the '<em><b>Static Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Element</em>' containment reference.
   * @see #setStaticElement(ConnectableElement)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator_StaticElement()
   * @model containment="true"
   * @generated
   */
  ConnectableElement getStaticElement();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getStaticElement <em>Static Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static Element</em>' containment reference.
   * @see #getStaticElement()
   * @generated
   */
  void setStaticElement(ConnectableElement value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(Label)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getDecorator_Label()
   * @model containment="true"
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Decorator#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

} // Decorator
