package abstraction;
abstract class Money{
	abstract void give(int amount);
	abstract void enjoyed(int amount);
}
class Son extends Money{
	int amount;
	@Override
	void give(int amount) {
		System.out.println("Parents will give "+amount+ " to their son");
	}
	void enjoyed(int amount) {
		System.out.println("son enjoyed "+amount+" rupees");
	}
}

public class MainClass {

	public static void main(String[] args) {
		Money m=new Son();
		m.give(1000);
		m.enjoyed(1000);
	}

}
