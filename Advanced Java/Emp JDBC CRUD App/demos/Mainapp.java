package com.ash.demos;

import java.util.Scanner;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		EmployeeManagement empm=new EmployeeManagement();
		//empm.displayAll();
		
		do {
			System.out.println("1.Add");
			System.out.println("2.Search(By ID)");
			System.out.println("3.Update(By ID)");
			System.out.println("4.Delete(By ID)");
			System.out.println("5.Display(All)");
			System.out.println("6.Exit");
			
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				empm.addEmployee();
				break;
			
			case 2:
				empm.searchEmp();
				break;
				
			case 3:
				empm.updateEmp();
				break;
				
			case 4:
				empm.deleteEmp();
				break;
				
			case 5:
				empm.displayAll();
				break;
				
			case 6:
			{
				System.out.println("Exiting...");
				break;
			}
			
			default:
				System.out.println("Invalid Choice");
				break;

			}
		}while(choice!=6);

	}

}
