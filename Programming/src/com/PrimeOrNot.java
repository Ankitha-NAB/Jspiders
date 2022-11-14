package com;
import java.util.Scanner;

public class PrimeOrNot {
	static void prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		prime(n);
	}
}	