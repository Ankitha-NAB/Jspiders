package object;
class Sample5 {
	int x=10;
	int y=20;
	void test() {
		System.out.println("running test() method");
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Sample5 d1=new Sample5();
		System.out.println("d1 ---> "+d1);
		Sample5 d2=d1;//copy d1 to d2
		System.out.println("d2---> "+d2);
		d2.x=100;
		d2.y=200;
		System.out.println("x value in object is: "+d1.x);
		System.out.println("y value in object is: "+d1.y);
		System.out.println("main method ended");

	}

}
