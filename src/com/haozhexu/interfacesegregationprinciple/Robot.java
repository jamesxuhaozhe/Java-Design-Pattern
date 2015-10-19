package com.haozhexu.interfacesegregationprinciple;

public class Robot implements Workable {

	@Override
	public void work() {
		System.out.println("I am a robot and I am working.");
	}

}
