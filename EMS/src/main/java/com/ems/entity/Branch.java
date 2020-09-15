package com.ems.entity;

public class Branch 
{
	private String branchName;
	private String postalAddress;
	private String postalCode;
	private String location;
	private int branchID;
	public int getBranchID() {
		return branchID;
	}
	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}
	public Branch() 
	{
		
	}
	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", postalAddress=" + postalAddress + ", postalCode=" + postalCode
				+ ", location=" + location + "]";
	}
	public Branch(String branchName, String postalAddress, String postalCode, String location) {
		super();
		this.branchName = branchName;
		this.postalAddress = postalAddress;
		this.postalCode = postalCode;
		this.location = location;
	}
	public String getBranchName()
	{
		return branchName;
	}
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	public String getPostalAddress()
	{
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) 
	{
		this.postalAddress = postalAddress;
	}
	
	public String getPostalCode()
	{
		return postalCode;
	}
	public void setPostalCode(String postalCode) 
	{
		this.postalCode = postalCode;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
}
