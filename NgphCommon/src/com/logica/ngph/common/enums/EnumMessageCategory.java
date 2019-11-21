package com.logica.ngph.common.enums;

/**
 * Defines the category of messages. </p>
 * <ol>
 * 	<li>Request Message</li>
 * 	<li>Notification Message</li>
 *  <li>Acknowledgment Message</li>
 *  <li>Inward Payment Message</li>   
 * 	<li>Broadcast Message</li>
 * </ol>
 * @author Prasad. B.S.R.
 * @version 1.0 06/December/2009
 * @since NGPH 1.0
 */
public enum EnumMessageCategory {
	REQUEST("Request Message"),
	NOTIFICATION("Notification Message"),
	ACKNOWLEDGMENT("Acknowledgment Message"),
	ACKNOWLEDGMENT_SSN("Sender's Settlement Acknowledgment Message"),
	IN_PAYMENTS("Inward Payment Message"),
	BROADCAST("Broadcast Message"),
	IN_RETURN_PAYMENTS("Inward Return Payments");
	
	private String description;
	
	private EnumMessageCategory(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
