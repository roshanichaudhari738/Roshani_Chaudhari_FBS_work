
#include<stdio.h>
typedef struct Employee {
    int id;
    char name[20];
    int quantity;
}Employee;

void store();
void display();

void main() 
{
	Employee e1,e2;
    store(&e1);   
    display(&e1); 
    
    store(&e2);   
    display(&e2); 
}


void store(Employee* e) 
{
        printf("Enter Employee ID: ");
        scanf("%d", &e->id);
        printf("Enter Name: ");
        scanf("%s", e->name);
        printf("Enter quantity: ");
        scanf("%d", &e->quantity);
}

void display(Employee* e) 
{
        printf("\nEmployee ID: %d", e->id);
        printf("\nName   : %s", e->name);
        printf("\nquantity   : %d\n", e->quantity);
}
