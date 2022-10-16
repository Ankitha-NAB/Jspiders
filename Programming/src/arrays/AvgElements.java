package arrays;
import java.util.Scanner;
public class AvgElements {
public static void main(String[] args) {
	int sum=0;int avg=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements: ");
	int a[]=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	/* System.out.println("entered elements are: ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
	*/
	System.out.println("----Avg of elements----");
	for(int i=0;i<a.length;i++) {
		sum+=a[i];
		avg=sum/a.length;
	}
	/*System.out.println(sum);
	System.out.println("---Average of an elements---");
	for(int i=0;i<a.length;i++) {
		avg=sum/a.length;
	}*/
	System.out.println(avg);
}
}
