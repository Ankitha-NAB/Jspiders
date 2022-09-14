package MethodOverriding;

class Employee{
	void work() {
		System.out.println("Employee is working");
	}
}

class Developer extends Employee{
	@Override
	void work() {
		super.work();
		System.out.println("Developer is going to develop app");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Developer d=new Developer();
		d.work();

	}

}
