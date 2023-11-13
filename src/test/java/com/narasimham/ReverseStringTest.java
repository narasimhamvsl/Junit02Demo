package com.narasimham;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseString() {
		String expected = "avaj";
		assertEquals(expected, new ReverseString().reverseString("java"));
	}

}
