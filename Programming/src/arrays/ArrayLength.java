package arrays;
import java.util.Scanner;

public class ArrayLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("entered elements are");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" \n");
		
	}
	System.out.println("length of an array:"+a.length);
	
}
}
