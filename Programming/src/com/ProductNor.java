package com;
import java.util.Scanner;

public class ProductNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1,rem=0;
		while(n!=0) {
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		System.out.println(prod);
		
	}

}
