package polymerphism;

//	COMPILE TIME POLYMORPHISM

class Mynthra{
	void purchase(String product) {
		System.out.println("product: "+product);
	}
	void purchase(int cost) {
		System.out.println("cost: "+cost);
	}
	void purchase(String product,int cost) {
		System.out.println("product: "+product+" cost: "+cost);
	}
	void purchase(int cost,String product) {
		System.out.println("cost:"+cost+" product:"+product);
	}
}

public class Customer {

	public static void main(String[] args) {
		Mynthra m=new Mynthra();
		m.purchase("headphone");
		m.purchase("headphones",1200);
		m.purchase(12000);
		m.purchase(4000,"cloth");

	}

}
