package com;
import java.util.Scanner;

public class DuckNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,c=0,prod=1;
		while(n!=0) {
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		if(prod==0) {
			System.out.println("Duck number");
		}
		else {
			System.out.println("Not a duck number");
		}

	}

}
