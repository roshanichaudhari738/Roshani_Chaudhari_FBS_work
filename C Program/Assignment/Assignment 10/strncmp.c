#include <stdio.h>
#include <string.h>

int main() {
    char s1[] = "apple";
    char s2[] = "Applet";
    
    int res = strncmp(s1, s2, 3);
    if (res == 0) 
        printf("s1 and s2 are same");
  	else if (res < 0)
      	printf("s1 is lexicographically "
      	        "smaller than s2");
  	else
      	printf("s1 is lexicographically "
      	"greater than s2");
    return 0;
}