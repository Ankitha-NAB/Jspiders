package com;
import java.util.Scanner;

public class LuckyNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,rem=0,n1=n,sum=0,c1=0,n2=n;
		while(n!=0) {
			c++;
			n=n/10;
		}
		if(c>6) {
			for(int i=1;i<=4;i++) {
				rem=n1%10;
				sum=sum+rem;
				n1=n1/10;
			}
		}
		for(int i=1;i<=sum;i++) {
			if(sum%i==0) {
				c1++;
			}
		}
		if(c1==2) {
			System.out.println("lucky nor");
		}
		else {
			System.out.println("unlucky nor");
		}
	}

}
