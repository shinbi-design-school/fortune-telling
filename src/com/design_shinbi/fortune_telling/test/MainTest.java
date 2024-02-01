package com.design_shinbi.fortune_telling.test;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.design_shinbi.fortune_telling.Main;

class MainTest {

	@Test
	void test() throws IOException, ClassNotFoundException {
		List<Class<?>> classes = Main.getClasses();
		System.out.println(classes);
	}
}