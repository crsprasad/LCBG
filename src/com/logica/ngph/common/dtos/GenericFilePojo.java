package com.logica.ngph.common.dtos;

import java.io.Serializable;

public class GenericFilePojo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String coloumnName;
	private String coloumnValue;
	private String fieldName;
	private String length;
	private String delim;
	private String key;
	private String staticValue="N";
	
	public String getStaticValue() 
	{
		return staticValue;
	}
	
	public void setStaticValue(String staticValue) 
	{
		this.staticValue = staticValue;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the coloumnName
	 */
	public String getColoumnName() {
		return coloumnName;
	}
	/**
	 * @return the coloumnValue
	 */
	public String getColoumnValue() {
		return coloumnValue;
	}
	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}
	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}
	/**
	 * @param coloumnName the coloumnName to set
	 */
	public void setColoumnName(String coloumnName) {
		this.coloumnName = coloumnName;
	}
	/**
	 * @param coloumnValue the coloumnValue to set
	 */
	public void setColoumnValue(String coloumnValue) {
		this.coloumnValue = coloumnValue;
	}
	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}
	/**
	 * @return the delim
	 */
	public String getDelim() {
		return delim;
	}
	/**
	 * @param delim the delim to set
	 */
	public void setDelim(String delim) {
		this.delim = delim;
	}
	
}
