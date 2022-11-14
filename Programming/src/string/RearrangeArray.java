package string;
import java.util.Scanner;

public class RearrangeArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int[] arr=new int[sc.nextInt()];
	System.out.println("enter elements:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i+1;j<arr.length;j++) {
			sum=sum+arr[j];
		}
		if(arr[i]<sum) {
			arr[i]=sum;
		}
		}
	for(int i:arr) {
		System.out.println(i+" ");
	}
	
}
}
