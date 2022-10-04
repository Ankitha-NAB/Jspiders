package abstraction;
interface Calculator{
	void add(int a,int b);
	void mul(int c,int d);
}
class CalculatorImpl implements Calculator{
	@Override
	public void add(int a,int b) {
		System.out.println("Sum of "+a+" & "+b+" is "+(a+b));
	}
	@Override
	public void mul(int c,int d) {
		System.out.println("Product of "+c+" & "+d+" is "+(c*d));
	}
}

public class Solution {

	public static void main(String[] args) {
		Calculator c=new CalculatorImpl();
		c.add(10, 20);
		c.mul(5, 4);

	}

}
