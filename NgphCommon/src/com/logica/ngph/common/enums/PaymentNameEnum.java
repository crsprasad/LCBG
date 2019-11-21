package com.logica.ngph.common.enums;

public enum PaymentNameEnum {
	
	AWAITING_REPAIR("Awaiting Repair Outbound"),
	Received("Received Outbound"),
	WAREHOUSED("Ware Housed Outbound"),
	AWAITING_ACCOUNTING("Awaiting Accounting Outbound"),
	ACCOUNTING_COMPLETED("Accounting Complted Outbound"),
	AWAITING_LIQUIDITY("Awaiting Liquidity Outbound"),
	LIQUIDITY_COMPLETED("Liquidity Complted Outbound"),
	AWAITING_AML("Awaiting Aml Outbound"),
	AML_COMPLETED("Aml Complted Outbound"),
	AWAITING_BILLING("Awaiting Billing Outbound"),
	BILLING_COMPLETED("Billing Compled Outbound"),
	AWAITING_ACKNOWLEDGEMENT("Awaiting Acknowledgement Outbound"),
	COMPLETED("Compled Outbound"),
	FINALISED("Finalised Outbound"),
	AWAITING_RELEASE("Awaiting Release Outbound"),
	EXCEPTIONS("Exceptions Outbound"),
	AWAITING_AUTHORISATION("Awaiting Authorisation Outbound"),
	REJECTED_BY_CHANNEL("Rejected By Channel Outbound"),
	INVALIDS("Invalids Outbound"),
	RECEIVED_I("Received Inbound"),
	INTERVENED("Intervened Inbound"),
	AWAITING_REPAIR_I("Awaiting Repair Inbound"),
	AWAITING_ACCOUNTING_I("Awaiting Accounting Inbound"),
	ACCOUNTING_COMPLETED_I("Accounting Complted Inbound"),
	ACCOUNTING_MISMATCH_I("Accounting Mismatch Inbound"),
	AWAITING_LIQUIDITY_I("Awaiting Liquidity"),
	LIQUIDITY_COMPLETED_I("Liquidity Completed"),
	AWAITING_AML_I("Awaiting Aml Inbound"),
	AML_COMPLETED_I("Aml Completed Inbound"),
	AWAITING_BILLING_I("Awaiting Billing Inbound"),
	BILLING_COMPLETED_I("Billing Completed Inbound"),
	SEND_TO_HOST_I("Send to Host Inbound"),
	PROCESSED_MANUALLY_I("Processed Manually Inbound");
	
	 String paymentName;
	 private PaymentNameEnum(String paymentName){
		 this.paymentName = paymentName;
	 }
	 
	 public static String findPaymentNamesEnumByName(String payment){
		 for(PaymentNameEnum messages :PaymentNameEnum.values())
			{
				if(messages.name().equals(payment))
					return messages.paymentName;
		
			}
			return null;
	 }
}
