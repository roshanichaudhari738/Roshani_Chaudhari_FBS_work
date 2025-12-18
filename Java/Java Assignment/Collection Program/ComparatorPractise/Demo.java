package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		System.out.println("Hash set working");
		HashSet<Employee> a1=new HashSet<Employee>();
		a1.add(new Employee(10, "Roshani", 45000));
		a1.add(new Employee(18, "Prathmesh", 40000));
		a1.add(new Employee(12, "ABC", 30000));
		a1.add(new Employee(4, "XYZ", 7000));
		System.out.println("\n");
		
		if(a1.contains(new Employee(18, "Prathmesh", 35000)))
		{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
	
	public static void main2(String[] args) {
		TreeSet<Employee> a1=new TreeSet<Employee>();
		a1.add(new Employee(101, "Roshani", 45000));
		a1.add(new Employee(102, "Prathmesh", 40000));
		a1.add(new Employee(103, "ABC", 30000));
		a1.add(new Employee(104, "XYZ", 7000));
		
		if(a1.contains(new Employee(103, "Prathmesh", 35000)))
		{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		Employee e2=new Employee(103, "Prathmesh", 35000);
		Employee e3=new Employee(102, "XYZ", 63000);
		
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		if(a1.contains(new Employee(103, "Prathmesh", 35000)))
		{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}

	}

}
