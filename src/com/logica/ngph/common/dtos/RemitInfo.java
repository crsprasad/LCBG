package com.logica.ngph.common.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author guptarb
 * 
 * This Class contains POJO mappings for Remit Info Table.
 */
public class RemitInfo {

	//@Column RMT_INFO_REF
	private String rmtInfoRef;
	
	//@Column RMT_MSGS_MSGREF
	private String rmtMsgRef;
	
	//@Column RMT_USTRD
	private String rmtUstrd;
	
	//@Column RMT_RFRDDOCINF_TYPE_CD
	private String rmtRfrddocInfTypeCd;
	
	//@Column RMT_RFRDDOCINF_TYPE_PRTRY
	private String rmtRfrddocInfTypePty;
	
	//@Column RMT_RFRDDOCINF_TYPE_ISSR
	private String rmtRfrddocInfTypeIssr;
	
	//@Column RMT_RFRDDOCINF_NB
	private String rmtRfrddocInfNb;
	
	//@Column RMT_RFRDDOCINF_RLTDDT
	private Timestamp rmtRfrddocInfRltDt;

	//@Column RMT_RFRDDOCAMT_DUEPYBL_CCY
	private String rmtRfrddocAmtDuepyblCcy;
	
	//@Column RMT_RFRDDOCAMT_DUEPYBL_AMT
	private BigDecimal rmtRfrddocAmtDuepyblAmt;

	//@Column RMT_RFRDDOCAMT_DSCNTAPID_CCY
	private String rmtRfrddocAmtDscntapidCcy;
	
	//@Column RMT_RFRDDOCAMT_DSCNTAPID_AMT
	private BigDecimal rmtRfrddocAmtDscntapidAmt;
	
	//@Column RMT_RFRDDOCAMT_CDTNOTE_CCY
	private String rmtRfrddocAmtCdtnoteCcy;
	
	//@Column RMT_RFRDDOCAMT_CDTNOTE_AMT
	private BigDecimal rmtRfrddocAmtCdtnoteAmt;
	
	//@Column RMT_RFRDDOCAMT_TAX_CCY
	private String rmtRfrddocAmtTaxCcy;

	//@Column RMT_RFRDDOCAMT_TAX_AMT
	private BigDecimal rmtRfrddocAmtTaxAmt;
	
	//@Column RMT_RFRDDOCAMT_ADJ_AMT_CCY
	private String rmtRfrddocAmtAdjAmtCcy;

	//@Column RMT_RFRDDOCAMT_ADJ_AMT_AMT
	private BigDecimal rmtRfrddocAmtAdjAmtAmt;
	
	//@Column RMT_RFRDDOCAMT_ADJ_AMT_DRCR
	private String rmtRfrddocAmtAdjAmtDrcr;
	
	//@Column RMT_RFRDDOCAMT_ADJ_AMT_RSN
	private String rmtRfrddocAmtAdjAmtRsn;
	
	//@Column RMT_RFRDDOCAMT_ADJ_AMT_ADDLINF
	private String rmtRfrddocAmtAdjAmtAddlinf;

	//@Column RMT_RFRDDOCAMT_RMTD_CCY
	private String rmtRfrddocAmtRmtdCcy;
	
	//@Column RMT_RFRDDOCAMT_RMTD_AMT
	private BigDecimal rmtRfrddocAmtRmtdAmt;
	
	//@Column RMT_CDTRREFINF_TP_CODE
	private String rmtCdtrrefInfTpCode;
	
	//@Column RMT_CDTRREFINF_TP_PRTRY
	private String rmtCdtrrefInfTpPty;
	
	//@Column RMT_CDTRREFINF_TP_ISSR
	private String rmtCdtrrefInfTpIssr;
	
	//@Column RMT_CDTRREFINF_REF
	private String rmtCdtrrefInfRef;

	//@Column RMT_INVCR_NM
	private String rmtInvcrNm;

	//@Column RMT_INVCR_PSTLADR
	private String rmtInvcrPstlAdr;

	//@Column RMT_INVCR_ID
	private String rmtInvcrId;

	//@Column RMT_INVCR_CTRYOFRES
	private String rmtInvcrCtryofres;
	
	//@Column RMT_INVCR_CTCTDTLS
	private String rmtInvcrCtcTdTls;
	
	//@Column RMT_INVCEE_NM
	private String rmtInvceeNm;

	//@Column RMT_INVCEE_PSTLADR
	private String rmtInvceePstlAdr;
	
	//@Column RMT_INVCEE_ID
	private String rmtInvceeId;
	
	//@Column RMT_INVCEE_CTRYOFRES
	private String rmtInvceeCtryorfres;
	
	//@Column RMT_INVCEE_CTCTDTLS
	private String rmtInvceeCtcTdTls;
	
	//@Column RMT_ADDTLRMTINF
	private String rmtAddTlRmtInf;
	
	//@Column RMT_TYPE
	private String rmtType;
	
	//@Column RMT_TXNDATE
	private Timestamp rmtTxnDt;

	//Getters
	/**
	 * @return the rmtInfoRef
	 */
	public String getRmtInfoRef() {
		return rmtInfoRef;
	}

	/**
	 * @return the rmtMsgRef
	 */
	public String getRmtMsgRef() {
		return rmtMsgRef;
	}

	/**
	 * @return the rmtUstrd
	 */
	public String getRmtUstrd() {
		return rmtUstrd;
	}

	/**
	 * @return the rmtRfrddocInfTypeCd
	 */
	public String getRmtRfrddocInfTypeCd() {
		return rmtRfrddocInfTypeCd;
	}

	/**
	 * @return the rmtRfrddocInfTypePty
	 */
	public String getRmtRfrddocInfTypePty() {
		return rmtRfrddocInfTypePty;
	}

	/**
	 * @return the rmtRfrddocInfTypeIssr
	 */
	public String getRmtRfrddocInfTypeIssr() {
		return rmtRfrddocInfTypeIssr;
	}

	/**
	 * @return the rmtRfrddocInfNb
	 */
	public String getRmtRfrddocInfNb() {
		return rmtRfrddocInfNb;
	}

	/**
	 * @return the rmtRfrddocInfRltDt
	 */
	public Timestamp getRmtRfrddocInfRltDt() {
		return rmtRfrddocInfRltDt;
	}

	/**
	 * @return the rmtRfrddocAmtDuepyblCcy
	 */
	public String getRmtRfrddocAmtDuepyblCcy() {
		return rmtRfrddocAmtDuepyblCcy;
	}

	/**
	 * @return the rmtRfrddocAmtDuepyblAmt
	 */
	public BigDecimal getRmtRfrddocAmtDuepyblAmt() {
		return rmtRfrddocAmtDuepyblAmt;
	}

	/**
	 * @return the rmtRfrddocAmtDscntapidCcy
	 */
	public String getRmtRfrddocAmtDscntapidCcy() {
		return rmtRfrddocAmtDscntapidCcy;
	}

	/**
	 * @return the rmtRfrddocAmtDscntapidAmt
	 */
	public BigDecimal getRmtRfrddocAmtDscntapidAmt() {
		return rmtRfrddocAmtDscntapidAmt;
	}

	/**
	 * @return the rmtRfrddocAmtCdtnoteCcy
	 */
	public String getRmtRfrddocAmtCdtnoteCcy() {
		return rmtRfrddocAmtCdtnoteCcy;
	}

	/**
	 * @return the rmtRfrddocAmtCdtnoteAmt
	 */
	public BigDecimal getRmtRfrddocAmtCdtnoteAmt() {
		return rmtRfrddocAmtCdtnoteAmt;
	}

	/**
	 * @return the rmtRfrddocAmtTaxCcy
	 */
	public String getRmtRfrddocAmtTaxCcy() {
		return rmtRfrddocAmtTaxCcy;
	}

	/**
	 * @return the rmtRfrddocAmtTaxAmt
	 */
	public BigDecimal getRmtRfrddocAmtTaxAmt() {
		return rmtRfrddocAmtTaxAmt;
	}

	/**
	 * @return the rmtRfrddocAmtAdjAmtCcy
	 */
	public String getRmtRfrddocAmtAdjAmtCcy() {
		return rmtRfrddocAmtAdjAmtCcy;
	}

	/**
	 * @return the rmtRfrddocAmtAdjAmtAmt
	 */
	public BigDecimal getRmtRfrddocAmtAdjAmtAmt() {
		return rmtRfrddocAmtAdjAmtAmt;
	}

	/**
	 * @return the rmtRfrddocAmtAdjAmtDrcr
	 */
	public String getRmtRfrddocAmtAdjAmtDrcr() {
		return rmtRfrddocAmtAdjAmtDrcr;
	}

	/**
	 * @return the rmtRfrddocAmtAdjAmtRsn
	 */
	public String getRmtRfrddocAmtAdjAmtRsn() {
		return rmtRfrddocAmtAdjAmtRsn;
	}

	/**
	 * @return the rmtRfrddocAmtAdjAmtAddlinf
	 */
	public String getRmtRfrddocAmtAdjAmtAddlinf() {
		return rmtRfrddocAmtAdjAmtAddlinf;
	}

	/**
	 * @return the rmtRfrddocAmtRmtdCcy
	 */
	public String getRmtRfrddocAmtRmtdCcy() {
		return rmtRfrddocAmtRmtdCcy;
	}

	/**
	 * @return the rmtRfrddocAmtRmtdAmt
	 */
	public BigDecimal getRmtRfrddocAmtRmtdAmt() {
		return rmtRfrddocAmtRmtdAmt;
	}

	/**
	 * @return the rmtCdtrrefInfTpCode
	 */
	public String getRmtCdtrrefInfTpCode() {
		return rmtCdtrrefInfTpCode;
	}

	/**
	 * @return the rmtCdtrrefInfTpPty
	 */
	public String getRmtCdtrrefInfTpPty() {
		return rmtCdtrrefInfTpPty;
	}

	/**
	 * @return the rmtCdtrrefInfTpIssr
	 */
	public String getRmtCdtrrefInfTpIssr() {
		return rmtCdtrrefInfTpIssr;
	}

	/**
	 * @return the rmtCdtrrefInfRef
	 */
	public String getRmtCdtrrefInfRef() {
		return rmtCdtrrefInfRef;
	}

	/**
	 * @return the rmtInvcrNm
	 */
	public String getRmtInvcrNm() {
		return rmtInvcrNm;
	}

	/**
	 * @return the rmtInvcrPstlAdr
	 */
	public String getRmtInvcrPstlAdr() {
		return rmtInvcrPstlAdr;
	}

	/**
	 * @return the rmtInvcrId
	 */
	public String getRmtInvcrId() {
		return rmtInvcrId;
	}

	/**
	 * @return the rmtInvcrCtryofres
	 */
	public String getRmtInvcrCtryofres() {
		return rmtInvcrCtryofres;
	}

	/**
	 * @return the rmtInvcrCtcTdTls
	 */
	public String getRmtInvcrCtcTdTls() {
		return rmtInvcrCtcTdTls;
	}

	/**
	 * @return the rmtInvceeNm
	 */
	public String getRmtInvceeNm() {
		return rmtInvceeNm;
	}

	/**
	 * @return the rmtInvceePstlAdr
	 */
	public String getRmtInvceePstlAdr() {
		return rmtInvceePstlAdr;
	}

	/**
	 * @return the rmtInvceeId
	 */
	public String getRmtInvceeId() {
		return rmtInvceeId;
	}

	/**
	 * @return the rmtInvceeCtryorfres
	 */
	public String getRmtInvceeCtryorfres() {
		return rmtInvceeCtryorfres;
	}

	/**
	 * @return the rmtInvceeCtcTdTls
	 */
	public String getRmtInvceeCtcTdTls() {
		return rmtInvceeCtcTdTls;
	}

	/**
	 * @return the rmtAddTlRmtInf
	 */
	public String getRmtAddTlRmtInf() {
		return rmtAddTlRmtInf;
	}

	/**
	 * @return the rmtType
	 */
	public String getRmtType() {
		return rmtType;
	}

	/**
	 * @return the rmtTxnDt
	 */
	public Timestamp getRmtTxnDt() {
		return rmtTxnDt;
	}

	//Setters
	/**
	 * @param rmtInfoRef the rmtInfoRef to set
	 */
	public void setRmtInfoRef(String rmtInfoRef) {
		this.rmtInfoRef = rmtInfoRef;
	}

	/**
	 * @param rmtMsgRef the rmtMsgRef to set
	 */
	public void setRmtMsgRef(String rmtMsgRef) {
		this.rmtMsgRef = rmtMsgRef;
	}

	/**
	 * @param rmtUstrd the rmtUstrd to set
	 */
	public void setRmtUstrd(String rmtUstrd) {
		this.rmtUstrd = rmtUstrd;
	}

	/**
	 * @param rmtRfrddocInfTypeCd the rmtRfrddocInfTypeCd to set
	 */
	public void setRmtRfrddocInfTypeCd(String rmtRfrddocInfTypeCd) {
		this.rmtRfrddocInfTypeCd = rmtRfrddocInfTypeCd;
	}

	/**
	 * @param rmtRfrddocInfTypePty the rmtRfrddocInfTypePty to set
	 */
	public void setRmtRfrddocInfTypePty(String rmtRfrddocInfTypePty) {
		this.rmtRfrddocInfTypePty = rmtRfrddocInfTypePty;
	}

	/**
	 * @param rmtRfrddocInfTypeIssr the rmtRfrddocInfTypeIssr to set
	 */
	public void setRmtRfrddocInfTypeIssr(String rmtRfrddocInfTypeIssr) {
		this.rmtRfrddocInfTypeIssr = rmtRfrddocInfTypeIssr;
	}

	/**
	 * @param rmtRfrddocInfNb the rmtRfrddocInfNb to set
	 */
	public void setRmtRfrddocInfNb(String rmtRfrddocInfNb) {
		this.rmtRfrddocInfNb = rmtRfrddocInfNb;
	}

	/**
	 * @param rmtRfrddocInfRltDt the rmtRfrddocInfRltDt to set
	 */
	public void setRmtRfrddocInfRltDt(Timestamp rmtRfrddocInfRltDt) {
		this.rmtRfrddocInfRltDt = rmtRfrddocInfRltDt;
	}

	/**
	 * @param rmtRfrddocAmtDuepyblCcy the rmtRfrddocAmtDuepyblCcy to set
	 */
	public void setRmtRfrddocAmtDuepyblCcy(String rmtRfrddocAmtDuepyblCcy) {
		this.rmtRfrddocAmtDuepyblCcy = rmtRfrddocAmtDuepyblCcy;
	}

	/**
	 * @param rmtRfrddocAmtDuepyblAmt the rmtRfrddocAmtDuepyblAmt to set
	 */
	public void setRmtRfrddocAmtDuepyblAmt(BigDecimal rmtRfrddocAmtDuepyblAmt) {
		this.rmtRfrddocAmtDuepyblAmt = rmtRfrddocAmtDuepyblAmt;
	}

	/**
	 * @param rmtRfrddocAmtDscntapidCcy the rmtRfrddocAmtDscntapidCcy to set
	 */
	public void setRmtRfrddocAmtDscntapidCcy(String rmtRfrddocAmtDscntapidCcy) {
		this.rmtRfrddocAmtDscntapidCcy = rmtRfrddocAmtDscntapidCcy;
	}

	/**
	 * @param rmtRfrddocAmtDscntapidAmt the rmtRfrddocAmtDscntapidAmt to set
	 */
	public void setRmtRfrddocAmtDscntapidAmt(BigDecimal rmtRfrddocAmtDscntapidAmt) {
		this.rmtRfrddocAmtDscntapidAmt = rmtRfrddocAmtDscntapidAmt;
	}

	/**
	 * @param rmtRfrddocAmtCdtnoteCcy the rmtRfrddocAmtCdtnoteCcy to set
	 */
	public void setRmtRfrddocAmtCdtnoteCcy(String rmtRfrddocAmtCdtnoteCcy) {
		this.rmtRfrddocAmtCdtnoteCcy = rmtRfrddocAmtCdtnoteCcy;
	}

	/**
	 * @param rmtRfrddocAmtCdtnoteAmt the rmtRfrddocAmtCdtnoteAmt to set
	 */
	public void setRmtRfrddocAmtCdtnoteAmt(BigDecimal rmtRfrddocAmtCdtnoteAmt) {
		this.rmtRfrddocAmtCdtnoteAmt = rmtRfrddocAmtCdtnoteAmt;
	}

	/**
	 * @param rmtRfrddocAmtTaxCcy the rmtRfrddocAmtTaxCcy to set
	 */
	public void setRmtRfrddocAmtTaxCcy(String rmtRfrddocAmtTaxCcy) {
		this.rmtRfrddocAmtTaxCcy = rmtRfrddocAmtTaxCcy;
	}

	/**
	 * @param rmtRfrddocAmtTaxAmt the rmtRfrddocAmtTaxAmt to set
	 */
	public void setRmtRfrddocAmtTaxAmt(BigDecimal rmtRfrddocAmtTaxAmt) {
		this.rmtRfrddocAmtTaxAmt = rmtRfrddocAmtTaxAmt;
	}

	/**
	 * @param rmtRfrddocAmtAdjAmtCcy the rmtRfrddocAmtAdjAmtCcy to set
	 */
	public void setRmtRfrddocAmtAdjAmtCcy(String rmtRfrddocAmtAdjAmtCcy) {
		this.rmtRfrddocAmtAdjAmtCcy = rmtRfrddocAmtAdjAmtCcy;
	}

	/**
	 * @param rmtRfrddocAmtAdjAmtAmt the rmtRfrddocAmtAdjAmtAmt to set
	 */
	public void setRmtRfrddocAmtAdjAmtAmt(BigDecimal rmtRfrddocAmtAdjAmtAmt) {
		this.rmtRfrddocAmtAdjAmtAmt = rmtRfrddocAmtAdjAmtAmt;
	}

	/**
	 * @param rmtRfrddocAmtAdjAmtDrcr the rmtRfrddocAmtAdjAmtDrcr to set
	 */
	public void setRmtRfrddocAmtAdjAmtDrcr(String rmtRfrddocAmtAdjAmtDrcr) {
		this.rmtRfrddocAmtAdjAmtDrcr = rmtRfrddocAmtAdjAmtDrcr;
	}

	/**
	 * @param rmtRfrddocAmtAdjAmtRsn the rmtRfrddocAmtAdjAmtRsn to set
	 */
	public void setRmtRfrddocAmtAdjAmtRsn(String rmtRfrddocAmtAdjAmtRsn) {
		this.rmtRfrddocAmtAdjAmtRsn = rmtRfrddocAmtAdjAmtRsn;
	}

	/**
	 * @param rmtRfrddocAmtAdjAmtAddlinf the rmtRfrddocAmtAdjAmtAddlinf to set
	 */
	public void setRmtRfrddocAmtAdjAmtAddlinf(String rmtRfrddocAmtAdjAmtAddlinf) {
		this.rmtRfrddocAmtAdjAmtAddlinf = rmtRfrddocAmtAdjAmtAddlinf;
	}

	/**
	 * @param rmtRfrddocAmtRmtdCcy the rmtRfrddocAmtRmtdCcy to set
	 */
	public void setRmtRfrddocAmtRmtdCcy(String rmtRfrddocAmtRmtdCcy) {
		this.rmtRfrddocAmtRmtdCcy = rmtRfrddocAmtRmtdCcy;
	}

	/**
	 * @param rmtRfrddocAmtRmtdAmt the rmtRfrddocAmtRmtdAmt to set
	 */
	public void setRmtRfrddocAmtRmtdAmt(BigDecimal rmtRfrddocAmtRmtdAmt) {
		this.rmtRfrddocAmtRmtdAmt = rmtRfrddocAmtRmtdAmt;
	}

	/**
	 * @param rmtCdtrrefInfTpCode the rmtCdtrrefInfTpCode to set
	 */
	public void setRmtCdtrrefInfTpCode(String rmtCdtrrefInfTpCode) {
		this.rmtCdtrrefInfTpCode = rmtCdtrrefInfTpCode;
	}

	/**
	 * @param rmtCdtrrefInfTpPty the rmtCdtrrefInfTpPty to set
	 */
	public void setRmtCdtrrefInfTpPty(String rmtCdtrrefInfTpPty) {
		this.rmtCdtrrefInfTpPty = rmtCdtrrefInfTpPty;
	}

	/**
	 * @param rmtCdtrrefInfTpIssr the rmtCdtrrefInfTpIssr to set
	 */
	public void setRmtCdtrrefInfTpIssr(String rmtCdtrrefInfTpIssr) {
		this.rmtCdtrrefInfTpIssr = rmtCdtrrefInfTpIssr;
	}

	/**
	 * @param rmtCdtrrefInfRef the rmtCdtrrefInfRef to set
	 */
	public void setRmtCdtrrefInfRef(String rmtCdtrrefInfRef) {
		this.rmtCdtrrefInfRef = rmtCdtrrefInfRef;
	}

	/**
	 * @param rmtInvcrNm the rmtInvcrNm to set
	 */
	public void setRmtInvcrNm(String rmtInvcrNm) {
		this.rmtInvcrNm = rmtInvcrNm;
	}

	/**
	 * @param rmtInvcrPstlAdr the rmtInvcrPstlAdr to set
	 */
	public void setRmtInvcrPstlAdr(String rmtInvcrPstlAdr) {
		this.rmtInvcrPstlAdr = rmtInvcrPstlAdr;
	}

	/**
	 * @param rmtInvcrId the rmtInvcrId to set
	 */
	public void setRmtInvcrId(String rmtInvcrId) {
		this.rmtInvcrId = rmtInvcrId;
	}

	/**
	 * @param rmtInvcrCtryofres the rmtInvcrCtryofres to set
	 */
	public void setRmtInvcrCtryofres(String rmtInvcrCtryofres) {
		this.rmtInvcrCtryofres = rmtInvcrCtryofres;
	}

	/**
	 * @param rmtInvcrCtcTdTls the rmtInvcrCtcTdTls to set
	 */
	public void setRmtInvcrCtcTdTls(String rmtInvcrCtcTdTls) {
		this.rmtInvcrCtcTdTls = rmtInvcrCtcTdTls;
	}

	/**
	 * @param rmtInvceeNm the rmtInvceeNm to set
	 */
	public void setRmtInvceeNm(String rmtInvceeNm) {
		this.rmtInvceeNm = rmtInvceeNm;
	}

	/**
	 * @param rmtInvceePstlAdr the rmtInvceePstlAdr to set
	 */
	public void setRmtInvceePstlAdr(String rmtInvceePstlAdr) {
		this.rmtInvceePstlAdr = rmtInvceePstlAdr;
	}

	/**
	 * @param rmtInvceeId the rmtInvceeId to set
	 */
	public void setRmtInvceeId(String rmtInvceeId) {
		this.rmtInvceeId = rmtInvceeId;
	}

	/**
	 * @param rmtInvceeCtryorfres the rmtInvceeCtryorfres to set
	 */
	public void setRmtInvceeCtryorfres(String rmtInvceeCtryorfres) {
		this.rmtInvceeCtryorfres = rmtInvceeCtryorfres;
	}

	/**
	 * @param rmtInvceeCtcTdTls the rmtInvceeCtcTdTls to set
	 */
	public void setRmtInvceeCtcTdTls(String rmtInvceeCtcTdTls) {
		this.rmtInvceeCtcTdTls = rmtInvceeCtcTdTls;
	}

	/**
	 * @param rmtAddTlRmtInf the rmtAddTlRmtInf to set
	 */
	public void setRmtAddTlRmtInf(String rmtAddTlRmtInf) {
		this.rmtAddTlRmtInf = rmtAddTlRmtInf;
	}

	/**
	 * @param rmtType the rmtType to set
	 */
	public void setRmtType(String rmtType) {
		this.rmtType = rmtType;
	}

	/**
	 * @param rmtTxnDt the rmtTxnDt to set
	 */
	public void setRmtTxnDt(Timestamp rmtTxnDt) {
		this.rmtTxnDt = rmtTxnDt;
	}

}
