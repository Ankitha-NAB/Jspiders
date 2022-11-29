package iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Traversing {
public static void main(String[] args) {
	LinkedList<Double> l=new LinkedList<Double>();
	l.add(5.6);
	l.add(2.3);
	l.add(4.8);
	//step1
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	System.out.println("----------");
	//step2
	for(Double i:l) {
		System.out.println(i);
	}
	System.out.println("-----------");
	//step3
	Iterator<Double> i=l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
