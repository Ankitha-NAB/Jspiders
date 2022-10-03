package com;
import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string: ");
		String str=sc.next();
		String org_str=str;
		String rev="";
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		if(org_str.equals(rev)) {
			System.out.println(rev+" is palindrome");
		}
		else {
			System.out.println(rev+" is not a palindrome");
		}

	}

}
