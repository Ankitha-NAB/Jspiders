package object;
class Demo{
	static int x=10;
	static void test() {
		System.out.println("runninf test() function");
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("x value is: "+Demo.x);
		Demo.test();
		System.out.println("modifying static variable x value");
		Demo.x=20;
		System.out.println("x value is: "+Demo.x);
		System.out.println("main method ended");

	}

}
