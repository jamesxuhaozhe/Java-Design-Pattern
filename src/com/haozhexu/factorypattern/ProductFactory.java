package com.haozhexu.factorypattern;

import java.util.HashMap;


public class ProductFactory {

	private static ProductFactory instance;
	
	private HashMap<String, Product> mRegisteredProducts = new HashMap<>();
	
	private ProductFactory() {
	}
	
	public static ProductFactory getInstance() {
		if (instance == null) {
			synchronized (ProductFactory.class) {
				if (instance == null) {
					instance = new ProductFactory();
				}
			}
		}
		return instance;
	}
	
	public void registerProducts(final String productId, final Product product) {
		mRegisteredProducts.put(productId, product);
	}
	
	public Product createProduct(final String productId) {
		return (Product) mRegisteredProducts.get(productId).createProduct();
	}
}
