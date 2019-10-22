package com.haozhexu.builder_pattern;

public class Car {
	private final String type;
	private final String color;
	
	private final String make;
	private final String year;
	private final String country;
	private final String transmission;
	
	public static class CarBuilder {
		private String type = "Sedan";
		private String color = "Black";
		
		private String make = "Honda";
		private String year = "2015";
		private String country = "USA";
		private String transmission = "Automatic";
		
		public CarBuilder(final String type, final String color) {
			this.type = type;
			this.color = color;
		}
		
		public CarBuilder setMake(final String make) {
			this.make = make;
			return this;
		}
		
		public CarBuilder setYear(final String year) {
			this.year = year;
			return this;
		}
		
		public CarBuilder  setCountry(final String country) {
			this.country = country;
			return this;
		}
		
		public CarBuilder setTransmission(final String transmission) {
			this.transmission = transmission;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
	
	private Car(final CarBuilder carBuilder) {
		this.type = carBuilder.type;
		this.color = carBuilder.color;
		this.make = carBuilder.make;
		this.year = carBuilder.year;
		this.country = carBuilder.country;
		this.transmission = carBuilder.transmission;
	}
	
	public void run() {
		System.out.println("I am running.");
	}
}
