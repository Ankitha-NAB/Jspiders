package com;
import java.util.Scanner;

public class Empty {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		while(n!=0) {
			rem=n%10;
			if(rem==0) {
				n=n/10;
			}
		}
		
	}
	
}

