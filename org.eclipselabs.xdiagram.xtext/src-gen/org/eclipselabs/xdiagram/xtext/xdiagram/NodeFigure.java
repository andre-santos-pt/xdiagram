/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getOption <em>Option</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFigure <em>Figure</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNodeFigure()
 * @model
 * @generated
 */
public interface NodeFigure extends EObject
{
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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNodeFigure_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

  /**
   * Returns the value of the '<em><b>Figure</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Figure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Figure</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape
   * @see #setFigure(FigureShape)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNodeFigure_Figure()
   * @model
   * @generated
   */
  FigureShape getFigure();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFigure <em>Figure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Figure</em>' attribute.
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.FigureShape
   * @see #getFigure()
   * @generated
   */
  void setFigure(FigureShape value);

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
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNodeFigure_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference.
   * @see #setFeatures(FigureFeatures)
   * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getNodeFigure_Features()
   * @model containment="true"
   * @generated
   */
  FigureFeatures getFeatures();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.xtext.xdiagram.NodeFigure#getFeatures <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' containment reference.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(FigureFeatures value);

} // NodeFigure
