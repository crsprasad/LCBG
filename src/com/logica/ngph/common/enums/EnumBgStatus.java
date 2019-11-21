package com.logica.ngph.common.enums;

public enum EnumBgStatus {	

	CREATED("1"),
	REQUESTED("2"),
	CREATEDACK("3"),
	AMENDED("4"),
	AMENDED_REGISTERED("5"),
	REDUCED("6"),
	REDUCED_ACK("7"),
	RELEASE_REQUEST("8"),
	RELEASED("9");
	
	
	 String paymentStatus;
	 
	private EnumBgStatus(String paymentStatus){
		 this.paymentStatus = paymentStatus;
	 }
	 
	 public static String findPaymentStatusEnumByName(String payment)
		{
			for(EnumBgStatus messages :EnumBgStatus.values())
			{
				if(messages.name().equals(payment))
					return messages.paymentStatus;
		
			}
			return null;
			
		}
		// Static Method that will return the Enum Val based on Tag Value
		public static EnumBgStatus findEnumByTag(String tagName) {
			for (EnumBgStatus oneEnumSample : EnumBgStatus.values()) {
				if (oneEnumSample.paymentStatus.equalsIgnoreCase(tagName))
					return oneEnumSample;

			}
			return null;
		}
		
		public String getValue(){
			return paymentStatus;
		}
}
