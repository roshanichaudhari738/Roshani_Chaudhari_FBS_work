package view;
import java.util.Scanner;

import controller.EmployeeController;

import model.Admin;
import model.Employee;
import model.HR;
import model.Salesmanager;

public class EmployeeView {
	
		EmployeeController ec;
		
		Scanner sc=new Scanner(System.in);
	
		public EmployeeView(EmployeeController ec) {
			super();
			this.ec = ec;
		}
		
		public int getValidInt(String msg) {
		    while (true) {
		        try {
		            System.out.print(msg);
		            return sc.nextInt();
		        } catch (Exception e) {
		            System.out.println("Invalid Input! Please enter numeric value only.");
		            sc.nextLine(); 
		        }
		    }
		}
		

		public void showMenu() 
		{
			
			 int choice=0;
			
			do {
				System.out.println("1. Add Employee");
				System.out.println("2. Search Employee");
				System.out.println("3. Update Employee");
				System.out.println("4. Delete Employee");
				System.out.println("5. Display All Employee");
				System.out.println("6. Employee sort");
				System.out.println("0. Exit");
				System.out.println("Enter the Choice:");
				 choice=sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the type of Employee : \n 1.HR\n 2.Admin\n 3.Salesmanager");
					int type=sc.nextInt();
					
					//System.out.println("Enter ID :");
					int ID=getValidInt("Enter ID :");
					sc.nextLine();
					
					System.out.println("Enter the Name :");
					String name=sc.nextLine();
					
					System.out.println("Enter Salary :");
					double salary=sc.nextDouble();
					
					if(type==1)
					{
						System.out.println("Enter Commission :");
						double comm=sc.nextDouble();
						ec.addEmployee(new HR(ID,name,salary,comm));
						System.out.println("HR added Successfull!!");
					}
					else if (type==2) {
						System.out.println("Enter Allowance :");
						double allowance=sc.nextDouble();
						ec.addEmployee(new Admin(ID, name, salary, allowance));
						System.out.println("Admin added Successfull!!");
					} else if(type==3) {
						System.out.println("Enter the Incentive :");
						int incentive=sc.nextInt();
						System.out.println("Enter target :");
						int target=sc.nextInt();
						ec.addEmployee(new Salesmanager(ID, name, salary, target,incentive));
						System.out.println("Salesmanager added Successfull!!!");
					}
					else {
						System.out.println("Invalid choice!!");
					}
					break;

					case 2:
						System.out.print("Enter ID to search: ");
		                 ID = sc.nextInt();
		                Employee e = ec.searchEmployeeById(ID);
		                if (e != null)
		                    System.out.println("Found: " + e);
		                else
		                    System.out.println("Employee not found.");
		                break;
		                
					case 3:
						System.out.print("Enter ID to update: ");
		                ID = sc.nextInt();
		                System.out.println("Enter the choice to update\n");
		                System.out.println("1.Salary\n");
		                System.out.println("2.Name\n");
		                System.out.println("Enter the choice");
		                switch (sc.nextInt()) {
						case 1:
							System.out.print("Enter New Salary: ");
			                salary = sc.nextDouble();
							if (ec.updateEmployee(ID, salary))
			                    System.out.println("Updated successfully!");
			                else
			                    System.out.println("Employee not found.");
							break;

						case 2:
							System.out.print("Enter updated name: ");
			                name = sc.next();
							if (ec.updateEmployeeName(ID, name))
			                    System.out.println("Updated successfully!");
			                else
			                    System.out.println("Employee not found.");
							break;
						default:System.out.println("Invalid Choice"); 
						break;
						}
		                
		               
		                break; 
		                
					case 4:
						 System.out.print("Enter ID to delete: ");
		                 ID = sc.nextInt();
		                 if (ec.deleteEmployee(ID))
		                     System.out.println("Deleted successfully!");
		                 else
		                     System.out.println("Employee not found.");
		                 break;
		                 
					case 5:
						ec.displayAll();
						break; 
					case 6:
						System.out.println("choice to sort:\n");
						System.out.println("1.ID\n");
						System.out.println("2.Salary\n");
						System.out.println("3.Name\n");
						System.out.println("Enter the choice:");
						choice=sc.nextInt();
						ec.sortEmployee(choice);	
				}
				
			} while (choice!=0);
			System.out.println("Program Exited");
			
		}

}
