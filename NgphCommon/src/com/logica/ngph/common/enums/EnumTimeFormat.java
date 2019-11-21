package com.logica.ngph.common.enums;

/**
 * Maintains the list of time formats
 * @author Prasad. B.S.R.
 * @version 1.0 09/December/09
 * @since 1.0
 */
public enum EnumTimeFormat {
	HH24MMSS("HH:mm:ss", "(2[0-3]|[01]?[0-9]):?([0-5]?[0-9]):?([0-5]?[0-9])"),
	HH24MM ("HH:mm", "(2[0-3]|[01]?[0-9]):?([0-5]?[0-9])"),
	SFMS_TIMEFORMAT("HHmm", "(2[0-3]|[01]?[0-9])?([0-5]?[0-9])");
	
	private String regExPattern;
	private String format;
	
	/**
	 * Singleton constructor
	 * @param regExPattern {@link String}
	 */
	private EnumTimeFormat(String format, String regExPattern) {
		this.format = format;
		this.regExPattern = regExPattern;
	}
	
	/**
	 * Returns the time format
	 * @return {@link String}
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Returns the Regular Expression pattern
	 * @return {@link String}
	 */
	public String getRegExPattern() {
		return regExPattern;
	}
}
