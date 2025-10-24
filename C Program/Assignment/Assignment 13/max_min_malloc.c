#include<stdio.h>
#include<stdlib.h>
int main()
{
	//int arr[10];
	int* arr=(int*)malloc(40);
//	int sum=0;
	printf("Enter the Array element:");
	for(int i=0;i<10;i++)
	{
		scanf("%d\n",&arr[i]);
	}
	printf("Display the sum 10 element array:");
	for(int i=10;i>0;i--)
	{
		printf("%d\n",arr[i]);
	}
	return 0;
	
}