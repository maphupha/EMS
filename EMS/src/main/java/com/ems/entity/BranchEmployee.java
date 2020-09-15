package com.ems.entity;

public class BranchEmployee 
{
	public BranchEmployee () {}

	@Override
	public String toString() {
		return "BranchEmployee [fullName=" + fullName + ", telephoneno=" + telephoneno + ", branchName=" + branchName
				+ ", branchLocation=" + branchLocation + "]";
	}
	private String fullName;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getTelephoneno() {
		return telephoneno;
	}
	public void setTelephoneno(String telephoneno) {
		this.telephoneno = telephoneno;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	private String telephoneno;
	private String branchName;
	private String branchLocation;
	public BranchEmployee(String fullName, String telephoneno, String branchName, String branchLocation,
			String location, String birthday) {
		super();
		this.fullName = fullName;
		this.telephoneno = telephoneno;
		this.branchName = branchName;
		this.branchLocation = branchLocation;
		this.location = location;
		this.birthday = birthday;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	private String location;
	private String birthday;
}
