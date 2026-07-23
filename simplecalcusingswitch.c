/*Program for simple calculator*/
#include <stdio.h>
int main()
{ char op;
  int a,b;
  printf("Enter an operator:");
  scanf("%c",&op);
  printf("Enter a and b:");
  scanf("%d %d",&a,&b);
  switch(op)
  {case '+':
      printf("a+b=%d\n",a+b);
      break;
   case '-':
      printf("a-b=%d\n",a-b);
      break;
   case '*':
      printf("a*b=%d\n",a*b);
      break;
   case '/':
      if(b!=0)
         printf("a/b=%d\n",a/b);
      else
         printf("Division by zero is not allowed.\n");
      break;
   default:
      printf("Invalid operator! Please use +, -, *, or /.\n");
  }
    return 0;
}
    
