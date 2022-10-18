package string;
import java.util.Scanner;

public class NorOFVowels {
	static int vowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			s=s.toLowerCase();
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	System.out.println(vowels(s));
	
}
}
