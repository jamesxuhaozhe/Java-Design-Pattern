package com.haozhexu.builder_pattern;

public class Tester {

	public static void main(final String[] args) {
		Car mycar = new Car.CarBuilder("Convertable", "Red")
						.setCountry("China")
						.setMake("Toyota")
						.setYear("2015")
						.build();
		mycar.run();
	}
}
