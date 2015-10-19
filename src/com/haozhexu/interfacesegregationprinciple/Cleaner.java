package com.haozhexu.interfacesegregationprinciple;

public class Cleaner implements Workable, Feedable {

	@Override
	public void eat() {
		System.out.println("I am a cleaner and I am eating.");
	}

	@Override
	public void work() {
		System.out.println("I am a cleaner and I am working.");
	}

}
