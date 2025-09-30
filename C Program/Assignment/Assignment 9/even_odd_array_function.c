#include<stdio.h>
void storeArray(int*,int);
void display(int*,int);
void evenoddNo(int*,int);
void main()
{
	int arr[5];
	storeArray(arr,5);
	display(arr,5);
	evenoddNo(arr,5);
}

void storeArray(int *arr,int size)
{
	printf("Enter the 5 element of array:\n");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}	
}

void display(int *arr,int size)
{
	printf("Display the 5 element of array:\n");
	for(int i=0;i<size;i++)
	{
		printf("%d\n",arr[i]);
	}
}

void evenoddNo(int *arr,int size)
{
	printf("even or odd number of array:\n");
	for(int i=0;i<5;i++)
	{
		if(arr[i]%2==0)
		{
			printf("even no is\n");
			printf("%d\n",arr[i]);
		}
		else{
			printf("odd no is\n");
			printf("%d\n",arr[i]);
		}
	}
}