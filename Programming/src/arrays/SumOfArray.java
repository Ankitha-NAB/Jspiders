package arrays;
import java.util.Scanner; 

public class SumOfArray {
	static void sumOfArrayEle(int sum,int[] a) {
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements: ");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("---Array elements---");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	sumOfArrayEle(sum,a);
}
}
