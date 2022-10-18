package regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsFoueChars {
static void fourChars(String s) {
	Pattern p=Pattern.compile("[a-z,A-Z]{4}.*");
	Matcher m=p.matcher(s);
	boolean ans=m.matches();
	System.out.println(ans);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	fourChars(s);
}
}
