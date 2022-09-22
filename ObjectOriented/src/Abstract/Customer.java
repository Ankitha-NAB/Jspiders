package Abstract;
abstract class Flipkart{
	abstract void order();
}

abstract class Paytm extends Flipkart{
	abstract void Payment();
}


public class Customer extends Paytm {
	@Override
	void order() {
		System.out.println("ordering mobile");
	}
	@Override
	void Payment() {
		System.out.println("Paying through paytm");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.order();
		c.Payment();

	}

}
