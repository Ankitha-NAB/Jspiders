package object;
class sample{
	int y=10;
	void display() {
		System.out.println("running display() function");
	}
}

public class NonStaticVariable {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("y value is: "+new sample().y);
		new sample().display();
		System.out.println("main method ended");

	}

}
