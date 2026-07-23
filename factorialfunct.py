#Program to calculate the factorial of a number using a function
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)
# Get the number from the user
num = int(input("Enter a number to calculate its factorial: "))
# Call the function and display the result
result = factorial(num)
print(f"The factorial of {num} is: {result}")