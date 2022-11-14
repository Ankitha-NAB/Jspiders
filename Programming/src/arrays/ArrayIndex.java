package arrays;
import java.util.Scanner;

public class ArrayIndex {
	static int findingIndex(int[] a,int key) {
		int keyIndex=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				keyIndex=i;
				break;
			}
		}
		return keyIndex;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size:");
	int size=sc.nextInt();
	System.out.println("enter the elements:");
	int[] a=new int[size];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("enter the key element:");
	int key=sc.nextInt();
	System.out.println(findingIndex(a,key));
}
}
