/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueL <em>Value L</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueR <em>Value R</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature()
 * @model
 * @generated
 */
public interface StringFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(AtributeExpression)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature_Expression()
   * @model containment="true"
   * @generated
   */
  AtributeExpression getExpression();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(AtributeExpression value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Value L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value L</em>' attribute.
   * @see #setValueL(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature_ValueL()
   * @model
   * @generated
   */
  String getValueL();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueL <em>Value L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value L</em>' attribute.
   * @see #getValueL()
   * @generated
   */
  void setValueL(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Value R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value R</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value R</em>' attribute.
   * @see #setValueR(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getStringFeature_ValueR()
   * @model
   * @generated
   */
  String getValueR();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.StringFeature#getValueR <em>Value R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value R</em>' attribute.
   * @see #getValueR()
   * @generated
   */
  void setValueR(String value);

} // StringFeature
