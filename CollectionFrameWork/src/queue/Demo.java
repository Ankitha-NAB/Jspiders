package queue;
import java.util.*;

public class Demo {
public static void main(String[] args) {
	Queue<Integer> q=new PriorityQueue<Integer>();
	q.add(10);
	q.add(20);
	q.add(30);
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	q.clear();
	System.out.println(q.isEmpty());
	System.out.println(q.poll());
}
}
//poll() is returns and removes the head element