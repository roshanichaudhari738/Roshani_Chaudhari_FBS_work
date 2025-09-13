#include<stdio.h>
char upperlowercase(char);
void main(){
	char character;
	printf("Enter the Character:");
	scanf("%c",&character);
	int res=upperlowercase(character);
	res=='u'?printf("%c is a Uppercase",character):printf("%c is a lowercase",character);
}

char upperlowercase(char character)
{
	
	if(character >= 'A'&& character <= 'Z')
		return 'u';
	else
		return 'l';
}