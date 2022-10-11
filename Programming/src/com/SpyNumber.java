package com;
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int org_Str=n;
		int sum=0,prod=1,rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
