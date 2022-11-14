package basicprgms;
import java.util.Scanner;

public class SwapingNors {
	/*static void swapTwoNor(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("value of a: "+a+" value of b:"+b);
	}
	*/
	/*static void swapTwoNor(int a,int b) {
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("value of a: "+a+" value of b:"+b);
	}
	*/
	static void swapTwoNor(int a,int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("value of a: "+a+" value of b:"+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a=sc.nextInt();
		System.out.println("enter b:");
		int b=sc.nextInt();
		swapTwoNor(a,b);
	}
}
