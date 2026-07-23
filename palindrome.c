/*Program to check if a string is palindrome*/
#include<stdio.h>
#include<string.h>
int main()
{char string[100];
 int start,middle,end,length=0;
 gets(string);
 while(string[length]!='\0')
    length++;
end=length-1;
middle=length/2;
for(start=0;start<middle;start++)
    {if(string[start]!=string[end])
        {printf("Not a palindrome.\n");
         break;
        }
        end--;
    }
 if(start==middle) 
    printf("It is a palindrome.\n");
 return 0;
}        