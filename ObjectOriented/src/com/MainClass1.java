package com;
class GraphPoint{
	//attributes
	double xaxis;
	double yaxis;
	//behavior
	void display() {
		System.out.println("("+ xaxis + ","+yaxis+")");
	}
}
public class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		GraphPoint p1=new GraphPoint();
		p1.xaxis=3.2;
		p1.yaxis=4.5;
		p1.display();
		GraphPoint p2=new GraphPoint();
		p2.xaxis=9.8;
		p2.yaxis=1.3;
		p2.display();
		System.out.println("main method ended");


	}

}