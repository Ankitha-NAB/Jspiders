package polymerphism;
//RUN TIME POLYMORPHISM

class FoodDelivery{
	void orderFood() {
		System.out.println("ordering food");
	}
}
class Swiggy extends FoodDelivery{
	@Override
	void orderFood() {
		System.out.println("ordering food on swiggy");
	}
}
class Zomato extends FoodDelivery{
	@Override
	void orderFood() {
		System.out.println("ordering food on zomato");
	}
}

public class Mobile {
	//generalization
	static void selectApp(FoodDelivery f) {
		f.orderFood();
	}

	public static void main(String[] args) {
		/* FoodDelivery f=new Zomato();
		f.orderFood();
		FoodDelivery f1=new Swiggy();
		f1.orderFood();
		 */
		selectApp(new Swiggy());
		selectApp(new Zomato());
	}

}
