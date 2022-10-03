package numberseries;
import java.util.Scanner;

public class ArithmeticSquareSeries4 {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=10;
		for(int i=1,a=2,d=10;i<=n;i++,a+=2,d--) {
			sum=sum+(double)a/d;
		}
		System.out.println("sum is: "+sum);

	}

}