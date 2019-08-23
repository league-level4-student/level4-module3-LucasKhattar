package _02_gotta_catchem_all;

import static org.junit.Assert.fail;

public class ExceptionMethods {
	double divide(double number1, double number2) throws IllegalArgumentException {
		if(number2 == 0) {
			throw new IllegalArgumentException();
		}
		double quotient = number1/number2;
		return quotient;
	}
	String reverseString(String input) throws IllegalStateException {
		String result = "";
		if(input.equals("")) {
			throw new IllegalStateException();
		}
		for (int i = input.length()+1; i > 0; i--) {
 		}
		return result;
	}
}
