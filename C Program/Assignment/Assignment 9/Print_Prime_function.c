#include<stdio.h>
void storeArray(int*,int);
void printPrimeNo(int*,int);
void main()
{
	int arr[5];
	storeArray(arr,5);
	printPrimeNo(arr,5);
}

void storeArray(int *arr,int size)
{
	printf("Enter the 5 element of array:\n");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}	
}

void printPrimeNo(int *arr,int size)
{
	printf("Prime number of array:\n");
	for(int i=0;i<size;i++)
	{
		if(arr[i]%2!=0)
		{
			printf("%d\n",arr[i]);
		}
	}
}