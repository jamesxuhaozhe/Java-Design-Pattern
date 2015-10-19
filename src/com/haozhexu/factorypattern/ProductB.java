package com.haozhexu.factorypattern;

public class ProductB implements Product {
	
	public static final String ID = "ProductB";
	
	static {
		ProductFactory.getInstance().registerProducts("ProductB", new ProductB());
	}

	@Override
	public void doSomething() {
		System.out.println("ProductB does something.");
	}

	@Override
	public Product createProduct() {
		return new ProductB();
	}
	
}
