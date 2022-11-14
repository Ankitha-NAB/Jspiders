package exceptionhandling;
import java.util.Scanner;

class InvalidPasswordException extends InterruptedException{
	private String message;
	InvalidPasswordException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}

public class EmailCreation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int password=1234567;
	System.out.println("enter the password:");
	int userpassword=sc.nextInt();
	if(userpassword==password) {
		System.out.println("login succesfully");
	}
	else {
		try {
			throw new InvalidPasswordException("try again");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
