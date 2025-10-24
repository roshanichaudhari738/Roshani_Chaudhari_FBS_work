//Pass by Address
#include<stdio.h>
typedef struct Time {
    int hour, min, sec;
}Time;

void store();
void display();

void main() 
{
	Time p[2];
    store(p,2);   
    display(p,2); 
}


void store(Time* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
			printf("Enter Hour,Minute,Second:\n");
			scanf("%d %d %d",&ptr[i].hour, &ptr[i].min, &ptr[i].sec);
    }
}

void display(Time* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
		printf("Hour=%d,Minute=%d,Second=%d\n", ptr[i].hour,ptr[i].min,ptr[i].sec);
    }
}
