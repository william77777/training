package app.data;

import java.util.Arrays;

public class ArrayInitializationExample {
	public static void main(String[] args) {
		int [] i = new int[5];
		System.out.printf("initial values for int: %s\n",Arrays.toString(i));
		boolean [] b = new boolean[5];
		System.out.printf("initial values for boolean: %s\n",Arrays.toString(b));
		char [] c = new char[5];
		System.out.printf("initial values for char: %s\n",Arrays.toString(c));
		double [] d = new double[5];
		System.out.printf("initial values for double: %s\n",Arrays.toString(d));
		String [] s = new String[5];
		System.out.printf("initial values for String: %s\n",Arrays.toString(s));
	}
}
