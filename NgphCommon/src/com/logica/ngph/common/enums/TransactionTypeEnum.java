package com.logica.ngph.common.enums;



public enum TransactionTypeEnum {
	P2P("45"),
	P2A("48"),
	P2M("47");

	 String txnType;
	 
	private TransactionTypeEnum(String txnType){
		 this.txnType = txnType;
	 }
	 
	 public static String findEnumByName(String payment)
		{
			for(TransactionTypeEnum messages :TransactionTypeEnum.values())
			{
				if(messages.name().equals(payment))
					return messages.txnType;
		
			}
			return null;
			
		}
		// Static Method that will return the Enum Val based on Tag Value
		public static TransactionTypeEnum findEnumByTag(String tagName) {
			for (TransactionTypeEnum oneEnumSample : TransactionTypeEnum.values()) {
				if (oneEnumSample.txnType.equalsIgnoreCase(tagName))
					return oneEnumSample;

			}
			return null;
		}

}
