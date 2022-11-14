package basicprgms;
import java.util.Scanner;

public class EvenOrOdd {
static void evenOdd(int n) {
	if(n%2==0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	evenOdd(n);
}
}
