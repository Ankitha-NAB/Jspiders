package regularexpression;
import java.util.Scanner;
import java.util.regex.*;

public class StringStarts {
	static void starts(String s) {
		Pattern p=Pattern.compile("A.*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	starts(s);
}
}
