/*Program to print sum of 1 to n numbers*/
#include <stdio.h>
int main()
{int n,i=1,sum=0;
 printf("Enter a number n: ");
 scanf("%d",&n);
 while(i<=n)
 {sum=sum+i;
    i++;
     }
 printf("Sum of 1 to %d=%d\n",n,sum);
    return 0;
}   