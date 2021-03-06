/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Anchor#getDirection <em>Direction</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Anchor#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Anchor#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getAnchor()
 * @model
 * @generated
 */
public interface Anchor extends Feature
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link pt.iscte.xdiagram.dsl.model.AnchorDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see pt.iscte.xdiagram.dsl.model.AnchorDirection
   * @see #setDirection(AnchorDirection)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getAnchor_Direction()
   * @model
   * @generated
   */
  AnchorDirection getDirection();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Anchor#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see pt.iscte.xdiagram.dsl.model.AnchorDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(AnchorDirection value);

  /**
   * Returns the value of the '<em><b>Model Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Reference</em>' reference.
   * @see #setModelReference(EReference)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getAnchor_ModelReference()
   * @model
   * @generated
   */
  EReference getModelReference();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Anchor#getModelReference <em>Model Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Reference</em>' reference.
   * @see #getModelReference()
   * @generated
   */
  void setModelReference(EReference value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getAnchor_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Anchor#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

} // Anchor
