package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingObjects {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	//step1
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	System.out.println("-----------");
	//step2
	for(int i:l) {
		System.out.println(i);
	}
	System.out.println("-----------");
	//step3
	Iterator<Integer> i=l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
