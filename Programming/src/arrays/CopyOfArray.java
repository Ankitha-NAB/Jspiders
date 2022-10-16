package arrays;
import java.util.Scanner; 
 
public class CopyOfArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements are:");
	int a[]=new int[size];
	int b[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("----Entered Array elements----");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println("----Copy of an array-----");
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
		System.out.println(b[i]+" ");
	}
}
}
