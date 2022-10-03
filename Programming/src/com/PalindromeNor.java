package com;
import java.util.Scanner;
public class PalindromeNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int org_str=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+ n%10;
			n=n/10;
		}
		if(org_str==rev) {
			System.out.println(rev+" is a palindrome");
		}
		else {
			System.out.println(rev+" is not palindrome");
		}
}
}
