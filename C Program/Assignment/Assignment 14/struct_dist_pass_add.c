//Pass by Address
#include<stdio.h>
typedef struct Distance {
    int feet,inch;
}Distance;

void store();
void display();

void main() 
{
	Distance p[2];
    store(p,2);   
    display(p,2); 
}


void store(Distance* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{

			printf("Enter feet,inch");
			scanf("%d %d",&ptr[i].feet, &ptr[i].inch);
    }
}

void display(Distance* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
		printf("Feet=%d,inch=%d\n", ptr[i].feet,ptr[i].inch);
    }
}
