//Program for using logical NOT operator
#include<stdio.h>
int main()
{
    int age = 22;
    // Check if the person is not a minor
    if(!(age < 18))
        printf("Person is not a minor\n");
    else
        printf("Person is a minor\n");
    return 0;
}