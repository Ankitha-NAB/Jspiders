package exceptionhandling;
import java.util.Scanner;

public class ArithmeticExceptionPrgm {
	public static void main(String[] args) {
		System.out.println("start");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("do not divide by 0");
		}
		System.out.println("end");
	}
}
