package com.logica.ngph.common.dtos;

import java.io.Serializable;

public class ErrorCodes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String errCode;
	private String errDes;
	private String errChnl;
	private String errMapCode;
	/**
	 * @return the errCode
	 */
	public String getErrCode() {
		return errCode;
	}
	/**
	 * @return the errDes
	 */
	public String getErrDes() {
		return errDes;
	}
	/**
	 * @return the errChnl
	 */
	public String getErrChnl() {
		return errChnl;
	}
	/**
	 * @return the errMapCode
	 */
	public String getErrMapCode() {
		return errMapCode;
	}
	/**
	 * @param errCode the errCode to set
	 */
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	/**
	 * @param errDes the errDes to set
	 */
	public void setErrDes(String errDes) {
		this.errDes = errDes;
	}
	/**
	 * @param errChnl the errChnl to set
	 */
	public void setErrChnl(String errChnl) {
		this.errChnl = errChnl;
	}
	/**
	 * @param errMapCode the errMapCode to set
	 */
	public void setErrMapCode(String errMapCode) {
		this.errMapCode = errMapCode;
	}

}
