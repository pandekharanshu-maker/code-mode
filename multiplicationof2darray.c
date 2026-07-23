/*Program to calculate multiplication of two matrices using 2-D array*/
#include<stdio.h>
int main()
{int a[50][50],b[50][50],d[50][50],i,j,r,c,r1,r2,c1,c2,k;
 printf("Enter rows and columns:");
 scanf("%d%d",&r,&c);
 printf("Enter element of first matrix:");
 for(i=0;i<r;i++)
    {for(j=0;j<c;j++)
        {scanf("%d",&a[i][j]);
        }
    }
 printf("Enter element of second matrix");
 for(i=0;i<r;i++)
    {for(j=0;j<c;j++)
        {scanf("%d",&b[i][j]);
        }
    }
 for(i=0;i<r;i++)
    {for(j=0;j<c;j++)
        {d[i][j]=0;
        }
    }   
 if(c1==r2)
    {for(i=0;i<r1;i++)
        {for(j=0;j<c2;j++)
            {for(k=0;k<r2;k++)
                {d[i][j]=d[i][j]+(a[i][j]*b[i][j]);
                }
            }
        }
     printf("\nResultant matrix:");
     for(i=0;i<r1;i++)
        {for(j=0;j<c2;j++)
            {printf("%d",d[i][j]);
            }
         printf("\n");   
        }                          
    }
 else 
    printf("Multiplication not possible");
 return 0;
}      