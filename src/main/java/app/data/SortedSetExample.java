package app.data;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet<Number> tree = new TreeSet<Number>(Arrays.asList(0, 1, 4, -5, 9, 7, 11, 6));
		System.out.println(tree); // sorted
		
		SortedSet<Number> sub = tree.subSet(1, 11);
		System.out.println(sub);

//		String aString = "I'm a String";
//		char[] aStringArray = aString.toCharArray();
//
//		System.out.println(new String(aStringArray).length());
//		for (Byte b : new String(aStringArray).getBytes()) {
//			System.out.print("[" + b + "]");
//		}
	}
}
