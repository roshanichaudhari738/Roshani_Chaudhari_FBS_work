package classwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoArrauList {
	
	public static void main(String[] a) {
		HashSet<Emp> a1=new HashSet<Emp>();
		a1.add(new Emp(101, "XYZ", 4500));
		a1.add(new Emp(102, "Roshani", 8500));
		a1.add(new Emp(103, "PQR", 63500));
		a1.add(new Emp(104, "ABC", 1400));

		if(a1.contains(new Emp(103, "PQR", 63500)))
		{
			System.out.println("Inside Hashcode");
			System.out.println("Found");
		}
		else {
			System.out.println("Inside Hashcode");
			System.out.println("Not Found");
		}
	}
	
	public static void main2(String[] a) {
		TreeSet<Emp> a1=new TreeSet<Emp>();
		a1.add(new Emp(101, "XYZ", 4500));
		a1.add(new Emp(102, "Roshani", 8500));
		a1.add(new Emp(103, "PQR", 63500));
		a1.add(new Emp(104, "ABC", 1400));

		if(a1.contains(new Emp(103, "PQR", 63500)))
		{
			System.out.println("Inside Treeset");
			System.out.println("Found");
		}
		else {
			System.out.println("Inside Treeset");
			System.out.println("Not Found");
		}
	}

	public static void main1(String[] args) {
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(new Emp(101, "XYZ", 4500));
		a1.add(new Emp(102, "Roshani", 8500));
		a1.add(new Emp(103, "PQR", 63500));
		a1.add(new Emp(104, "ABC", 1400));

		if(a1.contains(new Emp(103, "PQR", 63500)))
		{
			System.out.println("Inside Arraylist");
			System.out.println("Found");
		}
		else {
			System.out.println("Inside Arraylist");
			System.out.println("Not Found");
		}
		
		
	}

}
