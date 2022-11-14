package basicprgms;
import java.util.Scanner;

public class VowelOrConsonent {
	static void vowelOrConsonent(char ch) {
		if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonent");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ch:");
	char ch=sc.next().charAt(0);
	vowelOrConsonent(ch);
}
}
