package basicprgms;
import java.util.Scanner;

public class Factorial {
	static void facto(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n:");
	int n=sc.nextInt();
	facto(n);
}
}
