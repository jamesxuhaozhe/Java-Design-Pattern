package com.haozhexu.dependency_inversion;

public class Programmer implements Worker {

	@Override
	public void work() {
		System.out.println("I am a programming and I am coding.");
	}

}
