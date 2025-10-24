#include<stdio.h>
typedef struct Product {
    int id;
    char name[20];
    int quantity;
    int price;
}Product;

void store(Product*);
void display(Product*);

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
        printf("Enter Quantity: ");
        scanf("%d", &a->quantity);
        printf("Enter Price: ");
        scanf("%d", &a->price);
}

void display(Product* a) 
{
        printf("\nProduct ID : %d", a->id);
        printf("\nName     : %s", a->name);
        printf("\nQuantity   : %d", a->quantity);
        printf("\nPrice : %d\n", a->price);
}
