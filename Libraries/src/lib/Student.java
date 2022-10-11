package lib;

//program without overriding toString()
public class Student {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);//implicitly calling toString()
		System.out.println(s.toString());//explicitly calling toString()

	}

}
