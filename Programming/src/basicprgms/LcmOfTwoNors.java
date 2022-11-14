package basicprgms;
import java.util.Scanner;

public class LcmOfTwoNors {
static int gcd(int u,int v) {
	if(u==0)
		return v;
	return gcd(v%u,u);
}
static int lcm(int u,int v) {
	return (u/gcd(u,v))*v;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter u:");
int u=sc.nextInt();
System.out.println("enter v:");
int v=sc.nextInt();
System.out.println("LCM of "+u+" and "+v+" is "+lcm(u,v));
}
}
