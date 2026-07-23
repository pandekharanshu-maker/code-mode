/*Program to print even numbers upto n*/
#include <stdio.h>
int main()
{int n,i=2;
printf("Enter a number n: ");
scanf("%d",&n);
while(i<=n)
{printf("%d\n",i);
    i=i+2;
    }
    return 0;
}
