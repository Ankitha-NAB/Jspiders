package com;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
}	