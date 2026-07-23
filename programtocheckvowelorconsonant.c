//Program to check whether a character is vowel or consonant
#include<stdio.h>
int main()
{
    char ch;
    printf("Enter an alphabet: ");
    scanf("%c", &ch);
    // Check if the character is a vowel
    if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
       ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        printf("%c is a vowel\n", ch);
    }
    else
    {
        printf("%c is a consonant\n", ch);
    }
    return 0;
}