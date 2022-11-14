package generics;
import java.util.*;

public class Demo {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	for(Integer ele:l) {
		System.out.println(ele);
	}
	System.out.println("-----------");
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Anku");
	ll.add("Nikki");
	ll.add("Bunny");
	for(String ele:ll) {
		System.out.println(ele);
	}
	System.out.println("------------");
	Vector<Character> v=new Vector<Character>();
	v.add('A');
	v.add('Z');
	for(Character ele:v) {
		System.out.println(ele);
	}
	System.out.println("-------------");
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("Tom");
	al.add(true);
	for(Object ele:al) {
		System.out.println(ele);
	}
}
}
