/*Program to use relational operators*/
#include<stdio.h>
int main()
{
    int a=10, b=4;
    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);

    // Using relational operators
    if(a == b)
        printf("%d is equal to %d\n", a, b);
    if(a != b)
        printf("%d is not equal to %d\n", a, b);
    if(a > b)
        printf("%d is greater than %d\n", a, b);
    if(a < b)
        printf("%d is less than %d\n", a, b);
    if(a >= b)
        printf("%d is greater than or equal to %d\n", a, b);
    if(a <= b)
        printf("%d is less than or equal to %d\n", a, b);

    return 0;
}