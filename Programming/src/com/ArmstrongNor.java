package com;
import java.util.Scanner;

public class ArmstrongNor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,n1=n,rem=0,sum=0,n2=n;
		while(n!=0) {
			c++;
			n=n/10;
		}
		while(n1!=0) {
			rem=n1%10;
			int pow=1;
			for(int i=1;i<=c;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;;
			n1=n1/10;
		}
		if(n2==sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
		

	}

}
