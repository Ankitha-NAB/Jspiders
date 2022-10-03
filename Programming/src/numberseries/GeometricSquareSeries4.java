package numberseries;

import java.util.Scanner;

public class GeometricSquareSeries4 {
	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=10;
		int x=sc.nextInt();
		for(int i=1,k=5,a1=1,a2=2;i<=n;i++,k*=5,a1++,a2++) {
			sum=sum+(x*Math.pow(k, 2)/(a1+a2));
		}
		System.out.println("sum is: "+sum);
	}


}
