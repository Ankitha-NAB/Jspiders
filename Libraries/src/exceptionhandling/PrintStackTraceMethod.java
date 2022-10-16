package exceptionhandling;

public class PrintStackTraceMethod {
public static void main(String[] args) {
	System.out.println("start");
	try {
		System.out.println(10/0);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("end");
}
}


//this method is used to print the whole information about the exception
/* printStackTrace() prints
1. Exception name
2. line number
3. message about the exception */