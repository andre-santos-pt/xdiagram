package org.eclipselabs.xdiagram.provider.internal.props;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipselabs.xdiagram.provider.internal.FigureProperty;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeExpression;
import org.eclipselabs.xdiagram.xtext.xdiagram.AtributeValue;
import org.eclipselabs.xdiagram.xtext.xdiagram.Attribute;
import org.eclipselabs.xdiagram.xtext.xdiagram.Feature;

public abstract class AbstractPropertyFeature<T,M extends Feature> implements PropertyFeature<T,M>{
	
	public final static String strAttribute ="><";	
	public final static String typeSeparator = "_";
	public final static String expressionSeparator = "|";
	public final static String equalsSeperator = "=";
	public final static String diferentSeperator = "<>";
	public final static String rgbSeperator = ",";
	
	@Override
	public Class<? extends T> getType() {
		Type type = getClass().getGenericSuperclass();

		if (type instanceof ParameterizedType) {
		    Type actualType = ((ParameterizedType) type).getActualTypeArguments()[0];
		    return (Class<? extends T>) actualType;
		}
		
//		TypeVariable<?>[] genericParameterTypes = getClass().getTypeParameters(); 
//
//		for(TypeVariable<?> t : genericParameterTypes){
//			
//		    if(t instanceof ParameterizedType){
//		        ParameterizedType aType = (ParameterizedType) t;
//		        Type[] parameterArgTypes = aType.getActualTypeArguments();
//		        for(Type parameterArgType : parameterArgTypes){
//		            Class parameterArgClass = (Class) parameterArgType;
//		            
//		           
//		            System.out.println("parameterArgClass = " + parameterArgClass);
//		            return parameterArgClass;
//		        }
//		    }
//		}
		return null;
	}
	
	@Override
	public Class<? extends M> getModelType() {
		Type type = getClass().getGenericSuperclass();

		if (type instanceof ParameterizedType) {
		    Type actualType = ((ParameterizedType) type).getActualTypeArguments()[1];
		    return (Class<? extends M>) actualType;
		}
		return null;
	}
	
	public boolean isIntegerFeature() {
		return getType().equals(Integer.class);
	}
	
	protected Object getAttributeValue(EClassifier etype, AtributeValue attribute){
		if ( etype instanceof EEnum && attribute.getValueID() != null ){
			EEnum eenum = (EEnum)etype;
			for ( EEnumLiteral literal : eenum.getELiterals())
				if ( literal.getName().equals(attribute.getValueID()) )
					return literal.getInstance();
		}else if (etype instanceof EDataType){
			switch (etype.getName()){
				case "EBoolean":
					return "true".equals(attribute.getValueBOOL());
				case "EInt":
					return attribute.getValueINT();
				case "EFloat":
					return (float)attribute.getValueINT() + (float)attribute.getValueDEC()/100.0 ;
				default:
					return attribute.getValueSTRING();
			}
		}
		return null;			
	}
	
	protected void setAttributesValue(EList<Attribute> attributes, EObject eObject){
		EClass eclass = eObject.eClass();			
		for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
			if (eStructuralFeature instanceof EAttribute) {
				for (Attribute attribute : attributes){
					if (eStructuralFeature.getName().equals(attribute.getKey()))
						eObject.eSet(eStructuralFeature, 
								getAttributeValue(eStructuralFeature.getEType(), attribute.getValue()));
				}
			}
		}
	}
	
	protected void setExpressionResult(GraphicsAlgorithm figure, EObject eObject, 
			AtributeExpression expression, String type, String feature, Object result){
		if (figure!=null && expression!=null && eObject!=null){
			EClass eclass = eObject.eClass();			
			for (EStructuralFeature eStructuralFeature : eclass.getEAllAttributes()){
				if (eStructuralFeature instanceof EAttribute) {
					if (eStructuralFeature.getName().equals(expression.getKey())){												
						Object value = getAttributeValue(eStructuralFeature.getEType(), 
								expression.getValue());												
						if (value!=null)
							FigureProperty.setProperty(figure,  type + typeSeparator + feature + 
							expressionSeparator + expression.getKey()+expression.getOperator()+value.toString(), 
							result.toString());
					}
				}
			}
		}
	}

	protected String getExpressionResult(GraphicsAlgorithm figure, List<Property> properties, String attribute, String value){

		String type = getType().getSimpleName();
		String feature = getClass().getSimpleName();
		
		String condition = type + typeSeparator + feature + expressionSeparator;
		String result = Graphiti.getPeService().getPropertyValue(figure, 
				condition + attribute + equalsSeperator + value);
		if (result==null){
			for (Property property : properties )
				if ( property.getKey().startsWith(condition + attribute + diferentSeperator) ){
					String[] str_exprs = property.getKey().split(diferentSeperator);
					if (!str_exprs[1].equals(value))
						result = property.getValue();
				}
		}
		return result;
	}
}
