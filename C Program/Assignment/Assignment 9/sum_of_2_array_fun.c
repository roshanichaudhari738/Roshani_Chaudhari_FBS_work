#include<stdio.h>
void storeArray1(int*,int);
void storeArray2(int*,int);
void sumArray(int*,int*,int*,int);
void displaySumArray(int*,int);
void main()
{
	int arr[5],brr[5],crr[5];
	storeArray1(arr,5);
	storeArray2(brr,5);
	sumArray(arr,brr,crr,5);
	displaySumArray(crr,5);
}

void storeArray1(int *arr,int size)
{
	printf("Enter the 5 element of array1:\n");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}	
}

void storeArray2(int *brr,int size)
{
	printf("Enter the 5 element of array2:\n");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&brr[i]);
	}	
}

void sumArray(int *arr,int *brr,int *crr,int size)
{
	printf("sum of array:");
	for(int i=0;i<size;i++)
	{
		crr[i]=arr[i]+brr[i];
	}
}

void displaySumArray(int *crr,int size)
{
	printf("Sum of two array:\n");
	for(int i=0;i<size;i++)
	{
		printf("%d\n",crr[i]);
	}	
}