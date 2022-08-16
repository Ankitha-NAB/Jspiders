package object;
class sample1{
	static int x=20;
	int y=10;
	static void test() {
		System.out.println("running test() function");
	}
	void display() {
		System.out.println("running display() function");
	}
}

public class StaticAndNonStatic {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("x value is: "+sample1.x);
		sample1.test();
		System.out.println("y value is: "+new sample1().y);
		new sample1().display();
		System.out.println("main method ended");
		

	}

}
