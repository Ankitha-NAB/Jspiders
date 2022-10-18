package string;
import java.util.Scanner;

public class StringPalindrome {
	static void palindrome(String s1) {
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("palindrome "+s2);
		}
		else {
			System.out.println("not a palindrome "+s2);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s1=sc.next();
	palindrome(s1);
	
}
}
