package imppgms;
import java.util.*;

/*
	input=518		input2=6507
	output=851		output2=7650
*/
public class MakeMeBig {
	static int mmb(int n) {
		int c=0;int n1=n;
		while(n!=0) {
			c++;
			n=n/10;
		}
		int[] a=new int[c];
		int rem=0;
		for(int i=0;i<c;i++) {
			rem=n1%10;
			a[i]=rem;
			n1=n1/10;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int ans=0;
		for(int i=0;i<a.length;i++) {
			ans=(ans*10)+a[i];
		}
		return ans;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();
	System.out.println(mmb(n));
}
}
