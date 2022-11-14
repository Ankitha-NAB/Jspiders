package sorting;
import java.util.Scanner;

public class StringBasedSort {
	static void strSort(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				}
			}
		}
		for(char ele:arr) {
			System.out.print(ele+" ");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char[] arr=s.toCharArray();
	strSort(arr);
}
}
