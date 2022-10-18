package string;
import java.util.Scanner;

public class StringReplacement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	String s1=s.replaceAll("[^a-zA-Z0-9]","" );
	System.out.println(s1);
	
}
}
