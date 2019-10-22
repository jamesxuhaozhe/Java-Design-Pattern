package com.haozhexu.dependency_inversion;

public class Tester {
	
	public static void main(final String[] args) {
		Manager manager = new Manager();
		manager.setWorker(new Cleaner());
		manager.orderToWork();
		manager.setWorker(new Programmer());
		manager.orderToWork();
	}
	
}
