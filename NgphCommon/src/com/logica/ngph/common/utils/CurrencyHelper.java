package com.logica.ngph.common.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A helper class to convert formats of a currency. 
 * @author Prasad. B.S.R
 * @version 1.0, 09/February/2010
 * @author Raghav Kulkarni
 * @version 1.1 17/February/2010
 * @since 1.0
 */
public class CurrencyHelper {
	/**
	 * Changes the Decimal separator from comma (,) to decimal point (.)
	 * @param amount {@link String}
	 * @return {@link String}
	 */
	public static String formatDecimalSeparator(String amount) {
		return amount.replace(',', '.');
	}
	
	/** Formats the double value to Locale dependent format 
	 * @author Raghav Kulkarni
	 * @param value {@link Double} Value to be converted
	 * @param locale {@link Locale} Format specified as in Locale
	 * @return Formated number
	 */
	public static String formatDoubleByLocale(double value, Locale locale) {
	
		if(Double.isNaN(value)) return Double.toString(value);
		if(Double.isInfinite(value))return Double.toString(value);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(value)  ;
	}
	
	/** Formats the double value to Locale dependent format 
	 * @author Raghav Kulkarni
	 * @param value {@link Double} Value to be converted
	 * @param decimalPlaces {@link Integer} number of decimal places to be formated
	 * @return Formated number
	 */
	public static String formatDoubleXPos(double value, int decimalPlaces) {
	
		NumberFormat nf = NumberFormat.getNumberInstance();
		if(Double.isNaN(value)) return Double.toString(value);
		if(Double.isInfinite(value))return Double.toString(value);
		
		nf.setMinimumFractionDigits(decimalPlaces);
		nf.setMaximumFractionDigits(decimalPlaces);
		return nf.format(value)  ;
	}
}
