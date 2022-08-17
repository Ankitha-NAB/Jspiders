package object;
class Sample2{
	int x=10;
	int y=20;
	void test() {
		System.out.println("running test() method");
	}
}

public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Sample2 d1;
		d1=new Sample2();
		System.out.println("x value is: "+d1.x);
		d1.test();
		Sample2 d2;
		d2=new Sample2();
		System.out.println("x value is: "+d2.x);
		d2.test();
		System.out.println("main method ended");
		
		

	}

	

}
