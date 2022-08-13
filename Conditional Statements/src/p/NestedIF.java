package p;

public class NestedIF {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		if(a>=b) {
			if(a>b) {
				System.out.println(a+" is greater than  "+b);
			}
			else {
				System.out.println(a+" is smaller than  "+b);
			}
		}
		else {
			System.out.println(a+" is equals to  "+b);
		}

	}

}
