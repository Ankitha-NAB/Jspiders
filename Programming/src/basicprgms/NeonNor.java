package basicprgms;
import java.util.Scanner;

public class NeonNor {
	static boolean checkNeon(int n) {
		int square=n*n;
		int sum=0;
		while(square>0) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n:");
	int n=sc.nextInt();
	if(checkNeon(n)) {
		System.out.println("neon");
	}
	else {
		System.out.println("not neon");
	}
	
}
}
