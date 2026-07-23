//Program to calculate root,cuberoot,power and factorial
#include<stdio.h>
#include<math.h>
int main()
{int a,b,fact=1,i=1,n;
 double r1,r2,r3;
 printf("Enter value of a and b:");
 scanf("%d%d",&a,&b);
 printf("Enter value of n:");
 scanf("%d",&n);
 r1=sqrt(a);
 r2=cbrt(b);
 r3=pow(a,b);
 for(i=1;i<=n;i++)
 {fact=fact*i;
 }   
 printf("square root of %d is %.2lf",a,r1);
 printf("\ncube root of %d is %.2lf",b,r2);
 printf("\npower of %d and %d is %.2lf",a,b,r3);
 printf("\nfactorial of %d is %d",n,fact);
 return 0;
}   