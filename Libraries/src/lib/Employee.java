package lib;

public class Employee {
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Empid of "+name+" is "+id;
	}
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Ankitha");
		Employee e2=new Employee(102,"Prateek");
		Employee e3=new Employee(103,"Prashanth");
		Employee[] emp= {e1,e2,e3};
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}
	}
}
