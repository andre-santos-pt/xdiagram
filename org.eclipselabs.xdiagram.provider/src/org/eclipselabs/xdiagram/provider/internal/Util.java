package org.eclipselabs.xdiagram.provider.internal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Util {

	public static EAttribute matchAttribute(EClass eClass, EAttribute att) {
		for(EAttribute a : eClass.getEAllAttributes())
			if(a.getName().equals(att.getName()))
				return a;
		
		return null;
	}
	
	
	
	public static EStructuralFeature matchFeature(EClass eClass, EStructuralFeature att) {
		for(EStructuralFeature a : eClass.getEAllStructuralFeatures())
			if(a.getName().equals(att.getName()))
				return a;
		
		return null;
	}
}
