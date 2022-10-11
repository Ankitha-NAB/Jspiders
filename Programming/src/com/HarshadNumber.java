package com;
import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int org_str=n,rem=0,sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(org_str%sum==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
