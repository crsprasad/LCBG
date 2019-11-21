package com.logica.ngph.common.enums;



public enum AccountTypeEnums{
	
	SAVING("10"),
	CURRENT("11"),
	CASH_CREDIT("13"),
	LOAN_ACCOUNT("14"),
	OVER_DRAFT("12"),
	NRE("40"),
	INDO_NEPAL_REMITTANCE("51"),
	CARD_PAYMENT("52"),
	REMITTANCE_FOR_CUSTOMERS_NOT_HAVING_ACCOUNT_WITH_REMITTING_BANKS("50");
	
	String accountType;
	 
	private AccountTypeEnums(String paymentStatus){
		 this.accountType = paymentStatus;
	 }
	 
	 public static String findAccountTypeByName(String account)
		{
			for(AccountTypeEnums messages :AccountTypeEnums.values())
			{
				if(messages.name().equals(account))
					return messages.accountType;
		
			}
			return null;
			
		}
		// Static Method that will return the Enum Val based on Tag Value
		public static AccountTypeEnums findEnumByTag(String tagName) {
			for (AccountTypeEnums oneEnumSample : AccountTypeEnums.values()) {
				if (oneEnumSample.accountType.equalsIgnoreCase(tagName))
					return oneEnumSample;

			}
			return null;
		};

}
