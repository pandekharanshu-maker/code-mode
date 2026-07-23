/*Program to demonstrate compound assignment operator*/
#include<stdio.h>
int main()
{
    int a = 10;//simple assignment
    printf("Initial value of a: %d\n", a);
    a += 5; // compound assignment (a = a + 5)
    printf("After a += 5, value of a: %d\n", a);
    a -= 3; // compound assignment (a = a - 3)
    printf("After a -= 3, value of a: %d\n", a);
    a *= 2; // compound assignment (a = a * 2)
    printf("After a *= 2, value of a: %d\n", a);
    a /= 4; // compound assignment (a = a / 4)
    printf("After a /= 4, value of a: %d\n", a);
    a %= 3; // compound assignment (a = a % 3)
    printf("After a %%= 3, value of a: %d\n", a);
    return 0;
}