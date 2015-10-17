package com.abtract.factory.pattern;

public abstract class Factory {
	abstract Dish getDish(String type) throws Exception;
	abstract Drink getDrink(String type) throws Exception;
}
