package encapsulations;
class Employee{
	private double salary;
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setSalary(15000);
		double salary=e.getSalary();
		System.out.println("salary: "+salary);
		System.out.println(e.getSalary());

	}

}
