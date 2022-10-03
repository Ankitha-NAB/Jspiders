package numberseries;

import java.util.Scanner;

public class GeometricSquareSeries3 {
	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=10;
		int x=sc.nextInt();
		for(int i=1,a=2,k=10;i<=n;i++,a+=2,k*=3) {
			sum=sum+(x+a)/k;
		}
		System.out.println("sum is: "+sum);
	}

}


