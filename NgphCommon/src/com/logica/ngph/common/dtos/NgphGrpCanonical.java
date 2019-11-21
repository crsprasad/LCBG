package com.logica.ngph.common.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 
 * @author mohdabdulaa
 *
 */
public class NgphGrpCanonical {

	//Message direction of the message. Values I/O only
	//@GRPHDR_MSG_DIRECTION
	private String grpDirection;
	
	//Message ID for group header 
	//@GRPHDR_MSGID
	private String grpMsgId;
	
	//Message creation date and time
	//@GRPHDR_CREDTTM
	private Timestamp grpCreationDtTime;
	
	//The date and time of the last modification
	//@GRPHDR_LASTMODIFIEDTIME
	private Timestamp grpLastModTime;
	
	//Batch booking indicator, whether single entry per transaction or consolidated credit, Values 0,1.
	//@GRPHDR_BTCHBOOKG
	private int grpBatchBooking;
	
	//Number of transactions in the bulk message
	//@GRPHDR_NBOFTXS
	private int grpNoOfTxns;
	
	//Control Sum of amounts for all the transactions in the message
	//@GRPHDR_CTRLSUM
	private BigDecimal grpControlSum;
	
	//Total Amount that is transferred from instructing to instructed
	//@GRPHDR_TTLINTRBKSTTLMAMT
	private BigDecimal grpTotalAmount;
	
	//Currency of the total Amount that is transferred from instructing to instructed
	//@GRPHDR_TTLINTRBKSTTLMCCY
	private String grpCurrency;
	
	//The date on which the interbank settlement happens so that on this date the funds are no more available with sender.
	//@GRPHDR_INTRBKSTTLMDT
	private Timestamp grpDate;
	
	//Settlement Method between instructing and instructed. Values CLRG, COVE, INDA & INGA
	//@GRPHDR_S_STTLMMTD
	private String grpSettleMethod;
	
	//The account ID as maintained in accounts master in NGPH for the specific purpose of debiting or crediting for the transactions.
	//@GRPHDR_S_STTLMACCT
	private String grpSettleAccount;
	
	//Code that identifies the clearing payment infrastructure of a country. RTG
	//@GRPHDR_S_CLRSYS_CD
	private String grpClearingSys;
	
	//The clearing system identification code like IFSC of RBI central site in RTGS
	//@GRPHDR_S_CLRSYS_PRTRY
	private String grpClearingSysId;
	
	//The NGPH bank code for the INSTRUCTING financial institution that will enable to construct the relevant FinInstnId
	//@GRPHDR_S_INSTGRMBRSMNTAGT_BK
	private String grpInstructingRmbrAgent;
	
	//The account ID as maintained in accounts master in NGPH for this INSTRUCTING financial institution
	//@GRPHDR_S_INSTGRMBRSMNTAGT_ACCT
	private String grpInstructingRmbrAgentAc;
	
	//The NGPH bank code for the INSTRUCTED financial institution that will enable to construct the relevant FinInstnId
	//@GRPHDR_S_INSTDRMBRSMNTAGT_BK
	private String grpInstructedRmbrAgent;
	
	//The account ID as maintained in accounts master in NGPH for this INSTRUCTED financial institution
	//@GRPHDR_S_INSTDRMBRSMNTAGT_ACCT
	private String grpInstructedRmbrAgentAc;
	
	//The NGPH bank code for the THIRD PARTY financial institution that will enable to construct the relevant FinInstnId
	//@GRPHDR_S_THRDRMBRSMNTAGT_BK
	private String grpThirdRmbrAgent;
	
	//The account ID as maintained in accounts master in NGPH for this THIRD PARTY financial institution
	//@GRPHDR_S_THRDRMBRSMNTAGT_ACCT
	private String grpThirdRmbrAgentAc;
	
	//The instruction priority.NORM, HIGH
	//@GRPHDR_P_INSTRPRTY
	private String grpInstructionPriority;
	
	//The clearing channel to be used for payment processing specified by sender.BOOK, MPNS, RTGS, RTNS
	//@GRPHDR_P_CLRCHANL
	private String grpClearingChannel;
	
	//Service level code as in external service level code list and as agreed between the parties
	//@GRPHDR_P_SVCLVL_CD
	private String grpSvcLevelCode;
	
	//The properitary code for the service level agreed
	//@GRPHDR_P_SVCLVL_PRTRY
	private String grpSvcLevelProperitary;
	
	//Local instrument code as in external local instrument code list
	//@GRPHDR_P_LCLINSTRM_CD
	private String grpLocalInstCode;
	
	//The properitary code for the local instrument code
	//@GRPHDR_P_LCLINSTRM_PRTRY
	private String grpLocalInstProperitary;
	
	//Category purpose code as in external category purpose code list
	//@GRPHDR_P_CTGYPURP_CD
	private String grpCatgPurposeCode;
	
	//The properitary code for the categroy purpose
	//@GRPHDR_P_CTGYPURP_PRTRY
	private String grpCatgPurposeProperitary;
	
	//The NGPH bank code for the INSTRUCTING financial institution
	//@GRPHDR_INSTGRMBRSMNTAGT_BK
	private String grpInstructingAgent;
	
	//The NGPH bank code for the INSTRUCTED financial institution
	//@GRPHDR_INSTDRMBRSMNTAGT_BK
	private String grpInstructedAgent;

	/**
	 * @return the grpDirection
	 */
	public String getGrpDirection() {
		return grpDirection;
	}

	/**
	 * @param grpDirection the grpDirection to set
	 */
	public void setGrpDirection(String grpDirection) {
		this.grpDirection = grpDirection;
	}

	/**
	 * @return the grpMsgId
	 */
	public String getGrpMsgId() {
		return grpMsgId;
	}

	/**
	 * @param grpMsgId the grpMsgId to set
	 */
	public void setGrpMsgId(String grpMsgId) {
		this.grpMsgId = grpMsgId;
	}

	/**
	 * @return the grpCreationDtTime
	 */
	public Timestamp getGrpCreationDtTime() {
		return grpCreationDtTime;
	}

	/**
	 * @param grpCreationDtTime the grpCreationDtTime to set
	 */
	public void setGrpCreationDtTime(Timestamp grpCreationDtTime) {
		this.grpCreationDtTime = grpCreationDtTime;
	}

	/**
	 * @return the grpLastModTime
	 */
	public Timestamp getGrpLastModTime() {
		return grpLastModTime;
	}

	/**
	 * @param grpLastModTime the grpLastModTime to set
	 */
	public void setGrpLastModTime(Timestamp grpLastModTime) {
		this.grpLastModTime = grpLastModTime;
	}

	/**
	 * @return the grpBatchBooking
	 */
	public int getGrpBatchBooking() {
		return grpBatchBooking;
	}

	/**
	 * @param grpBatchBooking the grpBatchBooking to set
	 */
	public void setGrpBatchBooking(int grpBatchBooking) {
		this.grpBatchBooking = grpBatchBooking;
	}

	/**
	 * @return the grpNoOfTxns
	 */
	public int getGrpNoOfTxns() {
		return grpNoOfTxns;
	}

	/**
	 * @param grpNoOfTxns the grpNoOfTxns to set
	 */
	public void setGrpNoOfTxns(int grpNoOfTxns) {
		this.grpNoOfTxns = grpNoOfTxns;
	}

	/**
	 * @return the grpControlSum
	 */
	public BigDecimal getGrpControlSum() {
		return grpControlSum;
	}

	/**
	 * @param grpControlSum the grpControlSum to set
	 */
	public void setGrpControlSum(BigDecimal grpControlSum) {
		this.grpControlSum = grpControlSum;
	}

	/**
	 * @return the grpTotalAmount
	 */
	public BigDecimal getGrpTotalAmount() {
		return grpTotalAmount;
	}

	/**
	 * @param grpTotalAmount the grpTotalAmount to set
	 */
	public void setGrpTotalAmount(BigDecimal grpTotalAmount) {
		this.grpTotalAmount = grpTotalAmount;
	}

	/**
	 * @return the grpCurrency
	 */
	public String getGrpCurrency() {
		return grpCurrency;
	}

	/**
	 * @param grpCurrency the grpCurrency to set
	 */
	public void setGrpCurrency(String grpCurrency) {
		this.grpCurrency = grpCurrency;
	}

	/**
	 * @return the grpDate
	 */
	public Timestamp getGrpDate() {
		return grpDate;
	}

	/**
	 * @param grpDate the grpDate to set
	 */
	public void setGrpDate(Timestamp grpDate) {
		this.grpDate = grpDate;
	}

	/**
	 * @return the grpSettleMethod
	 */
	public String getGrpSettleMethod() {
		return grpSettleMethod;
	}

	/**
	 * @param grpSettleMethod the grpSettleMethod to set
	 */
	public void setGrpSettleMethod(String grpSettleMethod) {
		this.grpSettleMethod = grpSettleMethod;
	}

	/**
	 * @return the grpSettleAccount
	 */
	public String getGrpSettleAccount() {
		return grpSettleAccount;
	}

	/**
	 * @param grpSettleAccount the grpSettleAccount to set
	 */
	public void setGrpSettleAccount(String grpSettleAccount) {
		this.grpSettleAccount = grpSettleAccount;
	}

	/**
	 * @return the grpClearingSys
	 */
	public String getGrpClearingSys() {
		return grpClearingSys;
	}

	/**
	 * @param grpClearingSys the grpClearingSys to set
	 */
	public void setGrpClearingSys(String grpClearingSys) {
		this.grpClearingSys = grpClearingSys;
	}

	/**
	 * @return the grpClearingSysId
	 */
	public String getGrpClearingSysId() {
		return grpClearingSysId;
	}

	/**
	 * @param grpClearingSysId the grpClearingSysId to set
	 */
	public void setGrpClearingSysId(String grpClearingSysId) {
		this.grpClearingSysId = grpClearingSysId;
	}

	/**
	 * @return the grpInstructingRmbrAgent
	 */
	public String getGrpInstructingRmbrAgent() {
		return grpInstructingRmbrAgent;
	}

	/**
	 * @param grpInstructingRmbrAgent the grpInstructingRmbrAgent to set
	 */
	public void setGrpInstructingRmbrAgent(String grpInstructingRmbrAgent) {
		this.grpInstructingRmbrAgent = grpInstructingRmbrAgent;
	}

	/**
	 * @return the grpInstructingRmbrAgentAc
	 */
	public String getGrpInstructingRmbrAgentAc() {
		return grpInstructingRmbrAgentAc;
	}

	/**
	 * @param grpInstructingRmbrAgentAc the grpInstructingRmbrAgentAc to set
	 */
	public void setGrpInstructingRmbrAgentAc(String grpInstructingRmbrAgentAc) {
		this.grpInstructingRmbrAgentAc = grpInstructingRmbrAgentAc;
	}

	/**
	 * @return the grpInstructedRmbrAgent
	 */
	public String getGrpInstructedRmbrAgent() {
		return grpInstructedRmbrAgent;
	}

	/**
	 * @param grpInstructedRmbrAgent the grpInstructedRmbrAgent to set
	 */
	public void setGrpInstructedRmbrAgent(String grpInstructedRmbrAgent) {
		this.grpInstructedRmbrAgent = grpInstructedRmbrAgent;
	}

	/**
	 * @return the grpInstructedRmbrAgentAc
	 */
	public String getGrpInstructedRmbrAgentAc() {
		return grpInstructedRmbrAgentAc;
	}

	/**
	 * @param grpInstructedRmbrAgentAc the grpInstructedRmbrAgentAc to set
	 */
	public void setGrpInstructedRmbrAgentAc(String grpInstructedRmbrAgentAc) {
		this.grpInstructedRmbrAgentAc = grpInstructedRmbrAgentAc;
	}

	/**
	 * @return the grpThirdRmbrAgent
	 */
	public String getGrpThirdRmbrAgent() {
		return grpThirdRmbrAgent;
	}

	/**
	 * @param grpThirdRmbrAgent the grpThirdRmbrAgent to set
	 */
	public void setGrpThirdRmbrAgent(String grpThirdRmbrAgent) {
		this.grpThirdRmbrAgent = grpThirdRmbrAgent;
	}

	/**
	 * @return the grpThirdRmbrAgentAc
	 */
	public String getGrpThirdRmbrAgentAc() {
		return grpThirdRmbrAgentAc;
	}

	/**
	 * @param grpThirdRmbrAgentAc the grpThirdRmbrAgentAc to set
	 */
	public void setGrpThirdRmbrAgentAc(String grpThirdRmbrAgentAc) {
		this.grpThirdRmbrAgentAc = grpThirdRmbrAgentAc;
	}

	/**
	 * @return the grpInstructionPriority
	 */
	public String getGrpInstructionPriority() {
		return grpInstructionPriority;
	}

	/**
	 * @param grpInstructionPriority the grpInstructionPriority to set
	 */
	public void setGrpInstructionPriority(String grpInstructionPriority) {
		this.grpInstructionPriority = grpInstructionPriority;
	}

	/**
	 * @return the grpClearingChannel
	 */
	public String getGrpClearingChannel() {
		return grpClearingChannel;
	}

	/**
	 * @param grpClearingChannel the grpClearingChannel to set
	 */
	public void setGrpClearingChannel(String grpClearingChannel) {
		this.grpClearingChannel = grpClearingChannel;
	}

	/**
	 * @return the grpSvcLevelCode
	 */
	public String getGrpSvcLevelCode() {
		return grpSvcLevelCode;
	}

	/**
	 * @param grpSvcLevelCode the grpSvcLevelCode to set
	 */
	public void setGrpSvcLevelCode(String grpSvcLevelCode) {
		this.grpSvcLevelCode = grpSvcLevelCode;
	}

	/**
	 * @return the grpSvcLevelProperitary
	 */
	public String getGrpSvcLevelProperitary() {
		return grpSvcLevelProperitary;
	}

	/**
	 * @param grpSvcLevelProperitary the grpSvcLevelProperitary to set
	 */
	public void setGrpSvcLevelProperitary(String grpSvcLevelProperitary) {
		this.grpSvcLevelProperitary = grpSvcLevelProperitary;
	}

	/**
	 * @return the grpLocalInstCode
	 */
	public String getGrpLocalInstCode() {
		return grpLocalInstCode;
	}

	/**
	 * @param grpLocalInstCode the grpLocalInstCode to set
	 */
	public void setGrpLocalInstCode(String grpLocalInstCode) {
		this.grpLocalInstCode = grpLocalInstCode;
	}

	/**
	 * @return the grpLocalInstProperitary
	 */
	public String getGrpLocalInstProperitary() {
		return grpLocalInstProperitary;
	}

	/**
	 * @param grpLocalInstProperitary the grpLocalInstProperitary to set
	 */
	public void setGrpLocalInstProperitary(String grpLocalInstProperitary) {
		this.grpLocalInstProperitary = grpLocalInstProperitary;
	}

	/**
	 * @return the grpCatgPurposeCode
	 */
	public String getGrpCatgPurposeCode() {
		return grpCatgPurposeCode;
	}

	/**
	 * @param grpCatgPurposeCode the grpCatgPurposeCode to set
	 */
	public void setGrpCatgPurposeCode(String grpCatgPurposeCode) {
		this.grpCatgPurposeCode = grpCatgPurposeCode;
	}

	/**
	 * @return the grpCatgPurposeProperitary
	 */
	public String getGrpCatgPurposeProperitary() {
		return grpCatgPurposeProperitary;
	}

	/**
	 * @param grpCatgPurposeProperitary the grpCatgPurposeProperitary to set
	 */
	public void setGrpCatgPurposeProperitary(String grpCatgPurposeProperitary) {
		this.grpCatgPurposeProperitary = grpCatgPurposeProperitary;
	}

	/**
	 * @return the grpInstructingAgent
	 */
	public String getGrpInstructingAgent() {
		return grpInstructingAgent;
	}

	/**
	 * @param grpInstructingAgent the grpInstructingAgent to set
	 */
	public void setGrpInstructingAgent(String grpInstructingAgent) {
		this.grpInstructingAgent = grpInstructingAgent;
	}

	/**
	 * @return the grpInstructedAgent
	 */
	public String getGrpInstructedAgent() {
		return grpInstructedAgent;
	}

	/**
	 * @param grpInstructedAgent the grpInstructedAgent to set
	 */
	public void setGrpInstructedAgent(String grpInstructedAgent) {
		this.grpInstructedAgent = grpInstructedAgent;
	}
	
	
}
