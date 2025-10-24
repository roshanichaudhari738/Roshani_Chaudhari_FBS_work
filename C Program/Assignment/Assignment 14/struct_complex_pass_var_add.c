#include<stdio.h>
typedef struct Complex {
    float real,imag;
}Complex;

void store();
void display();

void main() 
{
	Complex p1;
    store(&p1);   
    display(&p1); 
}


void store(Complex* c) 
{
	printf("Enter real,imag");
	scanf("%f %f",&c->real, &c->imag);
    
}

void display(Complex* c) 
{
	printf("Complex=%.2f+%.2fi\n", c->real,c->imag);
}
