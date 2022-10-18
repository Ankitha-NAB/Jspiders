package string;
import java.util.Scanner;

public class CharPos {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		System.out.println("character at "+i+" position:"+ch);
	}
}
}
