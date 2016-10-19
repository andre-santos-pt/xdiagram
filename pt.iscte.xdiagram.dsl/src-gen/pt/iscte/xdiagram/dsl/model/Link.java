/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Link#isReference <em>Reference</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Link#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Link#isComplex <em>Complex</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Link#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Link#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.Link#getDecorators <em>Decorators</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends DiagramElement, FeatureContainer
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(boolean)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink_Reference()
   * @model
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Link#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #isReference()
   * @generated
   */
  void setReference(boolean value);

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
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink_ModelReference()
   * @model
   * @generated
   */
  EReference getModelReference();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Link#getModelReference <em>Model Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Reference</em>' reference.
   * @see #getModelReference()
   * @generated
   */
  void setModelReference(EReference value);

  /**
   * Returns the value of the '<em><b>Complex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complex</em>' attribute.
   * @see #setComplex(boolean)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink_Complex()
   * @model
   * @generated
   */
  boolean isComplex();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Link#isComplex <em>Complex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complex</em>' attribute.
   * @see #isComplex()
   * @generated
   */
  void setComplex(boolean value);

  /**
   * Returns the value of the '<em><b>Source Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Reference</em>' reference.
   * @see #setSourceReference(EReference)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink_SourceReference()
   * @model
   * @generated
   */
  EReference getSourceReference();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Link#getSourceReference <em>Source Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Reference</em>' reference.
   * @see #getSourceReference()
   * @generated
   */
  void setSourceReference(EReference value);

  /**
   * Returns the value of the '<em><b>Target Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Reference</em>' reference.
   * @see #setTargetReference(EReference)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink_TargetReference()
   * @model
   * @generated
   */
  EReference getTargetReference();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.Link#getTargetReference <em>Target Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Reference</em>' reference.
   * @see #getTargetReference()
   * @generated
   */
  void setTargetReference(EReference value);

  /**
   * Returns the value of the '<em><b>Decorators</b></em>' containment reference list.
   * The list contents are of type {@link pt.iscte.xdiagram.dsl.model.Decorator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decorators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decorators</em>' containment reference list.
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getLink_Decorators()
   * @model containment="true"
   * @generated
   */
  EList<Decorator> getDecorators();

} // Link
