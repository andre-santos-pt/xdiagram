/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.ColorFeature#getType <em>Type</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.ColorFeature#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getColorFeature()
 * @model
 * @generated
 */
public interface ColorFeature extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getColorFeature_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.ColorFeature#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getColorFeature_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.ColorFeature#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

} // ColorFeature
