//Program to use logical or operator
#include<stdio.h>
int main()
{
    int score1 = 75;
    int score2 = 60;
    int passingGrade = 60;
    if(score1 >= passingGrade || score2 >= passingGrade)
        printf("At least one score is passing\n");
    else
        printf("Both scores are failing\n");
    return 0;
}