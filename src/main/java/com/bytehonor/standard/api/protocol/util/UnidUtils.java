package com.bytehonor.standard.api.protocol.util;

import java.util.UUID;

public class UnidUtils {

	public static String getSimple() {
		return getFull().replaceAll("-", "");
	}

	public static String getFull() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

}
