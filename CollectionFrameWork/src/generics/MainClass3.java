package generics;
import java.util.*;

public class MainClass3 {
public static void main(String[] args) {
	ArrayList<Car> l=new ArrayList<Car>();
	l.add(new Car("BMW",15000));
	l.add(new Car("ferari",2000));
	for(Car c:l) {
		System.out.println(c);
	}
}
}
