package set;
import java.util.*;

public class Test {
public static void main(String[] args) {
	//treeset allows natural sorting order
	//it not allow sorting order
	TreeSet<Integer> t=new TreeSet<Integer>();
	t.add(30);
	t.add(20);
	t.add(40);
	t.add(30);
	t.add(50);
	t.add(10);
	for(int i:t) {
		System.out.println(i);
	}
}
}
