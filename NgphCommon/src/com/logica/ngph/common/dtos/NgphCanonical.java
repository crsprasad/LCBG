package com.logica.ngph.common.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

/**
 * @author guptarb
 */
public class NgphCanonical implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String msgRef;
	private String grpMsgId;
	private int grpSeq;
	private String msgHost;
	private String msgChannel;
	private String msgChnlType;
	private String srcMsgType;
	private String srcMsgSubType;
	private String dstMsgType;
	private String dstMsgSubType;
	private String msgStatus;
	private String msgDirection;
	private String msgPrevStatus;
	private Timestamp receivedTime;
	private Timestamp lastModTime;
	private String txnReference;
	private String relReference;
	private String custTxnReference;
	private String sndrTxnId;
	private String clrgSysReference;
	private String sndrPymtPriority;
	private String clrgChannel;
	private String svcLevelCode;
	private String svcLevelProperitary;
	private String lclInstCode;
	private String lclInstProperitary;
	private String catgPurposeCode;
	private String catgPurposeProperitary;
	private String msgCurrency;
	private BigDecimal msgAmount;
	private Timestamp msgValueDate;
	private String sndrSttlmntPriority;
	private Timestamp drDateTime;
	private Timestamp crDateTime;
	private Timestamp clsDateTime;
	private Timestamp sttlmntTillTime;
	private Timestamp sttlmntFromTime;
	private Timestamp sttlmntRejTime;
	private Timestamp pymntAcceptedTime;
	private Timestamp cashpoolAdjstmntTime;
	private String instructedCurrency;
	private BigDecimal instructedAmount;
	private BigDecimal xchangeRate;
	private String chargeBearer;
	private String prevInstructingBank;
	private String prevInstructingAgentAcct;
	private String senderBank;
	private String receiverBank;
	private String intermediary1Bank;
	private String intermediary1BankId;
	private String intermediary1AgentAcct;
	private String intermediary2Bank;
	private String intermediary2AgentAcct;
	private String intermediary3Bank;
	private String intermediary3AgentAcct;
	private String orderingCustAccount;
	private String orderingInstitution;
	private String orderingInstitutionAcct;
	private String accountWithInstitution;
	private String accountWithInstitutionAcct;
	private String beneficiaryCustAcct;
	private String instructionsForCrdtrAgtCode;
	private String instructionsForCrdtrAgtText;
	private String instructionsForNextAgtCode;
	private String instructionsForNextAgtText;
	private String msgPurposeCode;
	private String msgPurposeText;
	private String regulatoryBankCode;
	private String regulatoryReportCurrency;
	private BigDecimal regulatoryReportAmount;
	private String regulatoryInformation;
	private String initiatorRemitReference;
	private String initiatorRemitAdviceMethod;
	private String remitInfoEmail;
	private String remitReceivingPartyName;
	private String remitReceivingPartyAddress;
	private String relRemitInfoRef;
	private String remitInfoRef;
	private String msgReturnReference;
	private String custAccount;
	private Timestamp msgBatchTime;
	private String msgDept;
	private String msgBranch;
	private String msgRules;
	private String msgErrorCode;
	private String orderingType;
	private String beneficiaryType;
	private String relUid;
	private String ultimateDebtorName;
	private String ultimateDebtorAddress;
	private String ultimateDebtorID;
	private String ultimateDebtorCtry;
	private String ultimateDebtorCtctDtls;
	private String initiatingPartyName;
	private String initiatingPartyAddress;
	private String initiatingPartyID;
	private String initiatingPartyCtry;
	private String initiatingPartyCtctDtls;
	private String orderingCustomerName;
	private String orderingCustomerAddress;
	private String orderingCustomerId;
	private String orderingCustomerCtry;
	private String orderingCustomerCtctDtls;
	private String senderCorrespondent;
	private String senderCorrespondentAcct;
	private String receiverCorrespondent;
	private String receiverCorrespondentAcct;
	private String thirdCorrespondent;
	private String thirdCorrespondentAcct;
	private String beneficiaryCustomerName;
	private String beneficiaryCustomerAddress;
	private String beneficiaryCustomerID;
	private String beneficiaryCustomerCtry;
	private String beneficiaryCustomerCtctDtls;
	private String ultimateCreditorName;
	private String ultimateCreditorAddress;
	private String ultimateCreditorID;
	private String ultimateCreditorCtry;
	private String ultimateCreditorCtctDtls;
	private List<ChargesDetailsDto> chargesDetails;
	private String intermediary1BankName;
	private String lastModifiedUser;
	private String comments;
	private String intermediary2BankName;
	private String intermediary3BankName;
	private String regulatoryReportDrCr;
	private String msgMur;
	private String crCurrency;
	private String drCurrency;
	private String serviceID;
	private BigDecimal baseCcyAmount;
	private BigDecimal msgCurrencyAmount;
	private BigDecimal instructedCcyAmount;
	private AccountingEntry accountingEntry[];
	private String repairReason;
	private String beneficiaryInstitution;
	private String beneficiaryInstitutionAcct;
	private String beneficiaryInstitutionName;
	private String intermediary1BankClrgCd;
	private String orderingInstitutionId;
	private String orderingInstitutionName;
	private String accountWithInstitutionId;
	private String accountWithInstitutionLoc;
	private String accountWithInstitutionClrgCd;
	private String accountWithInstitutionName;
	private String senderCorrespondentId;
	private String senderCorrespondentLoc;
	private String senderCorrespondentName;
	private String receiverCorrespondentId;
	private String receiverCorrespondentLoc;
	private String receiverCorrespondentName;
	private String thirdCorrespondentId;
	private String thirdCorrespondentLoc;
	private String thirdCorrespondentName;
	private String dstMsgChnlType;
	private String dstEiId;
	private String msgTxnType;
	private int pdeCount;	
	private String orderingAcType;
	private String beneficiaryAcType;
	private String accountingStatus;
	private String accountingReason;
	private String returnReasonCode;
	private String returnReasonDesc;
	private String seqNo;
	private NgphCanonical relCanonical;
	private HashMap<String, ErrorCodes> errorCodeMap;
	private String msgErrorDesc;
	private int msgIsReturn;
	
	private String lcType;
	private String lcNo;
	private String lcPrevAdvRef;
	private Timestamp lcIssueDt;
	private Timestamp lcExpDt;
	private String lcExpPlace;
	private String lcTolerance;
	private String lcPosTolerance;
	private String lcMaxCrAmt;
	private String lcAddlAmts;
	private String lcAuthBankCode;
	private String lcAuthBankAddr;
	private String lcAuthMode;
	private String lcDispatchPlace;
	private String lcDstn;
	private Timestamp lcLstShipDt;
	private String lcShipPeriod;
	private String lcShipTerms;
	private String lcDraftsAt;
	private String lcDraweeBnkPid;
	private String lcDraweeBnkCode;
	private String lcDraweeBnkAddr;
	private String lcMixedPymtDet;
	private String lcDefPymtDet;
	private String lcPartialShipment;
	private String lcTransShipment;
	private String lcDocsReq1;
	private String lcDocsReq2;
	private String lcAddnlCndt1;
	private String lcAddnlCndt2;
	private String lcCharges;
	private String lcPrsntnPrd;
	private String lcConfrmInstrns;
	private String lcInstrnTopay;
	private String lcNarrative;
	private int lcAmndmntNo;
	private Timestamp lcAmndmntDt;
	private Timestamp lcOldExpDt;
	private BigDecimal lcAmndmntIncAmt;
	private BigDecimal lcAmndmntDecAmt;
	private BigDecimal lcAmndmntOldAmt;
	private String lcAccId;
	private Timestamp lcAckDt;
	private BigDecimal lcChgsClaimed;
	private BigDecimal lcToAmtClaimed;
	private BigDecimal lcTotalAmtClaimed;
	private BigDecimal lcNetAmtClaimed;
	private BigDecimal lcAmtPaid;
	private String lcDiscrepancies;
	private String lcDispoDocs;

	private String msgRelStatus;
	private String lcTypeAuthCode;
	private String lcNonBankIssuer;
	private String lcDraweeBnkAcct;
	private String lcAppRulesCode;
	private String lcAppRulesDesc;
	private String lcDeparturePlace;
	private String lcFinalDstn;
	private String lcArrCommodity[]; 
	private String sendingInstId;
	private String sendingInstAcct;
	private String sendingInst;
	private String sendingInstLoc;
	private String sendingInstNameAdd;
	private String beneficiaryInstitutionPID;
	/*LCBG-73-Enablement of LC BG Guarantee message types.
	Added sequenceNo, noofMessages properties and there Setters and getters.*/
	private String message_so_far;
	private BigDecimal sequenceNo;
	private BigDecimal noofMessages;
	private Timestamp principalDate;
	private String principalCurrency;
	private BigDecimal principalAmt;
	private Timestamp prinDate;
	private String prinCurrency;
	private BigDecimal prinTotalAmt;
	private String lcAdditionalCurrency;
	private BigDecimal lcAdditionalAmt;
	private String beneficiaryInstitutionClrgCd;
	
	//Start - Added for BG Cover messages 760 and 767
	
	private String bgFormNumber; 
	private String bgType;
	private BigDecimal bgAmt;
	private String bgCurrency;
	private Timestamp bgFromDate;
	private Timestamp bgToDate;
	private Timestamp bgEffectiveDate;
	private Timestamp bgLodgementEndDate;
	private String bgLodgementPlace;
	private String issuingBankCode;
	private String issueingBankAddr;
	private String bgApplicentName;
	private String bgBenificiaryName;
	private String bgBenificiaryBankCode;
	private String bgBenificiaryBankAddr;
	private String bgPurpose;
	private String contractReference;
	private String StampDutyPaid;
	private String stampDutyNum;
	private Timestamp stampDutyDateTime; 
	private BigDecimal bgPaidAmt;
	private String bgStateCode;
	private String bgArticleNum;
	private Timestamp bgPaymentDate;
	private String bgPaymentPlace;
	private String bgDematForm;
	private String bgCostodianProvider;
	private String bgDematAccNum;
	
	//End - Added for BG Cover messages	760 and 767
	//Start - Added for Mizuho Bank
	private String lcChargesDeducted;
	private String lcChargesAdded;
	//private int noofProcessIterations;
	private String messageCurrency;
	private BigDecimal lcChargesClaimed;
	private String descriptionofGoods1;
	private String descriptionofGoods2;
	private BigDecimal lcTotalAmountClaimed;
	private String principalCurr;
	private BigDecimal principalAmount;
	
	
	
	



	/**
	 * @return the noofProcessIterations
	 *//*
	public int getNoofProcessIterations() {
		return noofProcessIterations;
	}

	*//**
	 * @param noofProcessIterations the noofProcessIterations to set
	 *//*
	public void setNoofProcessIterations(int noofProcessIterations) {
		this.noofProcessIterations = noofProcessIterations;
	}*/

	/**
	 * @return the messageCurrency
	 *//*
	public String getMessageCurrency() {
		return messageCurrency;
	}

	*//**
	 * @param messageCurrency the messageCurrency to set
	 *//*
	public void setMessageCurrency(String messageCurrency) {
		this.messageCurrency = messageCurrency;
	}

	*//**
	 * @return the lcChargesClaimed
	 *//*
	public BigDecimal getLcChargesClaimed() {
		return lcChargesClaimed;
	}

	*//**
	 * @param lcChargesClaimed the lcChargesClaimed to set
	 *//*
	public void setLcChargesClaimed(BigDecimal lcChargesClaimed) {
		this.lcChargesClaimed = lcChargesClaimed;
	}*/

	/**
	 * @return the lcTotalAmountClaimed
	 */
	public BigDecimal getLcTotalAmountClaimed() {
		return lcTotalAmountClaimed;
	}

	/**
	 * @param lcTotalAmountClaimed the lcTotalAmountClaimed to set
	 */
	public void setLcTotalAmountClaimed(BigDecimal lcTotalAmountClaimed) {
		this.lcTotalAmountClaimed = lcTotalAmountClaimed;
	}

	/**
	 * @return the principalCurr
	 */
	public String getPrincipalCurr() {
		return principalCurr;
	}

	/**
	 * @param principalCurr the principalCurr to set
	 */
	public void setPrincipalCurr(String principalCurr) {
		this.principalCurr = principalCurr;
	}

	/**
	 * @return the principalAmount
	 */
	public BigDecimal getPrincipalAmount() {
		return principalAmount;
	}

	/**
	 * @param principalAmount the principalAmount to set
	 */
	public void setPrincipalAmount(BigDecimal principalAmount) {
		this.principalAmount = principalAmount;
	}

	/**
	 * @return the messageCurrency
	 */
	public String getMessageCurrency() {
		return messageCurrency;
	}

	/**
	 * @param messageCurrency the messageCurrency to set
	 */
	public void setMessageCurrency(String messageCurrency) {
		this.messageCurrency = messageCurrency;
	}

	/**
	 * @return the lcChargesClaimed
	 */
	public BigDecimal getLcChargesClaimed() {
		return lcChargesClaimed;
	}

	/**
	 * @param lcChargesClaimed the lcChargesClaimed to set
	 */
	public void setLcChargesClaimed(BigDecimal lcChargesClaimed) {
		this.lcChargesClaimed = lcChargesClaimed;
	}

	/**
	 * @return the descriptionofGoods1
	 */
	public String getDescriptionofGoods1() {
		return descriptionofGoods1;
	}

	/**
	 * @param descriptionofGoods1 the descriptionofGoods1 to set
	 */
	public void setDescriptionofGoods1(String descriptionofGoods1) {
		this.descriptionofGoods1 = descriptionofGoods1;
	}

	/**
	 * @return the descriptionofGoods2
	 */
	public String getDescriptionofGoods2() {
		return descriptionofGoods2;
	}

	/**
	 * @param descriptionofGoods2 the descriptionofGoods2 to set
	 */
	public void setDescriptionofGoods2(String descriptionofGoods2) {
		this.descriptionofGoods2 = descriptionofGoods2;
	}

	/**
	 * @return the msgErrorDesc
	 */
	public String getMsgErrorDesc() {
		return msgErrorDesc;
	}

	/**
	 * @return the lcChargesDeducted
	 */
	public String getLcChargesDeducted() {
		return lcChargesDeducted;
	}

	/**
	 * @param lcChargesDeducted the lcChargesDeducted to set
	 */
	public void setLcChargesDeducted(String lcChargesDeducted) {
		this.lcChargesDeducted = lcChargesDeducted;
	}

	/**
	 * @return the lcChargesAdded
	 */
	public String getLcChargesAdded() {
		return lcChargesAdded;
	}

	/**
	 * @param lcChargesAdded the lcChargesAdded to set
	 */
	public void setLcChargesAdded(String lcChargesAdded) {
		this.lcChargesAdded = lcChargesAdded;
	}

	/**
	 * @param msgErrorDesc the msgErrorDesc to set
	 */
	public void setMsgErrorDesc(String msgErrorDesc) {
		this.msgErrorDesc = msgErrorDesc;
	}

	/**
	 * @return the errorCodeMap
	 */
	public HashMap<String, ErrorCodes> getErrorCodeMap() {
		return errorCodeMap;
	}

	/**
	 * @param errorCodeMap the errorCodeMap to set
	 */
	public void setErrorCodeMap(HashMap<String, ErrorCodes> errorCodeMap) {
		this.errorCodeMap = errorCodeMap;
	}

	/**
	 * @return the relCanonical
	 */
	public NgphCanonical getRelCanonical() {
		return relCanonical;
	}

	/**
	 * @param relCanonical the relCanonical to set
	 */
	public void setRelCanonical(NgphCanonical relCanonical) {
		this.relCanonical = relCanonical;
	}

	/**
	 * @return the seqNo
	 */
	public String getSeqNo() {
		return seqNo;
	}

	/**
	 * @param seqNo the seqNo to set
	 */
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	/**
	 * @return the returnReasonDesc
	 */
	public String getReturnReasonDesc() {
		return returnReasonDesc;
	}

	/**
	 * @param returnReasonDesc the returnReasonDesc to set
	 */
	public void setReturnReasonDesc(String returnReasonDesc) {
		this.returnReasonDesc = returnReasonDesc;
	}

	/**
	 * @return the returnReasonCode
	 */
	public String getReturnReasonCode() {
		return returnReasonCode;
	}

	/**
	 * @param returnReasonCode the returnReasonCode to set
	 */
	public void setReturnReasonCode(String returnReasonCode) {
		this.returnReasonCode = returnReasonCode;
	}

	/**
	 * @return the accountingReason
	 */
	public String getAccountingReason() {
		return accountingReason;
	}

	/**
	 * @param accountingReason the accountingReason to set
	 */
	public void setAccountingReason(String accountingReason) {
		this.accountingReason = accountingReason;
	}

	/**
	 * @return the accountingStatus
	 */
	public String getAccountingStatus() {
		return accountingStatus;
	}

	/**
	 * @param accountingStatus the accountingStatus to set
	 */
	public void setAccountingStatus(String accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	/**
	 * @return the beneficiaryAcType
	 */
	public String getBeneficiaryAcType() {
		return beneficiaryAcType;
	}

	/**
	 * @param beneficiaryAcType the beneficiaryAcType to set
	 */
	public void setBeneficiaryAcType(String beneficiaryAcType) {
		this.beneficiaryAcType = beneficiaryAcType;
	}

	/**
	 * @return the orderingAcType
	 */
	public String getOrderingAcType() {
		return orderingAcType;
	}

	/**
	 * @param orderingAcType the orderingAcType to set
	 */
	public void setOrderingAcType(String orderingAcType) {
		this.orderingAcType = orderingAcType;
	}

	/**
	 * @return the pdeCount
	 */
	public int getPdeCount() {
		return pdeCount;
	}

	/**
	 * @param pdeCount the pdeCount to set
	 */
	public void setPdeCount(int pdeCount) {
		this.pdeCount = pdeCount;
	}

	/**
	 * @return the msgTxnType
	 */
	public String getMsgTxnType() {
		return msgTxnType;
	}

	/**
	 * @param msgTxnType the msgTxnType to set
	 */
	public void setMsgTxnType(String msgTxnType) {
		this.msgTxnType = msgTxnType;
	}

	/**
	 * @return the dstEiId
	 */
	public String getDstEiId() {
		return dstEiId;
	}

	/**
	 * @param dstEiId the dstEiId to set
	 */
	public void setDstEiId(String dstEiId) {
		this.dstEiId = dstEiId;
	}

	/**
	 * @return the dstMsgChnlType
	 */
	public String getDstMsgChnlType() {
		return dstMsgChnlType;
	}

	/**
	 * @param dstMsgChnlType the dstMsgChnlType to set
	 */
	public void setDstMsgChnlType(String dstMsgChnlType) {
		this.dstMsgChnlType = dstMsgChnlType;
	}

	/**
	 * @return the intermediary1BankId
	 */
	public String getIntermediary1BankId() {
		return intermediary1BankId;
	}

	/**
	 * @return the intermediary1BankClrgCd
	 */
	public String getIntermediary1BankClrgCd() {
		return intermediary1BankClrgCd;
	}

	/**
	 * @return the orderingInstitutionId
	 */
	public String getOrderingInstitutionId() {
		return orderingInstitutionId;
	}

	/**
	 * @return the orderingInstitutionName
	 */
	public String getOrderingInstitutionName() {
		return orderingInstitutionName;
	}

	/**
	 * @return the accountWithInstitutionId
	 */
	public String getAccountWithInstitutionId() {
		return accountWithInstitutionId;
	}

	/**
	 * @return the accountWithInstitutionLoc
	 */
	public String getAccountWithInstitutionLoc() {
		return accountWithInstitutionLoc;
	}

	/**
	 * @return the accountWithInstitutionClrgCd
	 */
	public String getAccountWithInstitutionClrgCd() {
		return accountWithInstitutionClrgCd;
	}

	/**
	 * @return the accountWithInstitutionName
	 */
	public String getAccountWithInstitutionName() {
		return accountWithInstitutionName;
	}

	/**
	 * @return the senderCorrespondentId
	 */
	public String getSenderCorrespondentId() {
		return senderCorrespondentId;
	}

	/**
	 * @return the senderCorrespondentLoc
	 */
	public String getSenderCorrespondentLoc() {
		return senderCorrespondentLoc;
	}

	/**
	 * @return the senderCorrespondentName
	 */
	public String getSenderCorrespondentName() {
		return senderCorrespondentName;
	}

	/**
	 * @return the receiverCorrespondentId
	 */
	public String getReceiverCorrespondentId() {
		return receiverCorrespondentId;
	}

	/**
	 * @return the receiverCorrespondentLoc
	 */
	public String getReceiverCorrespondentLoc() {
		return receiverCorrespondentLoc;
	}

	/**
	 * @return the receiverCorrespondentName
	 */
	public String getReceiverCorrespondentName() {
		return receiverCorrespondentName;
	}

	/**
	 * @return the thirdCorrespondentId
	 */
	public String getThirdCorrespondentId() {
		return thirdCorrespondentId;
	}

	/**
	 * @return the thirdCorrespondentLoc
	 */
	public String getThirdCorrespondentLoc() {
		return thirdCorrespondentLoc;
	}

	/**
	 * @return the thirdCorrespondentName
	 */
	public String getThirdCorrespondentName() {
		return thirdCorrespondentName;
	}

	/**
	 * @param intermediary1BankId the intermediary1BankId to set
	 */
	public void setIntermediary1BankId(String intermediary1BankId) {
		this.intermediary1BankId = intermediary1BankId;
	}

	/**
	 * @param intermediary1BankClrgCd the intermediary1BankClrgCd to set
	 */
	public void setIntermediary1BankClrgCd(String intermediary1BankClrgCd) {
		this.intermediary1BankClrgCd = intermediary1BankClrgCd;
	}

	/**
	 * @param orderingInstitutionId the orderingInstitutionId to set
	 */
	public void setOrderingInstitutionId(String orderingInstitutionId) {
		this.orderingInstitutionId = orderingInstitutionId;
	}

	/**
	 * @param orderingInstitutionName the orderingInstitutionName to set
	 */
	public void setOrderingInstitutionName(String orderingInstitutionName) {
		this.orderingInstitutionName = orderingInstitutionName;
	}

	/**
	 * @param accountWithInstitutionId the accountWithInstitutionId to set
	 */
	public void setAccountWithInstitutionId(String accountWithInstitutionId) {
		this.accountWithInstitutionId = accountWithInstitutionId;
	}

	/**
	 * @param accountWithInstitutionLoc the accountWithInstitutionLoc to set
	 */
	public void setAccountWithInstitutionLoc(String accountWithInstitutionLoc) {
		this.accountWithInstitutionLoc = accountWithInstitutionLoc;
	}

	/**
	 * @param accountWithInstitutionClrgCd the accountWithInstitutionClrgCd to set
	 */
	public void setAccountWithInstitutionClrgCd(String accountWithInstitutionClrgCd) {
		this.accountWithInstitutionClrgCd = accountWithInstitutionClrgCd;
	}

	/**
	 * @param accountWithInstitutionName the accountWithInstitutionName to set
	 */
	public void setAccountWithInstitutionName(String accountWithInstitutionName) {
		this.accountWithInstitutionName = accountWithInstitutionName;
	}

	/**
	 * @param senderCorrespondentId the senderCorrespondentId to set
	 */
	public void setSenderCorrespondentId(String senderCorrespondentId) {
		this.senderCorrespondentId = senderCorrespondentId;
	}

	/**
	 * @param senderCorrespondentLoc the senderCorrespondentLoc to set
	 */
	public void setSenderCorrespondentLoc(String senderCorrespondentLoc) {
		this.senderCorrespondentLoc = senderCorrespondentLoc;
	}

	/**
	 * @param senderCorrespondentName the senderCorrespondentName to set
	 */
	public void setSenderCorrespondentName(String senderCorrespondentName) {
		this.senderCorrespondentName = senderCorrespondentName;
	}

	/**
	 * @param receiverCorrespondentId the receiverCorrespondentId to set
	 */
	public void setReceiverCorrespondentId(String receiverCorrespondentId) {
		this.receiverCorrespondentId = receiverCorrespondentId;
	}

	/**
	 * @param receiverCorrespondentLoc the receiverCorrespondentLoc to set
	 */
	public void setReceiverCorrespondentLoc(String receiverCorrespondentLoc) {
		this.receiverCorrespondentLoc = receiverCorrespondentLoc;
	}

	/**
	 * @param receiverCorrespondentName the receiverCorrespondentName to set
	 */
	public void setReceiverCorrespondentName(String receiverCorrespondentName) {
		this.receiverCorrespondentName = receiverCorrespondentName;
	}

	/**
	 * @param thirdCorrespondentId the thirdCorrespondentId to set
	 */
	public void setThirdCorrespondentId(String thirdCorrespondentId) {
		this.thirdCorrespondentId = thirdCorrespondentId;
	}

	/**
	 * @param thirdCorrespondentLoc the thirdCorrespondentLoc to set
	 */
	public void setThirdCorrespondentLoc(String thirdCorrespondentLoc) {
		this.thirdCorrespondentLoc = thirdCorrespondentLoc;
	}

	/**
	 * @param thirdCorrespondentName the thirdCorrespondentName to set
	 */
	public void setThirdCorrespondentName(String thirdCorrespondentName) {
		this.thirdCorrespondentName = thirdCorrespondentName;
	}

	/**
	 * @return the beneficiaryInstitution
	 */
	public String getBeneficiaryInstitution() {
		return beneficiaryInstitution;
	}

	/**
	 * @return the beneficiaryInstitutionAcct
	 */
	public String getBeneficiaryInstitutionAcct() {
		return beneficiaryInstitutionAcct;
	}

	/**
	 * @return the beneficiaryInstitutionName
	 */
	public String getBeneficiaryInstitutionName() {
		return beneficiaryInstitutionName;
	}

	/**
	 * @param beneficiaryInstitution the beneficiaryInstitution to set
	 */
	public void setBeneficiaryInstitution(String beneficiaryInstitution) {
		this.beneficiaryInstitution = beneficiaryInstitution;
	}

	/**
	 * @param beneficiaryInstitutionAcct the beneficiaryInstitutionAcct to set
	 */
	public void setBeneficiaryInstitutionAcct(String beneficiaryInstitutionAcct) {
		this.beneficiaryInstitutionAcct = beneficiaryInstitutionAcct;
	}

	/**
	 * @param beneficiaryInstitutionName the beneficiaryInstitutionName to set
	 */
	public void setBeneficiaryInstitutionName(String beneficiaryInstitutionName) {
		this.beneficiaryInstitutionName = beneficiaryInstitutionName;
	}

	
	
	/**
	 * @return the repairReason
	 */
	public String getRepairReason() {
		return repairReason;
	}

	/**
	 * @param repairReason the repairReason to set
	 */
	public void setRepairReason(String repairReason) {
		this.repairReason = repairReason;
	}

	/**
	 * @return the accountingEntry
	 */
	public AccountingEntry[] getAccountingEntry() {
		return accountingEntry;
	}

	/**
	 * @param accountingEntry the accountingEntry to set
	 */
	public void setAccountingEntry(AccountingEntry[] accountingEntry) {
		this.accountingEntry = accountingEntry;
	}

	public BigDecimal getBaseCcyAmount() {
		return baseCcyAmount;
	}

	public void setBaseCcyAmount(BigDecimal baseCcyAmount) {
		this.baseCcyAmount = baseCcyAmount;
	}

	public BigDecimal getMsgCurrencyAmount() {
		return msgCurrencyAmount;
	}

	public void setMsgCurrencyAmount(BigDecimal msgCurrencyAmount) {
		this.msgCurrencyAmount = msgCurrencyAmount;
	}

	public BigDecimal getInstructedCcyAmount() {
		return instructedCcyAmount;
	}

	public void setInstructedCcyAmount(BigDecimal instructedCcyAmount) {
		this.instructedCcyAmount = instructedCcyAmount;
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public String getCrCurrency() {
		return crCurrency;
	}

	public void setCrCurrency(String crCurrency) {
		this.crCurrency = crCurrency;
	}

	public String getDrCurrency() {
		return drCurrency;
	}

	public void setDrCurrency(String drCurrency) {
		this.drCurrency = drCurrency;
	}

	public String getMsgMur() {
		return msgMur;
	}

	public void setMsgMur(String msgMur) {
		this.msgMur = msgMur;
	}
	
	public String getIntermediary2BankName() {
		return intermediary2BankName;
	}

	public void setIntermediary2BankName(String intermediary2BankName) {
		this.intermediary2BankName = intermediary2BankName;
	}

	public String getIntermediary3BankName() {
		return intermediary3BankName;
	}

	public void setIntermediary3BankName(String intermediary3BankName) {
		this.intermediary3BankName = intermediary3BankName;
	}

	public String getRegulatoryReportDrCr() {
		return regulatoryReportDrCr;
	}

	public void setRegulatoryReportDrCr(String regulatoryReportDrCr) {
		this.regulatoryReportDrCr = regulatoryReportDrCr;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the intermediary1BankName
	 */
	public String getIntermediary1BankName() {
		return intermediary1BankName;
	}

	/**
	 * @param intermediary1BankName the intermediary1BankName to set
	 */
	public void setIntermediary1BankName(String intermediary1BankName) {
		this.intermediary1BankName = intermediary1BankName;
	}

	/**
	 * @return the chargesDetails
	 */
	public List<ChargesDetailsDto> getChargesDetails() {
		return chargesDetails;
	}

	/**
	 * @param chargesDetails the chargesDetails to set
	 */
	public void setChargesDetails(List<ChargesDetailsDto> chargesDetails) {
		this.chargesDetails = chargesDetails;
	}

	/**
	 * @return the ultimateDebtorName
	 */
	public String getUltimateDebtorName() {
		return ultimateDebtorName;
	}

	/**
	 * @param ultimateDebtorName the ultimateDebtorName to set
	 */
	public void setUltimateDebtorName(String ultimateDebtorName) {
		this.ultimateDebtorName = ultimateDebtorName;
	}

	/**
	 * @return the ultimateDebtorAddress
	 */
	public String getUltimateDebtorAddress() {
		return ultimateDebtorAddress;
	}

	/**
	 * @param ultimateDebtorAddress the ultimateDebtorAddress to set
	 */
	public void setUltimateDebtorAddress(String ultimateDebtorAddress) {
		this.ultimateDebtorAddress = ultimateDebtorAddress;
	}

	/**
	 * @return the ultimateDebtorID
	 */
	public String getUltimateDebtorID() {
		return ultimateDebtorID;
	}

	/**
	 * @param ultimateDebtorID the ultimateDebtorID to set
	 */
	public void setUltimateDebtorID(String ultimateDebtorID) {
		this.ultimateDebtorID = ultimateDebtorID;
	}

	/**
	 * @return the ultimateDebtorCtry
	 */
	public String getUltimateDebtorCtry() {
		return ultimateDebtorCtry;
	}

	/**
	 * @param ultimateDebtorCtry the ultimateDebtorCtry to set
	 */
	public void setUltimateDebtorCtry(String ultimateDebtorCtry) {
		this.ultimateDebtorCtry = ultimateDebtorCtry;
	}

	/**
	 * @return the ultimateDebtorCtctDtls
	 */
	public String getUltimateDebtorCtctDtls() {
		return ultimateDebtorCtctDtls;
	}

	/**
	 * @param ultimateDebtorCtctDtls the ultimateDebtorCtctDtls to set
	 */
	public void setUltimateDebtorCtctDtls(String ultimateDebtorCtctDtls) {
		this.ultimateDebtorCtctDtls = ultimateDebtorCtctDtls;
	}

	/**
	 * @return the initiatingPartyName
	 */
	public String getInitiatingPartyName() {
		return initiatingPartyName;
	}

	/**
	 * @param initiatingPartyName the initiatingPartyName to set
	 */
	public void setInitiatingPartyName(String initiatingPartyName) {
		this.initiatingPartyName = initiatingPartyName;
	}

	/**
	 * @return the initiatingPartyAddress
	 */
	public String getInitiatingPartyAddress() {
		return initiatingPartyAddress;
	}

	/**
	 * @param initiatingPartyAddress the initiatingPartyAddress to set
	 */
	public void setInitiatingPartyAddress(String initiatingPartyAddress) {
		this.initiatingPartyAddress = initiatingPartyAddress;
	}

	/**
	 * @return the initiatingPartyID
	 */
	public String getInitiatingPartyID() {
		return initiatingPartyID;
	}

	/**
	 * @param initiatingPartyID the initiatingPartyID to set
	 */
	public void setInitiatingPartyID(String initiatingPartyID) {
		this.initiatingPartyID = initiatingPartyID;
	}

	/**
	 * @return the initiatingPartyCtry
	 */
	public String getInitiatingPartyCtry() {
		return initiatingPartyCtry;
	}

	/**
	 * @param initiatingPartyCtry the initiatingPartyCtry to set
	 */
	public void setInitiatingPartyCtry(String initiatingPartyCtry) {
		this.initiatingPartyCtry = initiatingPartyCtry;
	}
	
	/**
	 * @return the initiatingPartyCtctDtls
	 */
	public String getInitiatingPartyCtctDtls() {
		return initiatingPartyCtctDtls;
	}

	/**
	 * @param initiatingPartyCtctDtls the initiatingPartyCtctDtls to set
	 */
	public void setInitiatingPartyCtctDtls(String initiatingPartyCtctDtls) {
		this.initiatingPartyCtctDtls = initiatingPartyCtctDtls;
	}

	/**
	 * @return the orderingCustomerName
	 */
	public String getOrderingCustomerName() {
		return orderingCustomerName;
	}

	/**
	 * @param orderingCustomerName the orderingCustomerName to set
	 */
	public void setOrderingCustomerName(String orderingCustomerName) {
		this.orderingCustomerName = orderingCustomerName;
	}

	/**
	 * @return the orderingCustomerAddress
	 */
	public String getOrderingCustomerAddress() {
		return orderingCustomerAddress;
	}

	/**
	 * @param orderingCustomerAddress the orderingCustomerAddress to set
	 */
	public void setOrderingCustomerAddress(String orderingCustomerAddress) {
		this.orderingCustomerAddress = orderingCustomerAddress;
	}

	/**
	 * @return the orderingCustomerID
	 */
	public String getOrderingCustomerId() {
		return orderingCustomerId;
	}

	/**
	 * @param orderingCustomerID the orderingCustomerID to set
	 */
	public void setOrderingCustomerId(String orderingCustomerId) {
		this.orderingCustomerId = orderingCustomerId;
	}

	/**
	 * @return the orderingCustomerCtry
	 */
	public String getOrderingCustomerCtry() {
		return orderingCustomerCtry;
	}

	/**
	 * @param orderingCustomerCtry the orderingCustomerCtry to set
	 */
	public void setOrderingCustomerCtry(String orderingCustomerCtry) {
		this.orderingCustomerCtry = orderingCustomerCtry;
	}

	/**
	 * @return the orderingCustomerCtctDtls
	 */
	public String getOrderingCustomerCtctDtls() {
		return orderingCustomerCtctDtls;
	}

	/**
	 * @param orderingCustomerCtctDtls the orderingCustomerCtctDtls to set
	 */
	public void setOrderingCustomerCtctDtls(String orderingCustomerCtctDtls) {
		this.orderingCustomerCtctDtls = orderingCustomerCtctDtls;
	}

	/**
	 * @return the senderCorrespondent
	 */
	public String getSenderCorrespondent() {
		return senderCorrespondent;
	}

	/**
	 * @param senderCorrespondent the senderCorrespondent to set
	 */
	public void setSenderCorrespondent(String senderCorrespondent) {
		this.senderCorrespondent = senderCorrespondent;
	}

	/**
	 * @return the senderCorrespondentAcct
	 */
	public String getSenderCorrespondentAcct() {
		return senderCorrespondentAcct;
	}

	/**
	 * @param senderCorrespondentAcct the senderCorrespondentAcct to set
	 */
	public void setSenderCorrespondentAcct(String senderCorrespondentAcct) {
		this.senderCorrespondentAcct = senderCorrespondentAcct;
	}

	/**
	 * @return the receiverCorrespondent
	 */
	public String getReceiverCorrespondent() {
		return receiverCorrespondent;
	}

	/**
	 * @param receiverCorrespondent the receiverCorrespondent to set
	 */
	public void setReceiverCorrespondent(String receiverCorrespondent) {
		this.receiverCorrespondent = receiverCorrespondent;
	}

	/**
	 * @return the receiverCorrespondentAcct
	 */
	public String getReceiverCorrespondentAcct() {
		return receiverCorrespondentAcct;
	}

	/**
	 * @param receiverCorrespondentAcct the receiverCorrespondentAcct to set
	 */
	public void setReceiverCorrespondentAcct(String receiverCorrespondentAcct) {
		this.receiverCorrespondentAcct = receiverCorrespondentAcct;
	}

	/**
	 * @return the thirdCorrespondent
	 */
	public String getThirdCorrespondent() {
		return thirdCorrespondent;
	}

	/**
	 * @param thirdCorrespondent the thirdCorrespondent to set
	 */
	public void setThirdCorrespondent(String thirdCorrespondent) {
		this.thirdCorrespondent = thirdCorrespondent;
	}

	/**
	 * @return the thirdCorrespondentAcct
	 */
	public String getThirdCorrespondentAcct() {
		return thirdCorrespondentAcct;
	}

	/**
	 * @param thirdCorrespondentAcct the thirdCorrespondentAcct to set
	 */
	public void setThirdCorrespondentAcct(String thirdCorrespondentAcct) {
		this.thirdCorrespondentAcct = thirdCorrespondentAcct;
	}

	/**
	 * @return the beneficiaryCustomerName
	 */
	public String getBeneficiaryCustomerName() {
		return beneficiaryCustomerName;
	}

	/**
	 * @param beneficiaryCustomerName the beneficiaryCustomerName to set
	 */
	public void setBeneficiaryCustomerName(String beneficiaryCustomerName) {
		this.beneficiaryCustomerName = beneficiaryCustomerName;
	}

	/**
	 * @return the beneficiaryCustomerAddress
	 */
	public String getBeneficiaryCustomerAddress() {
		return beneficiaryCustomerAddress;
	}

	/**
	 * @param beneficiaryCustomerAddress the beneficiaryCustomerAddress to set
	 */
	public void setBeneficiaryCustomerAddress(String beneficiaryCustomerAddress) {
		this.beneficiaryCustomerAddress = beneficiaryCustomerAddress;
	}

	/**
	 * @return the beneficiaryCustomerID
	 */
	public String getBeneficiaryCustomerID() {
		return beneficiaryCustomerID;
	}

	/**
	 * @param beneficiaryCustomerID the beneficiaryCustomerID to set
	 */
	public void setBeneficiaryCustomerID(String beneficiaryCustomerID) {
		this.beneficiaryCustomerID = beneficiaryCustomerID;
	}

	/**
	 * @return the beneficiaryCustomerCtry
	 */
	public String getBeneficiaryCustomerCtry() {
		return beneficiaryCustomerCtry;
	}

	/**
	 * @param beneficiaryCustomerCtry the beneficiaryCustomerCtry to set
	 */
	public void setBeneficiaryCustomerCtry(String beneficiaryCustomerCtry) {
		this.beneficiaryCustomerCtry = beneficiaryCustomerCtry;
	}

	/**
	 * @return the beneficiaryCustomerCtctDtls
	 */
	public String getBeneficiaryCustomerCtctDtls() {
		return beneficiaryCustomerCtctDtls;
	}

	/**
	 * @param beneficiaryCustomerCtctDtls the beneficiaryCustomerCtctDtls to set
	 */
	public void setBeneficiaryCustomerCtctDtls(String beneficiaryCustomerCtctDtls) {
		this.beneficiaryCustomerCtctDtls = beneficiaryCustomerCtctDtls;
	}

	/**
	 * @return the ultimateCreditorName
	 */
	public String getUltimateCreditorName() {
		return ultimateCreditorName;
	}

	/**
	 * @param ultimateCreditorName the ultimateCreditorName to set
	 */
	public void setUltimateCreditorName(String ultimateCreditorName) {
		this.ultimateCreditorName = ultimateCreditorName;
	}

	/**
	 * @return the ultimateCreditorAddress
	 */
	public String getUltimateCreditorAddress() {
		return ultimateCreditorAddress;
	}

	/**
	 * @param ultimateCreditorAddress the ultimateCreditorAddress to set
	 */
	public void setUltimateCreditorAddress(String ultimateCreditorAddress) {
		this.ultimateCreditorAddress = ultimateCreditorAddress;
	}

	/**
	 * @return the ultimateCreditorID
	 */
	public String getUltimateCreditorID() {
		return ultimateCreditorID;
	}

	/**
	 * @param ultimateCreditorID the ultimateCreditorID to set
	 */
	public void setUltimateCreditorID(String ultimateCreditorID) {
		this.ultimateCreditorID = ultimateCreditorID;
	}

	/**
	 * @return the ultimateCreditorCtry
	 */
	public String getUltimateCreditorCtry() {
		return ultimateCreditorCtry;
	}

	/**
	 * @param ultimateCreditorCtry the ultimateCreditorCtry to set
	 */
	public void setUltimateCreditorCtry(String ultimateCreditorCtry) {
		this.ultimateCreditorCtry = ultimateCreditorCtry;
	}

	/**
	 * @return the ultimateCreditorCtctDtls
	 */
	public String getUltimateCreditorCtctDtls() {
		return ultimateCreditorCtctDtls;
	}

	/**
	 * @param ultimateCreditorCtctDtls the ultimateCreditorCtctDtls to set
	 */
	public void setUltimateCreditorCtctDtls(String ultimateCreditorCtctDtls) {
		this.ultimateCreditorCtctDtls = ultimateCreditorCtctDtls;
	}

	/**
	 * 
	 * @return
	 */
	public String getRelReference() {
		return relReference;
	}

	/**
	 * 
	 * @param relReference
	 */
	public void setRelReference(String relReference) {
		this.relReference = relReference;
	}

	/**
	 * 
	 * @return
	 */
	public String getRelUid() {
		return relUid;
	}

	/**
	 * 
	 * @param relUid
	 */
	public void setRelUid(String relUid) {
		this.relUid = relUid;
	}

	/**
	 * 
	 * @return
	 */
	public String getOrderingType() {
		return orderingType;
	}

	/**
	 * 
	 * @param orderingType
	 */
	public void setOrderingType(String orderingType) {
		this.orderingType = orderingType;
	}

	/**
	 * 
	 * @return
	 */
	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	/**
	 * 
	 * @param beneficiaryType
	 */
	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	/**
	 * 
	 * @return
	 */
	public String getMsgErrorCode() {
		return msgErrorCode;
	}

	/**
	 * 
	 * @param msgErrorCode
	 */
	public void setMsgErrorCode(String msgErrorCode)
	{
		processErrorCodes(msgErrorCode, null);
	}
	
	//An Overloaded MeThod required for ErrorCodes
	public void setMsgErrorCode(String msgErrorCode, String errChnl)
	{
		processErrorCodes(msgErrorCode, errChnl);
	}

	// Method to handle error Codes Logic
	private void processErrorCodes(String errorCode, String errorChnl)
	{
		ErrorCodes errCodeObj = null;
		
		if (errorCode != null)
		{
			if(errorChnl!=null)
			{
				if(this.errorCodeMap !=null && this.errorCodeMap.get(errorCode+errorChnl)!=null)
				{
					errCodeObj = this.errorCodeMap.get(errorCode+errorChnl);
					if (errCodeObj.getErrMapCode() == null)
					{
						this.msgErrorCode = errorCode;
					}
					else
					{
						this.msgErrorCode = errCodeObj.getErrMapCode();
					}
				}
				else
				{
					this.msgErrorCode = errorCode;
				}
				
			}
			else
			{
				if(this.errorCodeMap !=null && this.errorCodeMap.get(errorCode)!=null)
				{
					errCodeObj = this.errorCodeMap.get(errorCode);
					if (errCodeObj.getErrMapCode() == null)
					{
						this.msgErrorCode = errorCode;
					}
					else
					{
						this.msgErrorCode = errCodeObj.getErrMapCode();
					}
				}
				else
				{
					this.msgErrorCode = errorCode;
				}
			}
			if(errCodeObj !=null)
			{
				setMsgErrorDesc(errCodeObj.getErrDes());
			}
		}
	}
	
	/**
	 * @return the msgRef
	 */
	public String getMsgRef() {
		return msgRef;
	}

	/**
	 * @param msgRef the msgRef to set
	 */
	public void setMsgRef(String msgRef) {
		this.msgRef = msgRef;
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
	 * @return the grpSeq
	 */
	public int getGrpSeq() {
		return grpSeq;
	}

	/**
	 * @param grpSeq the grpSeq to set
	 */
	public void setGrpSeq(int grpSeq) {
		this.grpSeq = grpSeq;
	}

	/**
	 * @return the msgHost
	 */
	public String getMsgHost() {
		return msgHost;
	}

	/**
	 * @param msgHost the msgHost to set
	 */
	public void setMsgHost(String msgHost) {
		this.msgHost = msgHost;
	}

	/**
	 * @return the msgChannel
	 */
	public String getMsgChannel() {
		return msgChannel;
	}

	/**
	 * @param msgChannel the msgChannel to set
	 */
	public void setMsgChannel(String msgChannel) {
		this.msgChannel = msgChannel;
	}

	/**
	 * @return the msgChnlType
	 */
	public String getMsgChnlType() {
		return msgChnlType;
	}

	/**
	 * @param msgChnlType the msgChnlType to set
	 */
	public void setMsgChnlType(String msgChnlType) {
		this.msgChnlType = msgChnlType;
	}

	/**
	 * @return the srcMsgType
	 */
	public String getSrcMsgType() {
		return srcMsgType;
	}

	/**
	 * @param srcMsgType the srcMsgType to set
	 */
	public void setSrcMsgType(String srcMsgType) {
		this.srcMsgType = srcMsgType;
	}

	/**
	 * @return the srcMsgSubType
	 */
	public String getSrcMsgSubType() {
		return srcMsgSubType;
	}

	/**
	 * @param srcMsgSubType the srcMsgSubType to set
	 */
	public void setSrcMsgSubType(String srcMsgSubType) {
		this.srcMsgSubType = srcMsgSubType;
	}

	/**
	 * @return the dstMsgType
	 */
	public String getDstMsgType() {
		return dstMsgType;
	}

	/**
	 * @param dstMsgType the dstMsgType to set
	 */
	public void setDstMsgType(String dstMsgType) {
		this.dstMsgType = dstMsgType;
	}

	/**
	 * @return the dstMsgSubType
	 */
	public String getDstMsgSubType() {
		return dstMsgSubType;
	}

	/**
	 * @param dstMsgSubType the dstMsgSubType to set
	 */
	public void setDstMsgSubType(String dstMsgSubType) {
		this.dstMsgSubType = dstMsgSubType;
	}

	/**
	 * @return the msgStatus
	 */
	public String getMsgStatus() {
		return msgStatus;
	}

	/**
	 * @param msgStatus the msgStatus to set
	 */
	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}

	/**
	 * @return the msgPrevStatus
	 */
	public String getMsgPrevStatus() {
		return msgPrevStatus;
	}

	/**
	 * @param msgPrevStatus the msgPrevStatus to set
	 */
	public void setMsgPrevStatus(String msgPrevStatus) {
		this.msgPrevStatus = msgPrevStatus;
	}

	/**
	 * @return the receivedTime
	 */
	public Timestamp getReceivedTime() {
		return receivedTime;
	}

	/**
	 * @param receivedTime the receivedTime to set
	 */
	public void setReceivedTime(Timestamp receivedTime) {
		this.receivedTime = receivedTime;
	}

	/**
	 * @return the lastModTime
	 */
	public Timestamp getLastModTime() {
		return lastModTime;
	}

	/**
	 * @param lastModTime the lastModTime to set
	 */
	public void setLastModTime(Timestamp lastModTime) {
		this.lastModTime = lastModTime;
	}

	/**
	 * @return the txnReference
	 */
	public String getTxnReference() {
		return txnReference;
	}

	/**
	 * @param txnReference the txnReference to set
	 */
	public void setTxnReference(String txnReference) {
		this.txnReference = txnReference;
	}

	/**
	 * @return the custTxnReference
	 */
	public String getCustTxnReference() {
		return custTxnReference;
	}

	/**
	 * @param custTxnReference the custTxnReference to set
	 */
	public void setCustTxnReference(String custTxnReference) {
		this.custTxnReference = custTxnReference;
	}

	/**
	 * @return the sndrTxnId
	 */
	public String getSndrTxnId() {
		return sndrTxnId;
	}

	/**
	 * @param sndrTxnId the sndrTxnId to set
	 */
	public void setSndrTxnId(String sndrTxnId) {
		this.sndrTxnId = sndrTxnId;
	}

	/**
	 * @return the clrgSysReference
	 */
	public String getClrgSysReference() {
		return clrgSysReference;
	}

	/**
	 * @param clrgSysReference the clrgSysReference to set
	 */
	public void setClrgSysReference(String clrgSysReference) {
		this.clrgSysReference = clrgSysReference;
	}

	/**
	 * @return the sndrPymtPriority
	 */
	public String getSndrPymtPriority() {
		return sndrPymtPriority;
	}

	/**
	 * @param sndrPymtPriority the sndrPymtPriority to set
	 */
	public void setSndrPymtPriority(String sndrPymtPriority) {
		this.sndrPymtPriority = sndrPymtPriority;
	}

	/**
	 * @return the clrgChannel
	 */
	public String getClrgChannel() {
		return clrgChannel;
	}

	/**
	 * @param clrgChannel the clrgChannel to set
	 */
	public void setClrgChannel(String clrgChannel) {
		this.clrgChannel = clrgChannel;
	}

	/**
	 * @return the svcLevelCode
	 */
	public String getSvcLevelCode() {
		return svcLevelCode;
	}

	/**
	 * @param svcLevelCode the svcLevelCode to set
	 */
	public void setSvcLevelCode(String svcLevelCode) {
		this.svcLevelCode = svcLevelCode;
	}

	/**
	 * @return the svcLevelPriority
	 */
	public String getSvcLevelProperitary() {
		return svcLevelProperitary;
	}

	/**
	 * @param svcLevelPriority the svcLevelPriority to set
	 */
	public void setSvcLevelProperitary(String svcLevelProperitary) {
		this.svcLevelProperitary = svcLevelProperitary;
	}

	/**
	 * @return the lclInstCode
	 */
	public String getLclInstCode() {
		return lclInstCode;
	}

	/**
	 * @param lclInstCode the lclInstCode to set
	 */
	public void setLclInstCode(String lclInstCode) {
		this.lclInstCode = lclInstCode;
	}

	/**
	 * @return the lclInstPriority
	 */
	public String getLclInstProperitary() {
		return lclInstProperitary;
	}

	/**
	 * @param lclInstPriority the lclInstPriority to set
	 */
	public void setLclInstProperitary(String lclInstProperitary) {
		this.lclInstProperitary = lclInstProperitary;
	}

	/**
	 * @return the catgPurposeCode
	 */
	public String getCatgPurposeCode() {
		return catgPurposeCode;
	}

	/**
	 * @param catgPurposeCode the catgPurposeCode to set
	 */
	public void setCatgPurposeCode(String catgPurposeCode) {
		this.catgPurposeCode = catgPurposeCode;
	}

	/**
	 * @return the catgPurposePriority
	 */
	public String getCatgPurposeProperitary() {
		return catgPurposeProperitary;
	}

	/**
	 * @param catgPurposePriority the catgPurposePriority to set
	 */
	public void setCatgPurposeProperitary(String catgPurposeProperitary) {
		this.catgPurposeProperitary = catgPurposeProperitary;
	}

	/**
	 * @return the msgCurrency
	 */
	public String getMsgCurrency() {
		return msgCurrency;
	}

	/**
	 * @param msgCurrency the msgCurrency to set
	 */
	public void setMsgCurrency(String msgCurrency) {
		this.msgCurrency = msgCurrency;
	}

	/**
	 * @return the msgAmount
	 */
	public BigDecimal getMsgAmount() {
		return msgAmount;
	}

	/**
	 * @param msgAmount the msgAmount to set
	 */
	public void setMsgAmount(BigDecimal msgAmount) {
		this.msgAmount = msgAmount;
	}

	/**
	 * @return the msgValueDate
	 */
	public Timestamp getMsgValueDate() {
		return msgValueDate;
	}

	/**
	 * @param msgValueDate the msgValueDate to set
	 */
	public void setMsgValueDate(Timestamp msgValueDate) {
		this.msgValueDate = msgValueDate;
	}

	/**
	 * @return the sndrSttlmntPriority
	 */
	public String getSndrSttlmntPriority() {
		return sndrSttlmntPriority;
	}

	/**
	 * @param sndrSttlmntPriority the sndrSttlmntPriority to set
	 */
	public void setSndrSttlmntPriority(String sndrSttlmntPriority) {
		this.sndrSttlmntPriority = sndrSttlmntPriority;
	}

	/**
	 * @return the drDateTime
	 */
	public Timestamp getDrDateTime() {
		return drDateTime;
	}

	/**
	 * @param drDateTime the drDateTime to set
	 */
	public void setDrDateTime(Timestamp drDateTime) {
		this.drDateTime = drDateTime;
	}

	/**
	 * @return the crDateTime
	 */
	public Timestamp getCrDateTime() {
		return crDateTime;
	}

	/**
	 * @param crDateTime the crDateTime to set
	 */
	public void setCrDateTime(Timestamp crDateTime) {
		this.crDateTime = crDateTime;
	}

	/**
	 * @return the clsDateTime
	 */
	public Timestamp getClsDateTime() {
		return clsDateTime;
	}

	/**
	 * @param clsDateTime the clsDateTime to set
	 */
	public void setClsDateTime(Timestamp clsDateTime) {
		this.clsDateTime = clsDateTime;
	}

	/**
	 * @return the sttlmntTillTime
	 */
	public Timestamp getSttlmntTillTime() {
		return sttlmntTillTime;
	}

	/**
	 * @param sttlmntTillTime the sttlmntTillTime to set
	 */
	public void setSttlmntTillTime(Timestamp sttlmntTillTime) {
		this.sttlmntTillTime = sttlmntTillTime;
	}

	/**
	 * @return the sttlmntFromTime
	 */
	public Timestamp getSttlmntFromTime() {
		return sttlmntFromTime;
	}

	/**
	 * @param sttlmntFromTime the sttlmntFromTime to set
	 */
	public void setSttlmntFromTime(Timestamp sttlmntFromTime) {
		this.sttlmntFromTime = sttlmntFromTime;
	}

	/**
	 * @return the sttlmntRejTime
	 */
	public Timestamp getSttlmntRejTime() {
		return sttlmntRejTime;
	}

	/**
	 * @param sttlmntRejTime the sttlmntRejTime to set
	 */
	public void setSttlmntRejTime(Timestamp sttlmntRejTime) {
		this.sttlmntRejTime = sttlmntRejTime;
	}

	/**
	 * @return the pymntAcceptedTime
	 */
	public Timestamp getPymntAcceptedTime() {
		return pymntAcceptedTime;
	}

	/**
	 * @param pymntAcceptedTime the pymntAcceptedTime to set
	 */
	public void setPymntAcceptedTime(Timestamp pymntAcceptedTime) {
		this.pymntAcceptedTime = pymntAcceptedTime;
	}

	/**
	 * @return the cashpoolAdjstmntTime
	 */
	public Timestamp getCashpoolAdjstmntTime() {
		return cashpoolAdjstmntTime;
	}

	/**
	 * @param cashpoolAdjstmntTime the cashpoolAdjstmntTime to set
	 */
	public void setCashpoolAdjstmntTime(Timestamp cashpoolAdjstmntTime) {
		this.cashpoolAdjstmntTime = cashpoolAdjstmntTime;
	}

	/**
	 * @return the instructedCurrency
	 */
	public String getInstructedCurrency() {
		return instructedCurrency;
	}

	/**
	 * @param instructedCurrency the instructedCurrency to set
	 */
	public void setInstructedCurrency(String instructedCurrency) {
		this.instructedCurrency = instructedCurrency;
	}

	/**
	 * @return the instructedAmount
	 */
	public BigDecimal getInstructedAmount() {
		return instructedAmount;
	}

	/**
	 * @param instructedAmount the instructedAmount to set
	 */
	public void setInstructedAmount(BigDecimal instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	/**
	 * @return the xchangeRate
	 */
	public BigDecimal getXchangeRate() {
		return xchangeRate;
	}

	/**
	 * @param xchangeRate the xchangeRate to set
	 */
	public void setXchangeRate(BigDecimal xchangeRate) {
		this.xchangeRate = xchangeRate;
	}

	/**
	 * @return the chargeBearer
	 */
	public String getChargeBearer() {
		return chargeBearer;
	}

	/**
	 * @param chargeBearer the chargeBearer to set
	 */
	public void setChargeBearer(String chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	/**
	 * @return the prevInstructingBank
	 */
	public String getPrevInstructingBank() {
		return prevInstructingBank;
	}

	/**
	 * @param prevInstructingBank the prevInstructingBank to set
	 */
	public void setPrevInstructingBank(String prevInstructingBank) {
		this.prevInstructingBank = prevInstructingBank;
	}

	/**
	 * @return the prevInstructingAgentAcct
	 */
	public String getPrevInstructingAgentAcct() {
		return prevInstructingAgentAcct;
	}

	/**
	 * @param prevInstructingAgentAcct the prevInstructingAgentAcct to set
	 */
	public void setPrevInstructingAgentAcct(String prevInstructingAgentAcct) {
		this.prevInstructingAgentAcct = prevInstructingAgentAcct;
	}

	/**
	 * @return the senderBank
	 */
	public String getSenderBank() {
		return senderBank;
	}

	/**
	 * @param senderBank the senderBank to set
	 */
	public void setSenderBank(String senderBank) 
	{
		this.senderBank = senderBank;
	}

	/**
	 * @return the receiverBank
	 */
	public String getReceiverBank() {
		return receiverBank;
	}

	/**
	 * @param receiverBank the receiverBank to set
	 */
	public void setReceiverBank(String receiverBank) {
		this.receiverBank = receiverBank;
	}

	/**
	 * @return the intermediary1Bank
	 */
	public String getIntermediary1Bank() {
		return intermediary1Bank;
	}

	/**
	 * @param intermediary1Bank the intermediary1Bank to set
	 */
	public void setIntermediary1Bank(String intermediary1Bank) {
		this.intermediary1Bank = intermediary1Bank;
	}

	/**
	 * @return the intermediary1AgentAcct
	 */
	public String getIntermediary1AgentAcct() {
		return intermediary1AgentAcct;
	}

	/**
	 * @param intermediary1AgentAcct the intermediary1AgentAcct to set
	 */
	public void setIntermediary1AgentAcct(String intermediary1AgentAcct) {
		this.intermediary1AgentAcct = intermediary1AgentAcct;
	}

	/**
	 * @return the intermediary2Bank
	 */
	public String getIntermediary2Bank() {
		return intermediary2Bank;
	}

	/**
	 * @param intermediary2Bank the intermediary2Bank to set
	 */
	public void setIntermediary2Bank(String intermediary2Bank) {
		this.intermediary2Bank = intermediary2Bank;
	}

	/**
	 * @return the intermediary2AgentAcct
	 */
	public String getIntermediary2AgentAcct() {
		return intermediary2AgentAcct;
	}

	/**
	 * @param intermediary2AgentAcct the intermediary2AgentAcct to set
	 */
	public void setIntermediary2AgentAcct(String intermediary2AgentAcct) {
		this.intermediary2AgentAcct = intermediary2AgentAcct;
	}

	/**
	 * @return the intermediary3Bank
	 */
	public String getIntermediary3Bank() {
		return intermediary3Bank;
	}

	/**
	 * @param intermediary3Bank the intermediary3Bank to set
	 */
	public void setIntermediary3Bank(String intermediary3Bank) {
		this.intermediary3Bank = intermediary3Bank;
	}

	/**
	 * @return the intermediary3AgentAcct
	 */
	public String getIntermediary3AgentAcct() {
		return intermediary3AgentAcct;
	}

	/**
	 * @param intermediary3AgentAcct the intermediary3AgentAcct to set
	 */
	public void setIntermediary3AgentAcct(String intermediary3AgentAcct) {
		this.intermediary3AgentAcct = intermediary3AgentAcct;
	}

	/**
	 * @return the orderingCustAccount
	 */
	public String getOrderingCustAccount() {
		return orderingCustAccount;
	}

	/**
	 * @param orderingCustAccount the orderingCustAccount to set
	 */
	public void setOrderingCustAccount(String orderingCustAccount) {
		this.orderingCustAccount = orderingCustAccount;
	}

	/**
	 * @return the orderingInstitution
	 */
	public String getOrderingInstitution() {
		return orderingInstitution;
	}

	/**
	 * @param orderingInstitution the orderingInstitution to set
	 */
	public void setOrderingInstitution(String orderingInstitution) {
		this.orderingInstitution = orderingInstitution;
	}

	/**
	 * @return the orderingInstitutionAcct
	 */
	public String getOrderingInstitutionAcct() {
		return orderingInstitutionAcct;
	}

	/**
	 * @param orderingInstitutionAcct the orderingInstitutionAcct to set
	 */
	public void setOrderingInstitutionAcct(String orderingInstitutionAcct) {
		this.orderingInstitutionAcct = orderingInstitutionAcct;
	}

	/**
	 * @return the accountWithInstitution
	 */
	public String getAccountWithInstitution() {
		return accountWithInstitution;
	}

	/**
	 * @param accountWithInstitution the accountWithInstitution to set
	 */
	public void setAccountWithInstitution(String accountWithInstitution) {
		this.accountWithInstitution = accountWithInstitution;
	}

	/**
	 * @return the accountWithInstitutionAcct
	 */
	public String getAccountWithInstitutionAcct() {
		return accountWithInstitutionAcct;
	}

	/**
	 * @param accountWithInstitutionAcct the accountWithInstitutionAcct to set
	 */
	public void setAccountWithInstitutionAcct(String accountWithInstitutionAcct) {
		this.accountWithInstitutionAcct = accountWithInstitutionAcct;
	}

	/**
	 * @return the beneficiaryCustAcct
	 */
	public String getBeneficiaryCustAcct() {
		return beneficiaryCustAcct;
	}

	/**
	 * @param beneficiaryCustAcct the beneficiaryCustAcct to set
	 */
	public void setBeneficiaryCustAcct(String beneficiaryCustAcct) {
		this.beneficiaryCustAcct = beneficiaryCustAcct;
	}

	/**
	 * @return the instructionsForCrdtrAgtCode
	 */
	public String getInstructionsForCrdtrAgtCode() {
		return instructionsForCrdtrAgtCode;
	}

	/**
	 * @param instructionsForCrdtrAgtCode the instructionsForCrdtrAgtCode to set
	 */
	public void setInstructionsForCrdtrAgtCode(String instructionsForCrdtrAgtCode) {
		this.instructionsForCrdtrAgtCode = instructionsForCrdtrAgtCode;
	}

	/**
	 * @return the instructionsForCrdtrAgtText
	 */
	public String getInstructionsForCrdtrAgtText() {
		return instructionsForCrdtrAgtText;
	}

	/**
	 * @param instructionsForCrdtrAgtText the instructionsForCrdtrAgtText to set
	 */
	public void setInstructionsForCrdtrAgtText(String instructionsForCrdtrAgtText) {
		this.instructionsForCrdtrAgtText = instructionsForCrdtrAgtText;
	}

	/**
	 * @return the instructionsForNextAgtCode
	 */
	public String getInstructionsForNextAgtCode() {
		return instructionsForNextAgtCode;
	}

	/**
	 * @param instructionsForNextAgtCode the instructionsForNextAgtCode to set
	 */
	public void setInstructionsForNextAgtCode(String instructionsForNextAgtCode) {
		this.instructionsForNextAgtCode = instructionsForNextAgtCode;
	}

	/**
	 * @return the instructionsForNextAgtText
	 */
	public String getInstructionsForNextAgtText() {
		return instructionsForNextAgtText;
	}

	/**
	 * @param instructionsForNextAgtText the instructionsForNextAgtText to set
	 */
	public void setInstructionsForNextAgtText(String instructionsForNextAgtText) {
		this.instructionsForNextAgtText = instructionsForNextAgtText;
	}

	/**
	 * @return the msgPurposeCode
	 */
	public String getMsgPurposeCode() {
		return msgPurposeCode;
	}

	/**
	 * @param msgPurposeCode the msgPurposeCode to set
	 */
	public void setMsgPurposeCode(String msgPurposeCode) {
		this.msgPurposeCode = msgPurposeCode;
	}

	/**
	 * @return the msgPurposeText
	 */
	public String getMsgPurposeText() {
		return msgPurposeText;
	}

	/**
	 * @param msgPurposeText the msgPurposeText to set
	 */
	public void setMsgPurposeText(String msgPurposeText) {
		this.msgPurposeText = msgPurposeText;
	}

	/**
	 * @return the regulatoryBankCode
	 */
	public String getRegulatoryBankCode() {
		return regulatoryBankCode;
	}

	/**
	 * @param regulatoryBankCode the regulatoryBankCode to set
	 */
	public void setRegulatoryBankCode(String regulatoryBankCode) {
		this.regulatoryBankCode = regulatoryBankCode;
	}

	/**
	 * @return the regulatoryReportCurrency
	 */
	public String getRegulatoryReportCurrency() {
		return regulatoryReportCurrency;
	}

	/**
	 * @param regulatoryReportCurrency the regulatoryReportCurrency to set
	 */
	public void setRegulatoryReportCurrency(String regulatoryReportCurrency) {
		this.regulatoryReportCurrency = regulatoryReportCurrency;
	}

	/**
	 * @return the regulatoryReportAmount
	 */
	public BigDecimal getRegulatoryReportAmount() {
		return regulatoryReportAmount;
	}

	/**
	 * @param regulatoryReportAmount the regulatoryReportAmount to set
	 */
	public void setRegulatoryReportAmount(BigDecimal regulatoryReportAmount) {
		this.regulatoryReportAmount = regulatoryReportAmount;
	}

	/**
	 * @return the regulatoryInformation
	 */
	public String getRegulatoryInformation() {
		return regulatoryInformation;
	}

	/**
	 * @param regulatoryInformation the regulatoryInformation to set
	 */
	public void setRegulatoryInformation(String regulatoryInformation) {
		this.regulatoryInformation = regulatoryInformation;
	}

	/**
	 * @return the initiatorRemitReference
	 */
	public String getInitiatorRemitReference() {
		return initiatorRemitReference;
	}

	/**
	 * @param initiatorRemitReference the initiatorRemitReference to set
	 */
	public void setInitiatorRemitReference(String initiatorRemitReference) {
		this.initiatorRemitReference = initiatorRemitReference;
	}

	/**
	 * @return the initiatorRemitAdviceMethod
	 */
	public String getInitiatorRemitAdviceMethod() {
		return initiatorRemitAdviceMethod;
	}

	/**
	 * @param initiatorRemitAdviceMethod the initiatorRemitAdviceMethod to set
	 */
	public void setInitiatorRemitAdviceMethod(String initiatorRemitAdviceMethod) {
		this.initiatorRemitAdviceMethod = initiatorRemitAdviceMethod;
	}

	/**
	 * @return the remitInfoEmail
	 */
	public String getRemitInfoEmail() {
		return remitInfoEmail;
	}

	/**
	 * @param remitInfoEmail the remitInfoEmail to set
	 */
	public void setRemitInfoEmail(String remitInfoEmail) {
		this.remitInfoEmail = remitInfoEmail;
	}

	/**
	 * @return the remitReceivingPartyName
	 */
	public String getRemitReceivingPartyName() {
		return remitReceivingPartyName;
	}

	/**
	 * @param remitReceivingPartyName the remitReceivingPartyName to set
	 */
	public void setRemitReceivingPartyName(String remitReceivingPartyName) {
		this.remitReceivingPartyName = remitReceivingPartyName;
	}

	/**
	 * @return the remitReceivingPartyAddress
	 */
	public String getRemitReceivingPartyAddress() {
		return remitReceivingPartyAddress;
	}

	/**
	 * @param remitReceivingPartyAddress the remitReceivingPartyAddress to set
	 */
	public void setRemitReceivingPartyAddress(String remitReceivingPartyAddress) {
		this.remitReceivingPartyAddress = remitReceivingPartyAddress;
	}

	/**
	 * @return the relatedRemitInfo
	 */
	public String getRelRemitInfoRef() {
		return relRemitInfoRef;
	}

	/**
	 * @param relatedRemitInfo the relatedRemitInfo to set
	 */
	public void setRelRemitInfoRef(String relRemitInfoRef) {
		this.relRemitInfoRef = relRemitInfoRef;
	}

	/**
	 * 
	 * @return
	 */
	public String getRemitInfoRef() {
		return remitInfoRef;
	}
	
	/**
	 * 
	 * @param remitInfoRef
	 */
	public void setRemitInfoRef(String remitInfoRef) {
		this.remitInfoRef = remitInfoRef;
	}

	/**
	 * @return the msgReturnReference
	 */
	public String getMsgReturnReference() {
		return msgReturnReference;
	}

	/**
	 * @param msgReturnReference the msgReturnReference to set
	 */
	public void setMsgReturnReference(String msgReturnReference) {
		this.msgReturnReference = msgReturnReference;
	}

	/**
	 * @return the custAccount
	 */
	public String getCustAccount() {
		return custAccount;
	}

	/**
	 * @param custAccount the custAccount to set
	 */
	public void setCustAccount(String custAccount) {
		this.custAccount = custAccount;
	}

	/**
	 * @return the msgBatchTime
	 */
	public Timestamp getMsgBatchTime() {
		return msgBatchTime;
	}

	/**
	 * @param msgBatchTime the msgBatchTime to set
	 */
	public void setMsgBatchTime(Timestamp msgBatchTime) {
		this.msgBatchTime = msgBatchTime;
	}

	/**
	 * @return the msgDept
	 */
	public String getMsgDept() {
		return msgDept;
	}

	/**
	 * @param msgDept the msgDept to set
	 */
	public void setMsgDept(String msgDept) {
		this.msgDept = msgDept;
	}

	/**
	 * @return the msgBranch
	 */
	public String getMsgBranch() {
		return msgBranch;
	}

	/**
	 * @param msgBranch the msgBranch to set
	 */
	public void setMsgBranch(String msgBranch) {
		this.msgBranch = msgBranch;
	}

	/**
	 * @return the msgRules
	 */
	public String getMsgRules() {
		return msgRules;
	}

	/**
	 * @param msgRules the msgRules to set
	 */
	public void setMsgRules(String msgRules) {
		this.msgRules = msgRules;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMsgDirection() {
		return msgDirection;
	}

	/**
	 * 
	 * @param msgDirection
	 */
	public void setMsgDirection(String msgDirection) 
	{
		this.msgDirection = msgDirection;
	}

	public void setMsgIsReturn(int msgIsReturn) 
	{
		this.msgIsReturn = msgIsReturn;
	}

	public int getMsgIsReturn() 
	{
		return msgIsReturn;
	}

	/**
	 * @return the lcType
	 */
	public String getLcType() {
		return lcType;
	}

	/**
	 * @return the lcNo
	 */
	public String getLcNo() {
		return lcNo;
	}

	/**
	 * @return the lcPrevAdvRef
	 */
	public String getLcPrevAdvRef() {
		return lcPrevAdvRef;
	}

	/**
	 * @return the lcIssueDt
	 */
	public Timestamp getLcIssueDt() {
		return lcIssueDt;
	}

	/**
	 * @return the lcExpDt
	 */
	public Timestamp getLcExpDt() {
		return lcExpDt;
	}

	/**
	 * @return the lcExpPlace
	 */
	public String getLcExpPlace() {
		return lcExpPlace;
	}

	/**
	 * @return the lcTolerance
	 */
	public String getLcTolerance() {
		return lcTolerance;
	}

	/**
	 * @return the lcMaxCrAmt
	 */
	public String getLcMaxCrAmt() {
		return lcMaxCrAmt;
	}

	/**
	 * @return the lcAddlAmts
	 */
	public String getLcAddlAmts() {
		return lcAddlAmts;
	}

	/**
	 * @return the lcAuthBankCode
	 */
	public String getLcAuthBankCode() {
		return lcAuthBankCode;
	}

	/**
	 * @return the lcAuthBankAddr
	 */
	public String getLcAuthBankAddr() {
		return lcAuthBankAddr;
	}

	/**
	 * @return the lcAuthMode
	 */
	public String getLcAuthMode() {
		return lcAuthMode;
	}

	/**
	 * @return the lcDispatchPlace
	 */
	public String getLcDispatchPlace() {
		return lcDispatchPlace;
	}

	/**
	 * @return the lcDstn
	 */
	public String getLcDstn() {
		return lcDstn;
	}

	/**
	 * @return the lcLstShipDt
	 */
	public Timestamp getLcLstShipDt() {
		return lcLstShipDt;
	}

	/**
	 * @return the lcShipPeriod
	 */
	public String getLcShipPeriod() {
		return lcShipPeriod;
	}

	/**
	 * @return the lcShipTerms
	 */
	public String getLcShipTerms() {
		return lcShipTerms;
	}

	/**
	 * @return the lcDraftsAt
	 */
	public String getLcDraftsAt() {
		return lcDraftsAt;
	}

	/**
	 * @return the lcDraweeBnkPid
	 */
	public String getLcDraweeBnkPid() {
		return lcDraweeBnkPid;
	}

	/**
	 * @return the lcDraweeBnkCode
	 */
	public String getLcDraweeBnkCode() {
		return lcDraweeBnkCode;
	}

	/**
	 * @return the lcDraweeBnkAddr
	 */
	public String getLcDraweeBnkAddr() {
		return lcDraweeBnkAddr;
	}

	/**
	 * @return the lcMixedPymtDet
	 */
	public String getLcMixedPymtDet() {
		return lcMixedPymtDet;
	}

	/**
	 * @return the lcDefPymtDet
	 */
	public String getLcDefPymtDet() {
		return lcDefPymtDet;
	}

	/**
	 * @return the lcPartialShipment
	 */
	public String getLcPartialShipment() {
		return lcPartialShipment;
	}

	/**
	 * @return the lcTransShipment
	 */
	public String getLcTransShipment() {
		return lcTransShipment;
	}

	/**
	 * @return the lcDocsReq1
	 */
	public String getLcDocsReq1() {
		return lcDocsReq1;
	}

	/**
	 * @return the lcDocsReq2
	 */
	public String getLcDocsReq2() {
		return lcDocsReq2;
	}

	/**
	 * @return the lcAddnlCndt1
	 */
	public String getLcAddnlCndt1() {
		return lcAddnlCndt1;
	}

	/**
	 * @return the lcAddnlCndt2
	 */
	public String getLcAddnlCndt2() {
		return lcAddnlCndt2;
	}

	/**
	 * @return the lcCharges
	 */
	public String getLcCharges() {
		return lcCharges;
	}

	/**
	 * @return the lcPrsntnPrd
	 */
	public String getLcPrsntnPrd() {
		return lcPrsntnPrd;
	}

	/**
	 * @return the lcConfrmInstrns
	 */
	public String getLcConfrmInstrns() {
		return lcConfrmInstrns;
	}

	/**
	 * @return the lcInstrnTopay
	 */
	public String getLcInstrnTopay() {
		return lcInstrnTopay;
	}

	/**
	 * @return the lcNarrative
	 */
	public String getLcNarrative() {
		return lcNarrative;
	}

	/**
	 * @return the lcAmndmntNo
	 */
	public int getLcAmndmntNo() {
		return lcAmndmntNo;
	}

	/**
	 * @return the lcAmndmntDt
	 */
	public Timestamp getLcAmndmntDt() {
		return lcAmndmntDt;
	}

	/**
	 * @return the lcOldExpDt
	 */
	public Timestamp getLcOldExpDt() {
		return lcOldExpDt;
	}

	/**
	 * @return the lcAmndmntIncAmt
	 */
	public BigDecimal getLcAmndmntIncAmt() {
		return lcAmndmntIncAmt;
	}

	/**
	 * @return the lcAmndmntDecAmt
	 */
	public BigDecimal getLcAmndmntDecAmt() {
		return lcAmndmntDecAmt;
	}

	/**
	 * @return the lcAmndmntOldAmt
	 */
	public BigDecimal getLcAmndmntOldAmt() {
		return lcAmndmntOldAmt;
	}

	/**
	 * @return the lcAccId
	 */
	public String getLcAccId() {
		return lcAccId;
	}

	/**
	 * @return the lcAckDt
	 */
	public Timestamp getLcAckDt() {
		return lcAckDt;
	}

	/**
	 * @return the lcChgsClaimed
	 */
	public BigDecimal getLcChgsClaimed() {
		return lcChgsClaimed;
	}

	/**
	 * @return the lcToAmtClaimed
	 */
	public BigDecimal getLcToAmtClaimed() {
		return lcToAmtClaimed;
	}

	/**
	 * @return the lcTotalAmtClaimed
	 */
	public BigDecimal getLcTotalAmtClaimed() {
		return lcTotalAmtClaimed;
	}

	/**
	 * @return the lcNetAmtClaimed
	 */
	public BigDecimal getLcNetAmtClaimed() {
		return lcNetAmtClaimed;
	}

	/**
	 * @return the lcAmtPaid
	 */
	public BigDecimal getLcAmtPaid() {
		return lcAmtPaid;
	}

	/**
	 * @return the lcDiscrepancies
	 */
	public String getLcDiscrepancies() {
		return lcDiscrepancies;
	}

	/**
	 * @return the lcDispoDocs
	 */
	public String getLcDispoDocs() {
		return lcDispoDocs;
	}

	/**
	 * @param lcType the lcType to set
	 */
	public void setLcType(String lcType) {
		this.lcType = lcType;
	}

	/**
	 * @param lcNo the lcNo to set
	 */
	public void setLcNo(String lcNo) {
		this.lcNo = lcNo;
	}

	/**
	 * @param lcPrevAdvRef the lcPrevAdvRef to set
	 */
	public void setLcPrevAdvRef(String lcPrevAdvRef) {
		this.lcPrevAdvRef = lcPrevAdvRef;
	}

	/**
	 * @param lcIssueDt the lcIssueDt to set
	 */
	public void setLcIssueDt(Timestamp lcIssueDt) {
		this.lcIssueDt = lcIssueDt;
	}

	/**
	 * @param lcExpDt the lcExpDt to set
	 */
	public void setLcExpDt(Timestamp lcExpDt) {
		this.lcExpDt = lcExpDt;
	}

	/**
	 * @param lcExpPlace the lcExpPlace to set
	 */
	public void setLcExpPlace(String lcExpPlace) {
		this.lcExpPlace = lcExpPlace;
	}

	/**
	 * @param lcTolerance the lcTolerance to set
	 */
	public void setLcTolerance(String lcTolerance) {
		this.lcTolerance = lcTolerance;
	}

	/**
	 * @param lcMaxCrAmt the lcMaxCrAmt to set
	 */
	public void setLcMaxCrAmt(String lcMaxCrAmt) {
		this.lcMaxCrAmt = lcMaxCrAmt;
	}

	/**
	 * @param lcAddlAmts the lcAddlAmts to set
	 */
	public void setLcAddlAmts(String lcAddlAmts) {
		this.lcAddlAmts = lcAddlAmts;
	}

	/**
	 * @param lcAuthBankCode the lcAuthBankCode to set
	 */
	public void setLcAuthBankCode(String lcAuthBankCode) {
		this.lcAuthBankCode = lcAuthBankCode;
	}

	/**
	 * @param lcAuthBankAddr the lcAuthBankAddr to set
	 */
	public void setLcAuthBankAddr(String lcAuthBankAddr) {
		this.lcAuthBankAddr = lcAuthBankAddr;
	}

	/**
	 * @param lcAuthMode the lcAuthMode to set
	 */
	public void setLcAuthMode(String lcAuthMode) {
		this.lcAuthMode = lcAuthMode;
	}

	/**
	 * @param lcDispatchPlace the lcDispatchPlace to set
	 */
	public void setLcDispatchPlace(String lcDispatchPlace) {
		this.lcDispatchPlace = lcDispatchPlace;
	}

	/**
	 * @param lcDstn the lcDstn to set
	 */
	public void setLcDstn(String lcDstn) {
		this.lcDstn = lcDstn;
	}

	/**
	 * @param lcLstShipDt the lcLstShipDt to set
	 */
	public void setLcLstShipDt(Timestamp lcLstShipDt) {
		this.lcLstShipDt = lcLstShipDt;
	}

	/**
	 * @param lcShipPeriod the lcShipPeriod to set
	 */
	public void setLcShipPeriod(String lcShipPeriod) {
		this.lcShipPeriod = lcShipPeriod;
	}

	/**
	 * @param lcShipTerms the lcShipTerms to set
	 */
	public void setLcShipTerms(String lcShipTerms) {
		this.lcShipTerms = lcShipTerms;
	}

	/**
	 * @param lcDraftsAt the lcDraftsAt to set
	 */
	public void setLcDraftsAt(String lcDraftsAt) {
		this.lcDraftsAt = lcDraftsAt;
	}

	/**
	 * @param lcDraweeBnkPid the lcDraweeBnkPid to set
	 */
	public void setLcDraweeBnkPid(String lcDraweeBnkPid) {
		this.lcDraweeBnkPid = lcDraweeBnkPid;
	}

	/**
	 * @param lcDraweeBnkCode the lcDraweeBnkCode to set
	 */
	public void setLcDraweeBnkCode(String lcDraweeBnkCode) {
		this.lcDraweeBnkCode = lcDraweeBnkCode;
	}

	/**
	 * @param lcDraweeBnkAddr the lcDraweeBnkAddr to set
	 */
	public void setLcDraweeBnkAddr(String lcDraweeBnkAddr) {
		this.lcDraweeBnkAddr = lcDraweeBnkAddr;
	}

	/**
	 * @param lcMixedPymtDet the lcMixedPymtDet to set
	 */
	public void setLcMixedPymtDet(String lcMixedPymtDet) {
		this.lcMixedPymtDet = lcMixedPymtDet;
	}

	/**
	 * @param lcDefPymtDet the lcDefPymtDet to set
	 */
	public void setLcDefPymtDet(String lcDefPymtDet) {
		this.lcDefPymtDet = lcDefPymtDet;
	}

	/**
	 * @param lcPartialShipment the lcPartialShipment to set
	 */
	public void setLcPartialShipment(String lcPartialShipment) {
		this.lcPartialShipment = lcPartialShipment;
	}

	/**
	 * @param lcTransShipment the lcTransShipment to set
	 */
	public void setLcTransShipment(String lcTransShipment) {
		this.lcTransShipment = lcTransShipment;
	}

	/**
	 * @param lcDocsReq1 the lcDocsReq1 to set
	 */
	public void setLcDocsReq1(String lcDocsReq1) {
		this.lcDocsReq1 = lcDocsReq1;
	}

	/**
	 * @param lcDocsReq2 the lcDocsReq2 to set
	 */
	public void setLcDocsReq2(String lcDocsReq2) {
		this.lcDocsReq2 = lcDocsReq2;
	}

	/**
	 * @param lcAddnlCndt1 the lcAddnlCndt1 to set
	 */
	public void setLcAddnlCndt1(String lcAddnlCndt1) {
		this.lcAddnlCndt1 = lcAddnlCndt1;
	}

	/**
	 * @param lcAddnlCndt2 the lcAddnlCndt2 to set
	 */
	public void setLcAddnlCndt2(String lcAddnlCndt2) {
		this.lcAddnlCndt2 = lcAddnlCndt2;
	}

	/**
	 * @param lcCharges the lcCharges to set
	 */
	public void setLcCharges(String lcCharges) {
		this.lcCharges = lcCharges;
	}

	/**
	 * @param lcPrsntnPrd the lcPrsntnPrd to set
	 */
	public void setLcPrsntnPrd(String lcPrsntnPrd) {
		this.lcPrsntnPrd = lcPrsntnPrd;
	}

	/**
	 * @param lcConfrmInstrns the lcConfrmInstrns to set
	 */
	public void setLcConfrmInstrns(String lcConfrmInstrns) {
		this.lcConfrmInstrns = lcConfrmInstrns;
	}

	/**
	 * @param lcInstrnTopay the lcInstrnTopay to set
	 */
	public void setLcInstrnTopay(String lcInstrnTopay) {
		this.lcInstrnTopay = lcInstrnTopay;
	}

	/**
	 * @param lcNarrative the lcNarrative to set
	 */
	public void setLcNarrative(String lcNarrative) {
		this.lcNarrative = lcNarrative;
	}

	/**
	 * @param lcAmndmntNo the lcAmndmntNo to set
	 */
	public void setLcAmndmntNo(int lcAmndmntNo) {
		this.lcAmndmntNo = lcAmndmntNo;
	}

	/**
	 * @param lcAmndmntDt the lcAmndmntDt to set
	 */
	public void setLcAmndmntDt(Timestamp lcAmndmntDt) {
		this.lcAmndmntDt = lcAmndmntDt;
	}

	/**
	 * @param lcOldExpDt the lcOldExpDt to set
	 */
	public void setLcOldExpDt(Timestamp lcOldExpDt) {
		this.lcOldExpDt = lcOldExpDt;
	}

	/**
	 * @param lcAmndmntIncAmt the lcAmndmntIncAmt to set
	 */
	public void setLcAmndmntIncAmt(BigDecimal lcAmndmntIncAmt) {
		this.lcAmndmntIncAmt = lcAmndmntIncAmt;
	}

	/**
	 * @param lcAmndmntDecAmt the lcAmndmntDecAmt to set
	 */
	public void setLcAmndmntDecAmt(BigDecimal lcAmndmntDecAmt) {
		this.lcAmndmntDecAmt = lcAmndmntDecAmt;
	}

	/**
	 * @param lcAmndmntOldAmt the lcAmndmntOldAmt to set
	 */
	public void setLcAmndmntOldAmt(BigDecimal lcAmndmntOldAmt) {
		this.lcAmndmntOldAmt = lcAmndmntOldAmt;
	}

	/**
	 * @param lcAccId the lcAccId to set
	 */
	public void setLcAccId(String lcAccId) {
		this.lcAccId = lcAccId;
	}

	/**
	 * @param lcAckDt the lcAckDt to set
	 */
	public void setLcAckDt(Timestamp lcAckDt) {
		this.lcAckDt = lcAckDt;
	}

	/**
	 * @param lcChgsClaimed the lcChgsClaimed to set
	 */
	public void setLcChgsClaimed(BigDecimal lcChgsClaimed) {
		this.lcChgsClaimed = lcChgsClaimed;
	}

	/**
	 * @param lcToAmtClaimed the lcToAmtClaimed to set
	 */
	public void setLcToAmtClaimed(BigDecimal lcToAmtClaimed) {
		this.lcToAmtClaimed = lcToAmtClaimed;
	}

	/**
	 * @param lcTotalAmtClaimed the lcTotalAmtClaimed to set
	 */
	public void setLcTotalAmtClaimed(BigDecimal lcTotalAmtClaimed) {
		this.lcTotalAmtClaimed = lcTotalAmtClaimed;
	}

	/**
	 * @param lcNetAmtClaimed the lcNetAmtClaimed to set
	 */
	public void setLcNetAmtClaimed(BigDecimal lcNetAmtClaimed) {
		this.lcNetAmtClaimed = lcNetAmtClaimed;
	}

	/**
	 * @param lcAmtPaid the lcAmtPaid to set
	 */
	public void setLcAmtPaid(BigDecimal lcAmtPaid) {
		this.lcAmtPaid = lcAmtPaid;
	}

	/**
	 * @param lcDiscrepancies the lcDiscrepancies to set
	 */
	public void setLcDiscrepancies(String lcDiscrepancies) {
		this.lcDiscrepancies = lcDiscrepancies;
	}

	/**
	 * @param lcDispoDocs the lcDispoDocs to set
	 */
	public void setLcDispoDocs(String lcDispoDocs) {
		this.lcDispoDocs = lcDispoDocs;
	}

	/**
	 * @return the msgRelStatus
	 */
	public String getMsgRelStatus() {
		return msgRelStatus;
	}

	/**
	 * @return the lcTypeAuthCode
	 */
	public String getLcTypeAuthCode() {
		return lcTypeAuthCode;
	}

	/**
	 * @return the lcNonBankIssuer
	 */
	public String getLcNonBankIssuer() {
		return lcNonBankIssuer;
	}

	/**
	 * @return the lcDraweeBnkAcct
	 */
	public String getLcDraweeBnkAcct() {
		return lcDraweeBnkAcct;
	}

	/**
	 * @return the lcAppRulesCode
	 */
	public String getLcAppRulesCode() {
		return lcAppRulesCode;
	}

	/**
	 * @return the lcAppRulesDesc
	 */
	public String getLcAppRulesDesc() {
		return lcAppRulesDesc;
	}

	/**
	 * @param msgRelStatus the msgRelStatus to set
	 */
	public void setMsgRelStatus(String msgRelStatus) {
		this.msgRelStatus = msgRelStatus;
	}

	/**
	 * @param lcTypeAuthCode the lcTypeAuthCode to set
	 */
	public void setLcTypeAuthCode(String lcTypeAuthCode) {
		this.lcTypeAuthCode = lcTypeAuthCode;
	}

	/**
	 * @param lcNonBankIssuer the lcNonBankIssuer to set
	 */
	public void setLcNonBankIssuer(String lcNonBankIssuer) {
		this.lcNonBankIssuer = lcNonBankIssuer;
	}

	/**
	 * @param lcDraweeBnkAcct the lcDraweeBnkAcct to set
	 */
	public void setLcDraweeBnkAcct(String lcDraweeBnkAcct) {
		this.lcDraweeBnkAcct = lcDraweeBnkAcct;
	}

	/**
	 * @param lcAppRulesCode the lcAppRulesCode to set
	 */
	public void setLcAppRulesCode(String lcAppRulesCode) {
		this.lcAppRulesCode = lcAppRulesCode;
	}

	/**
	 * @param lcAppRulesDesc the lcAppRulesDesc to set
	 */
	public void setLcAppRulesDesc(String lcAppRulesDesc) {
		this.lcAppRulesDesc = lcAppRulesDesc;
	}

	/**
	 * @return the lcDeparturePlace
	 */
	public String getLcDeparturePlace() {
		return lcDeparturePlace;
	}

	/**
	 * @return the lcFinalDstn
	 */
	public String getLcFinalDstn() {
		return lcFinalDstn;
	}

	/**
	 * @param lcDeparturePlace the lcDeparturePlace to set
	 */
	public void setLcDeparturePlace(String lcDeparturePlace) {
		this.lcDeparturePlace = lcDeparturePlace;
	}

	/**
	 * @param lcFinalDstn the lcFinalDstn to set
	 */
	public void setLcFinalDstn(String lcFinalDstn) {
		this.lcFinalDstn = lcFinalDstn;
	}

	/**
	 * @return the lcArrCommodity
	 */
	public String[] getLcArrCommodity() {
		return lcArrCommodity;
	}

	/**
	 * @param lcArrCommodity the lcArrCommodity to set
	 */
	public void setLcArrCommodity(String[] lcArrCommodity) {
		this.lcArrCommodity = lcArrCommodity;
	}

	/**
	 * @return the lcPosTolerance
	 */
	public String getLcPosTolerance() {
		return lcPosTolerance;
	}

	/**
	 * @param lcPosTolerance the lcPosTolerance to set
	 */
	public void setLcPosTolerance(String lcPosTolerance) {
		this.lcPosTolerance = lcPosTolerance;
	}

	/**
	 * @return the sendingInstId
	 */
	public String getSendingInstId() {
		return sendingInstId;
	}

	/**
	 * @return the sendingInstAcct
	 */
	public String getSendingInstAcct() {
		return sendingInstAcct;
	}

	/**
	 * @return the sendingInst
	 */
	public String getSendingInst() {
		return sendingInst;
	}

	/**
	 * @return the sendingInstLoc
	 */
	public String getSendingInstLoc() {
		return sendingInstLoc;
	}

	/**
	 * @return the sendingInstNameAdd
	 */
	public String getSendingInstNameAdd() {
		return sendingInstNameAdd;
	}

	/**
	 * @param sendingInstId the sendingInstId to set
	 */
	public void setSendingInstId(String sendingInstId) {
		this.sendingInstId = sendingInstId;
	}

	/**
	 * @param sendingInstAcct the sendingInstAcct to set
	 */
	public void setSendingInstAcct(String sendingInstAcct) {
		this.sendingInstAcct = sendingInstAcct;
	}

	/**
	 * @param sendingInst the sendingInst to set
	 */
	public void setSendingInst(String sendingInst) {
		this.sendingInst = sendingInst;
	}

	/**
	 * @param sendingInstLoc the sendingInstLoc to set
	 */
	public void setSendingInstLoc(String sendingInstLoc) {
		this.sendingInstLoc = sendingInstLoc;
	}

	/**
	 * @param sendingInstNameAdd the sendingInstNameAdd to set
	 */
	public void setSendingInstNameAdd(String sendingInstNameAdd) {
		this.sendingInstNameAdd = sendingInstNameAdd;
	}

	/**
	 * @return the beneficiaryInstitutionPID
	 */
	public String getBeneficiaryInstitutionPID() {
		return beneficiaryInstitutionPID;
	}

	/**
	 * @param beneficiaryInstitutionPID the beneficiaryInstitutionPID to set
	 */
	public void setBeneficiaryInstitutionPID(String beneficiaryInstitutionPID) {
		this.beneficiaryInstitutionPID = beneficiaryInstitutionPID;
	}

	/**
	 * @return the message_so_far
	 */
	public String getMessage_so_far() {
		return message_so_far;
	}

	/**
	 * @param message_so_far the message_so_far to set
	 */
	public void setMessage_so_far(String message_so_far) {
		this.message_so_far = message_so_far;
	}
	
	
	/**
	 * @return the bgSequenceNo
	 */
	public BigDecimal getSequenceNo() {
		return sequenceNo;
	}

	/**
	 * @param bgSequenceNo the bgSequenceNo to set
	 */
	public void setSequenceNo(BigDecimal bgSequenceNo) {
		this.sequenceNo = bgSequenceNo;
	}

	/**
	 * @return the bgNoofMessages
	 */
	public BigDecimal getNoofMessages() {
		return noofMessages;		
	}

	/**
	 * @param bgNoofMessages the bgNoofMessages to set
	 */
	public void setNoofMessages(BigDecimal bgNoofMessages) {
		this.noofMessages = bgNoofMessages;
	}
	
		
	/**
	 * @return the principalDate
	 */
	public Timestamp getPrincipalDate() {
		return principalDate;
	}

	/**
	 * @param principalDate the principalDate to set
	 */
	public void setPrincipalDate(Timestamp principalDate) {
		this.principalDate = principalDate;
	}

	/**
	 * @return the principalCurrency
	 */
	public String getPrincipalCurrency() {
		return principalCurrency;
	}

	/**
	 * @param principalCurrency the principalCurrency to set
	 */
	public void setPrincipalCurrency(String principalCurrency) {
		this.principalCurrency = principalCurrency;
	}

	/**
	 * @return the principalAmt
	 */
	public BigDecimal getPrincipalAmt() {
		return principalAmt;
	}

	/**
	 * @param principalAmt the principalAmt to set
	 */
	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}

	/**
	 * @return the prinDate
	 */
	public Timestamp getPrinDate() {
		return prinDate;
	}

	/**
	 * @param prinDate the prinDate to set
	 */
	public void setPrinDate(Timestamp prinDate) {
		this.prinDate = prinDate;
	}

	/**
	 * @return the prinCurrency
	 */
	public String getPrinCurrency() {
		return prinCurrency;
	}

	/**
	 * @param prinCurrency the prinCurrency to set
	 */
	public void setPrinCurrency(String prinCurrency) {
		this.prinCurrency = prinCurrency;
	}

	/**
	 * @return the prinTotalAmt
	 */
	public BigDecimal getPrinTotalAmt() {
		return prinTotalAmt;
	}

	/**
	 * @param prinTotalAmt the prinTotalAmt to set
	 */
	public void setPrinTotalAmt(BigDecimal prinTotalAmt) {
		this.prinTotalAmt = prinTotalAmt;
	}

	/**
	 * @return the lcAdditionalCurrency
	 */
	public String getLcAdditionalCurrency() {
		return lcAdditionalCurrency;
	}

	/**
	 * @param lcAdditionalCurrency the lcAdditionalCurrency to set
	 */
	public void setLcAdditionalCurrency(String lcAdditionalCurrency) {
		this.lcAdditionalCurrency = lcAdditionalCurrency;
	}

	/**
	 * @return the lcAdditionalAmt
	 */
	public BigDecimal getLcAdditionalAmt() {
		return lcAdditionalAmt;
	}

	/**
	 * @param lcAdditionalAmt the lcAdditionalAmt to set
	 */
	public void setLcAdditionalAmt(BigDecimal lcAdditionalAmt) {
		this.lcAdditionalAmt = lcAdditionalAmt;
	}

	/**
	 * @return the beneficiaryInstitutionClrgCd
	 */
	public String getBeneficiaryInstitutionClrgCd() {
		return beneficiaryInstitutionClrgCd;
	}

	/**
	 * @param beneficiaryInstitutionClrgCd the beneficiaryInstitutionClrgCd to set
	 */
	public void setBeneficiaryInstitutionClrgCd(String beneficiaryInstitutionClrgCd) {
		this.beneficiaryInstitutionClrgCd = beneficiaryInstitutionClrgCd;
	}
	
	

	/**
	 * @return the bgFormNumber
	 */
	public String getBgFormNumber() {
		return bgFormNumber;
	}

	/**
	 * @param bgFormNumber the bgFormNumber to set
	 */
	public void setBgFormNumber(String bgFormNumber) {
		this.bgFormNumber = bgFormNumber;
	}

	/**
	 * @return the bgType
	 */
	public String getBgType() {
		return bgType;
	}

	/**
	 * @param bgType the bgType to set
	 */
	public void setBgType(String bgType) {
		this.bgType = bgType;
	}

	/**
	 * @return the bgAmt
	 */
	public BigDecimal getBgAmt() {
		return bgAmt;
	}

	/**
	 * @param bgAmt the bgAmt to set
	 */
	public void setBgAmt(BigDecimal bgAmt) {
		this.bgAmt = bgAmt;
	}

	/**
	 * @return the bgCurrency
	 */
	public String getBgCurrency() {
		return bgCurrency;
	}

	/**
	 * @param bgCurrency the bgCurrency to set
	 */
	public void setBgCurrency(String bgCurrency) {
		this.bgCurrency = bgCurrency;
	}

	/**
	 * @return the bgFromDate
	 */
	public Timestamp getBgFromDate() {
		return bgFromDate;
	}

	/**
	 * @param bgFromDate the bgFromDate to set
	 */
	public void setBgFromDate(Timestamp bgFromDate) {
		this.bgFromDate = bgFromDate;
	}

	/**
	 * @return the bgToDate
	 */
	public Timestamp getBgToDate() {
		return bgToDate;
	}

	/**
	 * @param bgToDate the bgToDate to set
	 */
	public void setBgToDate(Timestamp bgToDate) {
		this.bgToDate = bgToDate;
	}

	/**
	 * @return the bgEffectiveDate
	 */
	public Timestamp getBgEffectiveDate() {
		return bgEffectiveDate;
	}

	/**
	 * @param bgEffectiveDate the bgEffectiveDate to set
	 */
	public void setBgEffectiveDate(Timestamp bgEffectiveDate) {
		this.bgEffectiveDate = bgEffectiveDate;
	}

	/**
	 * @return the bgLodgementEndDate
	 */
	public Timestamp getBgLodgementEndDate() {
		return bgLodgementEndDate;
	}

	/**
	 * @param bgLodgementEndDate the bgLodgementEndDate to set
	 */
	public void setBgLodgementEndDate(Timestamp bgLodgementEndDate) {
		this.bgLodgementEndDate = bgLodgementEndDate;
	}

	/**
	 * @return the bgLodgementPlace
	 */
	public String getBgLodgementPlace() {
		return bgLodgementPlace;
	}

	/**
	 * @param bgLodgementPlace the bgLodgementPlace to set
	 */
	public void setBgLodgementPlace(String bgLodgementPlace) {
		this.bgLodgementPlace = bgLodgementPlace;
	}

	/**
	 * @return the issuingBankCode
	 */
	public String getIssuingBankCode() {
		return issuingBankCode;
	}

	/**
	 * @param issuingBankCode the issuingBankCode to set
	 */
	public void setIssuingBankCode(String issuingBankCode) {
		this.issuingBankCode = issuingBankCode;
	}

	/**
	 * @return the issueingBankAddr
	 */
	public String getIssueingBankAddr() {
		return issueingBankAddr;
	}

	/**
	 * @param issueingBankAddr the issueingBankAddr to set
	 */
	public void setIssueingBankAddr(String issueingBankAddr) {
		this.issueingBankAddr = issueingBankAddr;
	}

	/**
	 * @return the bgApplicentName
	 */
	public String getBgApplicentName() {
		return bgApplicentName;
	}

	/**
	 * @param bgApplicentName the bgApplicentName to set
	 */
	public void setBgApplicentName(String bgApplicentName) {
		this.bgApplicentName = bgApplicentName;
	}

	/**
	 * @return the bgBenificiaryName
	 */
	public String getBgBenificiaryName() {
		return bgBenificiaryName;
	}

	/**
	 * @param bgBenificiaryName the bgBenificiaryName to set
	 */
	public void setBgBenificiaryName(String bgBenificiaryName) {
		this.bgBenificiaryName = bgBenificiaryName;
	}

	/**
	 * @return the bgBenificiaryBankCode
	 */
	public String getBgBenificiaryBankCode() {
		return bgBenificiaryBankCode;
	}

	/**
	 * @param bgBenificiaryBankCode the bgBenificiaryBankCode to set
	 */
	public void setBgBenificiaryBankCode(String bgBenificiaryBankCode) {
		this.bgBenificiaryBankCode = bgBenificiaryBankCode;
	}

	/**
	 * @return the bgBenificiaryBankAddr
	 */
	public String getBgBenificiaryBankAddr() {
		return bgBenificiaryBankAddr;
	}

	/**
	 * @param bgBenificiaryBankAddr the bgBenificiaryBankAddr to set
	 */
	public void setBgBenificiaryBankAddr(String bgBenificiaryBankAddr) {
		this.bgBenificiaryBankAddr = bgBenificiaryBankAddr;
	}

	/**
	 * @return the bgPurpose
	 */
	public String getBgPurpose() {
		return bgPurpose;
	}

	/**
	 * @param bgPurpose the bgPurpose to set
	 */
	public void setBgPurpose(String bgPurpose) {
		this.bgPurpose = bgPurpose;
	}

	/**
	 * @return the contractReference
	 */
	public String getContractReference() {
		return contractReference;
	}

	/**
	 * @param contractReference the contractReference to set
	 */
	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}

	/**
	 * @return the stampDutyPaid
	 */
	public String getStampDutyPaid() {
		return StampDutyPaid;
	}

	/**
	 * @param stampDutyPaid the stampDutyPaid to set
	 */
	public void setStampDutyPaid(String stampDutyPaid) {
		StampDutyPaid = stampDutyPaid;
	}

	/**
	 * @return the stampDutyNum
	 */
	public String getStampDutyNum() {
		return stampDutyNum;
	}

	/**
	 * @param stampDutyNum the stampDutyNum to set
	 */
	public void setStampDutyNum(String stampDutyNum) {
		this.stampDutyNum = stampDutyNum;
	}

	/**
	 * @return the stampDutyDateTime
	 */
	public Timestamp getStampDutyDateTime() {
		return stampDutyDateTime;
	}

	/**
	 * @param stampDutyDateTime the stampDutyDateTime to set
	 */
	public void setStampDutyDateTime(Timestamp stampDutyDateTime) {
		this.stampDutyDateTime = stampDutyDateTime;
	}

	/**
	 * @return the bgPaidAmt
	 */
	public BigDecimal getBgPaidAmt() {
		return bgPaidAmt;
	}

	/**
	 * @param bgPaidAmt the bgPaidAmt to set
	 */
	public void setBgPaidAmt(BigDecimal bgPaidAmt) {
		this.bgPaidAmt = bgPaidAmt;
	}

	/**
	 * @return the bgStateCode
	 */
	public String getBgStateCode() {
		return bgStateCode;
	}

	/**
	 * @param bgStateCode the bgStateCode to set
	 */
	public void setBgStateCode(String bgStateCode) {
		this.bgStateCode = bgStateCode;
	}

	/**
	 * @return the bgArticleNum
	 */
	public String getBgArticleNum() {
		return bgArticleNum;
	}

	/**
	 * @param bgArticleNum the bgArticleNum to set
	 */
	public void setBgArticleNum(String bgArticleNum) {
		this.bgArticleNum = bgArticleNum;
	}

	/**
	 * @return the bgPaymentDate
	 */
	public Timestamp getBgPaymentDate() {
		return bgPaymentDate;
	}

	/**
	 * @param bgPaymentDate the bgPaymentDate to set
	 */
	public void setBgPaymentDate(Timestamp bgPaymentDate) {
		this.bgPaymentDate = bgPaymentDate;
	}

	/**
	 * @return the bgPaymentPlace
	 */
	public String getBgPaymentPlace() {
		return bgPaymentPlace;
	}

	/**
	 * @param bgPaymentPlace the bgPaymentPlace to set
	 */
	public void setBgPaymentPlace(String bgPaymentPlace) {
		this.bgPaymentPlace = bgPaymentPlace;
	}

	/**
	 * @return the bgDematForm
	 */
	public String getBgDematForm() {
		return bgDematForm;
	}

	/**
	 * @param bgDematForm the bgDematForm to set
	 */
	public void setBgDematForm(String bgDematForm) {
		this.bgDematForm = bgDematForm;
	}

	/**
	 * @return the bgCostodianProvider
	 */
	public String getBgCostodianProvider() {
		return bgCostodianProvider;
	}

	/**
	 * @param bgCostodianProvider the bgCostodianProvider to set
	 */
	public void setBgCostodianProvider(String bgCostodianProvider) {
		this.bgCostodianProvider = bgCostodianProvider;
	}

	/**
	 * @return the bgDematAccNum
	 */
	public String getBgDematAccNum() {
		return bgDematAccNum;
	}

	/**
	 * @param bgDematAccNum the bgDematAccNum to set
	 */
	public void setBgDematAccNum(String bgDematAccNum) {
		this.bgDematAccNum = bgDematAccNum;
	}

	public NgphCanonical()
	{}
	
	public NgphCanonical(NgphCanonical originalObject) 
	{
		this.setMsgRef(originalObject.getMsgRef());
		this.setGrpMsgId(originalObject.getGrpMsgId());
		this.setGrpSeq(originalObject.getGrpSeq());
		this.setMsgHost(originalObject.getMsgHost());
		this.setMsgChannel(originalObject.getMsgChannel());
		this.setMsgChnlType(originalObject.getMsgChnlType());
		this.setSrcMsgType(originalObject.getSrcMsgType());
		this.setSrcMsgSubType(originalObject.getSrcMsgSubType());
		this.setDstMsgType(originalObject.getDstMsgType());
		this.setDstMsgSubType(originalObject.getDstMsgSubType());
		this.setMsgStatus(originalObject.getMsgStatus());
		this.setMsgPrevStatus(originalObject.getMsgPrevStatus());
		this.setMsgDirection(originalObject.getMsgDirection());
		this.setReceivedTime(originalObject.getReceivedTime());
		this.setLastModTime(originalObject.getLastModTime());
		this.setTxnReference(originalObject.getTxnReference());
		this.setRelReference(originalObject.getRelReference());
		this.setCustTxnReference(originalObject.getCustTxnReference());
		this.setSndrTxnId(originalObject.getSndrTxnId());
		this.setClrgSysReference(originalObject.getClrgSysReference());
		this.setSndrPymtPriority(originalObject.getSndrPymtPriority());
		this.setClrgChannel(originalObject.getClrgChannel());
		this.setSvcLevelCode(originalObject.getSvcLevelCode());
		this.setSvcLevelProperitary(originalObject.getSvcLevelProperitary());
		this.setLclInstCode(originalObject.getLclInstCode());
		this.setLclInstProperitary(originalObject.getLclInstProperitary());
		this.setCatgPurposeCode(originalObject.getCatgPurposeCode());
		this.setCatgPurposeProperitary(originalObject.getCatgPurposeProperitary());
		this.setMsgCurrency(originalObject.getMsgCurrency());
		this.setMsgAmount(originalObject.getMsgAmount());
		this.setMsgValueDate(originalObject.getMsgValueDate());
		this.setSndrSttlmntPriority(originalObject.getSndrSttlmntPriority());
		this.setDrDateTime(originalObject.getDrDateTime());
		this.setCrDateTime(originalObject.getCrDateTime());
		this.setClsDateTime(originalObject.getClsDateTime());
		this.setSttlmntTillTime(originalObject.getSttlmntTillTime());
		this.setSttlmntFromTime(originalObject.getSttlmntFromTime());
		this.setSttlmntRejTime(originalObject.getSttlmntRejTime());
		this.setPymntAcceptedTime(originalObject.getPymntAcceptedTime());
		this.setCashpoolAdjstmntTime(originalObject.getCashpoolAdjstmntTime());
		this.setInstructedCurrency(originalObject.getInstructedCurrency());
		this.setInstructedAmount(originalObject.getInstructedAmount());
		this.setXchangeRate(originalObject.getXchangeRate());
		this.setChargeBearer(originalObject.getChargeBearer());
		this.setPrevInstructingBank(originalObject.getPrevInstructingBank());
		this.setPrevInstructingAgentAcct(originalObject.getPrevInstructingAgentAcct());
		this.setSenderBank(originalObject.getSenderBank());
		this.setReceiverBank(originalObject.getReceiverBank());
		this.setIntermediary1Bank(originalObject.getIntermediary1Bank());
		this.setIntermediary1BankId(originalObject.getIntermediary1BankId());
		this.setIntermediary1BankClrgCd(originalObject.getIntermediary1BankClrgCd());
		this.setIntermediary1BankName(originalObject.getIntermediary1BankName());
		this.setIntermediary1AgentAcct(originalObject.getIntermediary1AgentAcct());
		this.setIntermediary2Bank(originalObject.getIntermediary2Bank());
		this.setIntermediary2AgentAcct(originalObject.getIntermediary2AgentAcct());
		this.setIntermediary2BankName(originalObject.getIntermediary2BankName());
		this.setIntermediary3Bank(originalObject.getIntermediary3Bank());
		this.setIntermediary3AgentAcct(originalObject.getIntermediary3AgentAcct());
		this.setIntermediary3BankName(originalObject.getIntermediary3BankName());
		this.setUltimateDebtorName(originalObject.getUltimateDebtorName());
		this.setUltimateDebtorAddress(originalObject.getUltimateDebtorAddress());
		this.setUltimateDebtorID(originalObject.getUltimateDebtorID());
		this.setUltimateDebtorCtry(originalObject.getUltimateDebtorCtry());
		this.setUltimateDebtorCtctDtls(originalObject.getUltimateDebtorCtctDtls());
		this.setInitiatingPartyName(originalObject.getInitiatingPartyName());
		this.setInitiatingPartyAddress(originalObject.getInitiatingPartyAddress());
		this.setInitiatingPartyID(originalObject.getInitiatingPartyID());
		this.setInitiatingPartyCtry(originalObject.getInitiatingPartyCtry());
		this.setInitiatingPartyCtctDtls(originalObject.getInitiatingPartyCtctDtls());
		this.setOrderingCustomerName(originalObject.getOrderingCustomerName());
		this.setOrderingCustomerAddress(originalObject.getOrderingCustomerAddress());
		this.setOrderingCustomerId(originalObject.getOrderingCustomerId());
		this.setOrderingCustomerCtry(originalObject.getOrderingCustomerCtry());
		this.setOrderingCustomerCtctDtls(originalObject.getOrderingCustomerCtctDtls());
		this.setOrderingCustAccount(originalObject.getOrderingCustAccount());
		this.setOrderingType(originalObject.getOrderingType());
		this.setOrderingAcType(originalObject.getOrderingAcType());
		this.setOrderingInstitution(originalObject.getOrderingInstitution());
		this.setOrderingInstitutionId(originalObject.getOrderingInstitutionId());
		this.setOrderingInstitutionName(originalObject.getOrderingInstitutionName());
		this.setOrderingInstitutionAcct(originalObject.getOrderingInstitutionAcct());
		this.setAccountWithInstitution(originalObject.getAccountWithInstitution());
		this.setAccountWithInstitutionId(originalObject.getAccountWithInstitutionId());
		this.setAccountWithInstitutionLoc(originalObject.getAccountWithInstitutionLoc());
		this.setAccountWithInstitutionClrgCd(originalObject.getAccountWithInstitutionClrgCd());
		this.setAccountWithInstitutionName(originalObject.getAccountWithInstitutionName());
		this.setAccountWithInstitutionAcct(originalObject.getAccountWithInstitutionAcct());
		this.setSenderCorrespondent(originalObject.getSenderCorrespondent());
		this.setSenderCorrespondentId(originalObject.getSenderCorrespondentId());
		this.setSenderCorrespondentLoc(originalObject.getSenderCorrespondentLoc());
		this.setSenderCorrespondentName(originalObject.getSenderCorrespondentName());
		this.setSenderCorrespondentAcct(originalObject.getSenderCorrespondentAcct());
		this.setReceiverCorrespondent(originalObject.getReceiverCorrespondent());
		this.setReceiverCorrespondentId(originalObject.getReceiverCorrespondentId());
		this.setReceiverCorrespondentLoc(originalObject.getReceiverCorrespondentLoc());
		this.setReceiverCorrespondentName(originalObject.getReceiverCorrespondentName());
		this.setReceiverCorrespondentAcct(originalObject.getReceiverCorrespondentAcct());
		this.setThirdCorrespondent(originalObject.getThirdCorrespondent());
		this.setThirdCorrespondentId(originalObject.getThirdCorrespondentId());
		this.setThirdCorrespondentLoc(originalObject.getThirdCorrespondentLoc());
		this.setThirdCorrespondentName(originalObject.getThirdCorrespondentName());
		this.setThirdCorrespondentAcct(originalObject.getThirdCorrespondentAcct());
		this.setBeneficiaryCustomerName(originalObject.getBeneficiaryCustomerName());
		this.setBeneficiaryCustomerAddress(originalObject.getBeneficiaryCustomerAddress());
		this.setBeneficiaryCustomerID(originalObject.getBeneficiaryCustomerID());
		this.setBeneficiaryCustomerCtry(originalObject.getBeneficiaryCustomerCtry());
		this.setBeneficiaryCustomerCtctDtls(originalObject.getBeneficiaryCustomerCtctDtls());
		this.setBeneficiaryCustAcct(originalObject.getBeneficiaryCustAcct());
		this.setBeneficiaryType(originalObject.getBeneficiaryType());
		this.setBeneficiaryAcType(originalObject.getBeneficiaryAcType());
		this.setBeneficiaryInstitution(originalObject.getBeneficiaryInstitution());
		this.setBeneficiaryInstitutionName(originalObject.getBeneficiaryInstitutionName());
		this.setBeneficiaryInstitutionAcct(originalObject.getBeneficiaryInstitutionAcct());
		this.setUltimateCreditorName(originalObject.getUltimateCreditorName());
		this.setUltimateCreditorAddress(originalObject.getUltimateCreditorAddress());
		this.setUltimateCreditorID(originalObject.getUltimateCreditorID());
		this.setUltimateCreditorCtry(originalObject.getUltimateCreditorCtry());
		this.setUltimateCreditorCtctDtls(originalObject.getUltimateCreditorCtctDtls());
		this.setInstructionsForCrdtrAgtCode(originalObject.getInstructionsForCrdtrAgtCode());
		this.setInstructionsForCrdtrAgtText(originalObject.getInstructionsForCrdtrAgtText());
		this.setInstructionsForNextAgtCode(originalObject.getInstructionsForNextAgtCode());
		this.setInstructionsForNextAgtText(originalObject.getInstructionsForNextAgtText());
		this.setMsgPurposeCode(originalObject.getMsgPurposeCode());
		this.setMsgPurposeText(originalObject.getMsgPurposeText());
		this.setRegulatoryBankCode(originalObject.getRegulatoryBankCode());
		this.setRegulatoryReportDrCr(originalObject.getRegulatoryReportDrCr());
		this.setRegulatoryReportCurrency(originalObject.getRegulatoryReportCurrency());
		this.setRegulatoryReportAmount(originalObject.getRegulatoryReportAmount());
		this.setRegulatoryInformation(originalObject.getRegulatoryInformation());
		this.setInitiatorRemitReference(originalObject.getInitiatorRemitReference());
		this.setInitiatorRemitAdviceMethod(originalObject.getInitiatorRemitAdviceMethod());
		this.setRemitInfoEmail(originalObject.getRemitInfoEmail());
		this.setRemitReceivingPartyName(originalObject.getRemitReceivingPartyName());
		this.setRemitReceivingPartyAddress(originalObject.getRemitReceivingPartyAddress());
		this.setRelRemitInfoRef(originalObject.getRelRemitInfoRef());
		this.setRemitInfoRef(originalObject.getRemitInfoRef());
		this.setMsgTxnType(originalObject.getMsgTxnType());
		this.setMsgReturnReference(originalObject.getMsgReturnReference());
		this.setCustAccount(originalObject.getCustAccount());
		this.setMsgBatchTime(originalObject.getMsgBatchTime());
		this.setMsgDept(originalObject.getMsgDept());
		this.setMsgBranch(originalObject.getMsgBranch());
		this.setMsgRules(originalObject.getMsgRules());
		this.setRelUid(originalObject.getRelUid());
		this.setMsgMur(originalObject.getMsgMur());
		this.setLastModifiedUser(originalObject.getLastModifiedUser());
		this.setComments(originalObject.getComments());
		this.setCrCurrency(originalObject.getCrCurrency());
		this.setDrCurrency(originalObject.getDrCurrency());
		this.setBaseCcyAmount(originalObject.getBaseCcyAmount());
		this.setMsgCurrencyAmount(originalObject.getMsgCurrencyAmount());
		this.setInstructedCcyAmount(originalObject.getInstructedCcyAmount());
		this.setServiceID(originalObject.getServiceID());
		this.setRepairReason(originalObject.getRepairReason());
		this.setAccountingStatus(originalObject.getAccountingStatus());
		this.setAccountingReason(originalObject.getAccountingReason());
		this.setPdeCount(originalObject.getPdeCount());
		this.setReturnReasonCode(originalObject.getReturnReasonCode());
		this.setReturnReasonDesc(originalObject.getReturnReasonDesc());
		this.setDstMsgChnlType(originalObject.getDstMsgChnlType());
		this.setDstEiId(originalObject.getDstEiId());
		this.setSeqNo(originalObject.getSeqNo());
		this.setMsgErrorDesc(originalObject.getMsgErrorDesc());
		this.setMsgIsReturn(originalObject.getMsgIsReturn());
		this.setMsgRelStatus(originalObject.getMsgRelStatus());
		this.setLcType(originalObject.getLcType());
		this.setLcTypeAuthCode(originalObject.getLcTypeAuthCode());
		this.setLcNo(originalObject.getLcNo());
		this.setLcPrevAdvRef(originalObject.getLcPrevAdvRef());
		this.setLcIssueDt(originalObject.getLcIssueDt());
		this.setLcExpDt(originalObject.getLcExpDt());
		this.setLcExpPlace(originalObject.getLcExpPlace());
		this.setLcNonBankIssuer(originalObject.getLcNonBankIssuer());
		this.setLcTolerance(originalObject.getLcTolerance());
		this.setLcPosTolerance(originalObject.getLcPosTolerance());
		this.setLcMaxCrAmt(originalObject.getLcMaxCrAmt());
		this.setLcAddlAmts(originalObject.getLcAddlAmts());
		this.setLcAuthBankCode(originalObject.getLcAuthBankCode());
		this.setLcAuthBankAddr(originalObject.getLcAuthBankAddr());
		this.setLcAuthMode(originalObject.getLcAuthMode());
		this.setLcDispatchPlace(originalObject.getLcDispatchPlace());
		this.setLcDeparturePlace(originalObject.getLcDeparturePlace());
		this.setLcDstn(originalObject.getLcDstn());
		this.setLcFinalDstn(originalObject.getLcFinalDstn());
		this.setLcLstShipDt(originalObject.getLcLstShipDt());
		this.setLcShipPeriod(originalObject.getLcShipPeriod());
		this.setLcShipTerms(originalObject.getLcShipTerms());
		this.setLcDraftsAt(originalObject.getLcDraftsAt());
		this.setLcDraweeBnkPid(originalObject.getLcDraweeBnkPid());
		this.setLcDraweeBnkAcct(originalObject.getLcDraweeBnkAcct());
		this.setLcDraweeBnkCode(originalObject.getLcDraweeBnkCode());
		this.setLcDraweeBnkAddr(originalObject.getLcDraweeBnkAddr());
		this.setLcMixedPymtDet(originalObject.getLcMixedPymtDet());
		this.setLcDefPymtDet(originalObject.getLcDefPymtDet());
		this.setLcPartialShipment(originalObject.getLcPartialShipment());
		this.setLcTransShipment(originalObject.getLcTransShipment());
		this.setLcDocsReq1(originalObject.getLcDocsReq1());
		this.setLcDocsReq2(originalObject.getLcDocsReq2());
		this.setLcAddnlCndt1(originalObject.getLcAddnlCndt1());
		this.setLcAddnlCndt2(originalObject.getLcAddnlCndt2());
		this.setLcCharges(originalObject.getLcCharges());
		this.setLcPrsntnPrd(originalObject.getLcPrsntnPrd());
		this.setLcConfrmInstrns(originalObject.getLcConfrmInstrns());
		this.setLcInstrnTopay(originalObject.getLcInstrnTopay());
		this.setLcNarrative(originalObject.getLcNarrative());
		this.setLcAmndmntNo(originalObject.getLcAmndmntNo());
		this.setLcAmndmntDt(originalObject.getLcAmndmntDt());
		this.setLcOldExpDt(originalObject.getLcOldExpDt());
		this.setLcAmndmntIncAmt(originalObject.getLcAmndmntIncAmt());
		this.setLcAmndmntDecAmt(originalObject.getLcAmndmntDecAmt());
		this.setLcAmndmntOldAmt(originalObject.getLcAmndmntOldAmt());
		this.setLcAccId(originalObject.getLcAccId());
		this.setLcAckDt(originalObject.getLcAckDt());
		this.setLcChgsClaimed(originalObject.getLcChgsClaimed());
		this.setLcToAmtClaimed(originalObject.getLcToAmtClaimed());
		this.setLcTotalAmtClaimed(originalObject.getLcTotalAmtClaimed());
		this.setLcNetAmtClaimed(originalObject.getLcNetAmtClaimed());
		this.setLcAmtPaid(originalObject.getLcAmtPaid());
		this.setLcDiscrepancies(originalObject.getLcDiscrepancies());
		this.setLcDispoDocs(originalObject.getLcDispoDocs());
		this.setLcAppRulesCode(originalObject.getLcAppRulesCode());
		this.setLcAppRulesDesc(originalObject.getLcAppRulesDesc());
		this.setSendingInst(originalObject.getSendingInst());
		this.setSendingInstAcct(originalObject.getSendingInstAcct());
		this.setSendingInstId(originalObject.getSendingInstId());
		this.setSendingInstLoc(originalObject.getSendingInstLoc());
		this.setSendingInstNameAdd(originalObject.getSendingInstNameAdd());
		this.setBeneficiaryInstitutionPID(originalObject.getBeneficiaryInstitutionPID());
		this.setSequenceNo(originalObject.getSequenceNo());
		this.setNoofMessages(originalObject.getNoofMessages());
		this.setPrincipalDate(originalObject.getPrincipalDate());
		this.setPrincipalCurrency(originalObject.getPrincipalCurrency());
		this.setPrincipalAmt(originalObject.getPrincipalAmt());
		this.setPrinDate(originalObject.getPrinDate());
		this.setPrinCurrency(originalObject.getPrinCurrency());
		this.setPrinTotalAmt(originalObject.getPrinTotalAmt());
		this.setLcAdditionalCurrency(originalObject.getLcAdditionalCurrency());
		this.setLcAdditionalAmt(originalObject.getLcAdditionalAmt());
		this.setBeneficiaryInstitutionClrgCd(originalObject.getBeneficiaryInstitutionClrgCd());
		//Start :: Added for BG COV messages
		this.setBgFormNumber(originalObject.getBgFormNumber());
		this.setBgType(originalObject.getBgType());
		this.setBgAmt(originalObject.getBgAmt());
		this.setBgCurrency(originalObject.getBgCurrency());
		this.setBgFromDate(originalObject.getBgFromDate());
		this.setBgToDate(originalObject.getBgToDate());
		this.setBgEffectiveDate(originalObject.getBgEffectiveDate());
		this.setBgLodgementEndDate(originalObject.getBgLodgementEndDate());
		this.setBgLodgementPlace(originalObject.getBgLodgementPlace());
		this.setIssuingBankCode(originalObject.getIssuingBankCode());
		this.setIssueingBankAddr(originalObject.getIssueingBankAddr());
		this.setBgApplicentName(originalObject.getBgApplicentName());
		this.setBgBenificiaryName(originalObject.getBgBenificiaryName());
		this.setBgBenificiaryBankCode(originalObject.getBgBenificiaryBankCode());
		this.setBgBenificiaryBankAddr(originalObject.getBgBenificiaryBankAddr());
		this.setBgPurpose(originalObject.getBgPurpose());
		this.setContractReference(originalObject.getContractReference());
		this.setStampDutyPaid(originalObject.getStampDutyPaid());
		this.setStampDutyNum(originalObject.getStampDutyNum());
		this.setStampDutyDateTime(originalObject.getStampDutyDateTime());
		this.setBgPaidAmt(originalObject.getBgPaidAmt());
		this.setBgStateCode(originalObject.getBgStateCode());
		this.setBgArticleNum(originalObject.getBgArticleNum());
		this.setBgPaymentDate(originalObject.getBgPaymentDate());
		this.setBgPaymentPlace(originalObject.getBgPaymentPlace());
		this.setBgDematForm(originalObject.getBgDematForm());
		this.setBgCostodianProvider(originalObject.getBgCostodianProvider());
		this.setBgDematAccNum(originalObject.getBgDematAccNum());
		//End :: Added for BG COV messages
		
	}
}
