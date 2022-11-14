package exceptionhandling;
import java.util.Scanner;

/* This program is example of custom or user defined exception that means any exception
 * which the user will create explicitly
 */
class InsufficientBalanceException extends RuntimeException{
	private String message;
	InsufficientBalanceException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}


public class Atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		System.out.println("enter the amount to be withdrawn:");
		int amount=sc.nextInt();
		if(amount<=balance) {
			System.out.println("amount withdrawn successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("insuficient funds");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
