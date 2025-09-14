#include<stdio.h>
void main()
{
	int arr[10];
	int sum=0;
	printf("Enter the Array element:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Display the sum 10 element array:");
	for(int i=0;i<10;i++)
	{
		sum=sum+arr[i];
		
	}
	printf("%d\n",sum);
}