package arraylist;
import java.util.*;

public class Test {
public static void main(String[] args) {
	// internally array gets created based on default initial capacity(10)
	ArrayList a=new ArrayList(10);
	// internally array gets created based on custom intial capacity(50)
	ArrayList b=new ArrayList(50);
	ArrayList x=new ArrayList();
	x.add(10);
	x.add(30);
	//adding one collection into another collection
	ArrayList y=new ArrayList(x);
	y.add(20);
	System.out.println(x);
	System.out.println();
	
}
}
