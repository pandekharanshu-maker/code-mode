/*To check number is Odd or Even*/
#include <stdio.h>
int main()
{
    int n;
    printf("Enter value of n:");
    scanf("%d",&n);
    if(n%2==0)
        printf("%d is Even number",n);
    else
        printf("%d is Odd number",n);
    return 0;         
}
//End of the program