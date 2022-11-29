package iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Age:"+age;
	}
}
public class TraversingStuObjects {
	
public static void main(String[] args) {
	Student s1=new Student("A",22);
	Student s2=new Student("C",21);
	Student s3=new Student("B",19);
	ArrayList<Student> l=new ArrayList<Student>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	//step1
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	System.out.println("------------");
	//step2
	for(Student i:l) {
		System.out.println(i);
	}
	System.out.println("------------");
	//step3
	Iterator<Student> i=l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
