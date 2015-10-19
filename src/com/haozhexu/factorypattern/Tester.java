package com.haozhexu.factorypattern;

public class Tester {

	static {
		try {
			Class.forName("com.haozhexu.factorypattern.ProductA");
			Class.forName("com.haozhexu.factorypattern.ProductB");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(final String[] args) {
		ProductFactory productFactory = ProductFactory.getInstance();
		ProductA productA = (ProductA) productFactory.createProduct(ProductA.ID);
		ProductB productB = (ProductB) productFactory.createProduct(ProductB.ID);
		productA.doSomething();
		productB.doSomething();
	}
}
