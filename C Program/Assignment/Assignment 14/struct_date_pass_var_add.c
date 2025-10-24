#include<stdio.h>
typedef struct Date {
    int date, month, year;
}Date;

void store(Date*);
void display(Date*);

void main() 
{
	Date a1;
    store(&a1);   
    display(&a1); 
    
//    store(&e2);   
//    display(&e2); 
}


void store(Date* a) 
{
        printf("Enter Date,Month,Year:\n");
			scanf("%d %d %d",&a->date, &a->month, &a->year);
}

void display(Date* a) 
{
        printf("Date=%d,Month=%d,Year=%d\n", a->date,a->month,a->year);
}
