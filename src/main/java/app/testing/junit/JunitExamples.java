package app.testing.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitExamples {
	
	@Test(expected=ArithmeticException.class)
	public void test_expectingArithmeticException() {
		throw new ArithmeticException();
	}
	
	@Test
	@Ignore(value="bad test case but we still want to keep it")
	public void test_ignore() {
		assertEquals(0.557D, 0.556D);
	}
	
	@Test
	public void test_better() {
		assertEquals(0.557D, 0.556D, 0.01D);
	}
	
	@Before
	public void runBeforeEachTest() {
		System.out.println("Running before each test.");
	}
	
	@After
	public void runAfterEachTest() {
		System.out.println("Run after each test.");
	}
	
	/**
	 * Needs to be static
	 */
	@BeforeClass
	public static void runOnceBeforeAnyTest() {
		System.out.println("Run only once before first test");
	}
	
	@AfterClass
	public static void runAfterAnyTest() {
		System.out.println("Run only once after last test");
	}
	
	@Test
	public void testStringBuilder_Append() {
		assertEquals("Hello World!", new StringBuilder()
				.append("Hello")
				.append(" ")
				.append("World")
				.append("!")
				.append("")
				.toString()
		);
	}
	
}
