package com.logica.ngph.common.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 
 * @author mohdabdulaa
 *
 */
public class AccountingEntry {
	
	private String accountNum;
	
	private String accountType;
	
	private String accountCcy;
	
	private String accountBranch;
	
	private BigDecimal amount;
	
	//values allowed are Dr/Cr
	private String txIndicator;
	
	private Timestamp   accountingDate;
	
	//information/description about this entry
	private String narration;

	/**
	 * @return the accountNum
	 */
	public String getAccountNum() {
		return accountNum;
	}

	/**
	 * @param accountNum the accountNum to set
	 */
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the accountCcy
	 */
	public String getAccountCcy() {
		return accountCcy;
	}

	/**
	 * @param accountCcy the accountCcy to set
	 */
	public void setAccountCcy(String accountCcy) {
		this.accountCcy = accountCcy;
	}

	/**
	 * @return the accountBranch
	 */
	public String getAccountBranch() {
		return accountBranch;
	}

	/**
	 * @param accountBranch the accountBranch to set
	 */
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the txIndicator
	 */
	public String getTxIndicator() {
		return txIndicator;
	}

	/**
	 * @param txIndicator the txIndicator to set
	 */
	public void setTxIndicator(String txIndicator) {
		this.txIndicator = txIndicator;
	}

	/**
	 * @return the accountingDate
	 */
	public Timestamp getAccountingDate() {
		return accountingDate;
	}

	/**
	 * @param accountingDate the accountingDate to set
	 */
	public void setAccountingDate(Timestamp accountingDate) {
		this.accountingDate = accountingDate;
	}

	/**
	 * @return the narration
	 */
	public String getNarration() {
		return narration;
	}

	/**
	 * @param narration the narration to set
	 */
	public void setNarration(String narration) {
		this.narration = narration;
	}


}
