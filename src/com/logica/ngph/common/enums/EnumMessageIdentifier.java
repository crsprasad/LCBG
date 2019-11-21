package com.logica.ngph.common.enums;

/**
 * A collection of the Message Identifier Types that NGPH system can handle. The
 * supported EnumMessage Identifiers are <tt>RTGS,NEFT,and SWIFT</tt>.
 * @author Prasad. B.S.R
 * @version 1.0, 14/November/2009
 * @since NGPH 1.0
 */
public enum EnumMessageIdentifier {
	RTGS("Real Time Gross Settlement"), 
	NEFT("National Electronic Fund Transfer"), 
	SWIFT("Society for Worldwide Interbank Financial Telecommunication");

	private String description; 									// Holds the description of an identifier

	/**
	 * Singleton constructor
	 * @param description {@link String}
	 */
	private EnumMessageIdentifier(String description) {
		this.description = description;
	}

	/**
	 * Returns the description of an identifier.
	 * @param identifier {@link EnumMessageIdentifier}
	 * @return {@link String}
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Verifies whether an given identifier is defined or not.</p>
	 * @param msgIdentifier {@link String}
	 * @return {@link Boolean}
	 */
	public static boolean contains(String msgIdentifier) {
		for (EnumMessageIdentifier element : EnumMessageIdentifier.values()) {
			if (element.name().equalsIgnoreCase(msgIdentifier)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns a Message Identifier if a given message identifier Name is available
	 * otherwise it returns null.	 
	 * @param msgIdentifier {@link String}
	 * @return {@link EnumMessageIdentifier}
	 */
	public static EnumMessageIdentifier getMessageIdentifier(String msgIdentifier) {
		for (EnumMessageIdentifier element : EnumMessageIdentifier.values()) {
			if (element.name().indexOf(msgIdentifier.toUpperCase()) != -1) {
				return element;
			}
		}
		return null;
	}
}
