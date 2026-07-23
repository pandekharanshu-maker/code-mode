/*Program to print sum of odd numbers upto n*/
#include <stdio.h>
int main()
{int n,i=1,sum=0;
printf("Enter a number n: ");
scanf("%d",&n);
while(i<=n)
{sum=sum+i;
 i+=2;
}
printf("Sum of odd numbers upto %d=%d\n",n,sum);
 return 0;
}