package classwork;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet <Integer> t1=new TreeSet<Integer>();
		t1.add(10);
		t1.add(30);
		t1.add(20);
		
		
		
		t1.remove(30);
		t1.add(40);
		System.out.println(t1);
		
		if(t1.contains(30))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		t1.remove(10);
		System.out.println(t1);
		
		t1.add(50);
		System.out.println(t1);

	}

}
