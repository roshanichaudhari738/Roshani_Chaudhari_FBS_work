//Pass by Address
#include<stdio.h>
typedef struct Product {
    int id;
    char name[20];
    int quantity;
    int price;
}Product;

void store();
void display();

void main() 
{
	Product p[3];
    store(p,3);   
    display(p,3); 
}


void store(Product* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("Enter Product ID: ");
        scanf("%d", &ptr[i].id);
        printf("Enter Name: ");
        scanf("%s", ptr[i].name);
        printf("Enter Quantity: ");
        scanf("%d", &ptr[i].quantity);
        printf("Enter Price: ");
        scanf("%d", &ptr[i].price);
    }
}

void display(Product* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("\nProduct ID: %d", ptr[i].id);
        printf("\nName      : %s", ptr[i].name);
        printf("\nQuantity  : %d", ptr[i].quantity);
        printf("\nPrice 	:%d\n", ptr[i].price);
    }
}
