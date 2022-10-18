package string;
import java.util.Scanner;

public class CountNorOfAlpha {
	static void countNor(String s) {
		int count1=0,count2=0,count3=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='A'&&c<='Z')||(c>'a'&&c<='z')) {
				count1++;
			}
			else if(c>='0'&&c<='9'){
				count2++;
			}
			else {
				count3++;
			}
		}
		System.out.println("alpha:"+count1);
		System.out.println("numeric:"+count2);
		System.out.println("special char:"+count3);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter of string:");
	String s=sc.next();
	countNor(s);
}
}
