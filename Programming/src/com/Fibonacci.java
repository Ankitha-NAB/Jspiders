package com;
import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range: ");
		int n=sc.nextInt();
		int a=0,b=1,sum=0,c;
		for(int i=1;i<=n;i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
}
}