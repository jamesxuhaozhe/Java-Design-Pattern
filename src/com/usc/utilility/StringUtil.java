package com.usc.utilility;

public class StringUtil {

	public static boolean isEmpty(final String string) {
		if (string == null || string.equals("")) {
			return true;
		}
		return false;
	}
}
