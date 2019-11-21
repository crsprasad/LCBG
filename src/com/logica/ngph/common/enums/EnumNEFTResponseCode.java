package com.logica.ngph.common.enums;

/**
 * @author beeralav
 *
 */
public enum EnumNEFTResponseCode implements IEnumResponseCode{
	HOLIDAY_AT_RBI("098", "Holiday at RBI"),
	PAST_VALUE_DATE_N03("099", "Past Value Date"),
	LATE_ARRIVAL_FOR_A_BATCH("100", "Late Arrival for a batch"),
	BATCH_DOES_NOT_EXISTS_ON_SATURDAY("094", "Batch Does Not Exists on Saturday"),
	LATE_ARRIVAL_AT_SC("101", "Late Arrival At SC"),
	PAST_VALUE_DATE_N09("107", "Past Value Date"),
	HOLIDAY_AT_SERVICE_CENTER("108", "Holiday at Service Center"),
	ACCOUNT_CLOSED("R01", "Account Closed"),
	ACCOUNT_TRANSFERRED("R02", "Account Transferred"),
	ACCOUNT_DOES_NOT_EXIST("R03", "Account Does Not Exist"),
	NO_SUCH_ACCOUNT_TYPE("R04", "No Such Account Type"),
	BENEFICIARY_NAME_DIFFERES("R05", "Beneficiary Name Differes"),
	ACCOUNT_HOLDER_EXPIRED("R06", "Account Holder Expired"),
	ACCOUNT_UNDER_ATTACHEMENT("R07", "Account Under Attachement"),
	GARNISHI_ORDER_RECEIVED("R08", "Garnishi Order Received"),
	OPERATIONS_SUSPENDED("R09" , "Operations Suspended"),
	PARTYS_INSTRUCTIONS("R10", "Partys Instructions"),
	ANY_OTHER_RESONS("R11", "Any Other Reasons"),
	CREDIT_TO_NRI_ACCOUNT("R12", "Credit To NRI Account");
	
	private String code;
	private String description;
	/**
	 * Singleton constructor to initialize the message codes
	 * @param code {@link String}
	 * @param description {@link String}
	 */
	private EnumNEFTResponseCode(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	/**
	 * Returns the code and description of a response enum type
	 */
	public String toString() {
		StringBuilder sbValue = new StringBuilder();
		return sbValue.append(code).append("-").append(description).toString();
	}
}
