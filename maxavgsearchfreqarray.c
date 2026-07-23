/*Program to find maximum,average,search element and frequency*/
#include<stdio.h>
int main()
{int j,a[50],i,n,max,s,p=0,f,sum=0,visited[10];
 printf("Enter size of array:");
 scanf("%d",&n);
 printf("Enter %d array elements:",n);
 for(i=0;i<n;i++)
    {scanf("%d",&a[i]);
    }
 //maximum of element
 for(i=0;i<n;i++)
    {if(a[i]>=max)
       max=a[i];
    }
 printf("%d is Maximum",max);
 //search element
 printf("\nElement to search:");
 scanf("%d",&s);
 for(i=0;i<n;i++)
    {if(s==a[i])
       {p=1;
        f=i;
        break;
       }
    }
 if(p==1)
    printf("%d found at index %d",s,f);
 else
    printf("%d not found",s);
 //average
 for(i=0;i<n;i++)
    {sum=sum+a[i];
    }
 int avg=sum/n;
 printf("\nAverage=%d",avg);
 //Frequency
 int freq=1;
 for(i=0;i<n;i++)
    {if(visited[i]==1)
       continue;
       freq=1;
    for(j=i+1;j<n;j++)
       {if(a[i]==a[j])
            {visited[i]=1;
             freq++;
            }       
       }
       printf("\n%d found %d time",a[i],freq);
    }
 return 0;
} 