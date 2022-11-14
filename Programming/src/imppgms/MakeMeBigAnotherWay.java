package imppgms;
import java.util.*;

public class MakeMeBigAnotherWay {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();
	ArrayList<Integer> l=new ArrayList<Integer>();
	int rem=0;
	while(n!=0) {
		rem=n%10;
		l.add(rem);
		n=n/10;
	}
	Collections.sort(l);
	Collections.reverse(l);
	int ans=0;
	for(int i=0;i<l.size();i++) {
		ans=(ans*10)+l.get(i);
	}
	System.out.println(ans);
}
}
