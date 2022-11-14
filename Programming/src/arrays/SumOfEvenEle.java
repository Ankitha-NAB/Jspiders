package arrays;
import java.util.Scanner;

public class SumOfEvenEle {
	static int sumEle(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
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
	System.out.println(sumEle(a));
}
}
