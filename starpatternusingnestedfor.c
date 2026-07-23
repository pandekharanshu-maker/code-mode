//Program to print star pattern
#include<stdio.h>
int main()
{int i,j,n;
 printf("Enter vaule of n:");
 scanf("%d",&n);
 for(i=1;i<=1;i++)
    {for(j=i;j<=n;j++)
        {printf("*");}
    }
 printf("\n");   
 for(i=2;i<=n-1;i++)
    {for(j=1;j<=n;j++)
        {if(j==n||j==1)
            printf("*");
         else 
            printf(" ");}
     printf("\n");     
    } 
 for(i=1;i<=1;i++)
    {for(j=i;j<=n;j++)
        {printf("*");}
    }
 return 0;    
}     




