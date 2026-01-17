package practise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Roll No :"+roll+"\nName :"+name;
	}
	
}

public class FileHandlingTest {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("data.txt");
			DataInputStream dis=new DataInputStream(fis);
			ObjectInputStream ois=new ObjectInputStream(dis);
			Student s1=(Student) ois.readObject();
			System.out.println(s1);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("data.txt");
			DataOutputStream dos=new DataOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(dos);
			oos.writeObject(new Student(101, "Roshani"));
			System.out.println("Written Successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
