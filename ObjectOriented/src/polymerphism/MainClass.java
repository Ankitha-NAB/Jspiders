package polymerphism;

class Teacher{
	void display() {
		System.out.println("Teacher is so cute");
	}
}
class Student extends Teacher{
	void display() {
		System.out.println("Teacher will give work to the student");
		System.out.println("Student will work on it");
	}
}
class Grade extends Teacher{
	void display() {
		System.out.println("Grade will given by the teacher to the student");
	}
}
public class MainClass {
public static void main(String[] args) {
	Teacher t=new Student();
	Teacher t1=new Grade();
	t.display();
	t1.display();
}
}
