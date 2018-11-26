package com.bytehonor.protocol.common.server.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bytehonor.protocol.common.server.util.GuidUtils;

public class GuidUtilsTest {

	@Test
	public void testGetSimple() {
		String src = GuidUtils.getSimple();
		boolean isOk = src != null && src.length() == 32;
		assertTrue("testGetSimple", isOk);
	}

	@Test
	public void testGetFull() {
		String src = GuidUtils.getFull();
		boolean isOk = src != null && src.length() == 36;
		assertTrue("testGetFull", isOk);
	}

}
