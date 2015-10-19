package com.haozhexu.dependencyinversion;

public class Tester {
	
	public static void main(final String[] args) {
		Manager manager = new Manager();
		manager.setWorker(new Cleaner());
		manager.orderToWork();
		manager.setWorker(new Programmer());
		manager.orderToWork();
	}
	
}
