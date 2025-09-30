#include <stdio.h>

int main() {
    char s[50];
    int n = 10;
    
    sprintf(s, "The value is %d", n);
    printf("%s", s);
    return 0;
}