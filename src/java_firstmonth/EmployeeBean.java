 package java_firstmonth;

import java.io.Serializable;

/**
 * @author LADDU
 *
 */
public class EmployeeBean implements Serializable {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String gender;
	private String dob;
	private String emailId;
	private long mobileNumber;
	
	
	private String companyName;
	private String role;
	private int noticePeriod;
	private String location;
	
	private String experience;
	private double currentCTC;
	private double expectedCTC;
	private String manager;
	
	private String bankname;
	private long bankAccNo;
	private String ifscCode;
	
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public long getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(long bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifcsCode) {
		this.ifscCode = ifcsCode;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(double currentCTC) {
		this.currentCTC = currentCTC;
	}
	public double getExpectedCTC() {
		return expectedCTC;
	}
	public void setExpectedCTC(double expectedCTC) {
		this.expectedCTC = expectedCTC;
	}

}