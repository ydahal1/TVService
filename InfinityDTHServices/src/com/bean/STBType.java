package com.bean;

public enum STBType {
	STANDARD("standard"), HD("hd"), HDPLUS("hdplus"), IPTC("iptv");
	
	private String name;
	
	STBType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
