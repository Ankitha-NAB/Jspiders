package imppgms;
import java.util.*;

public class NumberToWord {
	static String numberToWord(int n) {
		String s[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int rem=0;
		String ans="";
		while(n!=0) {
			rem=n%10;
			ans=s[rem]+ans;
			n=n/10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		System.out.println(numberToWord(n));
	}


}
