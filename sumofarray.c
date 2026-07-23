/*Program to accept array and print sum of array elements*/
#include<stdio.h>
int main()
{int a[50],i,n,s=0;
 printf("Enter actual size of array:");
 scanf("%d",&n);
 for(i=0;i<n;i++)
    {printf("Enter %d element of array:",i);
     scanf("%d",&a[i]);
    }
 for(i=0;i<n;i++)
    {s=s+a[i];
    }
 printf("Addition of Array elements = %d",s);
 return 0;
}             