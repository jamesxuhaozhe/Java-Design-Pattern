package com.haozhexu.bad_example.liskov_substitution_principle;

public class LskovTester {

	private static Rectangular getRectangular() {
		return new Rectangular();
	}
	
	public static void main(final String[] args) {
		Rectangular rectangular = LskovTester.getRectangular();
		rectangular.setWidth(5);
		rectangular.setHeight(10);
		System.out.println(rectangular.getArea());
	}
}
