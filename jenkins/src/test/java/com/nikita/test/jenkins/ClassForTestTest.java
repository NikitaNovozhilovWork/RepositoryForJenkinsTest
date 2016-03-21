package com.nikita.test.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassForTestTest {

	@Test
	public void testExecuteTestTrueForTrue() {
		boolean result = ClassForTest.executeTest(true);
		assertEquals(true, result);
	}
	
	@Test
	public void testExecuteTestFalseForFalse() {
		boolean result = ClassForTest.executeTest(false);
		assertEquals(false, result);
	}

}
