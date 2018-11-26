package com.bytehonor.protocol.common.server.util;

import java.util.UUID;

/**
 * Unid Utils
 * 
 * @author lijianqiang
 *
 */
public class GuidUtils {

	/**
	 * guid by uuid
	 * 
	 * @return string without '-'
	 */
	public static String getSimple() {
		return getFull().replaceAll("-", "");
	}

	/**
	 * guid by uuid
	 * 
	 * @return string with '-'
	 */
	public static String getFull() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

}
