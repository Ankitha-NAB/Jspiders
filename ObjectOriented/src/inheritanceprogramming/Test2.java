package inheritanceprogramming;
class Duaghter{
	void collectingMoney() {
		System.out.println("duaghter is going to collect money");
	}
}
class Mother extends Duaghter{
	void givingMoney() {
		System.out.println("Mother is going to give money to the duaghter");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Mother m=new Mother();
		m.givingMoney();
		m.collectingMoney();

	}

}
