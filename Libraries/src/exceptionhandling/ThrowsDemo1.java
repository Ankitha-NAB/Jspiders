package exceptionhandling;
import java.io.*;

public class ThrowsDemo1 {
	static void div() throws ArithmeticException{
		System.out.println(10/0);
	}
public static void main(String[] args) {
	System.out.println("start");
	try {
		div();
	}
	catch(ArithmeticException e) {
		System.out.println("invalid denominator");
	}
	System.out.println("end");
}
}
