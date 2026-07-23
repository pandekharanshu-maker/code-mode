/*Program to demonstrate comma operator*/
#include <stdio.h>
int main()
{
    int x,p=7;
    x = (++p, p++);
    printf("x=%d",x);
    return 0;
}    