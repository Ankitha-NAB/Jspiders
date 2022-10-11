package com;
import java.util.Scanner;

public class KeyFound {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int key=sc.nextInt();
		int rem=0,c=0;
		while(n!=0) {
			rem=n%10;
			if(rem==key) {
				c++;
			}
			n=n/10;
		}
		if(c==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(c);
		}
	}

}
