package app.data;

public class Primitives {
	public static void main(String[] args) {
		// numbers in general are automatically treated as integers
		short a = 1, b = 2;
		// hence why without casting, this would be considered an integer addition
		short c = (short) (a + b);
	}
}
