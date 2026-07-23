/*Program to accept details of employee*/
#include<stdio.h>
struct employee
{char name[80];
 char salary[80];   
 char doj[80];
 char designation[80];
 char gender[10];
};
int main()
{struct employee e1;
 printf("Enter employee data -");
 printf("\nEnter employee name:");
 scanf("%s",&e1.name);
 printf("Enter salary:");
 scanf("%s",&e1.salary);
 printf("Enter date of joining:");
 scanf("%s",&e1.doj);
 printf("Enter designation:");
 scanf("%s",&e1.designation);
 printf("Enter gender:");
 scanf("%s",&e1.gender);
 printf("Employee data -");
 printf("\nName:%s",e1.name);
 printf("\nSalary:%ld",e1.salary);
 printf("\nDate of joining:%s",e1.doj);
 printf("\nDesignation:%s",e1.designation);
 printf("\nGender:%s",e1.gender);
}