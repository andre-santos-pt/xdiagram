/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getRgb <em>Rgb</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getAtribute <em>Atribute</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature()
 * @model
 * @generated
 */
public interface ColorFeature extends EObject
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Expression()
   * @model containment="true"
   * @generated
   */
  AtributeExpression getExpression();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getExpression <em>Expression</em>}' containment reference.
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getKey <em>Key</em>}' attribute.
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rgb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rgb</em>' containment reference.
   * @see #setRgb(RGB)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Rgb()
   * @model containment="true"
   * @generated
   */
  RGB getRgb();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getRgb <em>Rgb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rgb</em>' containment reference.
   * @see #getRgb()
   * @generated
   */
  void setRgb(RGB value);

  /**
   * Returns the value of the '<em><b>Atribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribute</em>' attribute.
   * @see #setAtribute(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Atribute()
   * @model
   * @generated
   */
  String getAtribute();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getAtribute <em>Atribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atribute</em>' attribute.
   * @see #getAtribute()
   * @generated
   */
  void setAtribute(String value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getColorFeature_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

} // ColorFeature
