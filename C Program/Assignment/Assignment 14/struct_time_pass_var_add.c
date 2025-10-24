#include<stdio.h>
typedef struct Time {
    int hour, min, sec;
}Time;

void store(Time*);
void display(Time*);

void main() 
{
	Time a1;
    store(&a1);   
    display(&a1); 
    
//    store(&e2);   
//    display(&e2); 
}


void store(Time* a) 
{
        printf("Enter hour,min,sec:\n");
			scanf("%d %d %d",&a->hour, &a->min, &a->sec);
}

void display(Time* a) 
{
        printf("hour=%d,min=%d,sec=%d\n", a->hour,a->min,a->sec);
}
