package com.haozhexu.singleton_pattern;

public class Tester {
	public static void main(final String[] args) {
		StandardSingleton standardSingleton = StandardSingleton.getInstance();
		standardSingleton.doSomething();
		
		LazyDoubleLockSingleton lazyDoubleLockSingleton = LazyDoubleLockSingleton.getInstance();
		lazyDoubleLockSingleton.doSomething();
		
		EasyInstan easyInstan = EasyInstan.getInstance();
		easyInstan.doSomething();
	}
}
