package generics;
import java.util.*;

public class MainClass {
public static void main(String[] args) {
	Student s1=new Student(22,"Anku");
	Student s2=new Student(20,"Bunny");
	Student s3=new Student(24,"Nikki");
	ArrayList<Student> l=new ArrayList<Student>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	//after overriding toString()
	for(Student s:l) {
		System.out.println(s);
	}
	System.out.println("----------");
	//without overriding toString()
	for(Student s:l) {
		System.out.println(s.name+" is "+s.age+" years old");
	}
}
}
