package app.testing.junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkTestingExample {

	private int x, y;

	public BulkTestingExample(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Parameters(name="Test {index}: is {0} + {1} < 100?")
	public static List<Object[]> parameters() {
		return Arrays.asList(new Object[][] { { 1, 2 }, { 40, 50 }, { -200, 99 }, { 0, 0 } });
	}
	
	@Test
	public void allLessThan100() {
		assertTrue(BulkTestingExample.sumLessThan100(x, y));
	}

	public static boolean sumLessThan100 (int x, int y) {
		return x + y < 100;
	}
	
}
