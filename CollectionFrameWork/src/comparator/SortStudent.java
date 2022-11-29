package comparator;

import java.util.TreeSet;

public class SortStudent {
public static void main(String[] args) {
	Student s1=new Student(24,"B");
	Student s2=new Student(20,"C");
	Student s3=new Student(21,"A");
	SortStudentByAge age=new SortStudentByAge();
	SortStudentByName name=new SortStudentByName();
	TreeSet<Student> t=new TreeSet<Student>(name);
	t.add(s1);
	t.add(s2);
	t.add(s3);
	for(Student std:t) {
		System.out.println(std);
	}
}
}
