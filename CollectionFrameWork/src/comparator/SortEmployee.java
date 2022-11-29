package comparator;

import java.util.TreeSet;

public class SortEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(10,"C",5000.00);
	Employee e2=new Employee(20,"A",3000.00);
	Employee e3=new Employee(30,"B",6000.00);
	SortEmployeeById id=new SortEmployeeById();
	SortEmployeeByName name=new SortEmployeeByName();
	SortEmployeeBySalary salary=new SortEmployeeBySalary();
	TreeSet<Employee> t=new TreeSet<Employee>(SortEmployeeBySalary);
	t.add(e1);
	t.add(e2);
	t.add(e3);
	for(Employee emp:t) {
		System.out.println(emp);
	}
	
}
}
