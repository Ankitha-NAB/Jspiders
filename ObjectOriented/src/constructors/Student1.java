package constructors;

public class Student1 {
	Student1(int age){
		this(5.8);
		System.out.println("Age: "+age);
	}
	Student1(String name){
		this(21);
		System.out.println("Name: "+name);
	}
	Student1(double height){
		System.out.println("Height: "+height);
	}

	public static void main(String[] args) {
		new Student1("Prateek");

	}

}
