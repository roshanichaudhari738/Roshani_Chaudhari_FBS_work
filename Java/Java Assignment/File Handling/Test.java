package practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FirstNameReader fr=new FirstNameReader();
//		LastNameReader lr=new LastNameReader();
//		fr.start();
//		lr.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					 BufferedReader b1=new BufferedReader(new FileReader("C:\\Users\\rosha\\OneDrive\\Desktop\\HPCP\\commons-math3-3.6.1\\FileHandlingPractise\\src\\practise\\firstname.txt"));
					 String fname=null;
					 while((fname=b1.readLine())!=null){
						 System.out.println(fname);
					 }
				 }
				catch(FileNotFoundException f) 
				{
					f.printStackTrace();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}).start();;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
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
		}).start();;

	}

}
