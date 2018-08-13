package com.bytehonor.standard.api.protocol.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MD5UtilsTest {

	@Test
	public void testMd5() {
		String md5 = MD5Utils.md5("asdfsafd");
		boolean isOk = md5 != null && md5.length() > 30;
		assertTrue("testBuild", isOk);
	}

}
