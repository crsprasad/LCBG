package com.logica.ngph.common.enums;

/**
 * A collection of Currency Codes defined with the 
 * Country Code, Currency Name, Currency ISO code and
 * Number of Decimals digits after the decimal point. 	
 * @author Prasad. B.S.R.
 * @version 1.0, 30/November/2009
 * @since 1.0
 */
public enum EnumCurrencyCode {
	INDIA("INR", "Indian Rupee", 356, 2);
	
	private String currnecyCode;									//Currency Code
	private String currencyName;									//Currency Name
	private int currencyISOCode;									//Currency ISO Code
	private int noOfDecimals;										//Number of Digits after the decimal point
	
	/**
	 * Singleton Constructor
	 * @param currencyCode {@link String}
	 * @param currencyName {@link String}
	 * @param currencyISOCode <tt>int</tt>
	 * @param noOfDecimals <tt>int</tt> - Number of digits after the decimal point
	 */
	private EnumCurrencyCode(String currencyCode, String currencyName, int currencyISOCode, int noOfDecimals) {
		this.currnecyCode = currencyCode;
		this.currencyName = currencyName;
		this.currencyISOCode = currencyISOCode;
		this.noOfDecimals = noOfDecimals;
	}

	/**
	 * Returns Currency Code
	 * @return {@link String}
	 */
	public String getCurrnecyCode() {
		return currnecyCode;
	}

	/**
	 * Returns Currency Name
	 * @return {@link String}
	 */
	public String getCurrencyName() {
		return currencyName;
	}

	/**
	 * Returns Currency ISO Code 
	 * @return <tt>int</tt>
	 */
	public int getCurrencyISOCode() {
		return currencyISOCode;
	}

	/**
	 * Returns the number of digits after the decimal point
	 * @return <tt>int</tt>
	 */
	public int getNoOfDecimals() {
		return noOfDecimals;
	}
	
	/**
	 * Verifies whether a given currency code is allowed/handled in NGPH system or not
	 * @param currencyCode {@link String}
	 * @return {@link Boolean}
	 */
	public static boolean contains(String currencyCode) {
		for (EnumCurrencyCode element : EnumCurrencyCode.values()) {
			if (element.currnecyCode.equalsIgnoreCase(currencyCode)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns the number of digits after the decimal point for a given currency code.
	 * @param currencyCode {@link String}
	 * @return int
	 */
	public static int getNoOfDecimals(String currencyCode) {
		for (EnumCurrencyCode element : EnumCurrencyCode.values()) {
			if (element.currnecyCode.equalsIgnoreCase(currencyCode)) {
				return element.getNoOfDecimals();
			}
		}
		return -1;
	}
}
