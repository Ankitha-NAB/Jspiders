package comparable;

import java.util.TreeSet;

public class SortEmployee {
public static void main(String[] args) {
	Employee e1=new Employee("C",50000.00);
	Employee e2=new Employee("A",30000.00);
	Employee e3=new Employee("B",70000.00);
	TreeSet<Employee> t=new TreeSet<Employee>();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	for(Employee e:t) {
		System.out.println(e);
	}
			
}
}
