package stack;
import java.util.*;
public class RevStrUsingCollection {
public static void main(String[] args) {
	String str="Ankitha";
	char[] c=str.toCharArray();
	Stack<Character> s=new Stack<Character>();
	for(char i:c) {
		s.push(i);
	}
	System.out.println(s);
	while(!s.isEmpty()) {
		System.out.print(s.pop()+"");
	}
}
}
