package com.haozhexu.singletonpattern;

public class StandardSingleton {

	private static StandardSingleton instance;
	
	private StandardSingleton() {
		System.out.println("Standard Singleton instance is created first time.");
	}
	
	public static synchronized StandardSingleton getInstance() {
		if (instance == null) {
			instance = new StandardSingleton();
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Standard Singleton do something.");
	}
}
