package association;


class Company{
	String name;
	Employee employee;
	Company(String name,Employee employee){
		this.name=name;
		this.employee=employee;
	}
}
class Employee{
	String name;
	Car car;
	Employee(String name,Car car){
		this.name=name;
		this.car=car;
	}
}
class Car{
	String brand;
	String color;
	double cost;
	Car(String brand,String color,double cost){
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
}
public class MainClass3 {
public static void main(String[] args) {
	Car car=new Car("BMW","Black",500000.00);
	Employee employee=new Employee("Ankitha",car);
	Company company=new Company("Bosch",employee);
	System.out.println(company.name);
	System.out.println(company.employee.name);
	System.out.println(company.employee.car.brand);
}
}
