package string;
import java.util.Scanner;

public class ConvertStrtoArray {
	static void converting(String s) {
		/*int sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				sp++;
			}
		}
		String[] arr=new String[sp+1];
		int k=0;
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				arr[k]=s2;
				s2="";
				k++;
			}
			else {
				s2=s2+ch;
			}
		}
		arr[k]=s2;
		for(String ele:arr) {
			System.out.println(ele);
		}*/
		String[] arr=s.split(" ");
		for(String ele:arr) {
			System.out.println(ele);
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string:");
	String s=sc.nextLine();
	converting(s);
}

}
