//Pass by Address
#include<stdio.h>
typedef struct Complex {
    float real,imag;
}Complex;

void store();
void display();

void main() 
{
	Complex p[2];
    store(p,2);   
    display(p,2); 
}


void store(Complex* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{

			printf("Enter real,imag");
			scanf("%f %f",&ptr[i].real, &ptr[i].imag);
    }
}

void display(Complex* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
		printf("Complex=%.2f+%.2fi\n", ptr[i].real,ptr[i].imag);
    }
}
