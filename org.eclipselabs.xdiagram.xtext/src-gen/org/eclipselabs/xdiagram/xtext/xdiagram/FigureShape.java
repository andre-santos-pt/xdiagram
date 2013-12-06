/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Figure Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFigureShape()
 * @model
 * @generated
 */
public enum FigureShape implements Enumerator
{
  /**
   * The '<em><b>SQUARE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQUARE_VALUE
   * @generated
   * @ordered
   */
  SQUARE(0, "SQUARE", "Square"),

  /**
   * The '<em><b>RECTANGLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECTANGLE_VALUE
   * @generated
   * @ordered
   */
  RECTANGLE(1, "RECTANGLE", "Rectangle"),

  /**
   * The '<em><b>ROUNDED RECTANGLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROUNDED_RECTANGLE_VALUE
   * @generated
   * @ordered
   */
  ROUNDED_RECTANGLE(2, "ROUNDED_RECTANGLE", "RoundedRectangle"),

  /**
   * The '<em><b>CIRCLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CIRCLE_VALUE
   * @generated
   * @ordered
   */
  CIRCLE(3, "CIRCLE", "Circle"),

  /**
   * The '<em><b>ELLIPSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ELLIPSE_VALUE
   * @generated
   * @ordered
   */
  ELLIPSE(4, "ELLIPSE", "Ellipse"),

  /**
   * The '<em><b>TRIANGLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIANGLE_VALUE
   * @generated
   * @ordered
   */
  TRIANGLE(5, "TRIANGLE", "Triangle"),

  /**
   * The '<em><b>RHOMBUS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RHOMBUS_VALUE
   * @generated
   * @ordered
   */
  RHOMBUS(6, "RHOMBUS", "Rhombus"),

  /**
   * The '<em><b>POLYGON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POLYGON_VALUE
   * @generated
   * @ordered
   */
  POLYGON(7, "POLYGON", "Polygon"),

  /**
   * The '<em><b>POLYLINE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POLYLINE_VALUE
   * @generated
   * @ordered
   */
  POLYLINE(8, "POLYLINE", "Polyline"),

  /**
   * The '<em><b>LABEL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LABEL_VALUE
   * @generated
   * @ordered
   */
  LABEL(9, "LABEL", "Label"),

  /**
   * The '<em><b>IMAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMAGE_VALUE
   * @generated
   * @ordered
   */
  IMAGE(10, "IMAGE", "Image");

  /**
   * The '<em><b>SQUARE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SQUARE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQUARE
   * @model literal="Square"
   * @generated
   * @ordered
   */
  public static final int SQUARE_VALUE = 0;

  /**
   * The '<em><b>RECTANGLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RECTANGLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECTANGLE
   * @model literal="Rectangle"
   * @generated
   * @ordered
   */
  public static final int RECTANGLE_VALUE = 1;

  /**
   * The '<em><b>ROUNDED RECTANGLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROUNDED RECTANGLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROUNDED_RECTANGLE
   * @model literal="RoundedRectangle"
   * @generated
   * @ordered
   */
  public static final int ROUNDED_RECTANGLE_VALUE = 2;

  /**
   * The '<em><b>CIRCLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CIRCLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CIRCLE
   * @model literal="Circle"
   * @generated
   * @ordered
   */
  public static final int CIRCLE_VALUE = 3;

  /**
   * The '<em><b>ELLIPSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ELLIPSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ELLIPSE
   * @model literal="Ellipse"
   * @generated
   * @ordered
   */
  public static final int ELLIPSE_VALUE = 4;

  /**
   * The '<em><b>TRIANGLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRIANGLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIANGLE
   * @model literal="Triangle"
   * @generated
   * @ordered
   */
  public static final int TRIANGLE_VALUE = 5;

  /**
   * The '<em><b>RHOMBUS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RHOMBUS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RHOMBUS
   * @model literal="Rhombus"
   * @generated
   * @ordered
   */
  public static final int RHOMBUS_VALUE = 6;

  /**
   * The '<em><b>POLYGON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POLYGON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POLYGON
   * @model literal="Polygon"
   * @generated
   * @ordered
   */
  public static final int POLYGON_VALUE = 7;

  /**
   * The '<em><b>POLYLINE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POLYLINE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POLYLINE
   * @model literal="Polyline"
   * @generated
   * @ordered
   */
  public static final int POLYLINE_VALUE = 8;

  /**
   * The '<em><b>LABEL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LABEL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LABEL
   * @model literal="Label"
   * @generated
   * @ordered
   */
  public static final int LABEL_VALUE = 9;

  /**
   * The '<em><b>IMAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IMAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMAGE
   * @model literal="Image"
   * @generated
   * @ordered
   */
  public static final int IMAGE_VALUE = 10;

  /**
   * An array of all the '<em><b>Figure Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FigureShape[] VALUES_ARRAY =
    new FigureShape[]
    {
      SQUARE,
      RECTANGLE,
      ROUNDED_RECTANGLE,
      CIRCLE,
      ELLIPSE,
      TRIANGLE,
      RHOMBUS,
      POLYGON,
      POLYLINE,
      LABEL,
      IMAGE,
    };

  /**
   * A public read-only list of all the '<em><b>Figure Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FigureShape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Figure Shape</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FigureShape get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FigureShape result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Figure Shape</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FigureShape getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FigureShape result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Figure Shape</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FigureShape get(int value)
  {
    switch (value)
    {
      case SQUARE_VALUE: return SQUARE;
      case RECTANGLE_VALUE: return RECTANGLE;
      case ROUNDED_RECTANGLE_VALUE: return ROUNDED_RECTANGLE;
      case CIRCLE_VALUE: return CIRCLE;
      case ELLIPSE_VALUE: return ELLIPSE;
      case TRIANGLE_VALUE: return TRIANGLE;
      case RHOMBUS_VALUE: return RHOMBUS;
      case POLYGON_VALUE: return POLYGON;
      case POLYLINE_VALUE: return POLYLINE;
      case LABEL_VALUE: return LABEL;
      case IMAGE_VALUE: return IMAGE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private FigureShape(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //FigureShape
