#include<stdio.h>
char checkvowelnot(char);
void main()
{
	char character = 'R';
	char res=checkvowelnot(character);
	res=='v'?printf("%c is a vowel",character):printf("%c is a consonant",character);
}

char checkvowelnot(char character)
{
	
	if(character == 'a'
	|| character == 'A'|| character == 'e' || character == 'E' || character == 'i' || character == 'I'  
	|| character == 'o' || character == 'O' || character == 'u' || character == 'U'){
//		printf("%c is a vowel",character);
		return 'v';
		
	}
	else{
		//printf("%c is a consonant",character);
		return 'c';
	}
}