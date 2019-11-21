package com.logica.ngph.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import com.logica.ngph.common.dtos.NgphCanonical;
import com.logica.ngph.common.dtos.SampleOperation;
/**
 * 
 * @author mohdabdulaa
 *
 */
public class RulesEvaluationHelper {
	
	/**
	 * 
	 */
	private static RulesEvaluationHelper rulesEvaluationHelperInstance = null;
	
	protected RulesEvaluationHelper() {
	      // Exists only to defeat instantiation.
	   }
	   public static RulesEvaluationHelper getInstance() {
	      if(rulesEvaluationHelperInstance == null) {
	    	  rulesEvaluationHelperInstance = new RulesEvaluationHelper();
	      }
	      return rulesEvaluationHelperInstance;
	   }

	/**
	 * 
	 * @param ruleCondition
	 * @param canonicalData
	 * @return
	 */
	public static Boolean evaluateRuleCondition(String ruleCondition,NgphCanonical canonicalData)throws Exception{
		
		rulesEvaluationHelperInstance = getInstance();
		Boolean flag = null;
		System.out.println("Inside the EvaluateRuleCondition ");
		if (rulesEvaluationHelperInstance.isStringNotEmpty(ruleCondition)) {
			Map<String, Object> map = new HashMap<String, Object>();
			SimpleBindings bindings = new SimpleBindings(map);
			StringBuilder evaluableRule = new StringBuilder();
			//breaking the complex rule into simple rules 
			//breaking it based on JOINS(AND, OR)
			StringTokenizer ruleConditionTokens = new StringTokenizer(
					ruleCondition, "#");
			
			System.out.println("RuleCondition is :: "+ruleCondition);
			//replacing with Java operators for each simple condition
			while (ruleConditionTokens.hasMoreTokens()) {

				String rule = ruleConditionTokens.nextToken();
				StringBuilder newRule = new StringBuilder();

				SampleOperation sampleOperation = new SampleOperation();
				
				if ("AND".equalsIgnoreCase(rule.trim())) {
					evaluableRule.append(" && ");
				} else if ("OR".equalsIgnoreCase(rule.trim())) {
					evaluableRule.append(" || ");
				} else {
					StringTokenizer ruleTokens = new StringTokenizer(rule,
							" ( )");
					while (ruleTokens.hasMoreTokens()) {
						String token = ruleTokens.nextToken();
						System.out.println("Token value is " + token);
						String dlim = token.trim().substring(0, 1);
						//removing unnecessary characters
						String st = rulesEvaluationHelperInstance.removeSpecialCharacters(token, dlim);

						if (dlim.trim().equalsIgnoreCase("$")) {
							sampleOperation.setFirstValue(st);
						} else if (dlim.trim().equalsIgnoreCase("~")) {
							// replace operator instead of token
							sampleOperation.setOperator(rulesEvaluationHelperInstance.getOperator(st));

						} else if (dlim.trim().equalsIgnoreCase("{")) {
							//

							sampleOperation.setSecondValue(st);
						}

						newRule.append(st);

					}
					//binding the values to the variables of condition
					evaluableRule.append(sampleOperation.getFirstValue());
					bindings.put(
							sampleOperation.getFirstValue(),
							rulesEvaluationHelperInstance.getAttributeValue(sampleOperation.getFirstValue(),canonicalData));
					evaluableRule.append(sampleOperation.getOperator());
					if (sampleOperation.getOperator()
							.contains("secondValueBla")) {

						String strRule = evaluableRule.toString();
						String strRuleOne = null;
						if (strRule.contains("secondValueBla")) {

							strRuleOne = strRule.replaceFirst("secondValueBla",
									sampleOperation.getSecondValue());
						}

						evaluableRule = new StringBuilder(strRuleOne);
					} else {
						evaluableRule.append(sampleOperation.getSecondValue());
					}

					bindings.put(
							sampleOperation.getSecondValue(),
							rulesEvaluationHelperInstance.getAttributeValue(sampleOperation.getSecondValue(),canonicalData));
					
						System.out.println("sampleOperation.getSecondValue() is " + sampleOperation.getSecondValue());
			          System.out.println("sampleOperation.getFirstValue() is " + sampleOperation.getFirstValue());
			          System.out.println("ruleEvali first is " + rulesEvaluationHelperInstance.getAttributeValue(sampleOperation.getFirstValue(), canonicalData));
			          System.out.println("ruleEvali second is " + rulesEvaluationHelperInstance.getAttributeValue(sampleOperation.getSecondValue(), canonicalData));
				}
			}

			// Get JavaScript engine
			ScriptEngine engine = new ScriptEngineManager()
					.getEngineByExtension("js");
			System.out.println("Rule Engine is ::" + engine);
		      System.out.println("Binding value is ::" + bindings);
		      System.out.println("evaluableRule value is :: " + evaluableRule);
			try {
				// Evaluate the expression
				flag = (Boolean) engine
						.eval(evaluableRule.toString(), bindings);
				System.out.println("Flag value is "+flag);

			} catch (ScriptException e) {
				e.printStackTrace();
				throw new Exception(e);
			}
		}
		return flag;
	}
	
	/**
	 * TODO add comments and move values to constants
	 */
	private String getOperator(String opr) {
		String operator = null;
		if ("Contains".equalsIgnoreCase(opr)) {
			operator = ".match(secondValueBla) != null";
		} else if ("like".equalsIgnoreCase(opr) || "=".equalsIgnoreCase(opr)) {

			operator = "==";

		} else if("<>".equalsIgnoreCase(opr)){
			operator = "!=";
		}else {
			operator = opr;
		}

		return operator;
	}

	/**
	 * 
	 */
	private String removeSpecialCharacters(String var, String delim) {

		StringTokenizer tokens = new StringTokenizer(var, delim);

		String token = null;

		if (tokens.countTokens() == 1) {

			token = tokens.nextToken();
			if (delim.trim().equalsIgnoreCase("{")) {
				//
				token = token.replaceAll("}", "");

			}
		}else{
			token = var;
		}

		return token;
	}

	/**
	 * TODO add all possible attributes in switch cases
	 */
	@SuppressWarnings("unchecked")
	private <T> T getAttributeValue(String attributeName,Object canonicalData) throws Exception{
		T attributeValue = null;
		String firstLetter = String.valueOf(attributeName.charAt(0));
		String methodName = "get".concat(attributeName.replaceFirst(firstLetter, firstLetter.toUpperCase()));
		
		Method method = null;
		Class<Object>[] types = null;
		try {
			method = canonicalData.getClass().getMethod(methodName, types);
			attributeValue = (T) method.invoke(canonicalData, (Object[])types);
		} catch (SecurityException e) {
			e.printStackTrace();
			throw new Exception(e);
		} catch (NoSuchMethodException e) {
			attributeValue = (T)attributeName;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			throw new Exception(e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			throw new Exception(e);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		
		return attributeValue;
	}
	/**
	 * 
	 * @param strValue
	 * @return
	 */
	private boolean isStringNotEmpty(String strValue)
	{
		if(strValue != null && !"".equals(strValue.trim()))
			return true;
		else
			return false;
	}

}
