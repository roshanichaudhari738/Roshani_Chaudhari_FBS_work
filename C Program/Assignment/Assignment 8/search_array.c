#include<stdio.h>
void main()
{
	int arr[10];
	int no,flag=0;
	printf("Enter the Array element:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the number yo want to search:");
	scanf("%d",&no);
	for(int i=0;i<10;i++)
	{
		if(arr[i]==no)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		printf("found");
	}
	else{
		printf("Not Found");
	}
}