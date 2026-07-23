//Program to calculate power using function
#include<stdio.h>
#include<math.h>
void power(int,int);
int main()
{int a,b;
 printf("Enter value of a and b:");
 scanf("%d%d",&a,&b);
 power(a,b);
 return 0;
}
void power(int a,int b)
{int x;
 x=pow(a,b);
 printf("power of %d to %d is %d",a,b,x);
}      