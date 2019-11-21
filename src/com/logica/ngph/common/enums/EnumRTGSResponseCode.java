package com.logica.ngph.common.enums;

/**
 * A collection of RTGS response Codes. A response code will be 
 * used while sending a RTGS response message to the host system from
 * which a request message has been arrived to the NGPH system<p>
 * This code would be used for Field 6346 of R90/91.
 * @author Prasad. B.S.R.
 * @version 1.0 20/November/2009
 * @since NGPH 1.0
 * @see IEnumResponseCode
 */
public enum EnumRTGSResponseCode implements IEnumResponseCode {
	SUCCESS("H00", "Success"),
	INVALID_UTR("H01", "Invalid UTR"),
	INVALID_PARTICIPANT_SENDER("H02", "Invalid Participant Identifier : Sender"),
	INVALID_PARTICIPANT_RECEIVER("H03", "Invalid Participant Identifier : Receiver"),
	INVALID_IFSC("H04", "Invalid IFSC"),
	INVALID_MESSAGE_TYPE("H07", "Invalid Message Type"),
	INCOMPLETE_BLOCK("H08", "Incomplete Block"),
	INVALID_AMOUNT("H11", "Invalid Amount"),
	INVALID_CODEWORD("H12", "Invalid Codeword"),
	INVALID_CURRENCY("H13", "Invalid Currency"),
	INVALID_DATE_FORMAT("H14", "Invalid Date Format"),
	INVALID_NUMBER_ENTERED("H16", "Invalid Number Entered"),
	NUMBER_OF_LINES_EXCEEDED("H17", "Number of lines exceed the limit of a field"),
	NUMBER_OF_CHARACTERS_EXCEEDED("H18", "Number of characters exceeds the limit of a field"),
	INVALID_PRIORITY("H19", "Priority entered is not within the specified range or default priority cannot be provided"),
	INVALID_TIME_FORMAT("H20", "Invalid Time Format"),
	MANUAL_CANCELLATION_IN_QPH("H58", "Manual cancellation of message in QPH"),
	INVALID_CHARACTERS_SINGLELINE("H61", "SINGLELINE: Invalid characters found"),
	INVALID_CHARACTERS_MULTILINE("H62", "MULTILINE: Invalid characters found"),
	MISSING_PREFIX("H63", "Specified prefix is not found"),
	MISSING_SUFFIX("H64", "Specified suffix is not found"),
	LENGTH_IS_SHORTER("H65", "Length is shorter than the value specified"),
	INVALID_PADDING("H66", "Invalid padding"),
	LENGTH_OF_LINE_EXCEEDED("H67", "Length of a line exceeds the size specified"),
	SPECIFIED_NUMBER_OF_LINES_NOT_FOUND("H68", "Specified number of lines are not found"),
	DECIMAL_SEPARATOR_NOT_FOUND("H69", "Decimal separator is not found"),
	INVALID_NUMBER_FORMAT("H70", "NUMBER: Invalid format encountered"),
	INVALID_DATE_FORMAT_SEPARATOR("H71", "Invalid date format separator"),
	BACKDATED_VALUE_DATE("H72", "The Value Date is back value date when compared with the business date"),
	INVALID_TIME_FORMAT_SEPARATOR("H73", "Invalid time format separator"),
	DELIMITER_NOT_FOUND("H74", "Delimiter is not found"),
	INVALID_BIC("H75", "Invalid BIC"),
	COMPONENT_NOT_IN_SPECIFIED_RANGE("H76", "Component value is not in specified range"),
	MANDATORY_FIELD_NOT_FOUND("H77", "Mandatory field is not found"),
	DUPLICATE_FIELD("H78", "For a group field, more than one field is encountered"),
	INVALID_MESSAGE("H79", "Invalid message"),
	DUPLICATE_UTR("H80", "Duplicate UTR"),
	POSSIBLE_DUPLICATE_MESSAGE("H81", "Possible Duplicate message"),
	INVALID_DESTINATION("H82", "Invalid destination"),
	FORWARD_DATE_VALUE("H83", "The Value Date is forward value date when compared with the business date"),
	FOUND_MORE_THAN_ONE_DECIMAL_SEPARATORS("H84", "Found more than one decimal separators"),
	AMOUNT_LESS_THAN_MINIMUM_ALLOWED_ON_RTGS("H85", "Amount falling below the minimum allowed on RTGS for that transaction type"),
	MANDATORY_FIELD_DOESNOT_HAVE_MAPPING("H90", "Mandatory Field doesn't have corresponding mapping"),
	DATABASE_ERROR("H99", "Database Error");		
	
	private String code;
	private String description;
	
	/**
	 * Singleton constructor to initialize the message codes
	 * @param code {@link String}
	 * @param description {@link String}
	 */
	private EnumRTGSResponseCode(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	/*
	 * Implemented method
	 * @see IEnumResponseCode#getCode()
	 */
	public String getCode() {
		return code;
	}

	/*
	 * Implemented method
	 * @see IEnumResponseCode#getDescription()
	 */
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
