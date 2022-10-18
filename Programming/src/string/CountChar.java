package string;
import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.next();
		int count=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>='A'&&arr[i]<='Z')||(arr[i]>='a'&&arr[i]<='z'))
				count++;
		}
		System.out.println(count);
	}
	
	
}
