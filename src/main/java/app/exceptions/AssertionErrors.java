package app.exceptions;
/**
 * Try both AssertionErrors run configuration
 * @author wums
 *
 */
public class AssertionErrors {

	public static void main(String[] args) {
		isTrue(true);
		isTrue(false);
	}

	static void isTrue(boolean val) {
		// needs to be ran with VM argument -ea for this to run
		assert val : "Is not true!!!";
		System.out.println("Passed");
	}
}
