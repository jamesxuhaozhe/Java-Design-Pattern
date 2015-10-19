package com.haozhexu.singletonpattern;

public class EasyInstan {
	private static EasyInstan instance = new EasyInstan();
	
	private EasyInstan() {
		System.out.println("EasyInstan instance is created for the first time.");
	}
	
	public static EasyInstan getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("do something.");
	}
}
