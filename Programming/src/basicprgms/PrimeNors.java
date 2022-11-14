package basicprgms;
import java.util.Scanner;

public class PrimeNors {
static void prime(int n) {
	int c=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			c++;
	}
	if(c==2)
		System.out.println("prime");
	else
		System.out.println("not prime");
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n:");
	int n=sc.nextInt();
	prime(n);
}
}
