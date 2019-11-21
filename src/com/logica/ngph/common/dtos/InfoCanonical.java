package com.logica.ngph.common.dtos;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author guptarb
 */
public class InfoCanonical implements Serializable{

	private static final long serialVersionUID = 1L;

/**
MSGS_MSGREF
MSGS_SRC_MSGTYPE
MSGS_SRC_MSGSUBTYPE
MSGS_INFORMATION
MSGS_SEQNO
MSGS_DIRECTION
MSGS_DEPT
MSGS_BRANCH
MSGS_PMTID_INSTRID
MSGS_PMTID_RELREF
MSGS_INSTDAGT_BKCD
MSGS_INSTGAGT_BKCD
MSGS_LASTMODIFIEDTIME
MSGS_DST_MSGTYPE
MSGS_DST_MSGSUBTYPE
MSGS_DST_CHNL
MSGS_MUR
MSGS_SNDRPYMTPRIORITY
MSGS_MSGSTS

*/
	
	private String msgRef;
	private String srcMsgType;
	private String srcMsgSubType;
	private String info;
	private String seqNo;
	private String direction;
	private String dept;
	private String branch;
	private String pmtId_instrId;
	private String pmtId_relRef;
	private String instdagt_bkcd;
	private String instgagt_bkcd;
	private Timestamp lstModTime;
	private String dstMsgType;
	private String dstMsgSubType;
	private String dstChnl;
	private String ei_ID;
	private String msgMur;
	private String sndrPymtPriority;
	private String msgStatus;
	private String message_info;
	
	
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
	 * @return the msgMur
	 */
	public String getMsgMur() {
		return msgMur;
	}
	/**
	 * @param msgMur the msgMur to set
	 */
	public void setMsgMur(String msgMur) {
		this.msgMur = msgMur;
	}
	/**
	 * @return the ei_ID
	 */
	public String getEi_ID() {
		return ei_ID;
	}
	/**
	 * @param ei_ID the ei_ID to set
	 */
	public void setEi_ID(String ei_ID) {
		this.ei_ID = ei_ID;
	}
	/**
	 * @return the dstMsgType
	 */
	public String getDstMsgType() {
		return dstMsgType;
	}
	/**
	 * @return the dstMsgSubType
	 */
	public String getDstMsgSubType() {
		return dstMsgSubType;
	}
	/**
	 * @return the dstChnl
	 */
	public String getDstChnl() {
		return dstChnl;
	}
	/**
	 * @param dstMsgType the dstMsgType to set
	 */
	public void setDstMsgType(String dstMsgType) {
		this.dstMsgType = dstMsgType;
	}
	/**
	 * @param dstMsgSubType the dstMsgSubType to set
	 */
	public void setDstMsgSubType(String dstMsgSubType) {
		this.dstMsgSubType = dstMsgSubType;
	}
	/**
	 * @param dstChnl the dstChnl to set
	 */
	public void setDstChnl(String dstChnl) {
		this.dstChnl = dstChnl;
	}
	/**
	 * @return the msgef
	 */
	public String getMsgRef() {
		return msgRef;
	}
	/**
	 * @return the srcMsgType
	 */
	public String getSrcMsgType() {
		return srcMsgType;
	}
	/**
	 * @return the srcMsgSubType
	 */
	public String getSrcMsgSubType() {
		return srcMsgSubType;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @return the seqNo
	 */
	public String getSeqNo() {
		return seqNo;
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @return the pmtId_instrId
	 */
	public String getPmtId_instrId() {
		return pmtId_instrId;
	}
	/**
	 * @return the pmtId_relRef
	 */
	public String getPmtId_relRef() {
		return pmtId_relRef;
	}
	/**
	 * @return the instdagt_bkcd
	 */
	public String getInstdagt_bkcd() {
		return instdagt_bkcd;
	}
	/**
	 * @return the instgagt_bkcd
	 */
	public String getInstgagt_bkcd() {
		return instgagt_bkcd;
	}
	/**
	 * @return the lstModTime
	 */
	public Timestamp getLstModTime() {
		return lstModTime;
	}
	/**
	 * @param msgef the msgef to set
	 */
	public void setMsgRef(String msgRef) {
		this.msgRef = msgRef;
	}
	/**
	 * @param srcMsgType the srcMsgType to set
	 */
	public void setSrcMsgType(String srcMsgType) {
		this.srcMsgType = srcMsgType;
	}
	/**
	 * @param srcMsgSubType the srcMsgSubType to set
	 */
	public void setSrcMsgSubType(String srcMsgSubType) {
		this.srcMsgSubType = srcMsgSubType;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	/**
	 * @param seqNo the seqNo to set
	 */
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @param pmtId_instrId the pmtId_instrId to set
	 */
	public void setPmtId_instrId(String pmtId_instrId) {
		this.pmtId_instrId = pmtId_instrId;
	}
	/**
	 * @param pmtId_relRef the pmtId_relRef to set
	 */
	public void setPmtId_relRef(String pmtId_relRef) {
		this.pmtId_relRef = pmtId_relRef;
	}
	/**
	 * @param instdagt_bkcd the instdagt_bkcd to set
	 */
	public void setInstdagt_bkcd(String instdagt_bkcd) {
		this.instdagt_bkcd = instdagt_bkcd;
	}
	/**
	 * @param instgagt_bkcd the instgagt_bkcd to set
	 */
	public void setInstgagt_bkcd(String instgagt_bkcd) {
		this.instgagt_bkcd = instgagt_bkcd;
	}
	/**
	 * @param lstModTime the lstModTime to set
	 */
	public void setLstModTime(Timestamp lstModTime) {
		this.lstModTime = lstModTime;
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
	 * @return the message_info
	 */
	public String getMessage_info() {
		return message_info;
	}
	/**
	 * @param message_info the message_info to set
	 */
	public void setMessage_info(String message_info) {
		this.message_info = message_info;
	}
	
	
}
