package com;

class AppRegistration{
	String username;
	long phone;
	String emailid;
	String password;
	
	AppRegistration(String arg1,long arg2,String arg3){
		username=arg1;
		phone=arg2;
		password=arg3;
	}
	
	AppRegistration(String arg1,String arg2,String arg3){
		username=arg1;
		emailid=arg2;
		password=arg3;
	}
	
	void details() {
		System.out.println("username: "+username+" phone: "+phone+" emailid: "+emailid+" password: "+password);
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		AppRegistration reg1=new AppRegistration("Shanmukha",27181920l,"shan@123");
		AppRegistration reg2=new AppRegistration("Pankaja","pank@gmail.com","pank@123");
		reg1.details();
		reg2.details();

	}

}

