package com.abtract.factory.pattern;

import com.usc.utilility.StringUtil;

public class DrinkFactory extends Factory {

	@Override
	public Dish getDish(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drink getDrink(String type) throws Exception {
		if (StringUtil.isEmpty(type)) {
			return null;
		}
		switch(type) {
		case "cola":
			return new Cola();
		case "sprite":
			return new Sprite();
		default:
			throw new Exception("Something is going wrong!!");
		}
	}

}
