/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Label#isEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends ConnectableElement
{
  /**
   * Returns the value of the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' attribute.
   * @see #setEditable(boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLabel_Editable()
   * @model
   * @generated
   */
  boolean isEditable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Label#isEditable <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' attribute.
   * @see #isEditable()
   * @generated
   */
  void setEditable(boolean value);

} // Label
