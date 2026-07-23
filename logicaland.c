//Program to use logical AND operator
#include<stdio.h>
int main()
{
    int score=85;
    if(score >=0 &&score <=100)
        printf("Valid score\n");
    else
        printf("Invalid score\n");
    return 0;
}