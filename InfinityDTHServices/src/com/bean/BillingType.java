package com.bean;

public enum BillingType {
	PREPAID("prepaid"), POSTPAID("postpaid");
	
	private String name;
	
	BillingType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
