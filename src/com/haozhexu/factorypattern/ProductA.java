package com.haozhexu.factorypattern;

public class ProductA  implements Product {
	
	public static final String ID = "ProductA";
	
	static {
		ProductFactory.getInstance().registerProducts("ProductA", new ProductA());
	}
	
	@Override
	public void doSomething() {
		System.out.println("ProductA does something.");
	}

	@Override
	public Product createProduct() {
		return new ProductA();
	}

}
