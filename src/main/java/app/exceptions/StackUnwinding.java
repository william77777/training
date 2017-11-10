package app.exceptions;

public class StackUnwinding {
	
	public static void main(String[] args) {
		firstCall();
	}
	
	// caught
	static void firstCall() {
		try {
			secondCall();
		} catch (Exception e) {
			for(StackTraceElement s : e.getStackTrace())
				System.out.println(s.toString());
		}
	}
	
	static void secondCall() throws Exception {
		thirdCall();
	}
	
	static void thirdCall() throws Exception {
		fourthCall();
	}
	
	/**
	 * throwpoint
	 * generates information about the exception, including the stack trace
	 * @throws Exception
	 */
	static void fourthCall() throws Exception {
		throw new Exception();
	}
}
