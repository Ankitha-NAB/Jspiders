package generics;
import java.util.*;

public class Test1 {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(20);
	l.add(10);
	l.add(30);
	for(int i:l) {
		System.out.println(i);
	}
	System.out.println("----------");
	Collections.sort(l);
	for(int i:l) {
		System.out.println(i);
	}
	System.out.println("----------");
	Collections.reverse(l);
	for(int i:l) {
		System.out.println(i);
	}
}
}
