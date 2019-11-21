package com.logica.ngph.common.utils;

/**
 * String Utilities
 * @author Prasad. B.S.R.
 * @version 1.0, 11/December/2009
 * @since 1.0
 */
public class StringHelper {
	/**
	 * Returns boolean value as true if object is not null
	 * @author Logica
	 * @param aObject
	 * @return boolean
	 */
	public static boolean isNotNullForString(Object aObject) {
		boolean isNotNull = false;

		if (aObject != null) {
			if (aObject instanceof String) {
				if (!"".equals(aObject)) {
					isNotNull = true;
				}
			} else {
				isNotNull = true;
			}
		} else {
			isNotNull = false;
		}

		return isNotNull;
	}
	
    /**
     * Pads the String on the left side with Zeros.
     * @param text {@link String}
     * @param width int
     * @return {@link String}
     */
	public static String leftPad(String text, int width) {
		String strFormat = new StringBuilder("%").append(width).append("s").toString();
        return String.format(strFormat, text).replace(' ', '0');
    }	
}
