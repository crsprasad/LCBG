package com.logica.ngph.common.enums;

/**
 * Maintains the list of messages that NGPH system can handle.
 * Each message can be distinctively identified by its following attributes:
 * <ol>
 * 	<li><b>Qualified Message Code</b> - Complete message code.
 * 	<li><b>Identifier</b> - Classifies whether a message belongs to RTGS, NEFT or SWIFT.
 *  <li><b>Direction</b> - Classifies a message direction; whether it is a Inward or Outward.
 *  <li><b>Category</b> - Classifies whether a message is of type Request, Response or Notification
 * </ol>
 * @author Prasad. B.S.R.
 * @version 1.0, 06/December/2009
 * @since 1.0
 * @see EnumMessageIdentifier
 * @see EnumMessageDirection
 * @see EnumMessageCategory
 */
public enum EnumMessage {
	R10("298R10", "Own Account Transfer Request", EnumMessageIdentifier.RTGS,EnumMessageDirection.OUTWARD, EnumMessageCategory.REQUEST),
	R41("298R41", "Customer Payment Request", EnumMessageIdentifier.RTGS, EnumMessageDirection.OUTWARD, EnumMessageCategory.REQUEST),
	R42("298R42", "Interbank Payment Request", EnumMessageIdentifier.RTGS, EnumMessageDirection.OUTWARD, EnumMessageCategory.REQUEST),
	R40("298R40", "Own Account Transfer Response", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT_SSN),
	R41_IN("298R41", "Customer Payment Response", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.IN_PAYMENTS),
	R42_IN("298R42", "Interbank Payment Response", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.IN_PAYMENTS),
	R43("298R43", "Debit Notification", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.NOTIFICATION),
	R44("298R44", "Credit Notification", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.NOTIFICATION),
	R90("298R90", "Gateway/Application Response", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	R91("298R91", "Gateway/Application Response", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	R09("298R09", "Senders Settlement Notification", EnumMessageIdentifier.RTGS, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT_SSN),
	N06("298N06", "Outward Debit Message from NEFT Branch", EnumMessageIdentifier.NEFT, EnumMessageDirection.OUTWARD, EnumMessageCategory.REQUEST),
	N07("298N07", "End-of-Day or End-of-Batch Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.OUTWARD, EnumMessageCategory.REQUEST),
	N02("298N02", "NEFT Credit Transaction", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.IN_PAYMENTS),
	N03("298N03", "Reject or Reschedule at NEFT Service Center", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	N04("298N04", "End-of-Day or End-of-Batch Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT_SSN),
	N09("298N09", "Reject or Reschedule at NEFT Service Branch", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F20("F20", "Acknowledgement Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F22("F22", "Non-Delivery Warning Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F23("F23", "Delivery Notification Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F24("F24", "Open Notification Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F25("F25", "Negative Acknowledgement Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F26("F26", "User Negative Acknowledgement Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT),
	F27("F27", "BankAPI Response Message", EnumMessageIdentifier.NEFT, EnumMessageDirection.INWARD, EnumMessageCategory.ACKNOWLEDGMENT);
	
	private String qualifiedMessageCode;
	private String description;
	private EnumMessageIdentifier messageIdentifier;
	private EnumMessageDirection messageDirection;
	private EnumMessageCategory messageCategory;
	
	/**
	 * Singleton constructor
	 * @param qualifiedMessageCode {@link String}
	 * @param description {@link String}
	 * @param messageIdentifier {@link EnumMessageIdentifier}
	 * @param messageDirection {@link EnumMessageDirection}
	 * @param messageCategory {@link EnumMessageCategory}
	 */
	private EnumMessage(String qualifiedMessageCode, String description, 
				EnumMessageIdentifier messageIdentifier, EnumMessageDirection messageDirection, 
				EnumMessageCategory messageCategory) {
		this.qualifiedMessageCode = qualifiedMessageCode;
		this.description = description;
		this.messageIdentifier = messageIdentifier;
		this.messageDirection = messageDirection;
		this.messageCategory = messageCategory;
	}
	
	/**
	 * Returns qualified message code of a message
	 * @return {@link String}
	 */
	public String getQualifiedMessageCode() {
		return qualifiedMessageCode;
	}
	
	/**
	 * Returns description of a message
	 * @return {@link String}
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Returns message identifier of a message
	 * @return {@link EnumMessageIdentifier}
	 */
	public EnumMessageIdentifier getMessageIdentifier() {
		return messageIdentifier;
	}
	
	/**
	 * Returns message direction of a message
	 * @return {@link EnumMessageDirection}
	 */
	public EnumMessageDirection getMessageDirection() {
		return messageDirection;
	}
	
	/**
	 * Returns message category of a message
	 * @return {@link EnumMessageCategory}
	 */
	public EnumMessageCategory getMessageCategory() {
		return messageCategory;
	}
	
	/**
	 * Returns a message for a given qualified message code.
	 * @param qualifiedMessageCode {@link String}
	 * @return {@link EnumMessage}
	 */
	public static EnumMessage getMessage(String qualifiedMessageCode) {
		for (EnumMessage element : EnumMessage.values()) {
			if (element.qualifiedMessageCode.equalsIgnoreCase(qualifiedMessageCode)) {
				return element;
			}
		}
		return null;
	}
	
	/**
	 * Verifies whether a given message is supported or not.</p>
	 * @param qualifiedMessageCode {@link String}
	 * @return {@link Boolean}
	 */
	public static boolean contains(String qualifiedMessageCode) {
		for (EnumMessage element : EnumMessage.values()) {
			if (element.qualifiedMessageCode.equalsIgnoreCase(qualifiedMessageCode)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns name of an Message Identifier if a valid qualified message code is provided
	 * otherwise it returns null.	 
	 * @param qualifiedMessageCode {@link String}
	 * @return {@link String}
	 */
	public static String getMessageIdentifierName(String qualifiedMessageCode) {
		for (EnumMessage element : EnumMessage.values()) {
			if (element.qualifiedMessageCode.equalsIgnoreCase(qualifiedMessageCode)) {
				return element.messageIdentifier.name();
			}
		}
		return null;
	}
	
	/**
	 * Returns an Message Identifier if a valid qualified message code is provided
	 * otherwise it returns null.	 
	 * @param qualifiedMessageCode {@link String}
	 * @return {@link EnumMessageIdentifier}
	 */
	public static EnumMessageIdentifier getMessageIdentifier(String qualifiedMessageCode) {
		for (EnumMessage element : EnumMessage.values()) {
			if (element.qualifiedMessageCode.equalsIgnoreCase(qualifiedMessageCode)) {
				return element.messageIdentifier;
			}
		}
		return null;
	}
	
	/**
	 * Returns message category type of a message.Incase of N02 the message category type can be Inward Return Payments/
	 * @param qualifiedMessageCode {@link String}
	 * @param isRRNPresent TODO
	 * @param EnumMessageDirection {@link EnumMessageDirection}
	 * @return {@link EnumMessageCategory} 
	 */
	public static EnumMessageCategory getMessageCategory(String qualifiedMessageCode, EnumMessageDirection direction, boolean isRRNPresent) {
		for (EnumMessage element : EnumMessage.values()) {
			if (element.qualifiedMessageCode.equalsIgnoreCase(qualifiedMessageCode)&& (element.messageDirection == direction)) {
				if (qualifiedMessageCode.equals(N02.qualifiedMessageCode)){
					if( isRRNPresent){
						return EnumMessageCategory.IN_RETURN_PAYMENTS;
					} else {
						return EnumMessageCategory.IN_PAYMENTS;
					}
				}
				return element.messageCategory;
			}
		}
		return null;
	}
}
