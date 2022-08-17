package object;
class Sample3 {
	int x=10;
	int y=20;
	void test() {
		System.out.println("running test() method");
	}
}

public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Sample3 d1=new Sample3();
		Sample3 d2=new Sample3();
		System.out.println("x value in first object: "+d1.x);
		System.out.println("y value in first object: "+d1.y);
		d1.test();
		System.out.println("x value in second object: "+d2.x);
		System.out.println("y value in second object: "+d2.y);
		d2.test();
		System.out.println("modifying x and y value in first object");
		d1.x=100;
		d1.y=200;
		System.out.println("x value in first object: "+d1.x);
		System.out.println("y value in first object: "+d1.y);
		System.out.println("x value in second object: "+d2.x);
		System.out.println("y value in second object: "+d2.y);
		System.out.println("main method ended");
		
		

	}

}
