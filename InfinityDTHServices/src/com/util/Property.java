package com.util;

public enum Property {
	DRIVER("driver"),
	URL("url"),
	USERNAME("username"),
	PASSWORD("password");
	
	private String name;
	
	Property(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

