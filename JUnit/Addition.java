package com.junit.mevenjunt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addition {
	public int add(int num1, int num2) {
		return num1 + num2;

	}

	public int sub(int num1, int num2) {
		return num1 - num2;

	}
	@Test
	public void addtest() {
		assertEquals(5, add(2, 3));
	}
	
	@Test
	public void subtest() {
		assertEquals(1, sub(5, 4));
	}

}
