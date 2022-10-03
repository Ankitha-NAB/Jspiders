package numberseries;
import java.util.Scanner;

public class ArithmeticSquareSeries1 {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		for(int i=1,a=9;i<=n;i++,a+=4) {
			sum=sum+a*a;
		}
		System.out.println("sum is: "+sum);

	}

}
