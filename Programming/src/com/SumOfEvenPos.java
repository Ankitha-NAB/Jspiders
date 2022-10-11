package com;
import java.util.Scanner;
public class SumOfEvenPos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,rem=0,sum=0;
		while(n!=0) {
			c++;
			rem=n%10;
			if(c%2==0) {
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println(sum);	
		}


}
