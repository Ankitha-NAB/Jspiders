package P2;

public class FunFactWp {
	static void Factorial(int n,int fact) {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial: "+fact);
	}
	public static void main(String[] args) {
		Factorial(5,1);

	}

}
