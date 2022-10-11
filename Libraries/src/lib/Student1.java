package lib;

//program after overriding toString()
public class Student1 {
	@Override
	public String toString() {
		return "Student@123";
	}

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);//implicitly calling toString()
		System.out.println(s.toString());//explicitly calling toString()
		System.out.println(new Student1());//implicitly calling toString()
		System.out.println(new Student1().toString());//explicitly calling toString()

	}

}
