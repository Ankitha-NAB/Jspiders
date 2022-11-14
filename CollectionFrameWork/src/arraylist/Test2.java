package arraylist;
import java.util.*;

public class Test2 {
public static void main(String[] args) {
	ArrayList x=new ArrayList();
	x.add(10);
	x.add(20);
	LinkedList y=new LinkedList();
	y.addAll(x);
	y.add(30);
	System.out.println(y.containsAll(x));
	System.out.println(y);
	y.removeAll(x);
	System.out.println(y);
}
}
