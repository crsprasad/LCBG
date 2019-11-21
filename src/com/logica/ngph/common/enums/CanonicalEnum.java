package com.logica.ngph.common.enums;

/**
 * 
 * @author mohdabdulaa
 * 
 */
public enum CanonicalEnum {

	MSGREF("msgRef"),

	GRPMSGID("grpMsgId"),

	GRPSEQ("grpSeq"),

	MSGHOST("msgHost"),

	MSGCHANNEL("msgChannel"),

	MSGCHNLTYPE("msgChnlType"),

	SRCMSGTYPE("srcMsgType"),

	SRCMSGSUBTYPE("srcMsgSubType"),

	DSTMSTTYPE("dstMsgType"),

	DSTMSTSUBTYPE("dstMsgSubType"),

	MSGSTATUS("msgStatus"),

	MSGPRVSTATUS("msgPrevStatus"),

	RECEIVEDTIME("receivedTime"),

	LASTMODTIME("lastModTime"),

	TXNREFERENCE("txnReference"),

	CUSTTXNREFERENCE("custTxnReference"),

	//TXNREFMSGPAY("txRefMsgPay"),
	SNDRTXNID("sndrTxnId"),

	CLRGSYSREFERENCE("clrgSysReference"),

	SNDRPYMTPRIORITY("sndrPymtPriority"),

	CLRGCHANNEL("clrgChannel"),

	SVCLEVELCODE("svcLevelCode"),

	//SVCLEVELPRIORITY("svcLevelPriority"),
	SVCLEVELPROPERITARY("svcLevelProperitary"),

	LCLINSTCODE("lclInstCode"),

	//LCLINSTPRIORITY("lclInstPriority"),
	LCLINSTPROPERITARY("lclInstProperitary"),

	CATGPURPOSECODE("catgPurposeCode"),

	//CATGPURPOSEPRIORITY("catgPurposePriority"),
	CATGPURPOSEPROPERITARY("catgPurposeProperitary"),

	MSGCURRENCY("msgCurrency"),

	MSGAMOUNT("msgAmount"),

	MSGVALUEDATE("msgValueDate"),

	SNDSTTLMNTPRIORITY("sndrSttlmntPriority"),

	DRDATETIME("drDateTime"),

	CRDATETIME("crDateTime"),

	CLSDATETIME("clsDateTime"),

	STTLMNTTILLTIME("sttlmntTillTime"),

	STTLMNTFRMTIME("sttlmntFromTime"),

	STTLMNTREJTIME("sttlmntRejTime"),

	PYMNTACCEPTEDTIME("pymntAcceptedTime"),

	CASHPOOLADJSTMNTTIME("cashpoolAdjstmntTime"),

	INSTRUCTEDCURRENCY("instructedCurrency"),

	INSTRUCTEDAMOUNT("instructedAmount"),

	XCHANGERATE("xchangeRate"),

	CHARGEBEARER("chargeBearer"),

	CHARGECURRENCY("chargeCurrency"),

	CHARGEAMOUNT("chargeAmount"),

	CHARGINGPARTYBANK("chargingPartyBank"),

	CHARGINGPARTYBRANCH("chargingPartyBranch"),

	PREVINSTRUCTINGBANK("prevInstructingBank"),

	PREVINSTRUCTINGBRANCH("prevInstructingBranch"),

	PREVINSTRUCTINGAGENTACCT("prevInstructingAgentAcct"),

	SENDERBANK("senderBank"),

	SENDERBANKBRANCH("senderBankBranch"),

	RECEIVERBANK("receiverBank"),

	RECEIVERBANKBRANCH("receiverBankBranch"),

	INTERMEDIARY1BANK("intermediary1Bank"),

	INTERMEDIARY1BRANCH("intermediary1Branch"),

	INTERMEDIARY1AGENTACCT("intermediary1AgentAcct"),

	INTERMEDIARY2BANK("intermediary2Bank"),

	INTERMEDIARY2BRANCH("intermediary2Branch"),

	INTERMEDIARY2AGENTACCT("intermediary2AgentAcct"),

	INTERMEDIARY3BANK("intermediary3Bank"),

	INTERMEDIARY3BRANCH("intermediary3Branch"),

	INTERMEDIARY3AGENTACCT("intermediary3AgentAcct"),

	ULTIMATEDEBTOR("ultimateDebtor"),

	INITIATINGPARTY("initiatingParty"),

	ORDERINGCUSTOMER("orderingCustomer"),

	ORDERINGCUSTACCOUNT("orderingCustAccount"),

	ORDERININSTITUTION("orderingInstitution"),

	ORDERININSTITUTIONACCT("orderingInstitutionAcct"),

	ACCOUNTWITHINSTRUCTION("accountWithInstitution"),

	ACCOUNTWITHINSTRUCTIONACCT("accountWithInstitutionAcct"),

	BENEFICIARYCUSTOMER("beneficiaryCustomer"),

	BENEFICIARYCUSTACCT("beneficiaryCustAcct"),

	ULTIMATECREDITOR("ultimateCreditor"),

	INSTRUCTIONSFORCRDTRAGTCODE("instructionsForCrdtrAgtCode"),

	INSTRUCTIONSFORCRDTRAGTTEXT("instructionsForCrdtrAgtText"),

	INSTRUCTIONSFORNEXTAGTCODE("instructionsForNextAgtCode"),

	INSTRUCTIONSFORNEXTAGTTEXT("instructionsForNextAgtText"),

	MSGPURPOSECODE("msgPurposeCode"),

	MSGPURPOSETEXT("msgPurposeText"),

	REGULATORYBANKCODE("regulatoryBankCode"),

	REGULATORYREPORTCURRENCY("regulatoryReportCurrency"),

	REGULATORYREPORTAMOUNT("regulatoryReportAmount"),

	REGULATORYINFORMATION("regulatoryInformation"),

	INITIATORREMITREFERENCE("initiatorRemitReference"),

	INITIATORREMITADVICEMETHOD("initiatorRemitAdviceMethod"),

	REMITINFOEMAIL("remitInfoEmail"),

	REMITRECEIVINGPARTYNAME("remitReceivingPartyName"),

	REMITRECEIVINGPARTYADDRESS("remitReceivingPartyAddress"),

	//RELATEDREMITINFO("relatedRemitInfo"),
	RELREMITINFOREF("relRemitInfoRef"),

	REMITINFOREF("remtInfoRef"),

	MSGRETURNREFERENCE("msgReturnReference"),

	CUSTACCOUNT("custAccount"),

	MSGBATCHTIME(" msgBatchTime"),

	MSGDEPT("msgDept"),

	MSGBRANCH("msgBranch"),

	MSGRULES("msgRules"),
	
	INTERMEDIARY2BANKNAME("intermediary2BankName"),
	
	INTERMEDIARY3BANKNAME("intermediary3BankName"),

	REGULATORYREPORTDRCR("regulatoryReportDrCr"),
	
	MSGMUR("msgMur");

	private String attribute;

	CanonicalEnum(String attribute) {
		this.attribute = attribute;
	}

	public static CanonicalEnum findCanonicalEnumByAttribute(
			String attributeName) {
		for (CanonicalEnum oneEnumSample : CanonicalEnum.values()) {
			if (oneEnumSample.attribute.equalsIgnoreCase(attributeName))
				return oneEnumSample;
		}
		return null;

	}

}
