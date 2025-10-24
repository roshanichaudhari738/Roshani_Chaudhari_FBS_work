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
	Product a1;
    store(&a1);   
    display(&a1); 
    
//    store(&e2);   
//    display(&e2); 
}


void store(Product* a) 
{
        printf("Enter Product ID: ");
        scanf("%d", &a->id);
        printf("antar Nama: ");
        scanf("%s", a->name);
        printf("Enter quantity: ");
        scanf("%d", &a->quantity);
        printf("Enter Allowance: ");
        scanf("%d", &a->allowance);
}

void display(Product* a) 
{
        printf("\nProduct ID : %d", a->id);
        printf("\nName     : %s", a->name);
        printf("\nquantity   : %d", a->quantity);
        printf("\nAllowance : %d\n", a->allowance);
}
