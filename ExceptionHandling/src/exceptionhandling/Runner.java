package exceptionhandling;

public class Runner {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index position");
	}
	catch(ArithmeticException e) {
		System.out.println("invalid denominator");
	}
	catch(Exception e) {
		System.out.println("super class handler");
	}
}
}

//one try block can have multiple catch blocks but that suitable catch block will get executed