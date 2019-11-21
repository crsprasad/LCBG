package com.logica.ngph.common.enums;

/**
 * Maintains the list of date formats
 * @author Prasad. B.S.R.
 * @version 1.0, 30/December/2009
 * @since 1.0
 */
public enum EnumDateFormat {
	SFMS_DATE_FORMAT("yyyyMMdd"),				//SFMS Message date format
	DATETIME_FORAMT("yyyyMMddHHmm"),			//Date Time format in the message header
	SWIFT_FORMAT("yyMMdd"),						//Swift message date format
	RTGS_FORMAT("yyyyMMdd");
	private String format;
	
	/**
	 * Singleton constructor
	 * @param dateFormat {@link String}
	 */
	private EnumDateFormat(String format) {
		this.format = format;
	}
	
	/**
	 * Returns the date format
	 * @return {@link String}
	 */
	public String getFormat() {
		return format;
	}
}
