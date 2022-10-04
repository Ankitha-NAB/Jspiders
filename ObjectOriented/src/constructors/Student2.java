package constructors;

//example for constructor overloading and chaining

public class Student2 {
	int age;
	String name;
	Student2(int age){
		this.age=age;
	}
	Student2(int age,String name){
		this(age);
		this.name=name;
	}

	public static void main(String[] args) {
		Student2 s=new Student2(21);
		Student2 s1=new Student2(22,"Prateek");
		System.out.println("Age: "+s.age+" Name: "+s.name);
		System.out.println("Age: "+s1.age+" Name: "+s1.name);

	}

}
