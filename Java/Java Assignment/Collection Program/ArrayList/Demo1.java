package classwork;

import java.awt.List;
import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(30);
		a1.add(20);
		
		a1.remove(1);
		a1.add(40);
		System.out.println(a1);
		
		
		if(a1.contains(30))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		
		

	}

}
