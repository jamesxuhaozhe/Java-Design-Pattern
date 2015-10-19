package com.haozhexu.interfacesegregationprinciple;

public class Programmer implements Workable, Feedable {

	@Override
	public void eat() {
		System.out.println("I am a Programmer and I am eating.");
	}

	@Override
	public void work() {
		System.out.println("I am a Programmer and I am working.");
	}

}
