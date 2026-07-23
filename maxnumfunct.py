#Program to find the maximum of three numbers using a function
def max_of_three(a, b, c):
    return max(a, b, c)

# Get the three numbers from the user
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
num3 = int(input("Enter the third number: "))

# Call the function and display the result
result = max_of_three(num1, num2, num3)
print(f"The maximum of {num1}, {num2}, and {num3} is: {result}")