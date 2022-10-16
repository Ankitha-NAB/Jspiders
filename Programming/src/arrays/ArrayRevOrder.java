package arrays;
import java.util.Scanner;

public class ArrayRevOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("entered elements are:");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println("elements in reverse order");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]+" ");
	}
}
}
