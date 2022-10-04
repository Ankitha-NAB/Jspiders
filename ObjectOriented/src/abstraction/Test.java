package abstraction;
abstract class Person{
	abstract void eat();
}
class Tom extends Person{
	@Override
	void eat() {
		System.out.println("tom is eating");
	}
}
public class Test {

	public static void main(String[] args) {
		Person p=new Tom();
		p.eat();
	}

}
