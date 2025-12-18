package ComparablePractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

//interface Comparable{
//	public int compareTo(Object o);
//}

class Employee implements Comparable
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
	public int compareTo(Object o) {
		Employee e1=(Employee)o;
		
		return this.ID-e1.ID;
	}
	
}

public class Test {
	
	public static void main(String[] a) {
//		Employee e1=new Employee();
//		Employee e2=new Employee(102, "Prathmesh", 35000);
//		Employee e3=new Employee(103, "XYZ", 63000);
		
		//List l1=new LinkedList();//Employee type
		
		TreeSet<Employee> l1=new TreeSet<Employee>();
		l1.add(new Employee(101, "Prathmesh", 35000));
		l1.add(new Employee(104, "XYZ", 63000));
		l1.add(new Employee(103, "ABC", 45000));
		//l1.add(e3);
		
		System.out.println(l1);
	}

}
