package association;

class College{
	String name="Jspiders";
	Department dept=new Department();
}
class Department{
	String name="CSE";
	Student stu=new Student();
}
class Student{
	String name="Anku";
}
public class MainClass{
	public static void main(String[] args) {
		College college=new College();
		System.out.println(college);
		System.out.println("College name:"+college.name);
		System.out.println(college.dept);
		System.out.println("Department name:"+college.dept.name);
		System.out.println(college.dept.stu);
		System.out.println("Student name:"+college.dept.stu.name);
	}
}