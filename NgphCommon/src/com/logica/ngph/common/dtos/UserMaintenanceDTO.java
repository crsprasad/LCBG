package com.logica.ngph.common.dtos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author SATHISH
 *
 */
public class UserMaintenanceDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String appl;
	private String user;
	private String userFirstName;
	private String userLastName;
	private String userBranch;
	private String userDept;
	private String userType;
	private String empNo;
	private int userLocked;
	private int userActive;
	private Date userExpiryDate;
	private String userEmailId;
	private String userPassword;
	private Date effectiveDateForRole;
	private double userDailyLimit;
	private int firstlogin;
	private String mobileNumber;
	private List<String> assignedRoles;
	private List<String> assignedDepts;
	private String userAction;
	private Timestamp lastLogin;
	private Timestamp currentLogin;	
	private Timestamp businessDay;
	private String securityQuestion;
	private String securityAnswer;
	
	
	public String getAppl() {
		return appl;
	}
	public void setAppl(String appl) {
		this.appl = appl;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserBranch() {
		return userBranch;
	}
	public void setUserBranch(String userBranch) {
		this.userBranch = userBranch;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public int getUserLocked() {
		return userLocked;
	}
	public void setUserLocked(int userLocked) {
		this.userLocked = userLocked;
	}
	public int getUserActive() {
		return userActive;
	}
	public void setUserActive(int userActive) {
		this.userActive = userActive;
	}
	public Date getUserExpiryDate() {
		return userExpiryDate;
	}
	public List<String> getAssignedDepts() {
		return assignedDepts;
	}
	public void setAssignedDepts(List<String> assignedDepts) {
		this.assignedDepts = assignedDepts;
	}
	public void setUserExpiryDate(Date userExpiryDate) {
		this.userExpiryDate = userExpiryDate;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getEffectiveDateForRole() {
		return effectiveDateForRole;
	}
	public String getUserAction() {
		return userAction;
	}
	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}
	public void setEffectiveDateForRole(Date effectiveDateForRole) {
		this.effectiveDateForRole = effectiveDateForRole;
	}
	public double getUserDailyLimit() {
		return userDailyLimit;
	}
	public List<String> getAssignedRoles() {
		return assignedRoles;
	}
	public void setAssignedRoles(List<String> assignedRoles) {
		this.assignedRoles = assignedRoles;
	}
	public void setUserDailyLimit(double userDailyLimit) {
		this.userDailyLimit = userDailyLimit;
	}
	public int getFirstlogin() {
		return firstlogin;
	}
	public void setFirstlogin(int firstlogin) {
		this.firstlogin = firstlogin;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Timestamp getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}
	public Timestamp getCurrentLogin() {
		return currentLogin;
	}
	public void setCurrentLogin(Timestamp currentLogin) {
		this.currentLogin = currentLogin;
	}
	public Timestamp getBusinessDay() {
		return businessDay;
	}
	public void setBusinessDay(Timestamp businessDay) {
		this.businessDay = businessDay;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}	
	
	
}
