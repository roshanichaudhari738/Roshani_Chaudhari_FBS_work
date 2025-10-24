//Pass by Address
#include<stdio.h>
typedef struct Student {
    int roll;
    char name[20];
    int marks;
}Student;

void store();
void display();

void main() 
{
	Student s[3];
    store(s,3);   
    display(s,3); 
}


void store(Student* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("Enter Roll No: ");
        scanf("%d", &ptr[i].roll);
        printf("Enter Name: ");
        scanf("%s", ptr[i].name);
        printf("Enter Marks: ");
        scanf("%d", &ptr[i].marks);
    }
}

void display(Student* ptr,int size) 
{
    for(int i=0; i<size; i++) 
	{
        printf("\nRoll No: %d", ptr[i].roll);
        printf("\nName   : %s", ptr[i].name);
        printf("\nMarks   : %d", ptr[i].marks);
    }
}
