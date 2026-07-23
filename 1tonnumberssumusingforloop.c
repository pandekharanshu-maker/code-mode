//Program to print sum of even numbers using for loop
#include<stdio.h>
int main()
{int i,n,sum;
 printf("Enter n:");
 scanf("%d",&n);
 for(i=2,sum=0;i<=n;sum=sum+i,i+=2)
 {printf("sum = %d\n",sum);
 }
 return 0;
}  