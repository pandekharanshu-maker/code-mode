//Program to print 1 to n numbers using do while loop
#include<stdio.h>
int main()
{int i=1,n;
 printf("Enter n:");
 scanf("%d",&n);
 do
 {printf("%d\n",i);
  i++;
 }while(i<=n);
 return 0;
}  