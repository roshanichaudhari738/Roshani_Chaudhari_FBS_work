#include<stdio.h>
int factorial(int);
void main(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	int temp=no;
	int res=factorial(no);
	printf("%d of factorial is %d",temp,res);
}

int factorial(int i)
{
	int fact=1;
	for(int no=i;no>1;no--)
		fact=fact*no;
	return fact;
}