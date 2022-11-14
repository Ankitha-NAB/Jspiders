package string;
import java.util.Scanner;

public class RollnoOfTheStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="prateek ankitha nikhitha barath";
		String[] arr=s.split(" ");
		System.out.println("enter string to find:");
		String s2=sc.next();
		s2=s2.toLowerCase();
		int k=0,c=0;
		for(String ele:arr) {
			k++;
			if(s2.equals(ele)) {
				System.out.println(k);
				break;
			}
			c++;
		}
		if(k==c) {
			System.out.println(-1);
		}
	}

}
