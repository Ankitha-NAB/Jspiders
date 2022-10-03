package com;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		System.out.println("enter second number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("before swapping a is "+a+" b is "+b);
		temp=a;
		a=b;
		b=temp;
		//logic2 use + and - without using third variable
		/* a=a+b;
		 * b=a-b;
		 * a=a-b;
		 */
		
		//logic3 use * and / without using third variable here a & b should not be zero
		/*a=a*b;
		 * b=a/b;
		 * a=a/b;
		 */
		
		//logic4 using bitwise XOR(^)
		/*a=a^b;
		 * b=a^b;
		 * a=a^b;
		 */
		
		//logic5 single statement
		//b=a+b-(a=b);
		
		System.out.println("after swapping a is "+a+" b is "+b);
		

	}

}
