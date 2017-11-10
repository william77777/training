package app.objects.primitives;

import java.math.BigDecimal;

public class BigDecimalExamples {
	public static void main(String[] args) {
		// sum
		BigDecimal big = BigDecimal.valueOf(0.0);
		for (int c = 0; c < 10; c++)
			big = big.add(BigDecimal.valueOf(0.1));
		System.out.println("Big sum: " + big.toString());

		// large sum comparisons
		BigDecimal largeSum = BigDecimal.valueOf(1.0e307);
		largeSum = largeSum.multiply(BigDecimal.valueOf(2000.0)).divide(BigDecimal.valueOf(2000.0));
		System.out.println("largeSum = 1.0e307: " + (largeSum.compareTo(BigDecimal.valueOf(1.0e307)) == 0));

		// adding large to small
		BigDecimal largeAndSmall = BigDecimal.valueOf(10000.0d);
		largeAndSmall = largeAndSmall.add(BigDecimal.valueOf(1.0e-13d));
		System.out.println("largeAndSmall = 10000.0d: " + (largeAndSmall.compareTo(BigDecimal.valueOf(10000.0d)) == 0));
	}
}
