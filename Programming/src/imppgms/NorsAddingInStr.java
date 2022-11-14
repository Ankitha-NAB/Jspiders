package imppgms;
import java.util.*;

public class NorsAddingInStr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	String s=sc.next();
	int sum=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='0' && c<='9') {
			sum=sum+(c-48);
		}
	}
	System.out.println(sum);
}
}
