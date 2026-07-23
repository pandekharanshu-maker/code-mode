//Program to calculate total salary
#include<stdio.h>
int main()
{float basicpay,hra,ta,grosspay;
 printf("Enter basic pay:");
 scanf("%f",&basicpay);
 hra = 0.2 * basicpay;
 ta = 0.15 * basicpay;
 grosspay = hra + ta + basicpay;
 printf("Your Total Salary is %f",grosspay);
 return 0;
}   