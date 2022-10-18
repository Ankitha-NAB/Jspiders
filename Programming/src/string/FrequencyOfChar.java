package string;
import java.util.Scanner;

public class FrequencyOfChar {
	static void frequency(String s,char key) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==key) {
				count++;
			}
		}
		System.out.println(count);
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	char key=sc.next().charAt(0);
	frequency(s,key);
}
}
