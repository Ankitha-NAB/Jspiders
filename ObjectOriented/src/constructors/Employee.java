package constructors;

public class Employee extends Person1{
	double salary;
	Employee(int id,String name,double salary){
		super(id,name);
		this.salary=salary;
	}
}
