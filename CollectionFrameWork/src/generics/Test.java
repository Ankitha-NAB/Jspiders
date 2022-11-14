package generics;
import java.util.*;

public class Test {
public static void main(String[] args) {
	int a=10;
	double b=1.8;
	ArrayList l=new ArrayList();
	l.add(a);//l.add(new Integer(10)
	l.add(b);//l.add(new Double(1.8)
	l.add('A');//l.add(new Character('A')
	
	//UPCASTING OR GENERALIZATION
	for(Object obj:l) {
		//Object obj=new Integer(10)
		//Object obj=new Double(1.8)
		//Object obj=new Character('A')
		System.out.println(obj);
	}
}
}
