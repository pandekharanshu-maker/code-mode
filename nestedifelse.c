/*Program to demonstrate nested if else*/
#include<stdio.h>
int main()
{int a,b,c;
 printf("Enter values of three numbers:");
 scanf("%d%d%d",&a,&b,&c);
 if(a>b)
   {
    if(a>c)
    {
     printf("\na is greater");
    }
    else
       {printf("\nc is greater");
       }
    }
  else
      {
       if(b>c)
         {
          printf("\nb is greater");
         }
       else
          {
           printf("\nc is greater");
          }
        }
  return 0;
}              
                     