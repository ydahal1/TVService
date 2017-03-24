package com.bean;

public class STBInventory {
	
	private STBType type;
	private long serialNumber;
	private long macId;
	private long remoteControlAssetId;
	private long dishAssetId;
	private Retailer status;
	
	public STBInventory(long serialNumber, long macId, long remoteControlAssetId, long dishAssetId)
	{
		this.serialNumber = serialNumber;
		this.macId = macId;
		this.remoteControlAssetId = remoteControlAssetId;
		this.dishAssetId = dishAssetId;
	}
	

	public STBType getType() {
		return type;
	}

	public void setType(STBType type) {
		this.type = type;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public long getMacId() {
		return macId;
	}

	public void setMacId(long macId) {
		this.macId = macId;
	}

	public long getRemoteControlAssetId() {
		return remoteControlAssetId;
	}

	public void setRemoteControlAssetId(long remoteControlAssetId) {
		this.remoteControlAssetId = remoteControlAssetId;
	}

	public long getDishAssetId() {
		return dishAssetId;
	}

	public void setDishAssetId(long dishAssetId) {
		this.dishAssetId = dishAssetId;
	}

	public Retailer getStatus() {
		return status;
	}

	public void setStatus(Retailer status) {
		this.status = status;
	}
}