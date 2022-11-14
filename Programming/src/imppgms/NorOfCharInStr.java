package imppgms;
import java.util.*;

public class NorOfCharInStr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.next();
	char[] a1=s.toCharArray();
	char[] a2=s.toCharArray();
	for(int i=0;i<a1.length;i++) {
		int c=0;
		for(int j=0;j<a2.length;j++) {
			if(a1[i]==a2[j]) {
				c++;
				a2[j]='\0';
			}
		}
		if(c>0) {
			System.out.println(a1[i]+"-"+c);
		}
	}
}
}
