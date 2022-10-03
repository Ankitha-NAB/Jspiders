package com;


public class ReverseString {
	public static void main(String[] args) {
		String str="PRATEEK";
		String rev="";
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("the reversed string is: "+rev);
		
}
}
