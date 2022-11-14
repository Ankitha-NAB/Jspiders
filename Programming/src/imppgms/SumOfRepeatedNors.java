package imppgms;
import java.util.*;

public class SumOfRepeatedNors {
	public static void main(String[] args) {
		int[] a1= {10,3,4,7,3,4,9,6,7};
		int[] a2=a1;
		int sum=0;
		for(int i=0;i<a1.length;i++) {
			int c=0;
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					c++;
					a2[j]=0;
				}
			}
			if(c>1) {
				sum=sum+a1[i];
			}

		}
		System.out.println(sum);
	}
}
