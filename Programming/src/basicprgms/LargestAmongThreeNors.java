package basicprgms;
import java.util.Scanner;


public class LargestAmongThreeNors {
	/*static int biggestOfNor(int a,int b,int c) {
		return c>(a>b?a:b)?c:((a>b)?a:b);
	}*/
	
	
	/*static int biggestOfNor(int a,int b,int c) {
		if(a>=b && a>=c)
			return a;
		else if(b>=a && b>=c)
			return b;
		else
			return c;
	}*/
	static int biggestOfNor(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}
			else {
				return b;
			}
		}
		else if(b>c) {
			return b;
		}
		else {
			return c;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a:");
	int a=sc.nextInt();
	System.out.println("enter b:");
	int b=sc.nextInt();
	System.out.println("enter c:");
	int c=sc.nextInt();
	int largest=biggestOfNor(a,b,c);
	System.out.println(largest);
}
}
