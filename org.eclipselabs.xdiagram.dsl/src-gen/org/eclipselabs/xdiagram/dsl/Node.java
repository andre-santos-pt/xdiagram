/**
 */
package org.eclipselabs.xdiagram.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.xdiagram.dsl.Node#getRootFigure <em>Root Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends DiagramElement
{
  /**
   * Returns the value of the '<em><b>Root Figure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Figure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Figure</em>' containment reference.
   * @see #setRootFigure(ConnectableElement)
   * @see org.eclipselabs.xdiagram.dsl.DslPackage#getNode_RootFigure()
   * @model containment="true"
   * @generated
   */
  ConnectableElement getRootFigure();

  /**
   * Sets the value of the '{@link org.eclipselabs.xdiagram.dsl.Node#getRootFigure <em>Root Figure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Figure</em>' containment reference.
   * @see #getRootFigure()
   * @generated
   */
  void setRootFigure(ConnectableElement value);

} // Node
