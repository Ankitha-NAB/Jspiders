package generics;
import java.util.*;

public class Student {
int age;
String name;
Student(int age,String name){
	this.age=age;
	this.name=name;
}
@Override
public String toString() {
	return name+" is "+age+" years old";
}
}
