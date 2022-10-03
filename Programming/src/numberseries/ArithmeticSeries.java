package numberseries;
import java.util.Scanner;


public class ArithmeticSeries {

	public static void main(String[] args) {
		//1+2+3+4+........+N
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		for(int i=1,a=1;i<=n;i++,a++) {
			sum=sum+i;
		}
		System.out.println("sum is: "+sum);

	}

}
