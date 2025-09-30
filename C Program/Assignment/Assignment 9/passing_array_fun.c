#include<stdio.h>
void store(int*,int);
void display(int*,int);
void replace(int*,int,int,int);
void main()
{
	int arr[10];
	store(arr,10);
	display(arr,10);
	replace(arr,10,5,7);
	display(arr,10);
}

void store(int *arr,int size)
{
	printf("Enter the element of array:\n");
	for(int i=0;i<size;i++)
	{
		scanf("%d\n",&arr[i]);
	}
}

void display(int *arr,int size)
{
	printf("Display the element of array:\n");
	for(int i=0;i<size;i++)
	{
		printf("%d\n",arr[i]);
	}
}

void replace(int *arr,int size,int old,int newvalue)
{
	printf("Display the element of array:\n");
	for(int i=0;i<size;i++)
	{
		if(arr[i]==old)
		{
			arr[i]=newvalue;
		}
	}
}