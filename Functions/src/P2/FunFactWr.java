package P2;

public class FunFactWr {
	static int Factorial() {
		int n=5,fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial: "+fact);
		return fact;
	}
	public static void main(String[] args) {
		
		Factorial();
	}

}