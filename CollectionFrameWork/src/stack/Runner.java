package stack;

import java.util.Stack;

public class Runner {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push("hi");
		s.push(20.5);
		for(Object obj:s) {
			System.out.println(obj);
		}
		System.out.println("-----------");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}

