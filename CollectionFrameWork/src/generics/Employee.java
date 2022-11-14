package generics;

public class Employee {
String name;
double salary;
Employee(String name,double salary){
	this.name=name;
	this.salary=salary;
}
@Override
public String toString() {
	return name+" got "+salary+"rs salary";
}
}
