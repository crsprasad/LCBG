package com.logica.ngph.common.enums;

/**
 * Maintains the list of Message statuses that can be
 * assigned to a message while it is being processed. 
 * @author Prasad. B.S.R.
 * @version 1.0, 03/December/2009
 * @since 1.0
 */
public enum EnumMessageStatus {
	WAREHOUSED(1),
	AWAITING_COMPLETION(2),
	AWAITING_AUTHORIZATION(3),
	MANUAL_INTERVENTION(5),
	AWAITING_RELEASE(6),
	AWAITING_EC_ACK(7),
	AWAITING_AHI_ACK(8),
	REJECTED_BY_EC(9),
	COMPLETED(10),
	CANCELLED(11),
	DELETED(12),
	REJECTED_BY_NGPH(13),
	SENT_TO_HOST(16),
	AWAITING_DELETION(18),
	RECEIVER_MISMATCH(21),
	RETURNED(23),
	AWAITING_ALLOCATION(35),
	RESCHEDULED(45),
	AWAITING_CALLOUT(50),
	TRANSACTIONS(60),
	REJECTED_BY_CALLOUT(70);
	
	private int statusID;
	
	/**
	 * Singleton constructor
	 * @param statusID {@link String}
	 */
	private EnumMessageStatus(int statusID) {
		this.statusID = statusID;
	}
	
	/**
	 * Returns the ID of a message status.
	 * @return int
	 */
	public int getStatusID() {
		return statusID;
	}
	
	/**
	 * Checks whether the given message status id belongs to the
	 * Finality status. 
	 * @param pStatusID int
	 * @return boolean
	 */
	public static boolean isFinalityStaus(int pStatusID) {
		boolean finalityStatus = false;
		
		if (pStatusID == EnumMessageStatus.COMPLETED.getStatusID() || 
				pStatusID == EnumMessageStatus.RETURNED.getStatusID()) {
			finalityStatus = true;
		}
		return finalityStatus;
	}
	
	/**
	 * Returns the MessageStatus Enum for a given message status ID. 
	 * @param statusID int - Message Status ID
	 * @return {@link EnumMessageStatus}
	 */
	public static EnumMessageStatus getEnumMessageStatus(int statusID) {
		for (EnumMessageStatus element : EnumMessageStatus.values()) {
			if (element.getStatusID() == statusID) {
				return element;
			}
		}
		return null;
	}
}
