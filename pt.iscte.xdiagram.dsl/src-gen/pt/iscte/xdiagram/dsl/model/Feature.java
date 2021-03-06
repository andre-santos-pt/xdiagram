/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Feature#getConditional <em>Conditional</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(FeatureConditional)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFeature_Conditional()
   * @model containment="true"
   * @generated
   */
  FeatureConditional getConditional();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Feature#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(FeatureConditional value);

} // Feature
