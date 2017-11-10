package app.oop;

public class SuperAndSubclassInteraction {
	public static void main(String[] args) {
		new ChildA();
		new ChildB();
		new ChildC();
		new ChildD();
	}
}

abstract class Parent {
	Parent() {
		doSomething();
		alwaysDoThisCannotBeChanged();
		implicitlyAlwaysDoThis();
		implicitlyAlwaysDoThis2();
	}

	// overrideable
	void doSomething() {
		System.out.println("Parent doing something");
	}
	
	// cannot be overrided
	final void alwaysDoThisCannotBeChanged() {
		System.out.println("Always doing this.");
	}
	
	private void implicitlyAlwaysDoThis() {
		System.out.println("Always doing this as well");
	}
	
	static void implicitlyAlwaysDoThis2() {
		System.out.println("Always doing this as well 2");
	} 
}

class ChildA extends Parent {

}

class ChildB extends Parent {
	public ChildB() {
	}
}

class ChildC extends Parent {
	public ChildC() {
	}

	@Override
	void doSomething() {
		System.out.println("Child doing something");
	}

}

class ChildD extends Parent {
	public ChildD() {
		super();
	}

	@Override
	void doSomething() {
		System.out.println("Child doing something");
	}

}
