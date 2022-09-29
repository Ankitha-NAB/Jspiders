package typecasting;
class Employee{
	void work() {
		System.out.println("Employee is working");
	}
}
class Developer extends Employee{
	void work() {
		System.out.println("Developer is working");
	}
}
class Tester extends Employee{
	void work() {
		System.out.println("Tester is working");
	}
}
class Hr extends Employee{
	void work() {
		System.out.println("Hr is working");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		Employee e=new Developer();
		Employee e1=new Tester();
		Employee e2=new Hr();
		e.work();
		e1.work();
		e2.work();

	}

}
