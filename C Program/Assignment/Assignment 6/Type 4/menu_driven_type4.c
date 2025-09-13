#include <stdio.h>
int evenodd(int);
int prime(int);
int palindrome(int);
int checkno(int);
int reversenumber(int);
int sumdigit(int);
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
        	int no=8;
            int res=evenodd(no);
            res == 1?printf("Even Number"):printf("Odd Number");
        }
        else if (choice == 2) {
        	int no=15;
            int res=prime(no);
            res==1?printf("Prime"):printf("Not Prime");
        }
        else if (choice == 3) {
        	int no=14441;
            int res=palindrome(no);
            int temp=no;
            res==1?printf("%d is a Palindrome",temp):printf("%d is not a Palindrome",temp);
        }
        else if (choice == 4) {
        	int no = 3;
            int value=checkno(no);
            value==1?printf("%d is positive",no):printf("%d is negative",no);
        }
        else if (choice == 5) {
        	int no=14441;
            int val=reversenumber(no);
            val==1?printf("%d is a reverse number",no):printf("%d is not a reverse number",no);
        }
        else if (choice == 6) {
        	int no=56384;
            int sum=sumdigit(no);
            printf("sum of %d is %d\n",no,sum);
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

int evenodd(int i)
{
    return (i%2==0)? 1:0;
}
 
int prime(int no)
{
	
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
		return 1;
	else
		return 0;
}

int palindrome(int no)
{
	int r1,rev=0;
	int temp=no;
	while(no>0)
	{
		r1=no%10;
		rev=rev*10+r1;
		no=no/10;
	}
	return temp==rev? 1: 0;
}

int checkno(int i)
{
			return (i > 0)? 1: 2;
}

int reversenumber(int no){
	int r1,rev=0;
	int temp=no;
	while(no>0)
	{
		r1=no%10;
		rev=rev*10+r1;
		no=no/10;	
	}
	return (temp==rev)? 1: 2;
}

int sumdigit(int no){
	int sum=0,r1,rev=0;
	int temp=no;
	while(no>0){
		r1=no%10;
		sum=sum+r1;
		no=no/10;
	}
	return sum;
	//printf("sum of %d is %d\n",temp,sum);
}