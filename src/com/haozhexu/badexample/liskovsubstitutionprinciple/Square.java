package com.haozhexu.badexample.liskovsubstitutionprinciple;

public class Square extends Rectangular {

	@Override
	public void setWidth(final int width) {
		this.width = width;
		this.height = width;
	}
	
	@Override
	public void setHeight(final int height) {
		this.width = height;
		this.height = height;
	}
}
