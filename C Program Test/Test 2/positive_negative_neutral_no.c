#include<stdio.h>
void isNumberpn(int);
void main()
{
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	isNumberpn(no);
}

void isNumberpn(int no)
{
	if(no>0)
	{
		printf("Positive Number");
	}
	else if(no<0)
	{
		printf("Negative Number");
	}
	else{
		printf("Neutral Number");
	}
}