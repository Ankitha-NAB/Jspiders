package stack;

import java.util.Stack;

public class RevEleIntArray {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		int[] a= {10,20,30};
		for(int i:a) {
			s.push(i);
		}
		System.out.println(s);
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
	}


}
