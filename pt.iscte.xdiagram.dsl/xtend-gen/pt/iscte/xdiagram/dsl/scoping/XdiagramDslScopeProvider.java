/**
 * generated by Xtext 2.10.0
 */
package pt.iscte.xdiagram.dsl.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import pt.iscte.xdiagram.dsl.model.ConnectableElement;
import pt.iscte.xdiagram.dsl.model.Contains;
import pt.iscte.xdiagram.dsl.model.Diagram;
import pt.iscte.xdiagram.dsl.model.DiagramElement;
import pt.iscte.xdiagram.dsl.model.Link;
import pt.iscte.xdiagram.dsl.model.MetaModel;
import pt.iscte.xdiagram.dsl.model.ModelPackage;
import pt.iscte.xdiagram.dsl.model.Node;
import pt.iscte.xdiagram.dsl.model.XDiagram;
import pt.iscte.xdiagram.dsl.scoping.AbstractXdiagramDslScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class XdiagramDslScopeProvider extends AbstractXdiagramDslScopeProvider {
  public static class XdiagramScope implements IScope {
    private ArrayList<IEObjectDescription> list = new ArrayList<IEObjectDescription>();
    
    private HashMap<QualifiedName, IEObjectDescription> map = new HashMap<QualifiedName, IEObjectDescription>();
    
    private final EObject context;
    
    private final EReference reference;
    
    private EPackage ePackage;
    
    public XdiagramScope(final EObject context, final EReference reference) {
      this.context = context;
      this.reference = reference;
      this.loadEPackage();
      boolean _notEquals = (!Objects.equal(this.ePackage, null));
      if (_notEquals) {
        this.loadData();
      }
    }
    
    public EPackage loadEPackage() {
      EPackage _xblockexpression = null;
      {
        EObject _crawlUp = this.crawlUp(this.context, ModelPackage.Literals.XDIAGRAM);
        XDiagram xdiagram = ((XDiagram) _crawlUp);
        EPackage _xifexpression = null;
        if ((((!Objects.equal(xdiagram.getMetamodel(), null)) && (!Objects.equal(xdiagram.getMetamodel().getPlugin(), null))) && 
          (!Objects.equal(xdiagram.getMetamodel().getEcorePath(), null)))) {
          EPackage _xblockexpression_1 = null;
          {
            MetaModel _metamodel = xdiagram.getMetamodel();
            String ecorePlugin = _metamodel.getPlugin();
            MetaModel _metamodel_1 = xdiagram.getMetamodel();
            String ecorePath = _metamodel_1.getEcorePath();
            boolean _startsWith = ecorePath.startsWith("/");
            if (_startsWith) {
              ecorePath.substring(1);
            }
            String location = ((ecorePlugin + "/") + ecorePath);
            URI modelLocation = URI.createPlatformResourceURI(location, true);
            ResourceSetImpl rs = new ResourceSetImpl();
            Resource resource = null;
            try {
              Resource _resource = rs.getResource(modelLocation, true);
              resource = _resource;
            } catch (final Throwable _t) {
              if (_t instanceof Exception) {
                final Exception e = (Exception)_t;
                URI _createPlatformPluginURI = URI.createPlatformPluginURI(location, true);
                modelLocation = _createPlatformPluginURI;
                try {
                  Resource _resource_1 = rs.getResource(modelLocation, true);
                  resource = _resource_1;
                } catch (final Throwable _t_1) {
                  if (_t_1 instanceof Exception) {
                    final Exception e2 = (Exception)_t_1;
                  } else {
                    throw Exceptions.sneakyThrow(_t_1);
                  }
                }
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            EPackage _xifexpression_1 = null;
            boolean _notEquals = (!Objects.equal(resource, null));
            if (_notEquals) {
              EList<EObject> _contents = resource.getContents();
              EObject _get = _contents.get(0);
              _xifexpression_1 = this.ePackage = ((EPackage) _get);
            }
            _xblockexpression_1 = _xifexpression_1;
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    }
    
    private Multimap<QualifiedName, IEObjectDescription> referenceLinksMap = ArrayListMultimap.<QualifiedName, IEObjectDescription>create();
    
    private Multimap<QualifiedName, IEObjectDescription> parentChildrenMap = ArrayListMultimap.<QualifiedName, IEObjectDescription>create();
    
    private Multimap<QualifiedName, IEObjectDescription> attributesMap = ArrayListMultimap.<QualifiedName, IEObjectDescription>create();
    
    private Multimap<QualifiedName, IEObjectDescription> complexRefsMap = ArrayListMultimap.<QualifiedName, IEObjectDescription>create();
    
    private Multimap<QualifiedName, IEObjectDescription> complexRefsSourceMap = ArrayListMultimap.<QualifiedName, IEObjectDescription>create();
    
    private Multimap<QualifiedName, IEObjectDescription> targetRefsMap = ArrayListMultimap.<QualifiedName, IEObjectDescription>create();
    
    public void loadData() {
      EList<EClassifier> _eClassifiers = this.ePackage.getEClassifiers();
      for (final EClassifier c : _eClassifiers) {
        if ((c instanceof EClass)) {
          EClass eClass = ((EClass) c);
          String _name = eClass.getName();
          QualifiedName classQname = QualifiedName.create(_name);
          EObjectDescription desc = new EObjectDescription(classQname, c, null);
          String _name_1 = eClass.getName();
          QualifiedName _create = QualifiedName.create(_name_1);
          this.map.put(_create, desc);
          EList<EAttribute> _eAllAttributes = ((EClass)c).getEAllAttributes();
          for (final EAttribute a : _eAllAttributes) {
            {
              String _name_2 = a.getName();
              QualifiedName _create_1 = QualifiedName.create(_name_2);
              EObjectDescription adesc = new EObjectDescription(_create_1, a, null);
              this.attributesMap.put(classQname, adesc);
            }
          }
          EList<EReference> _eAllReferences = ((EClass)c).getEAllReferences();
          for (final EReference r : _eAllReferences) {
            {
              String _name_2 = ((EClass)c).getName();
              String _name_3 = r.getName();
              QualifiedName qname = QualifiedName.create(_name_2, _name_3);
              EObjectDescription rdesc = new EObjectDescription(qname, r, null);
              this.referenceLinksMap.put(qname, rdesc);
              boolean _isContainment = r.isContainment();
              if (_isContainment) {
                String _name_4 = ((EClass)c).getName();
                QualifiedName _create_1 = QualifiedName.create(_name_4);
                qname = _create_1;
                String _name_5 = r.getName();
                QualifiedName _create_2 = QualifiedName.create(_name_5);
                EObjectDescription _eObjectDescription = new EObjectDescription(_create_2, r, null);
                rdesc = _eObjectDescription;
                this.parentChildrenMap.put(qname, rdesc);
                EClassifier _eType = r.getEType();
                EList<EReference> _eAllReferences_1 = ((EClass) _eType).getEAllReferences();
                for (final EReference r_uni : _eAllReferences_1) {
                  if (((r_uni.getLowerBound() == 1) && (r_uni.getUpperBound() == 1))) {
                    EClassifier _eType_1 = r.getEType();
                    String _name_6 = _eType_1.getName();
                    QualifiedName uname = QualifiedName.create(_name_6);
                    EClassifier _eType_2 = r.getEType();
                    EObjectDescription udesc = new EObjectDescription(uname, _eType_2, null);
                    this.complexRefsMap.put(uname, udesc);
                    String _name_7 = ((EClass)c).getName();
                    String _name_8 = r.getName();
                    QualifiedName sname = QualifiedName.create(_name_7, _name_8);
                    EObjectDescription sdesc = new EObjectDescription(sname, r, null);
                    this.complexRefsSourceMap.put(uname, sdesc);
                  }
                }
              } else {
                if ((((!r.isContainment()) && (r.getLowerBound() == 1)) && (r.getUpperBound() == 1))) {
                  String _name_9 = r.getName();
                  QualifiedName _create_3 = QualifiedName.create(_name_9);
                  EObjectDescription tdesc = new EObjectDescription(_create_3, r, null);
                  this.targetRefsMap.put(classQname, tdesc);
                }
              }
            }
          }
        }
      }
    }
    
    public EObject crawlUp(final EObject o, final EClass clazz) {
      EObject n = o.eContainer();
      while ((!clazz.isInstance(n))) {
        EObject _eContainer = n.eContainer();
        n = _eContainer;
      }
      return n;
    }
    
    public DiagramElement getDiagramElement(final EObject o) {
      EObject n = o.eContainer();
      while ((!(n instanceof DiagramElement))) {
        EObject _eContainer = n.eContainer();
        n = _eContainer;
      }
      return ((DiagramElement) n);
    }
    
    @Override
    public Iterable<IEObjectDescription> getAllElements() {
      if ((this.context instanceof Contains)) {
        EObject _eContainer = ((Contains)this.context).eContainer();
        if ((_eContainer instanceof Diagram)) {
          EObject _eContainer_1 = ((Contains)this.context).eContainer();
          final Diagram diagram = ((Diagram) _eContainer_1);
          EClass _modelClass = diagram.getModelClass();
          String _name = _modelClass.getName();
          QualifiedName _create = QualifiedName.create(_name);
          return this.parentChildrenMap.get(_create);
        } else {
          EObject _eContainer_2 = ((Contains)this.context).eContainer();
          if ((_eContainer_2 instanceof ConnectableElement)) {
            DiagramElement _diagramElement = this.getDiagramElement(this.context);
            final Node node = ((Node) _diagramElement);
            EClass _modelClass_1 = node.getModelClass();
            String _name_1 = _modelClass_1.getName();
            QualifiedName _create_1 = QualifiedName.create(_name_1);
            return this.parentChildrenMap.get(_create_1);
          }
        }
      } else {
        if (((this.context instanceof Link) && ((Link) this.context).isReference())) {
          return this.referenceLinksMap.values();
        } else {
          if (((this.context instanceof Link) && ((Link) this.context).isComplex())) {
            String _name_2 = this.reference.getName();
            boolean _equals = _name_2.equals("modelClass");
            if (_equals) {
              return this.complexRefsMap.values();
            } else {
              boolean _equals_1 = this.reference.equals(ModelPackage.Literals.LINK__SOURCE_REFERENCE);
              if (_equals_1) {
                EClass _modelClass_2 = ((Link) this.context).getModelClass();
                String _name_3 = _modelClass_2.getName();
                QualifiedName qname = QualifiedName.create(_name_3);
                return this.complexRefsSourceMap.get(qname);
              } else {
                boolean _equals_2 = this.reference.equals(ModelPackage.Literals.LINK__TARGET_REFERENCE);
                if (_equals_2) {
                  EClass _modelClass_3 = ((Link) this.context).getModelClass();
                  String _name_4 = _modelClass_3.getName();
                  QualifiedName qname_1 = QualifiedName.create(_name_4);
                  return this.targetRefsMap.get(qname_1);
                }
              }
            }
          } else {
            String _name_5 = this.reference.getName();
            boolean _equals_3 = _name_5.equals("modelAttribute");
            if (_equals_3) {
              EObject owner = this.crawlUp(this.context, ModelPackage.Literals.DIAGRAM_ELEMENT);
              if (((owner instanceof Link) && ((Link) owner).isReference())) {
                Iterator<Object> _emptyIterator = Collections.<Object>emptyIterator();
                return ((Iterable<IEObjectDescription>) _emptyIterator);
              } else {
                if ((owner instanceof Node)) {
                  EClass _modelClass_4 = ((Node) owner).getModelClass();
                  String _name_6 = _modelClass_4.getName();
                  QualifiedName _create_2 = QualifiedName.create(_name_6);
                  return this.attributesMap.get(_create_2);
                } else {
                  EClass _modelClass_5 = ((Link) owner).getModelClass();
                  String _name_7 = _modelClass_5.getName();
                  QualifiedName _create_3 = QualifiedName.create(_name_7);
                  return this.attributesMap.get(_create_3);
                }
              }
            } else {
              return this.map.values();
            }
          }
        }
      }
      return null;
    }
    
    @Override
    public Iterable<IEObjectDescription> getElements(final EObject object) {
      return this.list;
    }
    
    @Override
    public IEObjectDescription getSingleElement(final EObject object) {
      IEObjectDescription _xifexpression = null;
      boolean _isEmpty = this.list.isEmpty();
      if (_isEmpty) {
        _xifexpression = null;
      } else {
        _xifexpression = this.list.get(0);
      }
      return _xifexpression;
    }
    
    @Override
    public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
      return Collections.<IEObjectDescription>emptyList();
    }
    
    @Override
    public IEObjectDescription getSingleElement(final QualifiedName name) {
      if ((this.context instanceof Contains)) {
        EObject _eContainer = ((Contains)this.context).eContainer();
        if ((_eContainer instanceof Diagram)) {
          EObject _eContainer_1 = ((Contains)this.context).eContainer();
          final Diagram diagram = ((Diagram) _eContainer_1);
          EClass _modelClass = diagram.getModelClass();
          EList<EReference> _eAllContainments = _modelClass.getEAllContainments();
          for (final EReference r : _eAllContainments) {
            String _name = r.getName();
            String _string = name.toString();
            boolean _equals = _name.equals(_string);
            if (_equals) {
              return new EObjectDescription(name, r, null);
            }
          }
        } else {
          EObject _eContainer_2 = ((Contains)this.context).eContainer();
          if ((_eContainer_2 instanceof ConnectableElement)) {
            EObject n = ((Contains)this.context).eContainer();
            while ((!(n instanceof Node))) {
              EObject _eContainer_3 = n.eContainer();
              n = _eContainer_3;
            }
            final Node node = ((Node) n);
            EClass _modelClass_1 = node.getModelClass();
            EList<EReference> _eAllContainments_1 = _modelClass_1.getEAllContainments();
            for (final EReference r_1 : _eAllContainments_1) {
              String _name_1 = r_1.getName();
              String _string_1 = name.toString();
              boolean _equals_1 = _name_1.equals(_string_1);
              if (_equals_1) {
                String _name_2 = r_1.getName();
                QualifiedName _create = QualifiedName.create(_name_2);
                return new EObjectDescription(_create, r_1, null);
              }
            }
          }
        }
      } else {
        if (((this.context instanceof Link) && ((Link) this.context).isReference())) {
          Collection<IEObjectDescription> list = this.referenceLinksMap.get(name);
          IEObjectDescription _xifexpression = null;
          boolean _isEmpty = list.isEmpty();
          if (_isEmpty) {
            _xifexpression = null;
          } else {
            final Collection<IEObjectDescription> _converted_list = (Collection<IEObjectDescription>)list;
            _xifexpression = ((IEObjectDescription[])Conversions.unwrapArray(_converted_list, IEObjectDescription.class))[0];
          }
          return _xifexpression;
        } else {
          if (((this.context instanceof Link) && ((Link) this.context).isComplex())) {
            String _name_3 = this.reference.getName();
            boolean _equals_2 = _name_3.equals("modelClass");
            if (_equals_2) {
              Collection<IEObjectDescription> _values = this.complexRefsMap.values();
              for (final IEObjectDescription d : _values) {
                QualifiedName _name_4 = d.getName();
                boolean _equals_3 = _name_4.equals(name);
                if (_equals_3) {
                  return d;
                }
              }
            } else {
              boolean _equals_4 = this.reference.equals(ModelPackage.Literals.LINK__SOURCE_REFERENCE);
              if (_equals_4) {
                EClass _modelClass_2 = ((Link) this.context).getModelClass();
                String _name_5 = _modelClass_2.getName();
                QualifiedName qname = QualifiedName.create(_name_5);
                Collection<IEObjectDescription> _get = this.complexRefsSourceMap.get(qname);
                for (final IEObjectDescription d_1 : _get) {
                  QualifiedName _name_6 = d_1.getName();
                  boolean _equals_5 = _name_6.equals(name);
                  if (_equals_5) {
                    return d_1;
                  }
                }
              } else {
                boolean _equals_6 = this.reference.equals(ModelPackage.Literals.LINK__TARGET_REFERENCE);
                if (_equals_6) {
                  EClass _modelClass_3 = ((Link) this.context).getModelClass();
                  String _name_7 = _modelClass_3.getName();
                  QualifiedName qname_1 = QualifiedName.create(_name_7);
                  Collection<IEObjectDescription> _get_1 = this.targetRefsMap.get(qname_1);
                  for (final IEObjectDescription d_2 : _get_1) {
                    QualifiedName _name_8 = d_2.getName();
                    boolean _equals_7 = _name_8.equals(name);
                    if (_equals_7) {
                      return d_2;
                    }
                  }
                }
              }
            }
          } else {
            String _name_9 = this.reference.getName();
            boolean _equals_8 = _name_9.equals("modelAttribute");
            if (_equals_8) {
              DiagramElement owner = this.getDiagramElement(this.context);
              if ((Objects.equal(owner.getModelClass(), null) || Objects.equal(owner.getModelClass().getName(), null))) {
                return null;
              }
              EClass _modelClass_4 = owner.getModelClass();
              String _name_10 = _modelClass_4.getName();
              QualifiedName _create_1 = QualifiedName.create(_name_10);
              Collection<IEObjectDescription> list_1 = this.attributesMap.get(_create_1);
              for (final IEObjectDescription d_3 : list_1) {
                QualifiedName _name_11 = d_3.getName();
                boolean _equals_9 = _name_11.equals(name);
                if (_equals_9) {
                  return d_3;
                }
              }
              return null;
            }
          }
        }
      }
      return this.map.get(name);
    }
  }
  
  public XdiagramDslScopeProvider() {
  }
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xifexpression = null;
    EClassifier _eType = reference.getEType();
    String _name = _eType.getName();
    boolean _matches = _name.matches("EClass|EReference|EAttribute");
    if (_matches) {
      _xifexpression = new XdiagramDslScopeProvider.XdiagramScope(context, reference);
    } else {
      _xifexpression = super.getScope(context, reference);
    }
    return _xifexpression;
  }
}