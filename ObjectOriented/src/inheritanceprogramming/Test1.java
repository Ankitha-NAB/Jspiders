package inheritanceprogramming;

class Vehicle{
	String brand="BMW";
}

class Car extends Vehicle{
	int cost=45000;
	void start() {
		System.out.println("car started");
	}
}

class Bike extends Car{
	String fuel="Petrol";
	void stop() {
		System.out.println("bike stopped");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.brand+" "+c.cost);
		c.start();
		Bike b=new Bike();
		System.out.println(b.brand+" "+b.fuel);
		b.stop();

	}

}
