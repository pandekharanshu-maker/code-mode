#Program to perform string operations
str1 = input("Enter the first string: ")
str2 = input("Enter the second string: ")   
#Calculate the length of the strings
print("Length of the first string is: ", len(str1))
print("Length of the second string is: ", len(str2))
#String reversal
print("Reversed first string is: ", str1[::-1])
print("Reversed second string is: ", str2[::-1])
#Equality check
if str1 == str2:
    print("The strings are equal.")
else:
    print("The strings are not equal.")
#Palindrome check
if str1 == str1[::-1]:
    print("The first string is a palindrome.")
else:
    print("The first string is not a palindrome.")
if str2 == str2[::-1]:
    print("The second string is a palindrome.")
else:
    print("The second string is not a palindrome.")