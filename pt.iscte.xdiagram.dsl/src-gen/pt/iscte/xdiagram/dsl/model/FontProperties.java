/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.FontProperties#getFace <em>Face</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.FontProperties#getSize <em>Size</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.FontProperties#isBold <em>Bold</em>}</li>
 *   <li>{@link pt.iscte.xdiagram.dsl.model.FontProperties#isItalics <em>Italics</em>}</li>
 * </ul>
 *
 * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFontProperties()
 * @model
 * @generated
 */
public interface FontProperties extends Feature
{
  /**
   * Returns the value of the '<em><b>Face</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Face</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Face</em>' attribute.
   * @see #setFace(String)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFontProperties_Face()
   * @model
   * @generated
   */
  String getFace();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.FontProperties#getFace <em>Face</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Face</em>' attribute.
   * @see #getFace()
   * @generated
   */
  void setFace(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFontProperties_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.FontProperties#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

  /**
   * Returns the value of the '<em><b>Bold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bold</em>' attribute.
   * @see #setBold(boolean)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFontProperties_Bold()
   * @model
   * @generated
   */
  boolean isBold();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.FontProperties#isBold <em>Bold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bold</em>' attribute.
   * @see #isBold()
   * @generated
   */
  void setBold(boolean value);

  /**
   * Returns the value of the '<em><b>Italics</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Italics</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Italics</em>' attribute.
   * @see #setItalics(boolean)
   * @see pt.iscte.xdiagram.dsl.model.ModelPackage#getFontProperties_Italics()
   * @model
   * @generated
   */
  boolean isItalics();

  /**
   * Sets the value of the '{@link pt.iscte.xdiagram.dsl.model.FontProperties#isItalics <em>Italics</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Italics</em>' attribute.
   * @see #isItalics()
   * @generated
   */
  void setItalics(boolean value);

} // FontProperties