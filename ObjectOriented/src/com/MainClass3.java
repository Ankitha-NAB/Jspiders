package com;
class BankAccount{
	double acc_bal=10000.00;
	void deposit(int n) {
		System.out.println("deposit "+n+" amount");
		if (n<=acc_bal) {
			acc_bal=acc_bal-n;
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
	}
	void withdraw(int n) {
		System.out.println("cancelling "+n+" amount");
		acc_bal=acc_bal+n;
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		BankAccount b1=new BankAccount();
		System.out.println("total amount available: "+b1.acc_bal);
		b1.deposit(2000);
		System.out.println("total amount available: "+b1.acc_bal);
		b1.withdraw(5000);
		System.out.println("total amount available: "+b1.acc_bal);
		System.out.println("main method ended");

	}

}
