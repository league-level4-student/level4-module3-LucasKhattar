package _01_introduction;

public class CustomExeption extends ExceptionsDemo{
	static void terminate(){
		System.exit(0);
		try {
			testMethod2(-1);
		} catch (Exception e) {
			CustomExeption.terminate();
		}
	}
}
