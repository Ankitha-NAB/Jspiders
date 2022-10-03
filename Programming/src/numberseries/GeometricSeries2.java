package numberseries;
import java.util.Scanner;

public class GeometricSeries2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range: ");
		int n=sc.nextInt();
		for(int i=1,k=10;i<=n;i++,k*=3) {
			sum=sum+k;
		}
		System.out.println("sum is: "+sum);
	}

}
