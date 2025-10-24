#include<stdio.h>
typedef struct Distance {
    int feet,inch;
}Distance;

void store(Distance*);
void display(Distance*);

void main() 
{
	Distance a1;
    store(&a1);   
    display(&a1); 
    
//    store(&e2);   
//    display(&e2); 
}


void store(Distance* a) 
{
        printf("Enter feet,inch:\n");
			scanf("%d %d",&a->feet, &a->inch);
}

void display(Distance* a) 
{
        printf("feet=%d,inch=%d\n", a->feet,a->inch);
}
