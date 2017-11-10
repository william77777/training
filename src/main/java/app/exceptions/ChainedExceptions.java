package app.exceptions;

public class ChainedExceptions {
	
	public static void main(String[] args) {
		firstCall();
	}
	
	static void firstCall() {
		try {
			secondCall();
		} catch (Exception e) {
//			for(StackTraceElement s : e.getStackTrace())
//				System.out.println(s.toString());
			e.printStackTrace(System.out);
		}
	}
	
	static void secondCall() throws Exception {
		try {
			thirdCall();
		} catch (Exception e) {
			throw new ExceptionB("Second exception thrown.",e);
		}
	}
	
	static void thirdCall() throws Exception {
		throw new ExceptionA("First exception thrown.");
	}
}

class ExceptionA extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionA(String message) {
		super(message);
	}
	
}

class ExceptionB extends Exception{

	public ExceptionB(String message) {
		super(message);
	}

	public ExceptionB(String message, Throwable cause) {
		super(message, cause);
	}
	
}
