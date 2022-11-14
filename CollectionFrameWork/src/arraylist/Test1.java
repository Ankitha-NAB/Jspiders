package arraylist;
import java.util.*;

public class Test1 {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add(10);
	l.add("anku");
	l.add(true);
	//forward direction
	for(int i=0;i<l.size();i++) {
		System.out.print(l.get(i)+" ");
	}
	System.out.println("\n------------");
	//reverse direction
	for(int i=l.size()-1;i>=0;i--) {
		System.out.print(l.get(i)+" ");
}
}
}
