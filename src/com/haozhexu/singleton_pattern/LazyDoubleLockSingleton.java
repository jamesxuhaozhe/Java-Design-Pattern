package com.haozhexu.singleton_pattern;

public class LazyDoubleLockSingleton {
	private static LazyDoubleLockSingleton instance;
	
	private LazyDoubleLockSingleton() {
		System.out.println("LazyDoubleLockSingleton instance is created for the first time.");
	}
	
	public static LazyDoubleLockSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyDoubleLockSingleton.class) {
				if (instance == null) {
					instance = new LazyDoubleLockSingleton();
				}
			}
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("do something.");
	}
}
