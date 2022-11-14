package linkedlist;
import java.util.*;

public class Solution {
public static void main(String[] args) {
	String x="A";
	String y="B";
	System.out.println(x.compareTo(y));//"A".comparTo("B") -> -1
	System.out.println(x.compareTo(x));//"A".comparTo("A") -> 0
	System.out.println(y.compareTo(x));//"B".comparTo("A") -> +1
	System.out.println("-------------");
	Integer a=10;
	Integer b=20;
	System.out.println(a.compareTo(a));
	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(a));
	System.out.println("-------------");
	Double i=2.3;
	Double j=2.1;
	System.out.println(i.compareTo(j));
	System.out.println(i.compareTo(i));
	System.out.println(j.compareTo(i));
}
}
