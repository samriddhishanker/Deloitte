package com;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {
	
	Sum sum;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
		sum = new Sum();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void testAddNumbers() {
		assertNotEquals(100, sum.addNumbers(19,20));
	}

}
