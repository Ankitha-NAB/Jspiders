package com;
import java.util.Scanner;

public class PowerNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int exp=sc.nextInt();
		int pow=1;
		for(int i=1;i<=exp;i++) {
			pow=base*pow;
		}
		System.out.println(pow);
	}

}
