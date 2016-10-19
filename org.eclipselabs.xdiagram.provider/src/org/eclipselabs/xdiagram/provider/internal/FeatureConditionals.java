package org.eclipselabs.xdiagram.provider.internal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import pt.iscte.xdiagram.dsl.model.BooleanValue;
import pt.iscte.xdiagram.dsl.model.EnumValue;
import pt.iscte.xdiagram.dsl.model.FeatureConditional;
import pt.iscte.xdiagram.dsl.model.IntValue;
import pt.iscte.xdiagram.dsl.model.StringValue;
import pt.iscte.xdiagram.dsl.model.Value;

public class FeatureConditionals {

	public static boolean evaluate(EObject eObject, FeatureConditional cond) {
		if(eObject == null || cond == null)
			return true;

		EAttribute att = cond.getModelAttribute();

		Object obj = eObject.eGet(cond.getModelAttribute());

		if(obj == null)
			return false;

		String objToString = obj.toString();
		
		String v = getValue(cond.getValue(), att) + "";
		switch(cond.getOperator()) {
		case EQUAL: return objToString.equals(v);
		case DIFFERENT: return !objToString.equals(v);
		default: return false;
		}
	}


	private static Object getValue(Value v, EAttribute attribute) {
		if(v instanceof IntValue) return ((IntValue) v).getValue();
		if(v instanceof StringValue) return ((StringValue) v).getValue();
		if(v instanceof BooleanValue) return Boolean.parseBoolean(((BooleanValue) v).getValue().name().toLowerCase());
		if(v instanceof EnumValue) {
			String enumLit = ((EnumValue) v).getName();
			EEnum e = (EEnum) attribute.getEAttributeType();
			EEnumLiteral lit = e.getEEnumLiteral(enumLit);
			return lit;
		}
		return null;
	}
}
