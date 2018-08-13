package com.bytehonor.standard.api.protocol.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnidUtilsTest {

	@Test
	public void testGetSimple() {
		String src = UnidUtils.getSimple();
		boolean isOk = src != null && src.length() == 32;
		assertTrue("testGetSimple", isOk);
	}

	@Test
	public void testGetFull() {
		String src = UnidUtils.getFull();
		boolean isOk = src != null && src.length() == 36;
		assertTrue("testGetFull", isOk);
	}

}
