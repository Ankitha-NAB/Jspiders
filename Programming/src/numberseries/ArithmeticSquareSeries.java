package numberseries;
import java.util.Scanner;

public class ArithmeticSquareSeries {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=10;
		int x=sc.nextInt();
		for(int i=1,a=1;i<=n;i++,a++) {
			sum=sum+Math.pow(x, a);
		}
		System.out.println("sum is: "+sum);

	}

}
