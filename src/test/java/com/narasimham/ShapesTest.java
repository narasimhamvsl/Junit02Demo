package com.narasimham;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape = new Shapes();
	
	@Test
	void testComputeSquareArea() {
		double testValue = 59;
		assertEquals(testValue*testValue , shape.computeSquareArea(testValue));
	}
	
	@Test
	void testComputeCircleArea() {
		double testValue = 11;
		assertEquals(3.141*testValue*testValue, shape.ComputeCircleArea(testValue),"Area of Circle Calculation is Wrong");
	}

}