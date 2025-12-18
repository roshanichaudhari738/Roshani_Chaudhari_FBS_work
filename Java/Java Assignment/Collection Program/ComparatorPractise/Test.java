package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

class MyIDComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		return e2.ID - e1.ID;
	}
}

class Employee implements Comparable<Employee>
{
	int ID;
	String name;
	double salary;
	
	public Employee() {
		super();
		ID = 101;
		this.name ="Roshani";
		this.salary = 45000;
	}
	
	public Employee(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return "\nID "+ID+"\nName "+name+"\nSalary "+salary+"\n------";
	}
	
	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		System.out.println("Inside CompareTo");
		return this.ID-e1.ID;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Inside Hashcode");
		return this.ID;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Inside equals");
		Employee e1=(Employee) obj;
		
		if(this.ID==e1.ID)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

public class Test {
	
	public static void main2(String[] a) {
		Employee e1=new Employee();
		Employee e2=new Employee(103, "Prathmesh", 35000);
		Employee e3=new Employee(102, "XYZ", 63000);
		
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println("Before \n"+a1);
		MySalaryComparator msc=new MySalaryComparator();
		Collections.sort(a1, msc);
		System.out.println("Salary Sort!!");
		System.out.println("After \n"+a1);
	}
	
	
	public static void main1(String[] a) {
		Employee e1=new Employee();
		Employee e2=new Employee(103, "Prathmesh", 35000);
		Employee e3=new Employee(102, "XYZ", 63000);
		
		//List l1=new LinkedList();//Employee type
		
//		TreeSet<Employee> l1=new TreeSet<Employee>();
//		l1.add(new Employee(101, "Prathmesh", 35000));
//		l1.add(new Employee(104, "XYZ", 63000));
//		l1.add(new Employee(103, "ABC", 45000));
		//l1.add(e3);
		
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		System.out.println("Before \n"+a1);
		
		MyIDComparator mid=new MyIDComparator();
		Collections.sort(a1,mid);
		
		System.out.println("ID Sort!!");
		System.out.println("\nAfter "+a1);
	}
	
	public static void main(String[] a) {
		Employee e1=new Employee();
		Employee e2=new Employee(103, "Prathmesh", 35000);
		Employee e3=new Employee(102, "XYZ", 63000);
		
		ArrayList a1=new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		System.out.println("Before \n"+a1);
		
		MyNameComparator mnc=new MyNameComparator();
		Collections.sort(a1, mnc);
		System.out.println("\nAfter "+a1);
	}

}
