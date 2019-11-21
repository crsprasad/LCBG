package com.logica.ngph.common.enums;

/**
 * An interface to NGPH response code types.<p>
 * This interface facilitates to add all kinds of 
 * NGPH response codes (RTGS/NEFT/SWIFT) to <tt>ValidationMessage</tt> object.
 * @author Prasad. B.S.R
 * @version 1.0 28/November/2009
 * @since 1.0
 */
public interface IEnumResponseCode {
	/**
	 * Returns the code of a response message
	 * @return {@link String}
	 */
	public String getCode();
	
	/**
	 * Returns the description of a response message
	 * @return {@link String}
	 */
	public String getDescription();
	
}
