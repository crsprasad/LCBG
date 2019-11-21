package com.logica.ngph.common.enums;
/**
 * 
 * @author mohdabdulaa
 *
 */
public enum RepairReasonsEnum {
	
	BRANCH_NOT_FOUND("BranchCodeNotFound", "1"),
	INVALID_MSG_DIRECTION("InvalidMessageDirection", "2"),
	DEPT_NOT_FOUND("DepartmentCodeNotFound", "3"),
	VALIDATION_RULES_NOT_FOUND("ValidationRulesNotConfiguredForThisMessageType", "4"),
	VALIDATION_FAIL("ValidationFailedInValidationService", "5"),
	INTERVINE_SENT("IntervineServiceSentToRepair", "6"),
	CURRENCY_CONVERSION_PRBLM("ErrorWhileConvertingAmountToBaseCurrency", "7"),
	BASE_CURRENCY_NOT_FOUND("BaseCurrencyValueNotAvailable", "8"),
	INVALID_RULEACTION_ENRICHMENT("InvalidRuleActionFoundForEnriching", "9"),
	FAIL_CANONICAL_VAL_GET("FailToGetTheAttributeValueFromCanonical", "10"),
	FAIL_CANONICAL_VAL_SET("FailToSetTheEnrichedAttributeValueToCanonical", "11"),
	INVALID_RULEACTPARAM_ENRICHMENT("InvalidRuleActParamFoundForEnriching", "12"),
	INVALID_RULEACTPARAM_ROUTING("InvalidRuleActParamFoundForAutoRouting","13");
	
	//Description of the payment status
	String repairReason;
	
	//Code of the payment status
	String rprRsnCode;
	
	/*
	 * 
	 */
	private RepairReasonsEnum(String repairReason, String repairReasonCode){
		 this.repairReason = repairReason;
		 this.rprRsnCode = repairReasonCode;
	 }
	
	/**
	 * 
	 * @param enumAttribute
	 * @return
	 */
	public static String findRepairReasonsCodeByEnum(RepairReasonsEnum enumAttribute)
	{
		return enumAttribute.rprRsnCode;
	}
	
	/**
	 * 
	 * @param statusCode
	 * @return
	 */
	public static RepairReasonsEnum findRepairReasonsEnumByCode(String repairRsnCode)
	{
		for(RepairReasonsEnum oneEnumSample :RepairReasonsEnum.values())
		{
			if(oneEnumSample.rprRsnCode.equalsIgnoreCase(repairRsnCode))
				return oneEnumSample;
	
		}
		return null;
	}

}
