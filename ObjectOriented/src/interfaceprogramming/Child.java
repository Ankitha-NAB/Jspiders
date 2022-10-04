package interfaceprogramming;
interface Family{
	int money=1000;
	void pocketMoney();
}
interface Relatives extends Family{
	String talk="Relatives are very bad";
	void worstRelatives();
}
interface Friends extends Relatives{
	String tell="Some friends are fake :(";
	void frendshipFake();
}

public class Child implements Friends {
	@Override
	public void pocketMoney() {
		System.out.println("sometimes family gives pocketmoney");
	}
	@Override
	public void worstRelatives() {
		System.out.println("relatives are always worst they are useless......");
	}
	@Override
	public void frendshipFake() {
		System.out.println("some friends are fake and they will not help when we need...");
	}

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("Family gives me "+money);
		c.pocketMoney();
		System.out.println("All will talk like "+talk);
		c.worstRelatives();
		System.out.println("I'll tell "+tell);
		c.frendshipFake();
		

	}

}
