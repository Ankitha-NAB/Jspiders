package numberseries;

import java.util.Scanner;

public class GeometricSquareSeries {
	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=10;
		int x=sc.nextInt();
		for(int i=1,k=2;i<=n;i++,k*=2) {
			sum=sum+(double)x/k;
		}
		System.out.println("sum is: "+sum);
	}

}


