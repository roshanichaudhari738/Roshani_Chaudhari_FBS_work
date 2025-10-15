#include<stdio.h>
void main()
{
	int arr[20];
	int sum=0;
	printf("Enter the element of array:\n");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Display the element of array:\n");
	for(int i=0;i<10;i++)
	{
		printf("%d\n",arr[i]);
	}
	printf("Display the odd index element of array:\n");
	for(int i=0;i<10;i++)
	{
		if(i%2==1)
		{
			printf("%d\n",arr[i]);
			sum=sum+arr[i];
		}		 
	}
	printf("Sum is:%d",sum);
		 
}