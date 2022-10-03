package numberseries;

import java.util.Scanner;

public class GeometricSquareSeries1 {
	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=3;
		for(int i=1,k=2;i<=n;i++,k*=3) {
			if(i%2==0) {
				sum=sum-k;
			}
			else {
				sum=sum+k;
			}
		}
		System.out.println("sum is: "+sum);
	}

}
