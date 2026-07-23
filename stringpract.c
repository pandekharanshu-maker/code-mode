//Program to calculate string length,reverse,palindrome,compare string
#include<stdio.h>
#include<string.h>
int main()
{char s[80];
 int len=0,i;
 printf("Enter string:");
 scanf("%s",&s);
 //string length
 for(i=0;s[i]!='\0';i++)
    {len++;
    }
 printf("string length is %d",len);
 //Reverse string
 printf("\n");
 printf("Reverse string is ");
 for(i=len-1;i>=0;i--)
    {printf("%c",s[i]);
    }
 //Compare string
 char str1[50],str2[50],n;
 printf("\nEnter first string:");
 scanf("%s",&str1);
 printf("Enter second string:");
 scanf("%s",&str2);
 n=strcmp(str1,str2);
 if(n==0)
    printf("Strings are equal");
 else
    printf("Strings are unequal");
 //Palindrome
 int start,middle,end,length=0;
 gets(str1);
 while(str1[length]!='\0')
    length++;
    end=length-1;
    middle=length/2;
 for(start=0;start<middle;start++)
    {if(str1[start]!=str1[end])
        {printf("\nNot a palindrome");
         break;
        }
     end--;
    }
 if(start==middle)
    printf("\nIt is a palindrome");
 return 0;
}               