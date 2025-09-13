#include <stdio.h>
void evenodd();
void prime();
void palindrome();
void checkno();
void reversenumber();
void sumdigit();
int main() {
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
            evenodd();
        }
        else if (choice == 2) {
            prime();
        }
        else if (choice == 3) {
            palindrome();
        }
        else if (choice == 4) {
            checkno();
        }
        else if (choice == 5) {
            reversenumber();
        }
        else if (choice == 6) {
            sumdigit();
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

void evenodd()
{
	int no=8;
    if(no%2==0)
        printf("Even Number");
    else
        printf("Odd Number");
}
 
void prime()
{
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

void palindrome()
{
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

void checkno()
{
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

void reversenumber(){
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
				printf("%d is not a reverse number",temp);
			}
}

void sumdigit(){
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