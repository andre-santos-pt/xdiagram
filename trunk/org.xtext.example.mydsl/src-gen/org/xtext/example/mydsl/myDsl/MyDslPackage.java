/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COLORS = 0;

  /**
   * The feature id for the '<em><b>Images</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMAGES = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 2;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LINKS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ConnectableElementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConnectableElement()
   * @generated
   */
  int CONNECTABLE_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Connectable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RGBImpl <em>RGB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RGBImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRGB()
   * @generated
   */
  int RGB = 2;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__R = 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__G = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB__B = 2;

  /**
   * The number of structural features of the '<em>RGB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ImageFileImpl <em>Image File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ImageFileImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImageFile()
   * @generated
   */
  int IMAGE_FILE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FILE__SRC = 1;

  /**
   * The number of structural features of the '<em>Image File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ColorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getColor()
   * @generated
   */
  int COLOR = 4;

  /**
   * The feature id for the '<em><b>Custom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__CUSTOM = 0;

  /**
   * The feature id for the '<em><b>Rgb</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__RGB = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__DEFAULT = 2;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CustomColorImpl <em>Custom Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CustomColorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCustomColor()
   * @generated
   */
  int CUSTOM_COLOR = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Rgb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR__RGB = 1;

  /**
   * The number of structural features of the '<em>Custom Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_COLOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RectangleImpl <em>Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RectangleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 6;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Rectangle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__RECTANGLE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Square</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__SQUARE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 7;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RhombusImpl <em>Rhombus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RhombusImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRhombus()
   * @generated
   */
  int RHOMBUS = 8;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The number of structural features of the '<em>Rhombus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RHOMBUS_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EllipseImpl <em>Ellipse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EllipseImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEllipse()
   * @generated
   */
  int ELLIPSE = 9;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Ellipse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__ELLIPSE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Circle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE__CIRCLE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ellipse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPSE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PolygonImpl <em>Polygon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PolygonImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPolygon()
   * @generated
   */
  int POLYGON = 10;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Polygon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__POLYGON = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Polyline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON__POLYLINE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Polygon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AtributeExpressionImpl <em>Atribute Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AtributeExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtributeExpression()
   * @generated
   */
  int ATRIBUTE_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION__KEY = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Atribute Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl <em>Atribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtributeValue()
   * @generated
   */
  int ATRIBUTE_VALUE = 12;

  /**
   * The feature id for the '<em><b>Value INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_INT = 0;

  /**
   * The feature id for the '<em><b>Value DEC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_DEC = 1;

  /**
   * The feature id for the '<em><b>Value ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_ID = 2;

  /**
   * The feature id for the '<em><b>Value BOOL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_BOOL = 3;

  /**
   * The feature id for the '<em><b>Value STRING</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_STRING = 4;

  /**
   * The feature id for the '<em><b>Value DAY</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_DAY = 5;

  /**
   * The feature id for the '<em><b>Value MONTH</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_MONTH = 6;

  /**
   * The feature id for the '<em><b>Value YEAR</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE__VALUE_YEAR = 7;

  /**
   * The number of structural features of the '<em>Atribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTE_VALUE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LabelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 13;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__EDITABLE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ImageImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 14;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__FEATURES = CONNECTABLE_ELEMENT__FEATURES;

  /**
   * The feature id for the '<em><b>Image</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__IMAGE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LinkElementImpl <em>Link Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LinkElementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLinkElement()
   * @generated
   */
  int LINK_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Line Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ELEMENT__LINE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ELEMENT__FEATURES = 1;

  /**
   * The number of structural features of the '<em>Link Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ColorFeatureImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getColorFeature()
   * @generated
   */
  int COLOR_FEATURE = 16;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__COLOR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ForegroundImpl <em>Foreground</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ForegroundImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getForeground()
   * @generated
   */
  int FOREGROUND = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREGROUND__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREGROUND__COLOR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Foreground</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREGROUND_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BackgroundImpl <em>Background</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BackgroundImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBackground()
   * @generated
   */
  int BACKGROUND = 18;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND__COLOR = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Background</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKGROUND_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BorderImpl <em>Border</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BorderImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBorder()
   * @generated
   */
  int BORDER = 19;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__EXPRESSION = COLOR_FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER__COLOR = COLOR_FEATURE__COLOR;

  /**
   * The number of structural features of the '<em>Border</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_FEATURE_COUNT = COLOR_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TransparencyImpl <em>Transparency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TransparencyImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransparency()
   * @generated
   */
  int TRANSPARENCY = 20;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPARENCY__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPARENCY__PERCENT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transparency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPARENCY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.SizeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSize()
   * @generated
   */
  int SIZE = 21;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__WIDTH = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__HEIGHT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PointImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPoint()
   * @generated
   */
  int POINT = 22;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PositionImpl <em>Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PositionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPosition()
   * @generated
   */
  int POSITION = 23;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__X = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION__Y = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CornerImpl <em>Corner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CornerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCorner()
   * @generated
   */
  int CORNER = 24;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER__ANGLE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Corner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORNER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FontFaceImpl <em>Font Face</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FontFaceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontFace()
   * @generated
   */
  int FONT_FACE = 25;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Face</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE__FACE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Face</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FACE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FontSizeImpl <em>Font Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FontSizeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontSize()
   * @generated
   */
  int FONT_SIZE = 26;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__SIZE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FontStyleImpl <em>Font Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FontStyleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontStyle()
   * @generated
   */
  int FONT_STYLE = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Styles</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE__STYLES = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Font Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LineStyleImpl <em>Line Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LineStyleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLineStyle()
   * @generated
   */
  int LINE_STYLE = 28;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE__STYLE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Line Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_STYLE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LineWidthImpl <em>Line Width</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LineWidthImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLineWidth()
   * @generated
   */
  int LINE_WIDTH = 29;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_WIDTH__EXPRESSION = FEATURE__EXPRESSION;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_WIDTH__WIDTH = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Line Width</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_WIDTH_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.DefaultColor <em>Default Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.DefaultColor
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDefaultColor()
   * @generated
   */
  int DEFAULT_COLOR = 30;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.FontFaceType <em>Font Face Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.FontFaceType
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontFaceType()
   * @generated
   */
  int FONT_FACE_TYPE = 31;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.FontStyleType <em>Font Style Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.FontStyleType
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontStyleType()
   * @generated
   */
  int FONT_STYLE_TYPE = 32;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.LineType <em>Line Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.LineType
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLineType()
   * @generated
   */
  int LINE_TYPE = 33;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getColors <em>Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colors</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getColors()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Colors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getImages <em>Images</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Images</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getImages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Images();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getLinks()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Links();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ConnectableElement <em>Connectable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connectable Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConnectableElement
   * @generated
   */
  EClass getConnectableElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ConnectableElement#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.example.mydsl.myDsl.ConnectableElement#getFeatures()
   * @see #getConnectableElement()
   * @generated
   */
  EReference getConnectableElement_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RGB <em>RGB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB</em>'.
   * @see org.xtext.example.mydsl.myDsl.RGB
   * @generated
   */
  EClass getRGB();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RGB#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.xtext.example.mydsl.myDsl.RGB#getR()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_R();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RGB#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.xtext.example.mydsl.myDsl.RGB#getG()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_G();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.RGB#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.xtext.example.mydsl.myDsl.RGB#getB()
   * @see #getRGB()
   * @generated
   */
  EAttribute getRGB_B();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ImageFile <em>Image File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image File</em>'.
   * @see org.xtext.example.mydsl.myDsl.ImageFile
   * @generated
   */
  EClass getImageFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ImageFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ImageFile#getName()
   * @see #getImageFile()
   * @generated
   */
  EAttribute getImageFile_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ImageFile#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Src</em>'.
   * @see org.xtext.example.mydsl.myDsl.ImageFile#getSrc()
   * @see #getImageFile()
   * @generated
   */
  EAttribute getImageFile_Src();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.xtext.example.mydsl.myDsl.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Color#isCustom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Custom</em>'.
   * @see org.xtext.example.mydsl.myDsl.Color#isCustom()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Custom();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Color#getRgb <em>Rgb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rgb</em>'.
   * @see org.xtext.example.mydsl.myDsl.Color#getRgb()
   * @see #getColor()
   * @generated
   */
  EReference getColor_Rgb();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Color#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.xtext.example.mydsl.myDsl.Color#getDefault()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Default();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CustomColor <em>Custom Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Color</em>'.
   * @see org.xtext.example.mydsl.myDsl.CustomColor
   * @generated
   */
  EClass getCustomColor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.CustomColor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.CustomColor#getName()
   * @see #getCustomColor()
   * @generated
   */
  EAttribute getCustomColor_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.CustomColor#getRgb <em>Rgb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rgb</em>'.
   * @see org.xtext.example.mydsl.myDsl.CustomColor#getRgb()
   * @see #getCustomColor()
   * @generated
   */
  EReference getCustomColor_Rgb();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rectangle
   * @generated
   */
  EClass getRectangle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Rectangle#isRectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rectangle</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rectangle#isRectangle()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Rectangle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Rectangle#isSquare <em>Square</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Square</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rectangle#isSquare()
   * @see #getRectangle()
   * @generated
   */
  EAttribute getRectangle_Square();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Feature#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Feature#getExpression()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Rhombus <em>Rhombus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rhombus</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rhombus
   * @generated
   */
  EClass getRhombus();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Ellipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ellipse</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ellipse
   * @generated
   */
  EClass getEllipse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Ellipse#isEllipse <em>Ellipse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ellipse</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ellipse#isEllipse()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Ellipse();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Ellipse#isCircle <em>Circle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Circle</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ellipse#isCircle()
   * @see #getEllipse()
   * @generated
   */
  EAttribute getEllipse_Circle();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Polygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polygon</em>'.
   * @see org.xtext.example.mydsl.myDsl.Polygon
   * @generated
   */
  EClass getPolygon();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Polygon#isPolygon <em>Polygon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polygon</em>'.
   * @see org.xtext.example.mydsl.myDsl.Polygon#isPolygon()
   * @see #getPolygon()
   * @generated
   */
  EAttribute getPolygon_Polygon();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Polygon#isPolyline <em>Polyline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Polyline</em>'.
   * @see org.xtext.example.mydsl.myDsl.Polygon#isPolyline()
   * @see #getPolygon()
   * @generated
   */
  EAttribute getPolygon_Polyline();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AtributeExpression <em>Atribute Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atribute Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeExpression
   * @generated
   */
  EClass getAtributeExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeExpression#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeExpression#getKey()
   * @see #getAtributeExpression()
   * @generated
   */
  EAttribute getAtributeExpression_Key();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeExpression#getOperator()
   * @see #getAtributeExpression()
   * @generated
   */
  EAttribute getAtributeExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.AtributeExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeExpression#getValue()
   * @see #getAtributeExpression()
   * @generated
   */
  EReference getAtributeExpression_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.AtributeValue <em>Atribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atribute Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue
   * @generated
   */
  EClass getAtributeValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueINT <em>Value INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value INT</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueINT()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueINT();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueDEC <em>Value DEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value DEC</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueDEC()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueDEC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueID <em>Value ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value ID</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueID()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueID();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueBOOL <em>Value BOOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value BOOL</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueBOOL()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueBOOL();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueSTRING <em>Value STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value STRING</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueSTRING()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueSTRING();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueDAY <em>Value DAY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value DAY</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueDAY()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueDAY();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueMONTH <em>Value MONTH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value MONTH</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueMONTH()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueMONTH();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.AtributeValue#getValueYEAR <em>Value YEAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value YEAR</em>'.
   * @see org.xtext.example.mydsl.myDsl.AtributeValue#getValueYEAR()
   * @see #getAtributeValue()
   * @generated
   */
  EAttribute getAtributeValue_ValueYEAR();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.xtext.example.mydsl.myDsl.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Label#isEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Label#isEditable()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Editable();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.xtext.example.mydsl.myDsl.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.Image#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Image</em>'.
   * @see org.xtext.example.mydsl.myDsl.Image#getImage()
   * @see #getImage()
   * @generated
   */
  EReference getImage_Image();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LinkElement <em>Link Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Element</em>'.
   * @see org.xtext.example.mydsl.myDsl.LinkElement
   * @generated
   */
  EClass getLinkElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LinkElement#getLineType <em>Line Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.LinkElement#getLineType()
   * @see #getLinkElement()
   * @generated
   */
  EAttribute getLinkElement_LineType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.LinkElement#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.example.mydsl.myDsl.LinkElement#getFeatures()
   * @see #getLinkElement()
   * @generated
   */
  EReference getLinkElement_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Feature</em>'.
   * @see org.xtext.example.mydsl.myDsl.ColorFeature
   * @generated
   */
  EClass getColorFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ColorFeature#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see org.xtext.example.mydsl.myDsl.ColorFeature#getColor()
   * @see #getColorFeature()
   * @generated
   */
  EReference getColorFeature_Color();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Foreground <em>Foreground</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreground</em>'.
   * @see org.xtext.example.mydsl.myDsl.Foreground
   * @generated
   */
  EClass getForeground();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Background <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Background</em>'.
   * @see org.xtext.example.mydsl.myDsl.Background
   * @generated
   */
  EClass getBackground();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Border <em>Border</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border</em>'.
   * @see org.xtext.example.mydsl.myDsl.Border
   * @generated
   */
  EClass getBorder();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Transparency <em>Transparency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transparency</em>'.
   * @see org.xtext.example.mydsl.myDsl.Transparency
   * @generated
   */
  EClass getTransparency();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Transparency#getPercent <em>Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Transparency#getPercent()
   * @see #getTransparency()
   * @generated
   */
  EAttribute getTransparency_Percent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see org.xtext.example.mydsl.myDsl.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Size#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.example.mydsl.myDsl.Size#getWidth()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Size#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.xtext.example.mydsl.myDsl.Size#getHeight()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.xtext.example.mydsl.myDsl.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.example.mydsl.myDsl.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.example.mydsl.myDsl.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position</em>'.
   * @see org.xtext.example.mydsl.myDsl.Position
   * @generated
   */
  EClass getPosition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Position#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.example.mydsl.myDsl.Position#getX()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Position#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.example.mydsl.myDsl.Position#getY()
   * @see #getPosition()
   * @generated
   */
  EAttribute getPosition_Y();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Corner <em>Corner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corner</em>'.
   * @see org.xtext.example.mydsl.myDsl.Corner
   * @generated
   */
  EClass getCorner();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Corner#getAngle <em>Angle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle</em>'.
   * @see org.xtext.example.mydsl.myDsl.Corner#getAngle()
   * @see #getCorner()
   * @generated
   */
  EAttribute getCorner_Angle();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FontFace <em>Font Face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Face</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontFace
   * @generated
   */
  EClass getFontFace();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.FontFace#getFace <em>Face</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Face</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontFace#getFace()
   * @see #getFontFace()
   * @generated
   */
  EAttribute getFontFace_Face();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FontSize <em>Font Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Size</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontSize
   * @generated
   */
  EClass getFontSize();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.FontSize#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontSize#getSize()
   * @see #getFontSize()
   * @generated
   */
  EAttribute getFontSize_Size();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FontStyle <em>Font Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontStyle
   * @generated
   */
  EClass getFontStyle();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.FontStyle#getStyles <em>Styles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Styles</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontStyle#getStyles()
   * @see #getFontStyle()
   * @generated
   */
  EAttribute getFontStyle_Styles();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LineStyle <em>Line Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Style</em>'.
   * @see org.xtext.example.mydsl.myDsl.LineStyle
   * @generated
   */
  EClass getLineStyle();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LineStyle#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.xtext.example.mydsl.myDsl.LineStyle#getStyle()
   * @see #getLineStyle()
   * @generated
   */
  EAttribute getLineStyle_Style();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LineWidth <em>Line Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Width</em>'.
   * @see org.xtext.example.mydsl.myDsl.LineWidth
   * @generated
   */
  EClass getLineWidth();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.LineWidth#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.example.mydsl.myDsl.LineWidth#getWidth()
   * @see #getLineWidth()
   * @generated
   */
  EAttribute getLineWidth_Width();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.DefaultColor <em>Default Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Default Color</em>'.
   * @see org.xtext.example.mydsl.myDsl.DefaultColor
   * @generated
   */
  EEnum getDefaultColor();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.FontFaceType <em>Font Face Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font Face Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontFaceType
   * @generated
   */
  EEnum getFontFaceType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.FontStyleType <em>Font Style Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Font Style Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.FontStyleType
   * @generated
   */
  EEnum getFontStyleType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.myDsl.LineType <em>Line Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Line Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.LineType
   * @generated
   */
  EEnum getLineType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COLORS = eINSTANCE.getModel_Colors();

    /**
     * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMAGES = eINSTANCE.getModel_Images();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LINKS = eINSTANCE.getModel_Links();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ConnectableElementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConnectableElement()
     * @generated
     */
    EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTABLE_ELEMENT__FEATURES = eINSTANCE.getConnectableElement_Features();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RGBImpl <em>RGB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RGBImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRGB()
     * @generated
     */
    EClass RGB = eINSTANCE.getRGB();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__R = eINSTANCE.getRGB_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__G = eINSTANCE.getRGB_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB__B = eINSTANCE.getRGB_B();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ImageFileImpl <em>Image File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ImageFileImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImageFile()
     * @generated
     */
    EClass IMAGE_FILE = eINSTANCE.getImageFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_FILE__NAME = eINSTANCE.getImageFile_Name();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_FILE__SRC = eINSTANCE.getImageFile_Src();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ColorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Custom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__CUSTOM = eINSTANCE.getColor_Custom();

    /**
     * The meta object literal for the '<em><b>Rgb</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR__RGB = eINSTANCE.getColor_Rgb();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__DEFAULT = eINSTANCE.getColor_Default();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CustomColorImpl <em>Custom Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CustomColorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCustomColor()
     * @generated
     */
    EClass CUSTOM_COLOR = eINSTANCE.getCustomColor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_COLOR__NAME = eINSTANCE.getCustomColor_Name();

    /**
     * The meta object literal for the '<em><b>Rgb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_COLOR__RGB = eINSTANCE.getCustomColor_Rgb();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RectangleImpl <em>Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RectangleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRectangle()
     * @generated
     */
    EClass RECTANGLE = eINSTANCE.getRectangle();

    /**
     * The meta object literal for the '<em><b>Rectangle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECTANGLE__RECTANGLE = eINSTANCE.getRectangle_Rectangle();

    /**
     * The meta object literal for the '<em><b>Square</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECTANGLE__SQUARE = eINSTANCE.getRectangle_Square();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__EXPRESSION = eINSTANCE.getFeature_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RhombusImpl <em>Rhombus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RhombusImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRhombus()
     * @generated
     */
    EClass RHOMBUS = eINSTANCE.getRhombus();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EllipseImpl <em>Ellipse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EllipseImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEllipse()
     * @generated
     */
    EClass ELLIPSE = eINSTANCE.getEllipse();

    /**
     * The meta object literal for the '<em><b>Ellipse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPSE__ELLIPSE = eINSTANCE.getEllipse_Ellipse();

    /**
     * The meta object literal for the '<em><b>Circle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPSE__CIRCLE = eINSTANCE.getEllipse_Circle();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PolygonImpl <em>Polygon</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PolygonImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPolygon()
     * @generated
     */
    EClass POLYGON = eINSTANCE.getPolygon();

    /**
     * The meta object literal for the '<em><b>Polygon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLYGON__POLYGON = eINSTANCE.getPolygon_Polygon();

    /**
     * The meta object literal for the '<em><b>Polyline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLYGON__POLYLINE = eINSTANCE.getPolygon_Polyline();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AtributeExpressionImpl <em>Atribute Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AtributeExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtributeExpression()
     * @generated
     */
    EClass ATRIBUTE_EXPRESSION = eINSTANCE.getAtributeExpression();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_EXPRESSION__KEY = eINSTANCE.getAtributeExpression_Key();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_EXPRESSION__OPERATOR = eINSTANCE.getAtributeExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTE_EXPRESSION__VALUE = eINSTANCE.getAtributeExpression_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl <em>Atribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AtributeValueImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtributeValue()
     * @generated
     */
    EClass ATRIBUTE_VALUE = eINSTANCE.getAtributeValue();

    /**
     * The meta object literal for the '<em><b>Value INT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_INT = eINSTANCE.getAtributeValue_ValueINT();

    /**
     * The meta object literal for the '<em><b>Value DEC</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_DEC = eINSTANCE.getAtributeValue_ValueDEC();

    /**
     * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_ID = eINSTANCE.getAtributeValue_ValueID();

    /**
     * The meta object literal for the '<em><b>Value BOOL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_BOOL = eINSTANCE.getAtributeValue_ValueBOOL();

    /**
     * The meta object literal for the '<em><b>Value STRING</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_STRING = eINSTANCE.getAtributeValue_ValueSTRING();

    /**
     * The meta object literal for the '<em><b>Value DAY</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_DAY = eINSTANCE.getAtributeValue_ValueDAY();

    /**
     * The meta object literal for the '<em><b>Value MONTH</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_MONTH = eINSTANCE.getAtributeValue_ValueMONTH();

    /**
     * The meta object literal for the '<em><b>Value YEAR</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTE_VALUE__VALUE_YEAR = eINSTANCE.getAtributeValue_ValueYEAR();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LabelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__EDITABLE = eINSTANCE.getLabel_Editable();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ImageImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE__IMAGE = eINSTANCE.getImage_Image();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LinkElementImpl <em>Link Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LinkElementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLinkElement()
     * @generated
     */
    EClass LINK_ELEMENT = eINSTANCE.getLinkElement();

    /**
     * The meta object literal for the '<em><b>Line Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK_ELEMENT__LINE_TYPE = eINSTANCE.getLinkElement_LineType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK_ELEMENT__FEATURES = eINSTANCE.getLinkElement_Features();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ColorFeatureImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getColorFeature()
     * @generated
     */
    EClass COLOR_FEATURE = eINSTANCE.getColorFeature();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FEATURE__COLOR = eINSTANCE.getColorFeature_Color();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ForegroundImpl <em>Foreground</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ForegroundImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getForeground()
     * @generated
     */
    EClass FOREGROUND = eINSTANCE.getForeground();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BackgroundImpl <em>Background</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BackgroundImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBackground()
     * @generated
     */
    EClass BACKGROUND = eINSTANCE.getBackground();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BorderImpl <em>Border</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BorderImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBorder()
     * @generated
     */
    EClass BORDER = eINSTANCE.getBorder();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TransparencyImpl <em>Transparency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TransparencyImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTransparency()
     * @generated
     */
    EClass TRANSPARENCY = eINSTANCE.getTransparency();

    /**
     * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSPARENCY__PERCENT = eINSTANCE.getTransparency_Percent();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.SizeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__WIDTH = eINSTANCE.getSize_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__HEIGHT = eINSTANCE.getSize_Height();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PointImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PositionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPosition()
     * @generated
     */
    EClass POSITION = eINSTANCE.getPosition();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__X = eINSTANCE.getPosition_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CornerImpl <em>Corner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CornerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCorner()
     * @generated
     */
    EClass CORNER = eINSTANCE.getCorner();

    /**
     * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORNER__ANGLE = eINSTANCE.getCorner_Angle();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FontFaceImpl <em>Font Face</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FontFaceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontFace()
     * @generated
     */
    EClass FONT_FACE = eINSTANCE.getFontFace();

    /**
     * The meta object literal for the '<em><b>Face</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_FACE__FACE = eINSTANCE.getFontFace_Face();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FontSizeImpl <em>Font Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FontSizeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontSize()
     * @generated
     */
    EClass FONT_SIZE = eINSTANCE.getFontSize();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_SIZE__SIZE = eINSTANCE.getFontSize_Size();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FontStyleImpl <em>Font Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FontStyleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontStyle()
     * @generated
     */
    EClass FONT_STYLE = eINSTANCE.getFontStyle();

    /**
     * The meta object literal for the '<em><b>Styles</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT_STYLE__STYLES = eINSTANCE.getFontStyle_Styles();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LineStyleImpl <em>Line Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LineStyleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLineStyle()
     * @generated
     */
    EClass LINE_STYLE = eINSTANCE.getLineStyle();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_STYLE__STYLE = eINSTANCE.getLineStyle_Style();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LineWidthImpl <em>Line Width</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LineWidthImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLineWidth()
     * @generated
     */
    EClass LINE_WIDTH = eINSTANCE.getLineWidth();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE_WIDTH__WIDTH = eINSTANCE.getLineWidth_Width();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.DefaultColor <em>Default Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.DefaultColor
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDefaultColor()
     * @generated
     */
    EEnum DEFAULT_COLOR = eINSTANCE.getDefaultColor();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.FontFaceType <em>Font Face Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.FontFaceType
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontFaceType()
     * @generated
     */
    EEnum FONT_FACE_TYPE = eINSTANCE.getFontFaceType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.FontStyleType <em>Font Style Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.FontStyleType
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFontStyleType()
     * @generated
     */
    EEnum FONT_STYLE_TYPE = eINSTANCE.getFontStyleType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.LineType <em>Line Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.LineType
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLineType()
     * @generated
     */
    EEnum LINE_TYPE = eINSTANCE.getLineType();

  }

} //MyDslPackage
