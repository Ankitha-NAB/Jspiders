package Inheritance;

class Father{
	int age=45;
}

class Son extends Father{
	String name="Tom";
}

public class Test {

	public static void main(String[] args) {
		Son s=new Son();
		System.out.println("Father's age: "+s.age);
		System.out.println("Son's name: "+s.name);

	}

}
