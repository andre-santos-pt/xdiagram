/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#isComplex <em>Complex</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetReference <em>Target Reference</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#isManhattan <em>Manhattan</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getLinefeatures <em>Linefeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getColorfeatures <em>Colorfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getIntegerfeatures <em>Integerfeatures</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceStatic <em>Source Static</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceDynamic <em>Source Dynamic</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetStatic <em>Target Static</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetDynamic <em>Target Dynamic</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getPlacings <em>Placings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
{
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_ModelReference()
   * @model
   * @generated
   */
  EReference getModelReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelReference <em>Model Reference</em>}' reference.
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Complex()
   * @model
   * @generated
   */
  boolean isComplex();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#isComplex <em>Complex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complex</em>' attribute.
   * @see #isComplex()
   * @generated
   */
  void setComplex(boolean value);

  /**
   * Returns the value of the '<em><b>Model Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Class</em>' reference.
   * @see #setModelClass(EClass)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_ModelClass()
   * @model
   * @generated
   */
  EClass getModelClass();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getModelClass <em>Model Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Class</em>' reference.
   * @see #getModelClass()
   * @generated
   */
  void setModelClass(EClass value);

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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_SourceReference()
   * @model
   * @generated
   */
  EReference getSourceReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceReference <em>Source Reference</em>}' reference.
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_TargetReference()
   * @model
   * @generated
   */
  EReference getTargetReference();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetReference <em>Target Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Reference</em>' reference.
   * @see #getTargetReference()
   * @generated
   */
  void setTargetReference(EReference value);

  /**
   * Returns the value of the '<em><b>Manhattan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manhattan</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manhattan</em>' attribute.
   * @see #setManhattan(boolean)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Manhattan()
   * @model
   * @generated
   */
  boolean isManhattan();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#isManhattan <em>Manhattan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manhattan</em>' attribute.
   * @see #isManhattan()
   * @generated
   */
  void setManhattan(boolean value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Linefeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.LineFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Linefeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Linefeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Linefeatures()
   * @model containment="true"
   * @generated
   */
  EList<LineFeature> getLinefeatures();

  /**
   * Returns the value of the '<em><b>Colorfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.ColorFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colorfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colorfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Colorfeatures()
   * @model containment="true"
   * @generated
   */
  EList<ColorFeature> getColorfeatures();

  /**
   * Returns the value of the '<em><b>Integerfeatures</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.IntegerFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integerfeatures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integerfeatures</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Integerfeatures()
   * @model containment="true"
   * @generated
   */
  EList<IntegerFeature> getIntegerfeatures();

  /**
   * Returns the value of the '<em><b>Source Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Static</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Static</em>' containment reference.
   * @see #setSourceStatic(StaticFigure)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_SourceStatic()
   * @model containment="true"
   * @generated
   */
  StaticFigure getSourceStatic();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getSourceStatic <em>Source Static</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Static</em>' containment reference.
   * @see #getSourceStatic()
   * @generated
   */
  void setSourceStatic(StaticFigure value);

  /**
   * Returns the value of the '<em><b>Source Dynamic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Dynamic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Dynamic</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_SourceDynamic()
   * @model containment="true"
   * @generated
   */
  EList<DynamicFigure> getSourceDynamic();

  /**
   * Returns the value of the '<em><b>Target Static</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Static</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Static</em>' containment reference.
   * @see #setTargetStatic(StaticFigure)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_TargetStatic()
   * @model containment="true"
   * @generated
   */
  StaticFigure getTargetStatic();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.Link#getTargetStatic <em>Target Static</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Static</em>' containment reference.
   * @see #getTargetStatic()
   * @generated
   */
  void setTargetStatic(StaticFigure value);

  /**
   * Returns the value of the '<em><b>Target Dynamic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.DynamicFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Dynamic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Dynamic</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_TargetDynamic()
   * @model containment="true"
   * @generated
   */
  EList<DynamicFigure> getTargetDynamic();

  /**
   * Returns the value of the '<em><b>Placings</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipselabs.xdiagram.xtext.xdiagram.PlacingFigure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Placings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Placings</em>' containment reference list.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getLink_Placings()
   * @model containment="true"
   * @generated
   */
  EList<PlacingFigure> getPlacings();

} // Link
