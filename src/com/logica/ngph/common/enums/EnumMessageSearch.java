package com.logica.ngph.common.enums;

/**
 * Maintains a list of different message search criteria.
 * 
 * @author Jithu Gopal
 * @version 1.0, 12/May/2010
 */
public enum EnumMessageSearch {
	RRNSearch("N03 | N09"),
	SEQSearch("F27"),
	StatusSearch("N04"),
	TRNSearch("RTGS");
	
	private String messageFormat;

	/**
	 * Singleton constructor
	 * @param messageFormat
	 */
	private EnumMessageSearch(String messageFormat) {
		this.messageFormat = messageFormat;
	}

	/**
	 * Returns the message format.
	 * @return the messageFormat
	 */
	public String getMessageFormat() {
		return messageFormat;
	}
}
