//Program to calculate square and cube of number
#include<stdio.h>
int main()
{int n;
 double s,c;
 printf("Enter value of n:");
 scanf("%d",&n);
 s=n*n;
 c=n*n*n;
 printf("square of %d is %lf\n",n,s);
 printf("\ncube of %d is %lf",n,c);
 return 0;
}   