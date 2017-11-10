package app.exceptions;

public class ExceptionFlowControl {
	
	public static void main(String[] args) {
		secondPass();
	}
	
	static void secondPass() {
		try {
			firstPass();
		} catch (PassThisAlong e) {
			e.inc();
			System.out.println("Caught exception: "+e.getMsg());
		}
	}
	
	static void firstPass() throws PassThisAlong {
		try {
			whereItStarted();
		} catch (PassThisAlong e) {
			System.out.println("First pass: doing some stuff before throwing exception");
			e.inc();
			throw e;
		} finally {
			System.out.println("First pass: doing stuff in finally block, also happens before exception.");
		}
	}
	
	static void whereItStarted() throws PassThisAlong {
		PassThisAlong passThisFoo = new PassThisAlong("I was passed along");
		passThisFoo.inc();
		throw passThisFoo;
	}
}

// use finally
// use exception hierarchies
// add pass count
class PassThisAlong extends Exception{

	int count=0;
	
	public PassThisAlong(String message) {
		super(message);
	}
	
	void inc(){
		this.count++;
	}
	
	String getMsg() {
		return this.getLocalizedMessage() + " " + this.count + " times.";
	}
}
