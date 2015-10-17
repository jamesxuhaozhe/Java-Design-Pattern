package com.factory.pattern;

import com.usc.utilility.StringUtil;

public class MenuFactory {

	public Menu generateMenu(final String area) throws Exception {
		if (StringUtil.isEmpty(area)) {
			return null;
		}
		switch (area) {
		case "Chinese":
			return new ChineseMenu();
		case "French":
			return new FrenchMenu();
		case "American":
			return new AmericanMenu();
		default:
			throw new Exception("We only have 3 menus.");
		}
	}
}
