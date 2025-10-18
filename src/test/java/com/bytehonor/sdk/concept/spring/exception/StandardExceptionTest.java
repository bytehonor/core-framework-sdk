package com.bytehonor.sdk.concept.spring.exception;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StandardExceptionTest {

	@Test
	public void testGetCode() {
		int code = 1;
		StandardException se = new StandardException(code, "test");

		assertTrue("testGetCode should return 'true'", se.getCode() == code);
	}

}
