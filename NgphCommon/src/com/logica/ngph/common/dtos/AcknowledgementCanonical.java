package com.logica.ngph.common.dtos;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 
 * @author guptarb
 *
 */
public class AcknowledgementCanonical implements Serializable 
{
	private static final long serialVersionUID = 1L;
	/*
	1)	Message Id
	2)	Group Id
	3)	Group Sequence
	4)	Message Branch
	5)	Message Department
	6)	Message Direction
	7)	Source Channel Type
	8)	Source Message Type
	9)	Source Sub Message Type
	10)	Source EI id
	11)	Destination Channel Type
	12)	Destination Message Type
	13)	Destination Sub Message Type
	14)	Destination EI id
	15)	Message MUR or related transaction reference
	16)	Acknowledgement Type
	17)	Acknowledgment Reason Code
	18)	Message Time Stamp
	19)	Acknowledgment Received Time Stamp
	20)	Original Message Message Id
	21)	Last Service Id
	22)	Rules Applied
	 */
		private String msgId;
		private String grpId;
		private String grpSeq;
		private String msgBranch;
		private String msgDept;
		private String msgDirection;
		private String srcChnlType;
		private String srcMsgType;
		private String srcSubMsgType;
		private String srcEiId;
		private String dstChnlType;
		private String dstMsgType;
		private String dstSubMsgType;
		private String dstEiId;
		private String msgMur;
		private String ackType;
		private String ackReasonCode;
		private Timestamp msgTmstmp;
		private Timestamp ackReceivedTmStmp;
		private String msgOriginalId;
		private String lastServiceId;
		private String rulesApplied;
		private String seqNo;
		private String sessionNo;
		//
		private String sndrTxnId;
		private String sndrPymtPriority;
		private String senderBank;
		private String receiverBank;
		private String msgSoFar;
		
		/**
		 * @return the msgSoFar
		 */
		public String getMsgSoFar() {
			return msgSoFar;
		}
		/**
		 * @param msgSoFar the msgSoFar to set
		 */
		public void setMsgSoFar(String msgSoFar) {
			this.msgSoFar = msgSoFar;
		}
		/**
		 * @return the senderBank
		 */
		public String getSenderBank() {
			return senderBank;
		}
		/**
		 * @return the receiverBank
		 */
		public String getReceiverBank() {
			return receiverBank;
		}
		/**
		 * @param senderBank the senderBank to set
		 */
		public void setSenderBank(String senderBank) {
			this.senderBank = senderBank;
		}
		/**
		 * @param receiverBank the receiverBank to set
		 */
		public void setReceiverBank(String receiverBank) {
			this.receiverBank = receiverBank;
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
		 * @return the sessionNo
		 */
		public String getSessionNo() {
			return sessionNo;
		}
		/**
		 * @param sessionNo the sessionNo to set
		 */
		public void setSessionNo(String sessionNo) {
			this.sessionNo = sessionNo;
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
		 * @return the msgId
		 */
		public String getMsgId() {
			return msgId;
		}
		/**
		 * @return the grpId
		 */
		public String getGrpId() {
			return grpId;
		}
		/**
		 * @return the grpSeq
		 */
		public String getGrpSeq() {
			return grpSeq;
		}
		/**
		 * @return the msgBranch
		 */
		public String getMsgBranch() {
			return msgBranch;
		}
		/**
		 * @return the msgDept
		 */
		public String getMsgDept() {
			return msgDept;
		}
		/**
		 * @return the msgDirection
		 */
		public String getMsgDirection() {
			return msgDirection;
		}
		/**
		 * @return the srcChnlType
		 */
		public String getSrcChnlType() {
			return srcChnlType;
		}
		/**
		 * @return the srcMsgType
		 */
		public String getSrcMsgType() {
			return srcMsgType;
		}
		/**
		 * @return the srcSubMsgType
		 */
		public String getSrcSubMsgType() {
			return srcSubMsgType;
		}
		/**
		 * @return the srcEiId
		 */
		public String getSrcEiId() {
			return srcEiId;
		}
		/**
		 * @return the dstChnlType
		 */
		public String getDstChnlType() {
			return dstChnlType;
		}
		/**
		 * @return the dstMsgType
		 */
		public String getDstMsgType() {
			return dstMsgType;
		}
		/**
		 * @return the dstSubMsgType
		 */
		public String getDstSubMsgType() {
			return dstSubMsgType;
		}
		/**
		 * @return the dstEiId
		 */
		public String getDstEiId() {
			return dstEiId;
		}
		/**
		 * @return the msgMur
		 */
		public String getMsgMur() {
			return msgMur;
		}
		/**
		 * @return the ackType
		 */
		public String getAckType() {
			return ackType;
		}
		/**
		 * @return the ackReasonCode
		 */
		public String getAckReasonCode() {
			return ackReasonCode;
		}
		/**
		 * @return the msgTmstmp
		 */
		public Timestamp getMsgTmstmp() {
			return msgTmstmp;
		}
		/**
		 * @return the ackReceivedTmStmp
		 */
		public Timestamp getAckReceivedTmStmp() {
			return ackReceivedTmStmp;
		}
		/**
		 * @return the msgOriginalId
		 */
		public String getMsgOriginalId() {
			return msgOriginalId;
		}
		/**
		 * @return the lastServiceId
		 */
		public String getLastServiceId() {
			return lastServiceId;
		}
		/**
		 * @return the rulesApplied
		 */
		public String getRulesApplied() {
			return rulesApplied;
		}
		/**
		 * @param msgId the msgId to set
		 */
		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}
		/**
		 * @param grpId the grpId to set
		 */
		public void setGrpId(String grpId) {
			this.grpId = grpId;
		}
		/**
		 * @param grpSeq the grpSeq to set
		 */
		public void setGrpSeq(String grpSeq) {
			this.grpSeq = grpSeq;
		}
		/**
		 * @param msgBranch the msgBranch to set
		 */
		public void setMsgBranch(String msgBranch) {
			this.msgBranch = msgBranch;
		}
		/**
		 * @param msgDept the msgDept to set
		 */
		public void setMsgDept(String msgDept) {
			this.msgDept = msgDept;
		}
		/**
		 * @param msgDirection the msgDirection to set
		 */
		public void setMsgDirection(String msgDirection) {
			this.msgDirection = msgDirection;
		}
		/**
		 * @param srcChnlType the srcChnlType to set
		 */
		public void setSrcChnlType(String srcChnlType) {
			this.srcChnlType = srcChnlType;
		}
		/**
		 * @param srcMsgType the srcMsgType to set
		 */
		public void setSrcMsgType(String srcMsgType) {
			this.srcMsgType = srcMsgType;
		}
		/**
		 * @param srcSubMsgType the srcSubMsgType to set
		 */
		public void setSrcSubMsgType(String srcSubMsgType) {
			this.srcSubMsgType = srcSubMsgType;
		}
		/**
		 * @param srcEiId the srcEiId to set
		 */
		public void setSrcEiId(String srcEiId) {
			this.srcEiId = srcEiId;
		}
		/**
		 * @param dstChnlType the dstChnlType to set
		 */
		public void setDstChnlType(String dstChnlType) {
			this.dstChnlType = dstChnlType;
		}
		/**
		 * @param dstMsgType the dstMsgType to set
		 */
		public void setDstMsgType(String dstMsgType) {
			this.dstMsgType = dstMsgType;
		}
		/**
		 * @param dstSubMsgType the dstSubMsgType to set
		 */
		public void setDstSubMsgType(String dstSubMsgType) {
			this.dstSubMsgType = dstSubMsgType;
		}
		/**
		 * @param dstEiId the dstEiId to set
		 */
		public void setDstEiId(String dstEiId) {
			this.dstEiId = dstEiId;
		}
		/**
		 * @param msgMur the msgMur to set
		 */
		public void setMsgMur(String msgMur) {
			this.msgMur = msgMur;
		}
		/**
		 * @param ackType the ackType to set
		 */
		public void setAckType(String ackType) {
			this.ackType = ackType;
		}
		/**
		 * @param ackReasonCode the ackReasonCode to set
		 */
		public void setAckReasonCode(String ackReasonCode) {
			this.ackReasonCode = ackReasonCode;
		}
		/**
		 * @param msgTmstmp the msgTmstmp to set
		 */
		public void setMsgTmstmp(Timestamp msgTmstmp) {
			this.msgTmstmp = msgTmstmp;
		}
		/**
		 * @param ackReceivedTmStmp the ackReceivedTmStmp to set
		 */
		public void setAckReceivedTmStmp(Timestamp ackReceivedTmStmp) {
			this.ackReceivedTmStmp = ackReceivedTmStmp;
		}
		/**
		 * @param msgOriginalId the msgOriginalId to set
		 */
		public void setMsgOriginalId(String msgOriginalId) {
			this.msgOriginalId = msgOriginalId;
		}
		/**
		 * @param lastServiceId the lastServiceId to set
		 */
		public void setLastServiceId(String lastServiceId) {
			this.lastServiceId = lastServiceId;
		}
		/**
		 * @param rulesApplied the rulesApplied to set
		 */
		public void setRulesApplied(String rulesApplied) {
			this.rulesApplied = rulesApplied;
		}

		/* Old Code
		private String msgRef;
		private String txnRef;
		private int ackType;
		private String ackReason;
		private String msgMur;
		private String msgPaymentStatus;
		private String msgNewPaymentStatus;

		*//**
		 * @return the msgNewPaymentStatus
		 *//*
		public String getMsgNewPaymentStatus() {
			return msgNewPaymentStatus;
		}

		*//**
		 * @param msgNewPaymentStatus the msgNewPaymentStatus to set
		 *//*
		public void setMsgNewPaymentStatus(String msgNewPaymentStatus) {
			this.msgNewPaymentStatus = msgNewPaymentStatus;
		}

		public String getMsgPaymentStatus() {
			return msgPaymentStatus;
		}

		public void setMsgPaymentStatus(String msgPaymentStatus) {
			this.msgPaymentStatus = msgPaymentStatus;
		}

		public String getMsgMur() {
			return msgMur;
		}

		public void setMsgMur(String msgMur) {
			this.msgMur = msgMur;
		}

		public String getMsgRef() {
			return msgRef;
		}

		public void setMsgRef(String msgRef) {
			this.msgRef = msgRef;
		}

		public String getTxnRef() {
			return txnRef;
		}

		public void setTxnRef(String txnRef) {
			this.txnRef = txnRef;
		}

		public int getAckType() {
			return ackType;
		}

		public void setAckType(int ackType) {
			this.ackType = ackType;
		}

		public String getAckReason() {
			return ackReason;
		}

		public void setAckReason(String ackReason) {
			this.ackReason = ackReason;
		}
		

	*/
}
