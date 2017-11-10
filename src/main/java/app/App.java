package app;

public class App {
	public static void main(String[] args) {
		System.out.println(new String("123") instanceof String);
		System.out.println(new String("123") instanceof Object);
		System.out.println(new Object() instanceof String);
	}
}
