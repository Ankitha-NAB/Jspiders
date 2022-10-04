package interfaceprogramming;
interface Employee{
	int id=101;//public static final int id=101;
	void work();//public abstract void work();
}

public class Jerry implements Employee {
	@Override
	public void work() {
		System.out.println("Jerry is working");
	}
	public static void main(String[] args) {
		System.out.println("ID: "+Employee.id);
		Jerry j=new Jerry();
		j.work();

	}

}
