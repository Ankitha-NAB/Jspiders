package string;
import java.util.Scanner;

public class CharFromString {
	/*static char getCharFromString(String str,int index) {
	return str.charAt(index);
}*/
	static char getCharFromString(String str,int index) {
		return str.toCharArray()[index];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
		System.out.println("enter index:");
		int index=sc.nextInt();
		System.out.println(getCharFromString(str,index));
	}
}
