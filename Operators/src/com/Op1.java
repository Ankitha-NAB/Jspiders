package com;

public class Op1 {

	public static void main(String[] args) {
		//comparison operators
		int x=10;
		int y=20;
		System.out.println(x<y);
		System.out.println(x<=5);
		System.out.println("----------");
		System.out.println(y>50);
		System.out.println(y>=20);
		System.out.println("----------");
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x==10);
		System.out.println(x!=10);
		//logical operators
		System.out.println("-----------");
		int a=1;
		int b=2;
		boolean result=a<b && a==1;
		System.out.println(result);
		System.out.println(a<=4 && a==b);

	}

}
