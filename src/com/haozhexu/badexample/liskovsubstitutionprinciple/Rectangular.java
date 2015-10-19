package com.haozhexu.badexample.liskovsubstitutionprinciple;

public class Rectangular {
	protected int width;
	protected int height;
	
	public void setWidth(final int width) {
		this.width = width;
	}
	
	public void setHeight(final int height) {
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
}
