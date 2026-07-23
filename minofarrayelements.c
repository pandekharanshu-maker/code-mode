//Program to find min of array elements
#include<stdio.h>
int main()
{int a[50],i,n,min;
 printf("Enter size of array:");
 scanf("%d",&n);
 printf("Enter %d array elements:",n);
 for(i=0;i<n;i++)
    {scanf("%d",&a[i]);
    }
 for(i=0;i<n;i++)   
    {if(a[i]<min)
        min=a[i];
    }
 printf("Minimum element = %d",min);
 return 0;
}          