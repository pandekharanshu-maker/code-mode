//Program to input multiple values
#include<stdio.h>
int main()
{
    int a;
    float b;
    printf("Enter an integer and then a float value: ");
    //Taking multiple inputs
    scanf("%d %f", &a, &b);
    printf("You entered integer: %d and float: %.2f\n", a,b);
    return 0;
}