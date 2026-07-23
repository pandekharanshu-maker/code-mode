/*Program to print adition of array*/
#include<stdio.h>
int main()
{int a[50],b[50],c[50],i,n;
 printf("Enter size of array:");
 scanf("%d",&n);
 printf("Enter elements of first array:");
 for(i=0;i<n;i++)
    {scanf("%d",&a[i]);
    }
 printf("Enter elements of second array:");
 for(i=0;i<n;i++)
    {scanf("%d",&b[i]);
    }
 for(i=0;i<n;i++)   
    {c[i]=a[i]+b[i];
    }   
 printf("Addition = %d",c[i]);
 return 0;
}         