package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	static double divide(double a, double b) {
		return a / b;
	}

	static double divide(double a, double b, double c) {
		return a / b / c;
	}

	static double divide(double a, double b, double c, double d) {
		return a / b / c / d;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static double subtract(double a, double b, double c) {
		return a - b - c;
	}

	static double subtract(double a, double b, double c, double d) {
		return a - b - c - d;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	static double multiply(double a, double b, double c, double d) {
		return a * b * c * d;
	}

	@Test // @Ignore
	public void test_011() {
		assertEquals("Not correct", divide(90.0, 7.0), 12.9, 0.09);
	}

	@Test // @Ignore
	public void test_02() {
		assertEquals("Not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);
	}

	@Test // @Ignore
	public void test_03() {
		assertEquals("Not correct", subtract(100.0, 22.0), 78.0, 0.09);
	}

	@Test // @Ignore
	public void test_04() {
		assertEquals("Not correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Before
	public void before() {
		System.out.println("\tBefore Test");
	}

	@After
	public void after() {
		System.out.println("\tAfter Test");
	}
}
