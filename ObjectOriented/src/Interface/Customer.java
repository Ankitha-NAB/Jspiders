package Interface;
interface PhonePay{
	void Payment();
}

interface Mythra extends PhonePay{
	void Purchase();
}

public class Customer implements Mythra {
	@Override
	public void Purchase() {
		System.out.println("Purchasing some cloths");
	}
	@Override
	public void Payment() {
		System.out.println("Paying through phonepay");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.Purchase();
		c.Payment();

	}

}
