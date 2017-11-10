package app.api;

import java.util.Arrays;

public class SystemExamples {
	public static void main(String[] args) {
		extractMethodExample();
		arrayCopyExample();
	}

	private static void extractMethodExample() {
		System.out.println("Extract method example");
	}

	private static void arrayCopyExample() {
		char [] arr1 = new char[] {'a','b','c'};
		char [] arr2 = new char[] {'a','b','c'};
		char [] arr3 = new char[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arr3));
	}
}
