//Pass by Address
#include<stdio.h>
typedef struct Product {
    int id;
    char name[20];
    int quantity;
    int allowance;
}Product;

void store();
void display();

void main() 
{
	Product a[3];
    store(a,3);   
    display(a,3); 
}


void store(Product* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("Enter Product ID: ");
        scanf("%d", &ptr[i].id);
        printf("Enter Name: ");
        scanf("%s", ptr[i].name);
        printf("Enter quantity: ");
        scanf("%d", &ptr[i].quantity);
        printf("Enter Allowance: ");
        scanf("%d", &ptr[i].allowance);
    }
}

void display(Product* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("\nProduct ID: %d", ptr[i].id);
        printf("\nName    : %s", ptr[i].name);
        printf("\nquantity  : %d", ptr[i].quantity);
         scanf("Allowance :%d\n", &ptr[i].allowance);
    }
}
