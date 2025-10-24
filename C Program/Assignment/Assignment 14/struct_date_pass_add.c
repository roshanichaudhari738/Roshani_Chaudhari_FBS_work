//Pass by Address
#include<stdio.h>
typedef struct Date {
    int date, month, year;
}Date;

void store();
void display();

void main() 
{
	Date p[2];
    store(p,2);   
    display(p,2); 
}


void store(Date* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{

			printf("Enter Date,Month,Year");
			scanf("%d %d %d",&ptr[i].date, &ptr[i].month, &ptr[i].year);
    }
}

void display(Date* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
		printf("Date=%d,Month=%d,Year=%d", ptr[i].date,ptr[i].month,ptr[i].year);
    }
}
