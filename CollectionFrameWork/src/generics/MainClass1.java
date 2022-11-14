package generics;
import java.util.*;

public class MainClass1 {
public static void main(String[] args) {
	LinkedList<Employee> l=new LinkedList<Employee>();
	l.add(new Employee("Anku",50000.00));
	l.add(new Employee("Prateek",70000.00));
	l.add(new Employee("Prashant",80000.00));
	for(Employee e:l) {
		System.out.println(e);
	}
}
}
