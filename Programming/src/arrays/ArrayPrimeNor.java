package arrays;
import java.util.Scanner;


public class ArrayPrimeNor {
	static boolean primeNor(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	static int sumOfEvenArrayEle(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			boolean ans=primeNor(a[i]);
			if(ans==true) {
				sum+=a[i];
			}
		}
		return sum;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements:");
	int[] a=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println(sumOfEvenArrayEle(a));
}
}
