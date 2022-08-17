package object;
class Sample4 {
	int x=10;
	int y=20;
	void test() {
		System.out.println("running test() method");
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Sample4 d1=new Sample4();
		System.out.println("d1 ---> "+d1);
		System.out.println("x value in first object: "+d1.x);
		System.out.println("y value in first object: "+d1.y);
		d1.x=100;
		d1.y=200;
		d1=new Sample4();//re initialization
		System.out.println("d1---> "+d1);
		System.out.println("x value is: "+d1.x);
		System.out.println("y value is: "+d1.y);
		System.out.println("main method ended");

	}

}
