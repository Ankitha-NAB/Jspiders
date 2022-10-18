package regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContain {
static void contains(String s) {
	Pattern p=Pattern.compile(".*abc.*");
	Matcher m=p.matcher(s);
	boolean ans=m.matches();
	System.out.println(ans);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String s=sc.next();
	contains(s);
}
}
