package com.bean;

import java.util.Date;

/*
 * Operator class to save Operator registration input information
 *  locally.
 * Class written by: Patrick Laflin 3/24/2017 
 */
public class Operator extends User{
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private Date shiftTimeStart;
	private Date shiftTimeEnd;
	private int maxNoCustomers;
	private Date creationDate;
	private int totalNoActiveCustomers;	
	
		
	public int getTotalNoActiveCustomers() {
		return totalNoActiveCustomers;
	}
	public void setTotalNoActiveCustomers(int totalNoActiveCustomers) {
		this.totalNoActiveCustomers = totalNoActiveCustomers;
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
	public Date getShiftTimeStart() {
		return shiftTimeStart;
	}
	public void setShiftTimeStart(Date shiftTimeStart) {
		this.shiftTimeStart = shiftTimeStart;
	}
	public Date getShiftTimeEnd() {
		return shiftTimeEnd;
	}
	public void setShiftTimeEnd(Date shiftTimeEnd) {
		this.shiftTimeEnd = shiftTimeEnd;
	}
	public int getMaxNoCustomers() {
		return maxNoCustomers;
	}
	public void setMaxNoCustomers(int maxNoCustomers) {
		this.maxNoCustomers = maxNoCustomers;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
