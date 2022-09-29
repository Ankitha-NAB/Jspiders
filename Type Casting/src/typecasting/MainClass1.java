package typecasting;
class Vehicle{
	String brand="BMW";
	void start() {
		System.out.println("vehicle started");
	}
}
class Car extends Vehicle{
	Double cost=50000.00;
	void stop() {
		System.out.println("vehicle stopped");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Vehicle v=new Car();
		System.out.println(v.brand);
		v.start();

		Car c=(Car)v;
		System.out.println(c.brand+" "+c.cost);
		c.stop();
	}
}
