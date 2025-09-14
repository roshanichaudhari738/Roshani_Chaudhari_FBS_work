#include<stdio.h>
void main()
{
	int arr[5],flag=0;
	printf("Enter the 5 element of array:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Prime number of array:\n");
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2!=0)
		{
			printf("%d\n",arr[i]);
		}
	}
	printf("Not Prime number of array:\n");
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			printf("%d\n",arr[i]);
		}
	}
	
}