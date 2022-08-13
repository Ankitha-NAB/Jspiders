package P2;

public class FunFactWpWr {
	static int Factorial(int n,int fact) {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial: "+fact);
		return fact;
	}
	public static void main(String[] args) {
		
		Factorial(5,1);
	}

}
