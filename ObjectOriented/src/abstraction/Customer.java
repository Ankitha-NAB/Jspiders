package abstraction;

interface Amazon{
	void purchase();
	void buy();
	void offer();
	void deliver();
}

class Man implements Amazon{
	@Override
	public void purchase() {
		System.out.println("Person purchasing things");
	}
	public void buy() {
		System.out.println("Person buying some clothes for festival");
	}
	public void offer() {
		System.out.println("Due to dasara festival amazon will give offer on clothes");
	}
	public void deliver() {
		System.out.println("Amazon pepole will deliver things at a time");
	}
}

public class Customer {

	public static void main(String[] args) {
		Amazon a=new Man();
		a.purchase();
		a.buy();
		a.deliver();
		a.offer();
	}

}
