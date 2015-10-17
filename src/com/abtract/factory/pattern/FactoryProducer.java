package com.abtract.factory.pattern;

import com.usc.utilility.StringUtil;

public class FactoryProducer {

	public static Factory getFactory(final String type) throws Exception {
		if (StringUtil.isEmpty(type)) {
			return null;
		}
		switch (type) {
		case "dish":
			return new DishFactory();
		case "drink":
			return new DrinkFactory();
		default:
			throw new Exception("Something shitty going man!");
		}
	}
}
