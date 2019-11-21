package com.logica.ngph.common.enums;

/**
 * Maintains a list of message directions and it's corresponding codes
 * @author Prasad. B.S.R.
 * @version 1.0 15/November/2009
 * @since NGPH 1.0
 */
public enum EnumMessageDirection {
	INWARD("I"),
	OUTWARD("O");

	private String directionCode;									//Stores the message direction code	
	
	/**
	 * Singleton Constructor
	 * @param msgDirection {@link String}
	 */
	private EnumMessageDirection(String directionCode) {
		this.directionCode = directionCode; 
	}
	
	/**
	 * Returns the message direction code 
	 * @return directionCode {@link String}
	 */
	public String getDirectionCode() {
		return directionCode;
	}
	
	/**
	 * Returns a MessageDirection for a given message direction code
	 * @param sdirectionCode {@link String}
	 * @return {@link EnumMessageDirection}
	 */
	public static EnumMessageDirection getMessageDirection(String directionCode) {
		if (directionCode != null){
	        for (EnumMessageDirection element : EnumMessageDirection.values()) {
				if (element.directionCode.equalsIgnoreCase(directionCode)) {
					return element;
				}
			}
	    }
	    return null;
	}
}
