package string;
import java.util.Scanner;

public class VowelsNotPResent {
	static void vowels(String s) {
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a')
				c1++;
			else if(c=='e')
				c2++;
			else if(c=='i')
				c3++;
			else if(c=='o')
				c4++;
			else
				c5++;
		}
		if(c1==0)
			System.out.println("a");
		if(c2==0)
			System.out.println("e");
		if(c3==0)
			System.out.println("i");
		if(c4==0)
			System.out.println("o");
		if(c5==0)
			System.out.println("u");
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	vowels(s);
}
}
