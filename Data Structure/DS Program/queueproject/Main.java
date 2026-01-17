package queueproject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myqueue mq=new Myqueue(5);
		
		while (true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose the menu");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.exit");
			System.out.println("Enter the Choice :");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the Element :");
				int ele=sc.nextInt();
				mq.enQueue(ele);;
				break;
			
			case 2:
				mq.deQueue();
				
				break;
				
			case 3:
				mq.display();
				
				break;
			
			case 4:
				System.out.println("Exit");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter the valid choice!!");
				break;

			}
		}

	}

}
