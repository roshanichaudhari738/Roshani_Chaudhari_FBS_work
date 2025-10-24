#include<stdio.h>
typedef struct hr {
    int id;
    char name[20];
    int salary;
    int commission;
}hr;

void store();
void display();

void main() 
{
	hr a1;
    store(&a1);   
    display(&a1); 
    
//    store(&e2);   
//    display(&e2); 
}


void store(hr* a) 
{
        printf("Enter hr ID: ");
        scanf("%d", &a->id);
        printf("antar Nama: ");
        scanf("%s", a->name);
        printf("Enter Salary: ");
        scanf("%d", &a->salary);
        printf("Enter commission: ");
        scanf("%d", &a->commission);
}

void display(hr* a) 
{
        printf("\nhr ID : %d", a->id);
        printf("\nName     : %s", a->name);
        printf("\nSalary   : %d", a->salary);
        printf("\nAllowance : %d\n", a->allowance);
}
