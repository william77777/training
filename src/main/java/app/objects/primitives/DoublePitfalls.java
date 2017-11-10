package app.objects.primitives;

public class DoublePitfalls {
	public static void main(String[] args) {

		// doubles are an approximation
		// using double and float
		// float has 8 leading digits precision
		// double has 17 leading digits precision
		float f = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		double d = 0.1d + 0.1d + 0.1d + 0.1d + 0.1d + 0.1d + 0.1d + 0.1d + 0.1d + 0.1d;
		System.out.println("double: " + d + " vs " + "float: " + f);
		
		// sum
		double sum = 0.1d + 0.1d + 0.1d;
		System.out.println(sum);
		System.out.println("Sum equal to 0.3: " + (sum == 0.3));

		// overflow
		double largeSum = 1.0e307 * 2000 / 2000;
		System.out.println("largeSum: " + (largeSum == 1.0e307));

		// adding large to small
		double largeAndSmall = 10000.0d + 1.0e-13d;
		System.out.println("largeAndSmall: " + (largeAndSmall == 10000.0d)); // no effect

		// avoid equality tests with double
		// infinite for-loop
		System.out.println("First loop: ");
		int count=0;
		for(double i=0.1 ; i!=0.3 ; i+=0.1) {
			System.out.println(i);
			if(count > 10) break; // force termination
			count++;
		}
		
		// use a tolerance or less than instead
		System.out.println("Second loop: ");
		double tolerance = 0.01;
		for(double i=0.0 ; Math.abs(0.3-i) > tolerance ; i+=0.1) {
			System.out.println(i);
		}
		System.out.println("Third loop: ");
		for(double i=0.0 ; i<0.4 ; i+=0.1) {
			System.out.println(i);
		}
		
		// negative infinity lol
		System.out.println("Divide by postive 0: "+(1.0/0.0));
		System.out.println("Divide by negative 0: "+(1.0/-0.0));
		
		// what you see is not what you get
		System.out.println(0.3d); // not really 0.3
	}
}





