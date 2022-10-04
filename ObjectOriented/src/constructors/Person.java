package constructors;

public class Person {
	int age;
	String name;
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		Person p1=new Person(22,"Prateek");
		Person p2=new Person(21,"Ankitha");
		System.out.println("Person details");
		System.out.println("---------");
		System.out.println("Name: "+p1.name+" age: "+p1.age);
		System.out.println("Name: "+p2.name+" age: "+p2.age);

	}

}
