package com.logica.ngph.common.enums;

public enum EnumLcStatus {
	PRE_ADVICE("1"),
	PRE_ADVICE_ACK("2"),
	OPENED("3"),
	REGISTERED("4"),
	AMENDED("5"),
	AMEND_REGISTERED("6"),
	PYMT_ADVICED("7"),
	PYMT_ADVICE_ACK("8"),
	PYMT_AUTHORISED("9"),
	PYMT_AUTHORISEACK("10"),

	CLAIMED("11"),
	CLAIM_PAID("12"),
	DISCREPANT("13"),
	DISCREPANT_APPROVED("14"),
	ADVICE_ACCEPTED("15"),
	ADVICE_REJECTED("16"),
	TRANSFERRED("17"),
	TRANSFERRED_ACK("18"),
	REIMB_READY("19"),
	REIMB_READY_ACK("20"),
	REIMB_AUTHORISED("21"),
	REIMB_AUTHORISED_ACK("22")
;
	
	 String paymentStatus;
	 
	private EnumLcStatus(String paymentStatus){
		 this.paymentStatus = paymentStatus;
	 }
	 
	 public static String findPaymentStatusEnumByName(String payment)
		{
			for(EnumLcStatus messages :EnumLcStatus.values())
			{
				if(messages.name().equals(payment))
					return messages.paymentStatus;
		
			}
			return null;
			
		}
		// Static Method that will return the Enum Val based on Tag Value
		public static EnumLcStatus findEnumByTag(String tagName) {
			for (EnumLcStatus oneEnumSample : EnumLcStatus.values()) {
				if (oneEnumSample.paymentStatus.equalsIgnoreCase(tagName))
					return oneEnumSample;

			}
			return null;
		}
}
