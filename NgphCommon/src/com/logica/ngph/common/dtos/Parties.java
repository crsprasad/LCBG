package com.logica.ngph.common.dtos;

import java.io.Serializable;

public class Parties implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5209032874844314548L;
	public String getBankIdentifierCode() {
		return bankIdentifierCode;
	}
	public void setBankIdentifierCode(String bankIdentifierCode) {
		this.bankIdentifierCode = bankIdentifierCode;
	}
	public String getClearingSystemMemberId() {
		return clearingSystemMemberId;
	}
	public void setClearingSystemMemberId(String clearingSystemMemberId) {
		this.clearingSystemMemberId = clearingSystemMemberId;
	}
	public String getClearingSystemMemberCode() {
		return clearingSystemMemberCode;
	}
	public void setClearingSystemMemberCode(String clearingSystemMemberCode) {
		this.clearingSystemMemberCode = clearingSystemMemberCode;
	}
	public String getClearingSystemMemberExternalCode() {
		return clearingSystemMemberExternalCode;
	}
	public void setClearingSystemMemberExternalCode(
			String clearingSystemMemberExternalCode) {
		this.clearingSystemMemberExternalCode = clearingSystemMemberExternalCode;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAddressRef() {
		return addressRef;
	}
	public void setAddressRef(String addressRef) {
		this.addressRef = addressRef;
	}
	public String getPartyIdendificationId() {
		return partyIdendificationId;
	}
	public void setPartyIdendificationId(String partyIdendificationId) {
		this.partyIdendificationId = partyIdendificationId;
	}
	public String getExternalPartyIdendificationId() {
		return externalPartyIdendificationId;
	}
	public void setExternalPartyIdendificationId(
			String externalPartyIdendificationId) {
		this.externalPartyIdendificationId = externalPartyIdendificationId;
	}
	public String getIdendificationSchme() {
		return idendificationSchme;
	}
	public void setIdendificationSchme(String idendificationSchme) {
		this.idendificationSchme = idendificationSchme;
	}
	public String getPartyissr() {
		return partyissr;
	}
	public void setPartyissr(String partyissr) {
		this.partyissr = partyissr;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	public String getParentIdIndicator() {
		return parentIdIndicator;
	}
	public void setParentIdIndicator(String parentIdIndicator) {
		this.parentIdIndicator = parentIdIndicator;
	}
	public String getBankReference() {
		return bankReference;
	}
	public void setBankReference(String bankReference) {
		this.bankReference = bankReference;
	}
	public int getIsCorrespondent() {
		return isCorrespondent;
	}
	public void setIsCorrespondent(int isCorrespondent) {
		this.isCorrespondent = isCorrespondent;
	}
	//PARTY_BIC
	private String bankIdentifierCode;
	//PARTY_CLRSYSMMBID_MMBID
	private String clearingSystemMemberId;
	//PARTY_CLRSYSMMBID_C_CD
	private String clearingSystemMemberCode;
	//PARTY_CLRSYSMMBID_C_PRTRY
	private String clearingSystemMemberExternalCode;
	//PARTY_NM
	private String agentName;
	//PARTY_ADDRREF
	private String addressRef;
	//PARTY_OTHR_ID
	private String partyIdendificationId;
	//PARTY_OTHR_SCHMENM_CD
	private String externalPartyIdendificationId;
	//PARTY_OTHR_SCHMENM_PRTRY
	private String idendificationSchme;
	//PARTY_OTHR_ISSR
	private String partyissr;
	//PARTY_BRANCH
	private int branch;
	//PARTY_PARENT_ID_IND
	private String parentIdIndicator;
	//PARTY_REFERENCE
	private String bankReference;
	//PARTY_ISCORRESPONDENT
	private int isCorrespondent;
}	
