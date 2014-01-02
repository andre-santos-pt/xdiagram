/**
 */
package org.eclipselabs.xdiagram.dsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Face Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.dsl.DslPackage#getFontFaceType()
 * @model
 * @generated
 */
public enum FontFaceType implements Enumerator
{
  /**
   * The '<em><b>ARIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARIAL_VALUE
   * @generated
   * @ordered
   */
  ARIAL(0, "ARIAL", "arial"),

  /**
   * The '<em><b>VERDANA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERDANA_VALUE
   * @generated
   * @ordered
   */
  VERDANA(1, "VERDANA", "verdana"),

  /**
   * The '<em><b>TIMES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIMES_VALUE
   * @generated
   * @ordered
   */
  TIMES(2, "TIMES", "times"),

  /**
   * The '<em><b>COURIER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COURIER_VALUE
   * @generated
   * @ordered
   */
  COURIER(3, "COURIER", "courier");

  /**
   * The '<em><b>ARIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARIAL
   * @model literal="arial"
   * @generated
   * @ordered
   */
  public static final int ARIAL_VALUE = 0;

  /**
   * The '<em><b>VERDANA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERDANA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERDANA
   * @model literal="verdana"
   * @generated
   * @ordered
   */
  public static final int VERDANA_VALUE = 1;

  /**
   * The '<em><b>TIMES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIMES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIMES
   * @model literal="times"
   * @generated
   * @ordered
   */
  public static final int TIMES_VALUE = 2;

  /**
   * The '<em><b>COURIER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COURIER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COURIER
   * @model literal="courier"
   * @generated
   * @ordered
   */
  public static final int COURIER_VALUE = 3;

  /**
   * An array of all the '<em><b>Font Face Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FontFaceType[] VALUES_ARRAY =
    new FontFaceType[]
    {
      ARIAL,
      VERDANA,
      TIMES,
      COURIER,
    };

  /**
   * A public read-only list of all the '<em><b>Font Face Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FontFaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Font Face Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FontFaceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FontFaceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Font Face Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FontFaceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FontFaceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Font Face Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FontFaceType get(int value)
  {
    switch (value)
    {
      case ARIAL_VALUE: return ARIAL;
      case VERDANA_VALUE: return VERDANA;
      case TIMES_VALUE: return TIMES;
      case COURIER_VALUE: return COURIER;
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
  private FontFaceType(int value, String name, String literal)
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
  
} //FontFaceType
