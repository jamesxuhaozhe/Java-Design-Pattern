package com.factory.pattern;

public class Tester {

	public static void main(final String[] args) throws Exception {
		MenuFactory factory = new MenuFactory();
		factory.generateMenu("Chinese").offerDish();
		factory.generateMenu("French").offerDish();
		factory.generateMenu("American").offerDish();
		//factory.generateMenu("Others");
	}
}
