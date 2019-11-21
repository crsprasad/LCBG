package com.logica.ngph.common;



public enum PaymentStatusEnum {
	
	AWAITING_REPAIR("2"),
	Received("1"),
	WAREHOUSED("3"),
	AWAITING_ACCOUNTING("4"),
	ACCOUNTING_COMPLETED("5"),
	AWAITING_LIQUIDITY("6"),
	LIQUIDITY_COMPLETED("7"),
	AWAITING_AML("8"),
	AML_COMPLETED("9"),
	AWAITING_BILLING("10"),
	BILLING_COMPLETED("11"),
	AWAITING_ACKNOWLEDGEMENT("12"),
	COMPLETED("13"),
	FINALISED("14"),
	AWAITING_RELEASE("15"),
	EXCEPTIONS("16"),
	AWAITING_AUTHORISATION("17"),
	REJECTED_BY_CHANNEL("18"),
	INVALIDS("19"),
	RETURNED_0("21"),
	DUPLICATES_O("22"),
	REJECTED_O ("23"),
	RECEIVED_I("31"),
	INTERVENED("32"),
	AWAITING_REPAIR_I("33"),
	AWAITING_ACCOUNTING_I("34"),
	ACCOUNTING_COMPLETED_I("35"),
	ACCOUNTING_MISMATCH_I("36"),
	AWAITING_LIQUIDITY_I("37"),
	LIQUIDITY_COMPLETED_I("38"),
	AWAITING_AML_I("39"),
	AML_COMPLETED_I("40"),
	AWAITING_BILLING_I("41"),
	BILLING_COMPLETED_I("42"),
	SEND_TO_HOST_I("43"),
	PROCESSED_MANUALLY_I("44"),
	COMPLETED_I("45"),
	RETURNED_I("46"),
	DUPLICATES_I("47"),
	REJECTED_I("48"), 
	PENDING_AUTHORISATION("99");
	
	
	 String paymentStatus;
	 
	private PaymentStatusEnum(String paymentStatus){
		 this.paymentStatus = paymentStatus;
	 }
	 
	 public static String findPaymentStatusEnumByName(String payment)
		{
			for(PaymentStatusEnum messages :PaymentStatusEnum.values())
			{
				if(messages.name().equals(payment))
					return messages.paymentStatus;
		
			}
			return null;
			
		}
		// Static Method that will return the Enum Val based on Tag Value
		public static PaymentStatusEnum findEnumByTag(String tagName) {
			for (PaymentStatusEnum oneEnumSample : PaymentStatusEnum.values()) {
				if (oneEnumSample.paymentStatus.equalsIgnoreCase(tagName))
					return oneEnumSample;

			}
			return null;
		}
}
