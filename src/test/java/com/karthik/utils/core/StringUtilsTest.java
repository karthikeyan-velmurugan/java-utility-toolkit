package com.karthik.utils.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * -------------------------------------------------------
 * Author  : karthik
 * Created : 7 May 2025
 * Project : java-utility-toolkit
 * Class   : StringUtilsTest
 * -------------------------------------------------------
 */

class StringUtilsTest {
	
	private final StringUtils stringUtils = new StringUtils();

	@Test
	public void testIsEmpty() {
		assertTrue(stringUtils.isEmpty(null));
		assertTrue(stringUtils.isEmpty(""));
		assertTrue(stringUtils.isEmpty("  "));
		assertFalse(stringUtils.isEmpty("Hello"));
	}
	
	@Test
	public void testCapitalize() {
		assertEquals("Hello", stringUtils.capitalize("hello"));
		assertEquals("Hello world", stringUtils.capitalize("hello world"));
		assertEquals("", stringUtils.capitalize(""));
	}

}
