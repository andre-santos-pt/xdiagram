/**
 */
package org.eclipselabs.xdiagram.xtext.xdiagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Style Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.xdiagram.xtext.xdiagram.XdiagramPackage#getFontStyleType()
 * @model
 * @generated
 */
public enum FontStyleType implements Enumerator
{
  /**
   * The '<em><b>ITALICS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ITALICS_VALUE
   * @generated
   * @ordered
   */
  ITALICS(0, "ITALICS", "italics"),

  /**
   * The '<em><b>BOLD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOLD_VALUE
   * @generated
   * @ordered
   */
  BOLD(1, "BOLD", "bold"),

  /**
   * The '<em><b>UNDERLINE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDERLINE_VALUE
   * @generated
   * @ordered
   */
  UNDERLINE(2, "UNDERLINE", "underline");

  /**
   * The '<em><b>ITALICS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ITALICS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ITALICS
   * @model literal="italics"
   * @generated
   * @ordered
   */
  public static final int ITALICS_VALUE = 0;

  /**
   * The '<em><b>BOLD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOLD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOLD
   * @model literal="bold"
   * @generated
   * @ordered
   */
  public static final int BOLD_VALUE = 1;

  /**
   * The '<em><b>UNDERLINE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNDERLINE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDERLINE
   * @model literal="underline"
   * @generated
   * @ordered
   */
  public static final int UNDERLINE_VALUE = 2;

  /**
   * An array of all the '<em><b>Font Style Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FontStyleType[] VALUES_ARRAY =
    new FontStyleType[]
    {
      ITALICS,
      BOLD,
      UNDERLINE,
    };

  /**
   * A public read-only list of all the '<em><b>Font Style Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FontStyleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Font Style Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FontStyleType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FontStyleType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Font Style Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FontStyleType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FontStyleType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Font Style Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FontStyleType get(int value)
  {
    switch (value)
    {
      case ITALICS_VALUE: return ITALICS;
      case BOLD_VALUE: return BOLD;
      case UNDERLINE_VALUE: return UNDERLINE;
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
  private FontStyleType(int value, String name, String literal)
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
  
} //FontStyleType
