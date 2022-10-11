package inheritanceprogramming;
class Pappa{
	void reponsibility() {
		System.out.println("child can learn responsibilty from father");
	}
}
class Mom extends Pappa{
	void love() {
		System.out.println("child can learn love from mother");
	}
}
class Child extends Pappa{
	void behave() {
		System.out.println("child can behave like good manner");
	}
}
public class Solution {

	public static void main(String[] args) {
		Mom m=new Mom();
		m.love();
		Child c=new Child();
		c.behave();
		

	}

}
