#include<stdio.h>
void main()
{
	int arr[5],brr[5],crr[5];
	printf("Enter the 5 element of 1st array:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Enter the 5 element of 2nd array:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&brr[i]);
	}
	printf("sum of array:");
	for(int i=0;i<5;i++)
	{
		crr[i]=arr[i]+brr[i];
	}
	printf("Sum of two array:");
	for(int i=0;i<5;i++)
	{
		printf("%d\n",crr[i]);
	}
}