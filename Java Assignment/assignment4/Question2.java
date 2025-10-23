package assignment4;

public class Question2 {

	public static void main(String[] args) {
		int choice;

	  
	        System.out.printf("\n------ MENU ------\n");
	        System.out.printf("1. Check Even or Odd\n");
	        System.out.printf("2. Check Prime or Not\n");
	        System.out.printf("3. Check Palindrome or Not\n");
	        System.out.printf("4. Check Positive, Negative or Zero\n");
	        System.out.printf("5. Reverse a Number\n");
	        System.out.printf("6. Find Sum of Digits\n");
	        System.out.printf("7. Exit\n");
//	        System.out.printf("Enter your choice: ");
//	        scanf("%d", &choice);
	        choice=1;

	        if (choice == 1) {
	            int no=8;
	            if(no%2==0)
	            	System.out.printf("Even Number");
	            else
	            	System.out.printf("Odd Number");
	        }
	        else if (choice == 2) {
	            int no=15;
				int i=2,status=0;
				while(i<=(no/2))
				{
					if(no%i==0)
					{
						status=1;
						break;
					}
						i++;
				}
					
				if(status==0)
					System.out.printf("Prime");
				else
					System.out.printf("Not Prime");
	        }
	        else if (choice == 3) {
	            int r1,rev=0;
				int no=14441;
				int temp=no;
				while(no>0)
				{
					r1=no%10;
					rev=rev*10+r1;
					no=no/10;
			
				}
			if(temp==rev){
				System.out.printf("%d is a Palindrome",temp);
			}
			else{
				System.out.printf("%d is not a Palindrome",temp);
			}
	        }
	        else if (choice == 4) {
	            int no = 3;
				if(no > 0)
				{
					System.out.printf("%d is positive",no);
				}
				else
				{
					System.out.printf("%d is negative",no);
				}
	        }
	        else if (choice == 5) {
	            int r1,rev=0;
				int no=14441;
				int temp=no;
				while(no>0)
				{
					r1=no%10;
					rev=rev*10+r1;
					no=no/10;	
				}
		
				if(temp==rev){
					System.out.printf("%d is a reverse number",temp);
				}
				else{
					System.out.printf("%d is not a Palindrome",temp);
				}
	        }
	        else if (choice == 6) {
	            int no=56384;
				int sum=0,r1;
				int temp=no;
				while(no>0){
					r1=no%10;
					sum=sum+r1;
					no=no/10;
				}
				System.out.printf("sum of %d is %d\n",temp,sum);
	        }
	        else if (choice == 7) {
	            System.out.printf("Exiting program...\n");
	        }
	        else {
	            System.out.printf("Invalid choice! Please try again.\n");
	        }


	    //return 0;

	}

}
