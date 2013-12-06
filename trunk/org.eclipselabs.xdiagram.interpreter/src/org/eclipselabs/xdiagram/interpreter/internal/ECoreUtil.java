package org.eclipselabs.xdiagram.interpreter.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class ECoreUtil {

	public static EClass getRoot(EPackage ePackage) {
		
		Set<EClass> candidates = new HashSet<EClass>();
		
		for(EClassifier c : ePackage.getEClassifiers()) {
			if(c instanceof EClass && ((EClass) c).getESuperTypes().isEmpty()) {
				candidates.add((EClass) c);
			}
		}
		
		for(EClassifier c : ePackage.getEClassifiers()) {
			if(c instanceof EClass) {
				EClass ec = (EClass) c;
				for(EReference r : ec.getEAllContainments())
					if(candidates.contains(r.getEType()))
						candidates.remove(r.getEType());
			}
		}
		 
		if(candidates.isEmpty())
			throw new RuntimeException("no root");
		else
			return candidates.iterator().next();
	}
	
	
	public static boolean isRoot(EClass eClass) {
		for(EClassifier c : eClass.getEPackage().getEClassifiers()) {
			if(c instanceof EClass) {
				EClass ec = (EClass) c;
				for(EReference r : ec.getEAllContainments())
					if(r.getEType().equals(eClass))
						return false;
			}
		}
		
		return true;
	}
	
//	public static boolean isTopLevel(EClass eClass) {
//		EClass root = getRoot(eClass.getEPackage());
//		for(EReference r : root.getEAllContainments())
//			if(r.getEType().equals(eClass))
//				return true;
//			
//		return false;
//	}
	
	
	public static boolean isIndirectLink(EReference reference) {
		return reference.isContainment() && hasRequiredUnaryReference(reference.getEType());
	}
	
	public static boolean isIndirectLinkTo(EReference reference, EClass target) {
		return isIndirectLink(reference) && getRequiredUnaryReference(reference.getEType()).getEType().equals(target);
	}
	
	private static boolean hasRequiredUnaryReference(EClassifier eClass) {
		return getRequiredUnaryReference(eClass) != null;
	}
	
	public static EReference getRequiredUnaryReference(EClassifier eClass) {
		for(EReference ref : ((EClass) eClass).getEAllReferences())
			if(!ref.isContainment() && !ref.isMany() && ref.isRequired())
				return ref;
		
		return null;
	}
	
	
	public static EObject resolveLinkTarget(EObject linkObject) {
		if(!isIndirectLink(linkObject.eContainmentFeature()))
			throw new RuntimeException("Not link : " + linkObject);
		
		EReference ref = getRequiredUnaryReference(linkObject.eClass());
		return (EObject) linkObject.eGet(ref);
	}

	private static boolean hasChild(EClass root, EClass child) {
		return getContainmentReference(root, child) != null;
	}
	
	public static boolean matchContainment(ContainerShape shape, EClass root, EClass child) {
		if(shape instanceof Diagram)
			return hasChild(root, child);
		
		EList<EObject> objs = shape.getLink().getBusinessObjects();
		return !objs.isEmpty() &&  contains(objs.get(0).eClass(), child);
	}
	
	public static boolean contains(EClass parent, EClass child) {
		for(EReference r : parent.getEAllContainments()) {
			if(((EClass) r.getEType()).isSuperTypeOf(child))
				return true;
		}
		
		return false;
	}
	
	public static EReference getContainmentReference(EClass parent, EClass child) {
		for(EReference r : parent.getEAllContainments()) {
			if(((EClass) r.getEType()).isSuperTypeOf(child))
				return r;
		}
		
		return null;
	}
	
	public static boolean enoughUpperBound(EReference eReference, EObject source) {
		Object obj = source.eGet(eReference);
		if(obj instanceof List) {
			if(eReference.getUpperBound() != -1) {
				if(((List) obj).size() >= eReference.getUpperBound())
					return false;
			}
		}
		else {
			if(obj != null)
				return false;
		}
		return true;
	}
	
	public static void setReference(EObject owner, EReference ref, EObject obj) {
		assert owner != null && ref != null;
		assert owner.eClass().getEAllReferences().contains(ref);
		assert obj == null || ref.getEReferenceType().isSuperTypeOf(obj.eClass());
		
		if(ref.isMany()) {
			List<EObject> list = (List<EObject>) owner.eGet(ref);
			list.add(obj);
		}
		else {
			owner.eSet(ref, obj);
		}		
	}
}
