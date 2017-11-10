package app.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			doSomeRandomThing();
		} catch (SomeRandomThing e) {
			System.out.println(e.getLocalizedMessage());
		}
		mightDoSomething();
	}

	static void doSomeRandomThing() throws SomeRandomThing {
		throw new SomeRandomThing("Caught " + SomeRandomThing.class.getSimpleName());
	}

	static void mightDoSomething() {
		throw new SomeRandomThingNotCaught("u dun goofed");
	}
}

class SomeRandomThing extends Throwable {

	public SomeRandomThing(String arg0) {
		super(arg0);
	}

}

/**
 * Doesn't have to be caught
 * 
 * @author wums
 *
 */
class SomeRandomThingNotCaught extends RuntimeException {

	public SomeRandomThingNotCaught(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}