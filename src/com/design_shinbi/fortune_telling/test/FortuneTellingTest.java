package com.design_shinbi.fortune_telling.test;

import org.junit.jupiter.api.Test;

import com.design_shinbi.fortune_telling.Result;

class FortuneTellingTest {

	@Test
	void testResult() {
		for(int i = 0; i < 50; i++) {
			Result result = Result.getRandom();
			System.out.println(result.getName());
		}
	}
}