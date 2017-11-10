package app.data;

public class StringMethodsAreNotInPlaceBecauseStringIsImmutable {
	public static void main(String[] args) {
		// each String api call returns a new String instance
		String s = new String("Hello World!");
		s.toLowerCase();
		s.replace('o', 'a');
		s.substring(4);
		s.concat("Other String");
		System.out.println(s);
	}
}
