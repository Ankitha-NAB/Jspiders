package comparator;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
}
