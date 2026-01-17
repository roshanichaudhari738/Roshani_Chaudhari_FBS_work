package stackprogram;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Stack obj=new Stack(10);
		
//		obj.push(10);
//		obj.push(20);
//		obj.push(30);
//		obj.push(40);
//		obj.push(50);
//		obj.push(60);
//		System.out.println("Element is display "+obj.peek());
//		System.out.println("Element is deleted "+obj.pop());
//		System.out.println("Element is display "+obj.peek());
		
		while (true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose the menu");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Traverse");
			System.out.println("5.exit");
			System.out.println("Enter the Choice :");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the Element :");
				int ele=sc.nextInt();
				obj.push(ele);
				break;
			
			case 2:
				System.out.println("Deleted element "+obj.pop());
				
				break;
				
			case 3:
				System.out.println("Top element "+obj.peek());
				
				break;
				
			case 4:
				obj.traverse();
				break;
			
			case 5:
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
