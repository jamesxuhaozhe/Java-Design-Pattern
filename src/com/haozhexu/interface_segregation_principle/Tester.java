package com.haozhexu.interface_segregation_principle;

public class Tester {
	public static void main(final String[] args) {
		Manager manager = new Manager();
		manager.setWorkable(new Cleaner());
		manager.orderToWork();
		manager.setWorkable(new Programmer());
		manager.orderToWork();
		manager.setWorkable(new Robot());
		manager.orderToWork();
	}
}
