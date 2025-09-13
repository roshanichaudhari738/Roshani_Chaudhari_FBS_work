#include<stdio.h>
void upperlowercase(char);
void main(){
	char character;
	printf("Enter the Character:");
	scanf("%c",&character);
	upperlowercase(character);
}

void upperlowercase(char character)
{
	
	if(character >= 'A'&& character <= 'Z')
		printf("%c is a Uppercase",character);
	else
		printf("%c is a lowercase",character);
}