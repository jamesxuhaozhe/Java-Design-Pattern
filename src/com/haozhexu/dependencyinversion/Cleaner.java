package com.haozhexu.dependencyinversion;

public class Cleaner implements Worker {

	@Override
	public void work() {
		System.out.println("I am a cleaner, and I am clearning.");
	}

}
