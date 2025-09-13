#include<stdio.h>
int prime();
void main()
{
	int res=prime();
	res==1?printf("Prime"):printf("Not Prime");
}

int prime()
{
	int no,status=0;
	printf("Enter the Number:");
	scanf("%d",&no);
	int i=2;
	while(i<=(no/2))
	{
		if(no%i==0)
			status=1;
			break;
		i++;
	}
	
	if(status==0)
		return 1;
	else
		return 0;
}