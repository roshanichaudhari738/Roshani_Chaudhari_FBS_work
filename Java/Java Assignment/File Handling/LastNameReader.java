package practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LastNameReader extends Thread {
	public void run() {
		 try {
		 BufferedReader b1=new BufferedReader(new FileReader("C:\\Users\\rosha\\OneDrive\\Desktop\\HPCP\\commons-math3-3.6.1\\FileHandlingPractise\\src\\practise\\lastname.txt"));
		 String lname=null;
		 while((lname=b1.readLine())!=null){
			 System.out.println(lname);
		 }
	 }
		 catch(FileNotFoundException f) {
			 f.printStackTrace();
			}
		 catch(IOException e){
				e.printStackTrace();
			}
	}


}
