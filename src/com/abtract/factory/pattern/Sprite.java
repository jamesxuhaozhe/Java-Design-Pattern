package com.abtract.factory.pattern;

public class Sprite implements Drink {

	@Override
	public void serve() {
		System.out.println("I am Sprite and I am 1.5 dolors.");
	}
}
