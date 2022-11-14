package string;
import java.util.Scanner;

public class LargestWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.next();
	String[] arr=s.split(" ");
	String max=arr[0];
	if(s.length()>0) {
		for(String ele:arr) {
			if(max.length()<arr.length) {
				max=ele;
			}
		}
		System.out.println(max);
	}
	else {
		System.out.println(-1);
	}
}
}
