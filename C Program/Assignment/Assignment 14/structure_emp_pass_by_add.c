//Pass by Address
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
	Employee e[3];
    store(s,3);   
    display(s,3); 
}


void store(Employee* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("Enter Employee ID: ");
        scanf("%d", &ptr[i].id);
        printf("Enter Name: ");
        scanf("%s", ptr[i].name);
        printf("Enter quantity: ");
        scanf("%d", &ptr[i].quantity);
    }
}

void display(Employee* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("\nEmployee ID: %d", ptr[i].id);
        printf("\nName   : %s", ptr[i].name);
        printf("\nquantity   : %d", ptr[i].quantity);
    }
}
