package com.logica.ngph.common.utils;

import com.logica.ngph.common.enums.IEnumResponseCode;

/**
 * A class to Store the detailed Exception Result thrown by Castor.</p>
 * The class will store 
 * <li>Field, for which the exception was thrown</li>
 * <li>Formatted message</li>
 * <li>Response Code to be sent across in the form of {@link IEnumResponseCode}</li>
 * </p>
 * The cases handled by the Class are
 * <li>Field is not matching the required Regular Expression</li>
 * <li>Mandatory Field is missing</li>
 * <li>Field must not have more Characters then Maximum Length</li>
 * <li>Field is not having Minimum Length of Characters</li>
 * </p>
 * Any new cases and/or the field required can be included. </p>
 * This class is instantiated  and values are set in <code>NGPHUtil.parseCastorValidationEx()</code> Method and returned. 
 * @author Raghav Kulkarni 23/March/2010
 * @version 1.0
 * @since 1.0
 * @see NGPHUtil
 */
public class CastorExceptionResult {
	
	private String messageField;
	private String formattedMessage;
	private IEnumResponseCode responseCode;
	
	/**
	 * @return the messageField
	 */
	public String getMessageField() {
		return messageField;
	}
	
	/**
	 * @param messageField the messageField to set
	 */
	public void setMessageField(String messageField) {
		this.messageField = messageField;
	}
	
	/**
	 * @return the formattedMessage
	 */
	public String getFormattedMessage() {
		return formattedMessage;
	}
	
	/**
	 * @param formattedMessage the formattedMessage to set
	 */
	public void setFormattedMessage(String formattedMessage) {
		this.formattedMessage = formattedMessage;
	}

	/**
	 * @return the responseCode
	 */
	public IEnumResponseCode getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(IEnumResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	@Override
	public String toString() {
		return this.getFormattedMessage();
	}
}
