//Pass by Address
#include<stdio.h>
typedef struct HR {
    int id;
    char name[20];
    int salary;
    int commission;
}HR;

void store();
void display();

void main() 
{
	HR h[3];
    store(h,3);   
    display(h,3); 
}


void store(HR* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("Enter Admin ID: ");
        scanf("%d", &ptr[i].id);
        printf("Enter Name: ");
        scanf("%s", ptr[i].name);
        printf("Enter Salary: ");
        scanf("%d", &ptr[i].salary);
        printf("Enter commission: ");
        scanf("%d", &ptr[i].commission);
    }
}

void display(HR* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("\nHR ID	: %d", ptr[i].id);
        printf("\nName    : %s", ptr[i].name);
        printf("\nSalary  : %d", ptr[i].salary);
        printf("\ncommission :%d\n", &ptr[i].commission);
    }
}
