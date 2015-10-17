package com.abtract.factory.pattern;

import com.usc.utilility.StringUtil;

public class DishFactory extends Factory {

	@Override
	public Dish getDish(String type) throws Exception{
		if (StringUtil.isEmpty(type)) {
			return null;
		}
		switch (type) {
		case "rib":
			return new Rib();
		case "fish":
			return new Fish();
		default:
			throw new Exception("Something wrong is going on!");
		}
	}

	@Override
	public Drink getDrink(String type) throws Exception {
		return null;
	}
}
