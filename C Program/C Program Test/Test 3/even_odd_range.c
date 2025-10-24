#include<stdio.h>
void main()
{
	int arr[10];
	printf("Enter the element of array:\n");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Print the Even number:");
	for(int i=1;i<10;i++)
	{
		if(arr[i]%2==0)
			printf("%d\n",arr[i]);
	}
	printf("Print the Odd number:");
	for(int i=1;i<10;i++)
	{
		if(arr[i]%2!=0)
			printf("%d\n",arr[i]);
	}
}