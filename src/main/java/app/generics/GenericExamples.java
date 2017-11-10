package app.generics;

public class GenericExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java compiler strips out generics and put in raw types
		// Erasure: every location of a placeholder will be replaced by an object
		// e.g. for <T>, this will be Object
		// only one bytecode representation for each generic method
		// Generics during compile time:
		// compiler checks to see if Type put in for <T> (e.g. Integer) can be used anywhere
		// T is used
		// use more complex type parameters to add functionality
		// e.g. <T extends SomeClass> will allow to use functions of SomeClass
		// compiler will replace T with SomeClass at compliation
		// Cannot use different types if only one placeholder
		operateOnDifferentTypes(1, 1.0); // using auto-boxing
		
		// Maintaining typesafety:
		// Compiler will automatically cast return type to type of parameters passed in 
		// e.g. T method(T obj)
		// -> (Integer) method(new Integer) // done implicitly
	}
	
	static <T1,T2> void operateOnDifferentTypes(T1 obj1, T2 obj2) {
		System.out.printf("Object 1: %s\n"
				+ "Object 2: %s\n",
				obj1.getClass().toString(),
				obj2.getClass().toString());
	}

}
