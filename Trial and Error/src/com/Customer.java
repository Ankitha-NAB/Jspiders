package com;


public class Customer {
	public static void main(String[] args) {
		Customer c=new Customer("prateek");
		Customer c1=new Customer("Prateek",123);


	}
	String id;
	int password;

	Customer(String id){
		this.id=id;
		System.out.println("ID: "+id);
	}
	Customer(String id,int password){
		this.password=password;
		System.out.println("Password: "+password);
	}

	abstract class Cust{
		void Payment() {
			System.out.println("paying through phonepay");
		}
		abstract class Cust1 extends Cust{
			void payment(){
				super.Payment();
				System.out.println("paying through Gpay");
			}
		}
		abstract class Cust2 extends Cust1{
			void payment() {
				super.Payment();
				System.out.println("paying through slicepay");
			}
		}
		abstract class Cust3 extends Cust2{
			void payment() {
				super.Payment();
				System.out.println("paying through bheempay");
			}
		}
		

	}
}
