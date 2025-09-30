#include<stdio.h>
void storeArray(int*,int);
void display(int*,int);
void maxmin(int*,int);
void main()
{
	int arr[5];
	storeArray(arr,5);
	display(arr,5);
	maxmin(arr,5);
	
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

void maxmin(int *arr,int size){
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i<size;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	printf("Maximum number of array:%d\n",max);
	printf("Minimum number of array:%d",min);
}