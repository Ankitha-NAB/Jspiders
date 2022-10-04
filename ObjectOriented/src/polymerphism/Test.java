package polymerphism;

//RUN TIME POLYMORPHISM
class Employee{
	void work() {
		System.out.println("employee is working");
	}
}
class Developer extends Employee{
	@Override
	void work() {
		System.out.println("developer is developing app");
	}
}
class Tester extends Employee{
	@Override
	void work() {
		System.out.println("tester will test the app");
	}
}

public class Test {

	public static void main(String[] args) {
		Employee e=new Developer();
		e.work();
		Employee e1=new Tester();
		e1.work();
	}

}
