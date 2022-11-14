package string;
import java.util.Scanner;

public class CountNorWords {
	static void norOfWords(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ') {
				count++;
			}
			}
		System.out.println(count++);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.nextLine();
	norOfWords(s);
	
}
}
