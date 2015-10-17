package com.factory.pattern;

public class AmericanMenu implements Menu {

	@Override
	public void offerDish() {
		System.out.println("American menu offers American dishes.");
	}
}
