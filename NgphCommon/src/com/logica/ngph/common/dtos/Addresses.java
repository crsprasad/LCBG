package com.logica.ngph.common.dtos;

import java.io.Serializable;

public class Addresses implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1376968071271481754L;

	/*DDR_REF, 
	ADDR_PSTLADR_ADRTP,
	ADDR_PSTLADR_DEPT,
	ADDR_PSTLADR_SUBDEPT,
	ADDR_PSTLADR_STRTNM,
	ADDR_PSTLADR_BLDGNB,
	ADDR_PSTLADR_PSTCD,
	ADDR_PSTLADR_TWNNM,
	ADDR_PSTLADR_CTRYSUBDVSN, 
	ADDR_PSTLADR_CTRY, 
	ADDR_PSTLADR_ADRLINE,
	ADDR_PHONE1,
	ADDR_PHONE2,
	ADDR_PHONE3, 
	ADDR_FAX, 
	ADDR_EMAIL1,
	ADDR_EMAIL2, 
	ADDR_EMAIL3,
	ADDR_ADDRESS_FOR, 
	ADDR_OWN_BRANCH*/
	private String addressRef;
	
	private String postalAddressNature;
	private String department;
	private String subDepartment;
	private String streetName;
	private String buildingDetail;
	private String postalCode;
	private String townName;
	private String citySubDivision;
	private String cityName;
	private String postalServiceAddress;
	
	private String phoneOne;
	private String phoneTwo;
	private String phoneThree;
	private String fax;
	private String emailOne;
	private String emailTwo;
	private String emailThree;
	private String addressFor;
	private String branchReference;
	public String getAddressRef() {
		return addressRef;
	}
	public void setAddressRef(String addressRef) {
		this.addressRef = addressRef;
	}
	public String getPostalAddressNature() {
		return postalAddressNature;
	}
	public void setPostalAddressNature(String postalAddressNature) {
		this.postalAddressNature = postalAddressNature;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSubDepartment() {
		return subDepartment;
	}
	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getBuildingDetail() {
		return buildingDetail;
	}
	public void setBuildingDetail(String buildingDetail) {
		this.buildingDetail = buildingDetail;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
	public String getCitySubDivision() {
		return citySubDivision;
	}
	public void setCitySubDivision(String citySubDivision) {
		this.citySubDivision = citySubDivision;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPostalServiceAddress() {
		return postalServiceAddress;
	}
	public void setPostalServiceAddress(String postalServiceAddress) {
		this.postalServiceAddress = postalServiceAddress;
	}
	public String getPhoneOne() {
		return phoneOne;
	}
	public void setPhoneOne(String phoneOne) {
		this.phoneOne = phoneOne;
	}
	public String getPhoneTwo() {
		return phoneTwo;
	}
	public void setPhoneTwo(String phoneTwo) {
		this.phoneTwo = phoneTwo;
	}
	public String getPhoneThree() {
		return phoneThree;
	}
	public void setPhoneThree(String phoneThree) {
		this.phoneThree = phoneThree;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmailOne() {
		return emailOne;
	}
	public void setEmailOne(String emailOne) {
		this.emailOne = emailOne;
	}
	public String getEmailTwo() {
		return emailTwo;
	}
	public void setEmailTwo(String emailTwo) {
		this.emailTwo = emailTwo;
	}
	public String getEmailThree() {
		return emailThree;
	}
	public void setEmailThree(String emailThree) {
		this.emailThree = emailThree;
	}
	public String getAddressFor() {
		return addressFor;
	}
	public void setAddressFor(String addressFor) {
		this.addressFor = addressFor;
	}
	public String getBranchReference() {
		return branchReference;
	}
	public void setBranchReference(String branchReference) {
		this.branchReference = branchReference;
	}
	
}
