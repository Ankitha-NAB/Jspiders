package sorting;
import java.util.Scanner;

public class ThirdLargest {
	static void thirdLarge(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		if(arr.length>=3) {
			System.out.println(arr[2]);
		}
		else {
			System.out.println("-1");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	thirdLarge(arr);
}
}
