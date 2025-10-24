
#include<stdio.h>
typedef struct Admin {
    int id;
    char name[20];
    int salary;
     int allowance;
}Admin;

void store();
void display();

void main() 
{
	Admin a1;
    store(&a1);   
    display(&a1); 
    
//    store(&e2);   
//    display(&e2); 
}


void store(Admin* a) 
{
        printf("Enter Admin ID: ");
        scanf("%d", &a->id);
        printf("antar Nama: ");
        scanf("%s", a->name);
        printf("Enter Salary: ");
        scanf("%d", &a->salary);
        printf("Enter Allowance: ");
        scanf("%d", &a->allowance);
}

void display(Admin* a) 
{
        printf("\nAdmin ID : %d", a->id);
        printf("\nName     : %s", a->name);
        printf("\nSalary   : %d", a->salary);
        printf("\nAllowance : %d\n", a->allowance);
}
