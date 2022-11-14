package imppgms;
import java.util.*;

public class MaxTimeOccuringWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string:");
	//String s="hello hi hello hi bye hello hi";
	String s=sc.nextLine();
	String[] a1=s.split(" ");
	String[] a2=s.split(" ");
	int max=0;
	int min=a1.length;
	String ans1="";
	String ans2="";
	for(int i=0;i<a2.length;i++) {
		int c=0;
		for(int j=0;j<a2.length;j++) {
			if(a1[i].equals(a2[j])) {
				c++;
				a2[j]="";
			}
		}
		if(c>0 && c>max) {
			max=c;
			ans1=a1[i];
		}
		if(c>0 && c<min) {
			min=c;
			ans2=a1[i];
		}
	}
	System.out.println("most repeated:"+ans1);
	System.out.println("least repeated:"+ans2);
}
}
