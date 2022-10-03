package numberseries;
import java.util.*;

public class ArithmeticSeries2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		for(int i=1,a=2;i<=n;i++,a+=2) {
			sum=sum+a;
		}
		System.out.println("Sum is: "+sum);

	}

}
