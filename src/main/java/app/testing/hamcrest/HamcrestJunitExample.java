package app.testing.hamcrest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.hamcrest.Matchers;
import org.junit.Test;

public class HamcrestJunitExample {
	@Test
	public void assertThatExample() {
		assertThat("Hey", equalTo("Hey"));
		assertThat(false, Matchers.anyOf(equalTo(true), equalTo(false)));
		assertThat("Hello", Matchers.anyOf(equalTo("Hello"), instanceOf(String.class), not(containsString("Hey"))));
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		assertThat(nums, hasItems(2,3)); // using Java's forargs feature 
		
		Stack<String> stack = new Stack<>();
		stack.push("World");
		stack.push("Hello");
		
		assertThat(stack, hasItems("World"));
		assertThat(stack, hasItems("dum"));
	}
}
