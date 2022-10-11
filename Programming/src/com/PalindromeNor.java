package com;
import java.util.Scanner;
public class PalindromeNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int m=n;
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==m) {
			System.out.println(m+" is a palindrome");
		}
		else {
			System.out.println(m+" is not palindrome");
		}
}
}
