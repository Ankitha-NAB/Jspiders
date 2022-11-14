package generics;
import java.util.*;
class Students{
	String name;
	int marks;
	Students(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return name+" has scored "+marks+" marks";
	}
}

public class Solution {
public static void main(String[] args) {
	Students s1=new Students("Doremon",45);
	Students s2=new Students("Sizuka",50);
	Students s3=new Students("Nobitha",80);
	ArrayList<Students> l=new ArrayList<Students>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	for(Students s:l) {
		System.out.println(s);
	}
	System.out.println("-----------");
	//l -> s1,s2,s3
	//     0 ,1, 2
	Students max=l.get(0);
	Students min=l.get(0);
	for(int i=1;i<l.size();i++) {
		if(l.get(i).marks>max.marks) {
			max=l.get(i);
		}
	}
	System.out.println("student with highest marks:\n"+max);
	for(int i=1;i<l.size();i++) {
		if(l.get(i).marks<min.marks) {
			min=l.get(i);		
			}
	}
	System.out.println("student with lowest marks:\n"+min);
	
}
}
