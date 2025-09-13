#include<stdio.h>
int prime(int);
void main()
{
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	int res=prime(no);
	res==1?printf("Prime"):printf("not Prime");
}

int prime(int num)
{
	int flag=0;
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
//			return 1;
			flag=1;
			break;
	}
	
	
	if(flag==0)
		return 1;
	else
		return 2;
}