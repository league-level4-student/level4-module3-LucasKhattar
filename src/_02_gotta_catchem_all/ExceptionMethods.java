package _02_gotta_catchem_all;

import static org.junit.Assert.fail;

public class ExceptionMethods {
	double divide(double number1, double number2) {
		double quotient = number1/number2;
		return quotient;
	}
	String reverseString(String input) {
		String output = "";
		try {
			input = "";
			fail("IllegalStateException");
		} catch (Exception e) {
			System.out.println("Enter a string");
		}
		return output;
	}
}
