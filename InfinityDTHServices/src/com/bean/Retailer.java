package com.bean;

/*TO DO: Inventory List(Object/ArrayList), Total Cost of Inventory
 * 		 Status of Inventory given to Retailer
 */

import java.util.Date;

public class Retailer {

	private int id;
	private String name;
	private String contactNo1;
	private String contactNo2;
	private Address address1;
	private Address address2;
	private String city;
	private String state;
	private String pinCode;
	private int setTopBoxLimit;
	private double creditLimit;
	private double commissionPercentage;
	private double serviceCharges;
	private Date retailerCreationDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo1() {
		return contactNo1;
	}
	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}
	public String getContactNo2() {
		return contactNo2;
	}
	public void setContactNo2(String contactNo2) {
		this.contactNo2 = contactNo2;
	}
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	public Address getAddress2() {
		return address2;
	}
	public void setAddress2(Address address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public int getSetTopBoxLimit() {
		return setTopBoxLimit;
	}
	public void setSetTopBoxLimit(int setTopBoxLimit) {
		this.setTopBoxLimit = setTopBoxLimit;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getCommissionPercentage() {
		return commissionPercentage;
	}
	public void setCommissionPercentage(double commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public double getServiceCharges() {
		return serviceCharges;
	}
	public void setServiceCharges(double serviceCharges) {
		this.serviceCharges = serviceCharges;
	}
	public Date getRetailerCreationDate() {
		return retailerCreationDate;
	}
	public void setRetailerCreationDate(Date retailerCreationDate) {
		this.retailerCreationDate = retailerCreationDate;
	}
	

}
