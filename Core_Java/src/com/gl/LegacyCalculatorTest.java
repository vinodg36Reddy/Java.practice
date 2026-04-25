package com.gl;

import org.junit.jupiter.api.Test;

class LegacyCalculatorTest {

	private final LegacyCalculator legacy = new LegacyCalculator();
	@Test
	void test() {
		int result = legacy.calculateLoyaltyPoints("GOLD", 100);
		assertEquals(10,result);
	}

}
