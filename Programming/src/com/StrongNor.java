package com;
import java.util.Scanner;

public class StrongNor {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rem=0,sum=0,m=n;
	while(n!=0) {
		rem=n%10;
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(m==sum) {
		System.out.println("strong number");
}
	else {
		System.out.println("not a strong number");
	}
}
}
