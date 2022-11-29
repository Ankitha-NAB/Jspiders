package comparable;

public class Employee implements Comparable<Employee> {
	String name;
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Salary:"+salary;
	}
	@Override
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}

}
