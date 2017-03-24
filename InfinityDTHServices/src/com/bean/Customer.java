package com.bean;

import java.util.Date;

/*
 * Customer class to save Customer registration input information 
 * locally.
 * Class written by: Patrick Laflin 3/24/2017 
 */
public class Customer extends User{
	private String firstName;
	private String lastName;
	private String emailAddress;	
	private String phoneNumber;
	private Address address;
	private Date customerCreationDate;
	private String operatorName;
	private String retailerName;
	
	
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getCustomerCreationDate() {
		return customerCreationDate;
	}
	public void setCustomerCreationDate(Date customerCreationDate) {
		this.customerCreationDate = customerCreationDate;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}	
	

}
