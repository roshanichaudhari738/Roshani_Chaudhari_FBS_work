#include<stdio.h>
int evenodd();
void main()
{
	int res=evenodd();
	if(res==1)
		printf("Even");
	else
		printf("Odd");
}
 
int evenodd()
{
	int no=8;
	if(no%2==0)
		return 1;
	else
		return 0;
}