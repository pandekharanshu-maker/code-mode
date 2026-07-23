/*Program to print grades*/
#include <stdio.h>
int main() 
{int eng,math,eg,fpl;
    printf("Enter marks of english:");
    scanf("%d",&eng);
    printf("Enter marks of maths:");
    scanf("%d",&math);
    printf("Enter marks of graphics:");
    scanf("%d",&eg);
    printf("Enter marks of programming fundamentals:");
    scanf("%d",&fpl);
    int total=eng+math+eg+fpl;
    printf("Total marks=%d\n",total);
    float per=total/400.0*100;
    printf("Percentage=%f\n",per);
    if(per>=80)
       printf("Grade Outstanding\n");
    else if(per>=70&&per<80)
       printf("Grade Excellent\n");
    else if(per>=60&&per<70)
       printf("Grade Very Good\n");
    else if(per>=50&&per<60)
       printf("Grade Good\n");
    else if(per>=40&&per<50)
       printf("Grade Average\n");
    else if (per<40)
       printf("Grade Fail\n");
    return 0;
}   