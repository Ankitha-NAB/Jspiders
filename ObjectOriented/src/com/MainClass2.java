package com;

class TicketCounter{
	int total_tickets=100;
	void buy_tickets(int n) {
		System.out.println("buying "+n+" tickets");
		if(n<=total_tickets) {
			total_tickets=total_tickets-n;
			System.out.println("success");
		}else {
			System.out.println("failed");
		}
	}
	void return_tickets(int n) {
		System.out.println("cancelling "+n+" tickets");
		total_tickets=total_tickets+n;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TicketCounter tc1=new TicketCounter();
		System.out.println("total tickets available: "+tc1.total_tickets);
		tc1.buy_tickets(20);
		System.out.println("total tickets available: "+tc1.total_tickets);
		tc1.return_tickets(10);
		System.out.println("total tickets available: "+tc1.total_tickets);
		System.out.println("main method ended");

	}

}
