package com.bean;

import java.util.ArrayList;
import java.util.Date;

public class ChannelPackage {
	private String name;
	private String category;
	private boolean chargingTypeFree = true;
	private boolean packageTransmissionType = true;
	private ArrayList<Channel> channels = new ArrayList<Channel>();
	private double cost;
	private Date availableFromDate;
	private Date availableToDate;
	private boolean addedByDefault;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isChargingTypeFree() {
		return chargingTypeFree;
	}
	public void setChargingTypeFree(boolean chargingTypeFree) {
		this.chargingTypeFree = chargingTypeFree;
	}
	public boolean isPackageTransmissionType() {
		return packageTransmissionType;
	}
	public void setPackageTransmissionType(boolean packageTransmissionType) {
		this.packageTransmissionType = packageTransmissionType;
	}
	public ArrayList<Channel> getChannels() {
		return channels;
	}
	public void setChannels(ArrayList<Channel> channels) {
		this.channels = channels;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getAvailableFromDate() {
		return availableFromDate;
	}
	public void setAvailableFromDate(Date availableFromDate) {
		this.availableFromDate = availableFromDate;
	}
	public Date getAvailableToDate() {
		return availableToDate;
	}
	public void setAvailableToDate(Date availableToDate) {
		this.availableToDate = availableToDate;
	}
	public boolean isAddedByDefault() {
		return addedByDefault;
	}
	public void setAddedByDefault(boolean addedByDefault) {
		this.addedByDefault = addedByDefault;
	}
	
	
}
