package p;

public class MatrimonyPortal {

	public static void main(String[] args) {
		char gender='M';
		int age=22;
		if (gender=='M') {
			System.out.println("gender is male");
			if(age>=21) {
				System.out.println("you can get married");
			}
			else {
				System.out.println("you cannot get married");
			}
		}
		else if(gender=='F') {
			System.out.println("gender is female");
			if(age>=18) {
				System.out.println("you can get married");
			}
			else {
				System.out.println("ypu cannot get married");
			}
		}
		else {
			System.out.println("invalid");
		}
		

	}

}
