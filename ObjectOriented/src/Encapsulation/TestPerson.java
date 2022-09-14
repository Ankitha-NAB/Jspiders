package Encapsulation;

public class TestPerson {

	public static void main(String[] args) {
		/* system.out.println(p.age);
		 * p.age=20;
		 */
		Person p=new Person();
		p.setAge(25);
		int age=p.getAge();
		System.out.println("Age: "+age);
		System.out.println(p.getAge());
	}

}
