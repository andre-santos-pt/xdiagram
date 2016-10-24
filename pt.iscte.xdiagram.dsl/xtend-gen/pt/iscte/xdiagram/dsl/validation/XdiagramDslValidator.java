/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import pt.iscte.xdiagram.dsl.model.Color;
import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Contains;
import pt.iscte.xdiagram.dsl.model.CustomColor;
import pt.iscte.xdiagram.dsl.model.Decorator;
import pt.iscte.xdiagram.dsl.model.Diagram;
import pt.iscte.xdiagram.dsl.model.DiagramElement;
import pt.iscte.xdiagram.dsl.model.Ellipse;
import pt.iscte.xdiagram.dsl.model.Feature;
import pt.iscte.xdiagram.dsl.model.FeatureContainer;
import pt.iscte.xdiagram.dsl.model.Layout;
import pt.iscte.xdiagram.dsl.model.Line;
import pt.iscte.xdiagram.dsl.model.Link;
import pt.iscte.xdiagram.dsl.model.MetaModel;
import pt.iscte.xdiagram.dsl.model.ModelPackage;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.dsl.model.Position;
import pt.iscte.xdiagram.dsl.model.Rectangle;
import pt.iscte.xdiagram.dsl.model.Size;
import pt.iscte.xdiagram.dsl.model.XDiagram;
import pt.iscte.xdiagram.dsl.validation.AbstractXdiagramDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class XdiagramDslValidator extends AbstractXdiagramDslValidator {
  /**
   * TODO
   * anchor reference  incoming/outgoing
   * 	diagram contains
   * contains containment
   */
  @Check
  public void ecoreExists(final XDiagram diagram) {
    if (((Objects.equal(diagram.getMetamodel(), null) || Objects.equal(diagram.getMetamodel().getPlugin(), null)) || Objects.equal(diagram.getMetamodel().getEcorePath(), null))) {
      this.error("Metamodel section has to be defined.", diagram, ModelPackage.Literals.XDIAGRAM__METAMODEL);
    }
    MetaModel _metamodel = diagram.getMetamodel();
    String _plugin = _metamodel.getPlugin();
    String _plus = (_plugin + "/");
    MetaModel _metamodel_1 = diagram.getMetamodel();
    String _ecorePath = _metamodel_1.getEcorePath();
    String loc = (_plus + _ecorePath);
    URI uri = URI.createPlatformResourceURI(loc, true);
    ResourceSetImpl resourceSet = new ResourceSetImpl();
    Resource.Factory.Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String, Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    EcoreResourceFactoryImpl _ecoreResourceFactoryImpl = new EcoreResourceFactoryImpl();
    _extensionToFactoryMap.put("ecore", _ecoreResourceFactoryImpl);
    try {
      Resource resource = resourceSet.getResource(uri, true);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        URI _createPlatformPluginURI = URI.createPlatformPluginURI(loc, true);
        uri = _createPlatformPluginURI;
        try {
          Resource resource2 = resourceSet.getResource(uri, true);
        } catch (final Throwable _t_1) {
          if (_t_1 instanceof Exception) {
            final Exception e2 = (Exception)_t_1;
            this.error("could not load ecore model, check plugin id and write the ecore path relative to that plugin", diagram, ModelPackage.Literals.XDIAGRAM__METAMODEL);
          } else {
            throw Exceptions.sneakyThrow(_t_1);
          }
        }
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void noDuplicateBindings(final XDiagram diagram) {
    HashMap<EClass, DiagramElement> set = Maps.<EClass, DiagramElement>newHashMap();
    HashSet<DiagramElement> dups = Sets.<DiagramElement>newHashSet();
    HashMap<EReference, Link> setRefs = Maps.<EReference, Link>newHashMap();
    HashSet<Link> dupsRefs = Sets.<Link>newHashSet();
    EList<DiagramElement> _elements = diagram.getElements();
    for (final DiagramElement e : _elements) {
      EClass _modelClass = e.getModelClass();
      boolean _notEquals = (!Objects.equal(_modelClass, null));
      if (_notEquals) {
        EClass clazz = e.getModelClass();
        boolean _containsKey = set.containsKey(clazz);
        if (_containsKey) {
          dups.add(e);
          DiagramElement _get = set.get(clazz);
          dups.add(_get);
        } else {
          set.put(clazz, e);
        }
      } else {
        if ((e instanceof Link)) {
          EReference ref = ((Link) e).getModelReference();
          boolean _containsKey_1 = setRefs.containsKey(ref);
          if (_containsKey_1) {
            dupsRefs.add(((Link) e));
            Link _get_1 = setRefs.get(ref);
            dupsRefs.add(_get_1);
          } else {
            setRefs.put(ref, ((Link) e));
          }
        }
      }
    }
    for (final DiagramElement e_1 : dups) {
      this.error("duplicate mapping", e_1, ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS);
    }
    for (final Link l : dupsRefs) {
      this.error("duplicate mapping", l, ModelPackage.Literals.LINK__MODEL_REFERENCE);
    }
  }
  
  @Check
  public void node(final Node node) {
    EClass _modelClass = node.getModelClass();
    boolean _isAbstract = _modelClass.isAbstract();
    if (_isAbstract) {
      this.error("node class cannot be abstract", ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS);
    }
  }
  
  @Check
  public void link(final Link link) {
    boolean _isComplex = link.isComplex();
    if (_isComplex) {
      EClass linkClass = link.getModelClass();
      boolean _isAbstract = linkClass.isAbstract();
      if (_isAbstract) {
        this.error("link class cannot be abstract", ModelPackage.Literals.DIAGRAM_ELEMENT__MODEL_CLASS);
      }
      EReference srcRef = link.getSourceReference();
      EClass _eReferenceType = srcRef.getEReferenceType();
      boolean _isSuperTypeOf = _eReferenceType.isSuperTypeOf(linkClass);
      boolean _not = (!_isSuperTypeOf);
      if (_not) {
        this.error("source reference type must be compatible with link class", ModelPackage.Literals.LINK__SOURCE_REFERENCE);
      }
      EReference tgtRef = link.getTargetReference();
      EList<EReference> _eAllReferences = linkClass.getEAllReferences();
      boolean _contains = _eAllReferences.contains(tgtRef);
      boolean _not_1 = (!_contains);
      if (_not_1) {
        this.error("target reference must be owned by link class", ModelPackage.Literals.LINK__TARGET_REFERENCE);
      }
      boolean _not_2 = (!((tgtRef.getLowerBound() == 1) && (tgtRef.getUpperBound() == 1)));
      if (_not_2) {
        this.error("target reference must have cardinality 1..1", ModelPackage.Literals.LINK__TARGET_REFERENCE);
      }
    }
  }
  
  @Check
  public void contains(final Contains contains) {
    DiagramElement _diagramElement = this.diagramElement(contains);
    Node node = ((Node) _diagramElement);
    EClass clazz = node.getModelClass();
    EList<EReference> _eAllReferences = clazz.getEAllReferences();
    EReference _modelReference = contains.getModelReference();
    boolean _contains = _eAllReferences.contains(_modelReference);
    boolean _not = (!_contains);
    if (_not) {
      String _name = clazz.getName();
      String _plus = ("reference must be owned by node class " + _name);
      this.error(_plus, ModelPackage.Literals.CONTAINS__MODEL_REFERENCE);
    }
  }
  
  public DiagramElement diagramElement(final Feature f) {
    EObject o = f.eContainer();
    while ((!(o instanceof DiagramElement))) {
      EObject _eContainer = o.eContainer();
      o = _eContainer;
    }
    return ((DiagramElement) o);
  }
  
  @Check
  public void conflitingContains(final Diagram diagram) {
    EList<Contains> _contains = diagram.getContains();
    this.checkContains(_contains);
  }
  
  @Check
  public void conflitingContains(final FeatureContainer fc) {
    EList<Feature> _features = fc.getFeatures();
    this.checkContains(_features);
  }
  
  public void checkContains(final List<? extends Feature> list) {
    HashMap<EClass, EObject> refs = Maps.<EClass, EObject>newHashMap();
    for (final Feature f : list) {
      if ((f instanceof Contains)) {
        EReference _modelReference = ((Contains) f).getModelReference();
        EClass t = _modelReference.getEReferenceType();
        Set<EClass> _keySet = refs.keySet();
        for (final EClass c : _keySet) {
          if ((c.isSuperTypeOf(t) || t.isSuperTypeOf(c))) {
            this.error("references with compatible types", f, ModelPackage.Literals.CONTAINS__MODEL_REFERENCE);
            EObject _get = refs.get(c);
            this.error("references with compatible types", _get, ModelPackage.Literals.CONTAINS__MODEL_REFERENCE);
          }
        }
        refs.put(t, ((Contains) f));
      }
    }
  }
  
  /**
   * child figures cannot define Position if parent defines Layout
   */
  @Check
  public void layout(final ConnectableElement element) {
    EList<Feature> _features = element.getFeatures();
    for (final Feature f : _features) {
      if ((f instanceof Layout)) {
        EList<FeatureContainer> _children = element.getChildren();
        for (final FeatureContainer child : _children) {
          EList<Feature> _features_1 = child.getFeatures();
          for (final Feature fc : _features_1) {
            if ((fc instanceof Position)) {
              String l = "horizontal";
              boolean _isVertical = ((Layout) f).isVertical();
              if (_isVertical) {
                l = "vertical";
              }
              this.error((("child element cannot have position feature, given that parent defines layout (" + l) + ")"), fc, null);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void sizeSquareCircleLine(final Size size) {
    EObject parent = size.eContainer();
    String t = "";
    if (((size.getWidth() == 0) && (!size.isWidthRelative()))) {
      this.error("width must be positive", ModelPackage.Literals.SIZE__WIDTH);
    }
    if ((((parent instanceof Rectangle) && ((Rectangle) parent).isSquare()) && (size.getHeight() != 0))) {
      t = "square";
    } else {
      if ((((parent instanceof Ellipse) && ((Ellipse) parent).isCircle()) && (size.getHeight() != 0))) {
        t = "circle";
      } else {
        if (((parent instanceof Line) && (size.getHeight() != 0))) {
          t = "line";
        }
      }
    }
    boolean _isEmpty = t.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      this.error(("size should have only one dimension, given that parent is a " + t), ModelPackage.Literals.SIZE__HEIGHT);
      return;
    } else {
      if ((((size.getHeight() == 0) && (!size.isHeightRelative())) && (!this.isSingleDimension(((FeatureContainer) parent))))) {
        Class<? extends EObject> _class = parent.getClass();
        String _simpleName = _class.getSimpleName();
        String _plus = (_simpleName + ": height must be positive");
        this.error(_plus, ModelPackage.Literals.SIZE__HEIGHT);
      }
    }
  }
  
  public boolean isSingleDimension(final FeatureContainer f) {
    return ((((f instanceof Rectangle) && ((Rectangle) f).isSquare()) || 
      ((f instanceof Ellipse) && ((Ellipse) f).isCircle())) || 
      (f instanceof Line));
  }
  
  @Check
  public void relativeSize(final Size size) {
    if ((size.isWidthRelative() && (!this.isPercentage(size.getWidth())))) {
      this.error("relative width (%) must be within [0, 100]", ModelPackage.Literals.SIZE__WIDTH_RELATIVE);
    }
    if ((size.isHeightRelative() && (!this.isPercentage(size.getHeight())))) {
      this.error("relative height (%) must be within [0, 100]", ModelPackage.Literals.SIZE__HEIGHT_RELATIVE);
    }
  }
  
  @Check
  public void relativePosition(final Position p) {
    if ((p.isXRelative() && (!this.isPercentage(p.getX())))) {
      this.error("relative x position (%) must be within [0, 100]", ModelPackage.Literals.POSITION__XRELATIVE);
    }
    if ((p.isYRelative() && (!this.isPercentage(p.getY())))) {
      this.error("relative y position (%) must be within [0, 100]", ModelPackage.Literals.POSITION__YRELATIVE);
    }
  }
  
  @Check
  public void decorator(final Decorator d) {
    int _position = d.getPosition();
    boolean _isPercentage = this.isPercentage(_position);
    boolean _not = (!_isPercentage);
    if (_not) {
      this.error("decorator position must be within [0, 100]", ModelPackage.Literals.DECORATOR__POSITION);
    }
  }
  
  @Check
  public void color(final Color color) {
    CustomColor c = color.getCustom();
    boolean _notEquals = (!Objects.equal(c, null));
    if (_notEquals) {
      int _r = c.getR();
      boolean _isColorValue = this.isColorValue(_r);
      boolean _not = (!_isColorValue);
      if (_not) {
        this.error("invalid Red value, must be within [0, 255]", color, ModelPackage.Literals.CUSTOM_COLOR__R);
      }
      int _g = c.getG();
      boolean _isColorValue_1 = this.isColorValue(_g);
      boolean _not_1 = (!_isColorValue_1);
      if (_not_1) {
        this.error("invalid Green value, must be within [0, 255]", color, ModelPackage.Literals.CUSTOM_COLOR__R);
      }
      int _b = c.getB();
      boolean _isColorValue_2 = this.isColorValue(_b);
      boolean _not_2 = (!_isColorValue_2);
      if (_not_2) {
        this.error("invalid Blue value, must be within [0, 255]", color, ModelPackage.Literals.CUSTOM_COLOR__R);
      }
    }
  }
  
  public boolean isPercentage(final int v) {
    return ((v >= 0) && (v <= 100));
  }
  
  public boolean isColorValue(final int v) {
    return ((v >= 0) && (v <= 255));
  }
}
