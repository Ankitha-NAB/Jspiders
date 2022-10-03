package numberseries;
import java.util.Scanner;

public class ArithmeticSeries4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		for(int i=1,a=10;i<=n;i++,a--) {
			sum=sum+a;
		}
		System.out.println("sum is: "+sum);

	}

}
