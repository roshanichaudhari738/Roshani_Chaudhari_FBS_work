#include<stdio.h>
void palindrome(int);
void main()
{
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	palindrome(no);
}

void palindrome(int x)
{
	
	int r1,rev=0;
	int temp=x;
	while(x>0)
	{
		r1=x % 10;
		x=x / 10;
		rev=rev*10 + r1;
	}
		
	(temp == rev)?printf("%d is a Palindrome Number",temp):
	printf("%d is not a Palindrome Number",temp);
	
}