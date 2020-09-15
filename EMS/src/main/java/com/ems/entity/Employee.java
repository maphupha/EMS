package com.ems.entity;



public class Employee 
{
	private String name;
	private int empid;
	private int branchid;
	private String newEmpID;
	public String getNewEmpID() {
		return newEmpID;
	}

	public void setNewEmpID(String newEmpID) {
		this.newEmpID = newEmpID;
	}

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid1) {
		this.empid = empid1;
	}
	private  String surname;
	private String birthday;
	private String telephoneNo;
	private String location;
	private String maritalStatus;
	public Employee() 
	{
		
	}
	
	public Employee(String name, int empid1, String surname, String birthday, String telephoneNo, String location,
			String maritalStatus) {
		super();
		this.name = name;
		this.empid = empid1;
		this.surname = surname;
		this.birthday = birthday;
		this.telephoneNo = telephoneNo;
		this.location = location;
		this.maritalStatus = maritalStatus;
	}
	

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", surname=" + surname + ", birthday=" + birthday
				+ ", telephoneNo=" + telephoneNo + ", location=" + location + ", maritalStatus=" + maritalStatus + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
}
