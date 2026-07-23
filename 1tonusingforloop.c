/*Program to print even numbers 1 to n using for loop*/
#include<stdio.h>
int main()
{int n,i;
 printf("Enter n:");
 scanf("%d",&n);
 for(i=2;i<=n;i+=2)
 {printf("%d\n",i);
 }   
 return 0;    
}