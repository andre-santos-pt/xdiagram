/**
 */
package org.eclipselabs.xdiagram.dsl;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Link#isReference <em>Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Link#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Link#isComplex <em>Complex</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Link#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Link#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Link#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink()
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink_Reference()
   * @model
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Link#isReference <em>Reference</em>}' attribute.
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink_ModelReference()
   * @model
   * @generated
   */
  EReference getModelReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Link#getModelReference <em>Model Reference</em>}' reference.
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink_Complex()
   * @model
   * @generated
   */
  boolean isComplex();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Link#isComplex <em>Complex</em>}' attribute.
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink_SourceReference()
   * @model
   * @generated
   */
  EReference getSourceReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Link#getSourceReference <em>Source Reference</em>}' reference.
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
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink_TargetReference()
   * @model
   * @generated
   */
  EReference getTargetReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Link#getTargetReference <em>Target Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Reference</em>' reference.
   * @see #getTargetReference()
   * @generated
   */
  void setTargetReference(EReference value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.dsl.ConnectionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.ConnectionType
   * @see #setType(ConnectionType)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getLink_Type()
   * @model
   * @generated
   */
  ConnectionType getType();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Link#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipselabs.xdiagram.dsl.ConnectionType
   * @see #getType()
   * @generated
   */
  void setType(ConnectionType value);

} // Link
