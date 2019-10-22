package com.haozhexu.interface_segregation_principle;

public class Robot implements Workable {

	@Override
	public void work() {
		System.out.println("I am a robot and I am working.");
	}

}
