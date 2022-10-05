package typecasting;
class A{
	String name="NAB";
	void display() {
		System.out.println("name is: "+name);
	}
}
class Person extends A{
	int age=22;
	void display() {
		System.out.println("age of the person is "+age);
	}
}

public class Test1 {
public static void main(String[] args) {
	A a=new Person();
	System.out.println(a.name);
	a.display();
	Person p=(Person)a;
	System.out.println(p.name+" "+p.age);
	p.display();
}
}
