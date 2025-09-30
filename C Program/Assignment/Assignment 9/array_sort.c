#include<stdio.h>
int bubblesort(int*,int);
void main()
{
	int arr[10];
	printf("Enter the element of array:");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&arr[i]);
	}
	bubblesort(arr,10);
	printf("display the element of array:");
	for(int i=0;i<10;i++)
	{
		printf("%d",arr[i]);
	}
}

int bubblesort(int *arr,int size)
{
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}