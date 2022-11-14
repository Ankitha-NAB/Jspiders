package vector;
import java.util.*;

public class Runner {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(30);
	v.add(20);
	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
}
}
