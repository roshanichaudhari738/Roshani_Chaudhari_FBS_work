#include <stdio.h>
int menudriven();
void main() {
	int res=menudriven();
   	res;
}

int menudriven()
{
	int choice, num;

    do {
        printf("\n------ MENU ------\n");
        printf("1. Check Even or Odd\n");
        printf("2. Check Prime or Not\n");
        printf("3. Check Palindrome or Not\n");
        printf("4. Check Positive, Negative or Zero\n");
        printf("5. Reverse a Number\n");
        printf("6. Find Sum of Digits\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            int no=8;
            if(no%2==0)
            	printf("Even Number");
            else
            	printf("Odd Number");
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
				printf("Prime");
			else
				printf("Not Prime");
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
			printf("%d is a Palindrome",temp);
		}
		else{
			printf("%d is not a Palindrome",temp);
		}
        }
        else if (choice == 4) {
            int no = 3;
			if(no > 0)
			{
				printf("%d is positive",no);
			}
			else
			{
				printf("%d is negative",no);
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
				printf("%d is a reverse number",temp);
			}
			else{
				printf("%d is not a Palindrome",temp);
			}
        }
        else if (choice == 6) {
            int no=56384;
			int sum=0,r1,rev=0;
			int temp=no;
			while(no>0){
				r1=no%10;
				sum=sum+r1;
				no=no/10;
			}
			printf("sum of %d is %d\n",temp,sum);
        }
        else if (choice == 7) {
            printf("Exiting program...\n");
        }
        else {
            printf("Invalid choice! Please try again.\n");
        }

    } while(choice != 7);
    
    return 0;
}