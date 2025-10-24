//Pass by value
#include<stdio.h>
typedef struct Student {
    int roll;
    char name[20];
    int marks;
}Student;

void store(Student* s);
void display(Student* s);

void main() 
{
	Student s1,s2;
    store(&s1);   
    display(&s1); 
    store(&s2);   
    display(&s2); 
}


void store(Student* s) 
{
        printf("Enter Roll No: ");
        scanf("%d", &s->roll);
        printf("Enter Name: ");
        scanf("%s", s->name);
        printf("Enter Marks: ");
        scanf("%d", &s->marks);
}

void display(Student* s) 
{
        printf("\nRoll No: %d", s->roll);
        printf("\nName   : %s", s->name);
        printf("\nMarks   : %d\n", s->marks);
}
