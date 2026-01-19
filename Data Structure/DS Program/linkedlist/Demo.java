package linkedlistprogram;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
//		l.insertend(10);
//		l.insertend(20);
//		l.insertend(30);
//		l.insertBeg(5);
//		l.display();
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("----- Choose the Menu ------");
			System.out.println("1.Insert at Begining element");
			System.out.println("2.Insert at End element");
			System.out.println("3.display");
			System.out.println("4.Insert the Element at Position");
			System.out.println("5.Delete the Element at Position");
			System.out.println("6.Delete the Element at Begining");
			System.out.println("7.Delete the Element at End");
			System.out.println("8.Exit");
			System.out.println("Enter the Choice");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element");
				int no=sc.nextInt();
				l.insertBeg(no);
				System.out.println("Insert the element in begining");
				break;
				
			case 2:
				System.out.println("Enter the element");
				 no=sc.nextInt();
				l.insertend(no);
				System.out.println("Insert the element in end");
				break;
				
			case 3:
				l.display();
				break;
				
			case 4:
				System.out.println("Enter the Position");
				int p=sc.nextInt();
				System.out.println("Enter the element");
				no=sc.nextInt();
				l.insertPos(no, p);
				System.out.println("Insert the element in position");
				break;
				
			case 5:
				System.out.println("Enter the Position");
				int pos=sc.nextInt();
				l.deletePos(pos);
				System.out.println("delete the element in position");
				break;
				
			case 6:
				l.deleteBeg();
				System.out.println("delete the element in begining");
				break;
				
			case 7:
				l.deleteEnd();
				System.out.println("delete the element in end");
				break;
				
			case 8:
				System.out.println("Exit");
				System.exit(0);
				break;

			default:System.out.println("Enter the valid choice !!!");
				break;
			}
		}
		
	}

}
