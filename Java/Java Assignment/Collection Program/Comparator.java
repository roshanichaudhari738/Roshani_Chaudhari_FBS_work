package classwork;

import java.util.ArrayList;
import java.util.Collections;


class MyIDComparator implements java.util.Comparator
{
	@Override
	public int compare(Object o1,Object o2) {
		Emp e1= (Emp)o1;
		Emp e2= (Emp)o2;
		
		return e1.ID-e2.ID;
	}
}

class Emp
{
	int ID;
	String name;
	double salary;
	
	public Emp() {
		super();
		ID = 101;
		this.name ="Roshani";
		this.salary = 45000;
	}
	
	public Emp(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nID "+ID+"\nName "+name+"\nSalary "+salary+"\n------";
	}
	
	public int hashcode()
	{
		System.out.println("Inside hashcode");
		return this.ID;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("Inside equals");
		Emp e1=(Emp) obj;
		
		if(this.ID==e1.ID)
		{
			return true;
		}
		else {
			return false;
		}
	}
}

public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(new Emp(101, "XYZ", 45000));
		a1.add(new Emp(102, "ABC", 78000));
		a1.add(new Emp(105, "PQR", 12000));
		a1.add(new Emp(104, "Roshani", 4000));
		
		MyIDComparator mid=new MyIDComparator();
		Collections.sort(a1, mid);
		
		System.out.println(a1);
	}

}
