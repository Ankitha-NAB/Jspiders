package sorting;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.length()==s2.length()) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(c1[i]>c2[i]) {
					char temp=c1[i];
					c1[i]=c2[i];
					c2[i]=temp;
				}
			}
		}
		for(int i=0;i<s2.length();i++) {
			for(int j=i+1;j<s2.length();j++) {
				if(c1[i]>c2[i]) {
					char temp=c1[i];
					c1[i]=c2[i];
					c2[i]=temp;
				}
			}
		}
		if(s1.equals(s2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not a anagram");
		}
	}
	
	
}
}
