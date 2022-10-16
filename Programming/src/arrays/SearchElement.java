package arrays;
import java.util.Scanner;
public class SearchElement {
public static void main(String[] args) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements:");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("---Array elements---");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println("enter searching element: ");
	int n=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			count++;
		}
	}
	if(count>0) {
		System.out.println("item found "+count+" times");
	}
	else {
		System.out.println("item not found");
	}

}
}
