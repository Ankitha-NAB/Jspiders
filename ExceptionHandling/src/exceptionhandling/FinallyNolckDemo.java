package exceptionhandling;

//finally block will get executed always irrespective of an exception occurs or not
public class FinallyNolckDemo {
public static void main(String[] args) {
	System.out.println("start");
	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println("invalid denominator");
	}
	finally {
		System.out.println("inside finally block");
	}
	System.out.println("end");
}
}
