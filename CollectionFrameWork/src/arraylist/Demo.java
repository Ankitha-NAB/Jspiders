package arraylist;
import java.util.*;

public class Demo {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(100);
	l.add("Hello");
	l.add(false);
	l.add(100);
	l.add(null);
	System.out.println(l);
	System.out.println(l.get(1));
	System.out.println(l.size());
	System.out.println(l.contains("Hello"));
	System.out.println("-------------");
	System.out.println(l);
	l.remove(1);
	System.out.println(l);
	System.out.println("-------------");
	System.out.println(l.isEmpty());
	l.clear();
	System.out.println(l.isEmpty());
}
}
