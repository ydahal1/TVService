package com.bean;

public class Dimension {
	private double length;
	private double width;
	private double breadth;
	
	public Dimension(double length, double width, double breadth)
	{
		this.length = length;
		this.width = width;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}
