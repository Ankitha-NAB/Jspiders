package linkedlist;
import java.util.*;

public class Test {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(12);
	l.add(28);
	l.add(35);
	System.out.println(l);
	l.set(2, 77);
	System.out.println(l);
}
}


/* if there is inserting nd deleting the ele v choose linkedlist bcoz in linkedlist v don't have shifting of elements 
 * but in arraylist v have shifting of elements it will reduce the efficiency that's y v choose likedlist
*/

/* if there is only storing nd returning the ele v choose arraylist bcoz arraylist follows squential format nd it is 
faster compare to linkedlist
*/