package numberseries;
import java.util.Scanner;

public class GeometricSeries {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		for(int i=1,k=2;i<=n;i++,k*=2) {
			sum=sum+k;
		}
		System.out.println("sum is: "+sum);
	}

}
