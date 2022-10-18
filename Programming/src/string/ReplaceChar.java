package string;
import java.util.Scanner;

public class ReplaceChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
    String s1=sc.next();
    String s2="";
    char[] arr=s1.toCharArray();
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]=='a'||arr[i]=='A') {
    		s2=s2+'o';
    	}
    	else {
    		s2=s2+arr[i];
    	}
    }
    System.out.println(s2);
}
}
