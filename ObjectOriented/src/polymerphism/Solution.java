package polymerphism;

//COMPILE TIME POLYMORPHISM
class Emp{
	void work(String name) {
		System.out.println("Employee name is "+name);
	}
	void work() {
		System.out.println("NAB will work conistently");
	}
	void work(double salary) {
		System.out.println("NAB will get salary: "+salary);
	}

}

public class Solution {
	public static void main(String[] args) {
		Emp e=new Emp();
		e.work("NAB");
		e.work();
		e.work(10000);
		
		
	}
}
