package string;
import java.util.Scanner;

public class LargestWordInTheStr {
	static void largestWord(String s) {
		String[] arr=s.split(" ");
		if(s.length()>0) {
			String max=arr[0];
			for(String ele:arr) {
				if(max.length()<ele.length()) {
					max=ele;
				}
			}
			System.out.println(max);
		}
		else {
			System.out.println(-1);
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.nextLine();
	largestWord(s);
}
}
