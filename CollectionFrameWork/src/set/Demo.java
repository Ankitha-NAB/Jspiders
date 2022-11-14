package set;
import java.util.*;

public class Demo {
public static void main(String[] args) {
	//hashset does not maintain insertion order
	HashSet hs=new HashSet();
	hs.add(100);
	hs.add("java");
	hs.add(null);
	hs.add(100);
	hs.add(true);
	System.out.println("Size:"+hs.size());
	for(Object obj:hs) {
		System.out.println(obj);
	}
	System.out.println("------------");
	//linkedhashset maintains insertion order
	LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
	lhs.add(100);
	lhs.add(200);
	lhs.add(100);
	lhs.add(300);
	for(Object obj:lhs) {
		System.out.println(obj);
	}
}
}
