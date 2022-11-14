package string;
import java.util.Scanner;
public class MinLengthWrd {
	static void minLength(String s) {
		String[] arr=s.split(" ");
		if(s.length()>0) {
			String min=arr[0];
			for(String ele:arr) {
				if(min.length()>ele.length()) {
					min=ele;
				}
			}
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.nextLine();
	minLength(s);
}
}
