package exceptionhandling;
import java.util.Scanner;

public class ArrayIndexOutOfBoundPrgm {
public static void main(String[] args) {
	System.out.println("start");
	Scanner sc=new Scanner(System.in);
	int a[]= {10,20,30};
	try {
		System.out.println(a[99]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index position");
	}
	System.out.println("end");
}
}
