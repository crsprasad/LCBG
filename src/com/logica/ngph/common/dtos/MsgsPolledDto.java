package com.logica.ngph.common.dtos;

import java.sql.Timestamp;

public class MsgsPolledDto {
	private String msgsRef;
	//private Timestamp inTime;
	//private Timestamp markedOutTime;
	private String lastOrchServiceIdCalled;
	private String branchName;
	private Timestamp settlementDate ;
	private String msgsStatus;
	private String msgsPrevStatus;
	public String getMsgsRef() {
		return msgsRef;
	}
	public void setMsgsRef(String msgsRef) {
		this.msgsRef = msgsRef;
	}
	public String getLastOrchServiceIdCalled() {
		return lastOrchServiceIdCalled;
	}
	public void setLastOrchServiceIdCalled(String lastOrchServiceIdCalled) {
		this.lastOrchServiceIdCalled = lastOrchServiceIdCalled;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public Timestamp getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Timestamp settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getMsgsStatus() {
		return msgsStatus;
	}
	public void setMsgsStatus(String msgsStatus) {
		this.msgsStatus = msgsStatus;
	}
	public String getMsgsPrevStatus() {
		return msgsPrevStatus;
	}
	public void setMsgsPrevStatus(String msgsPrevStatus) {
		this.msgsPrevStatus = msgsPrevStatus;
	}
}
