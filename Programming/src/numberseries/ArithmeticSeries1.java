package numberseries;
import java.util.Scanner;

public class ArithmeticSeries1 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range: ");
		int n=sc.nextInt();
		for(int i=0,a=9;i<=n;i++,a+=4) {
			sum=sum+a;
		}
		System.out.println("sum is: "+sum);

	}

}
