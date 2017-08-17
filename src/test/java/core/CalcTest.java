package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

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
		System.out.println("Before Test");
	}

	@After
	public void after() {
		System.out.println("After Test");
	}

	@Test
	public void test_01() {
		System.out.println("Test # 01");
	}

	@Test
	public void test_02() {
		System.out.println("Test # 02");
	}

	@Test
	public void test_03() {
		System.out.println("Test # 03");
	}

	@Test
	public void test_04() {
		System.out.println("Test # 04");
	}
}
