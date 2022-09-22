package Abstract;
abstract class Person{
	abstract void walk();
}

public class Tom extends Person {
	@Override
	void walk() {
		System.out.println("Tom is walikng");
	}

	public static void main(String[] args) {
		Tom t=new Tom();
		t.walk();
	}

}
