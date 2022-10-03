package arrays;


import java.util.*;

public class A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elemenst: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//System.out.println();
		System.out.println("the entered elements are: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
}
