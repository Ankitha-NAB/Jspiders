package object;
class Pen{
	double price;
	String color;
	String brand;
}

public class MainClass5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Pen p1=new Pen();
		p1.price=50.00;
		p1.color="blue";
		p1.brand="cello";
		System.out.println("pen1 is having price of "+p1.price+" and it is a "+p1.color+" color and it is "+p1.brand+" branded");
		Pen p2=new Pen();
		p2.price=60.00;
		p2.color="black";
		p2.brand="reynolds";
		System.out.println("pen2 is having price of "+p2.price+" and it is a "+p2.color+" color and it is "+p2.brand+" branded");
		System.out.println("main method is ended");
	}

}
