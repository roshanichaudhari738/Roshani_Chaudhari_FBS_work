package practise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Employee
{
	int ID;
	String name;
	double Salary;
	
	public Employee(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		Salary = salary;
	}
	
	

	public Employee() {
		
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
}

public class PractiseTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileWriter fw=new FileWriter("d.txt");
//		BufferedWriter bw=new BufferedWriter(fw);
//		bw.write("Firstbit");
//		bw.newLine();
//		bw.write("Solution");
//		bw.newLine();
//		bw.write("FC Road");
//		bw.newLine();
//		bw.write("Pune");
//		bw.close();
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		
		FileReader fr=new FileReader("d.txt");
		BufferedReader bfr=new BufferedReader(fr);
		//System.out.println(bfr.readLine());
		String str;
		str=bfr.readLine();
		String[] res = str.split(",");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
			
		}
		System.out.println();
		while ((str=bfr.readLine())!=null) {
			String[] res1 = str.split(",");
			
			Employee e=new Employee();
			e.ID=Integer.parseInt(res1[0]);//0,1,2 ye column ka hai no of line ka nahi
			e.name=res1[1];
			e.Salary=Double.parseDouble(res1[2]);
					
			emplist.add(e);		
			
		}
		for (Employee emp : emplist) {
			System.out.println(emp);
		}
		
		bfr.close();
		
	}

}
